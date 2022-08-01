import java.util.Locale;
import java.util.Scanner;

public class vehicleInsurance {
    public static void main(String[] args) {
        System.out.println("Enter your vehicle type: ");
        System.out.println("Car, truck, Bus, Motorcycle");
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();
        String scanString = String.valueOf(type).toLowerCase(Locale.ROOT);

        int premium = 0;

        switch (scanString) {
            case "car":
                premium = 200;
                break;
            case "truck":
                premium = 300;
                break;
            case "bus":
                premium = 400;
                break;
            case "motorcycle":
                System.out.println("what is the type of youe moto? ");
                System.out.println("1 (low power), 2 (medium), 3 (high)");
                String motoType = scan.nextLine();
                int motoTypeInt = Integer.parseInt(motoType);
                switch (motoTypeInt) {
                    case 1:
                        premium = 300;
                        break;
                    case 2:
                        premium = 400;
                        break;
                    case 3:
                        premium = 500;
                        break;
                    default:
                        System.out.println("Unknown Motorcycle type... ");
                }
                break;
            default:
                System.out.println("Unknown vehicle type... ");
        }
        scan.close();
        System.out.println("The premium is $ " + premium);
    }
}
