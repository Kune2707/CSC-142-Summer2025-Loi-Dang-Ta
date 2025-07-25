import java.util.Scanner;
public class Assignment21 {
    // part 2 of assignment 2
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter number of checks: ");
        int checks = scanner.nextInt();
        final double BASE_FEE = 10.00 ;
        double checkFee = 0.00;
        if (checks < 0 ){
           System.out.println("Wrong input!");
           scanner.close();
           return ;

        }
        else if (checks < 20){
            checkFee = 0.10;
        }
        else if (checks >= 20 && checks <= 39) {
            checkFee = 0.08;
        }
        else if (checks >= 40 && checks <= 59 ){
            checkFee = 0.06;
        }
        else{
            checkFee = 0.04;
        }
        double total = BASE_FEE + checks * checkFee;
        String formattedTotal = String.format("$%.2f", total);
        System.out.println("Base fee: $"+BASE_FEE);
        System.out.println("Fee per check: $"+checkFee);
        System.out.println("Total service charge: "+formattedTotal);
    }
}
