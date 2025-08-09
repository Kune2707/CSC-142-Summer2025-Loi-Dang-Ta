
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class caseStudy2 {
    // main
    public static void main(String[] args) throws IOException {
        String fileName = getFileName();
        if (fileName == null || fileName.isEmpty()){
            JOptionPane.showMessageDialog(null, "invalid input");
            System.exit(0);
        }
        double total = getTotalSales(fileName);
        double average = 0;
        displayResults(total, average);
    }
    // first method
    public static String getFileName(){
        String fileName = JOptionPane.showInputDialog("Enter your file name: ");
        return fileName;

    }
    // second method
    public static Double getTotalSales(String fileName) throws IOException{
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        double sum = 0;
        int count = 0; 
        for (int i = 0 ; i < 30; i++){ // line reading then sum double on each line
            if (scanner.hasNextDouble()){
                sum += scanner.nextDouble();
                count++;
            }
            else{
                JOptionPane.showMessageDialog(null, "invalid value");
                System.exit(0);
            }
        }
        // if line is missing 
        if (count < 30 ){
            JOptionPane.showMessageDialog(null,"line is missing");
            System.exit(0);
        }
        scanner.close();
        return sum;

    }
    // result 
    public static void displayResults(double total, double average){
        average = total/30;
        String format = String.format("Your total is: $%,.2f \n Average is: $%,.2f",total,average);
        JOptionPane.showMessageDialog(null, format);
    }
}
// Test case:
// input1: File: 30 valid numbers -> output: Results
// input2: 29 valid numbers (missing 1 line) - > output: line is missing
// input3: null --> output: invalid input
// I'm still trying to figure out how to handle when the user type wrong file's name