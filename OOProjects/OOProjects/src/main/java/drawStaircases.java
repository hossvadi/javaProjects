import java.util.Scanner;

public class drawStaircases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of steps: ");
        int numSteps = scanner.nextInt();

        System.out.println("Enter step's number of width: ");
        int stepWidth = scanner.nextInt();

        for (int i = 0 ; i < numSteps; i++) {
            for (int j = 0 ; j < (i + 1) * stepWidth ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
