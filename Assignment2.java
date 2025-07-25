import java.util.Scanner;
public class Assignment2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter score 1: ");
        int score_one = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter score 2: ");
        int score_two = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter score 3: ");
        int score_three = scanner.nextInt();
        scanner.nextLine();
        double averageScore = (score_one + score_two + score_three) / 3.0;
        System.out.println("Average: "+ averageScore);
        if (averageScore >= 90 && averageScore <= 100){
            System.out.println("Grade: A");
        }
        else if (averageScore >= 80 && averageScore <= 89){
            System.out.println("Grade: B");
        }
        else if (averageScore >= 70 && averageScore <= 79 ){
            System.out.println("Grade: C");
        }
        else if (averageScore >= 60 && averageScore <= 69){
            System.out.println("Grade: D");
        }
        else{
            System.out.println("Grade: F");
        }
        scanner.close();
    }
}
