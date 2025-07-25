import java.util.Scanner;
public class Quiz1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double GRAVITY = 9.8;
        System.out.print("Enter mass of the object: ");
        double object_mass = scanner.nextInt();
        double weight = object_mass * GRAVITY;
        if (weight > 1000) {
            System.out.println("Too heavy");
        }
        else if (weight < 10) {
            System.out.println("Too light");
        }
        else{
            System.out.println("okay");
        }
        scanner.close();
    }
    
}
