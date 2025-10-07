import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double gallons = 0.0;
        double mpg = 0.0;
        double pricePerGallon = 0.0;
        String trash;
        boolean ok;

        // gallons >= 0
        ok = false;
        do {
            System.out.print("Enter gallons in tank (>= 0): ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();
                if (gallons >= 0) {
                    ok = true;
                } else {
                    System.out.println("Gallons cannot be negative.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!ok);

        // mpg > 0
        ok = false;
        do {
            System.out.print("Enter fuel efficiency (mpg > 0): ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine();
                if (mpg > 0) {
                    ok = true;
                } else {
                    System.out.println("MPG must be greater than 0.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!ok);

        // pricePerGallon >= 0
        ok = false;
        do {
            System.out.print("Enter price per gallon (>= 0): ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine();
                if (pricePerGallon >= 0) {
                    ok = true;
                } else {
                    System.out.println("Price cannot be negative.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!ok);

        double costFor100 = (100.0 / mpg) * pricePerGallon;
        double rangeOnFull = gallons * mpg;

        System.out.printf("Cost to drive 100 miles: $%.2f%n", costFor100);
        System.out.printf("Range on a full tank: %.2f miles%n", rangeOnFull);
    }
}