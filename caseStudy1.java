
import javax.swing.JOptionPane;

public class caseStudy1 {
    public static void main(String[] args) {
        // Take input from the user, convert string to double
       String firstInput= JOptionPane.showInputDialog("What is your annual salary? ");
       if (firstInput == null || firstInput.isEmpty()){ // checking if the user input is right or not
        noQualify();
        System.exit(0);
       }
       double annualSalary = Double.parseDouble(firstInput);
       String secondInput = JOptionPane.showInputDialog("Enter your credit rating (1-10)");
       // condition checking
       if (secondInput == null || secondInput.isEmpty()){
        noQualify();
        System.exit(0);
       }
       int rating = Integer.parseInt(secondInput);
       if (annualSalary >= 20000 && rating >=7) {
           qualify();
       }
       else{
        noQualify();
       }
        
    }
    // 2 void methods: 
    public static void qualify(){
        JOptionPane.showMessageDialog(null, "You qualify for the credit card");
    }
    public static void noQualify(){ 
        JOptionPane.showMessageDialog(null, "You do not qualify");
    }
}
// Test case 
// Input 1 : annual salary = 25000
//         credit rating = 7
// Output 1: qualify 
// Input 2 : annual salary = 0
//         credit rating = 7
// Output 2: you do not qualify
// Input 3: null
// Output 3 : you do not qualify

// I want to imrpove my program by checking more condition and also keep asking user if they have wrong input.