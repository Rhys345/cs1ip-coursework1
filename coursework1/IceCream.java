import java.util.Scanner;

public class IceCream {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Would you like (v)anilla, (c)hocolate or (s)trawberry?");
        char flavour = input.nextLine().charAt(0);

        int student = 34024487;
        int strawberry = (student / 10000) % 100;
        int chocolate = (student / 100) % 100;
        int vanilla = student % 100;
        int cone = 100;
        int price = 0;

        if (flavour == 's') {
            price = strawberry;
        } else if (flavour == 'c') {
            price = chocolate;
        } else if (flavour == 'v') {
            price = vanilla;
        } else {
            System.out.println("We don't have that flavour.");
            return;
        }

        System.out.println("How many scoops would you like?");
        int scoops = input.nextInt();

        if (scoops > 3) {
            System.out.println("That's too many scoops to fit in a cone.");
            return;
        }
        if (scoops < 1) {
            System.out.println("We don't sell just a cone.");
            return;
        }

        int total = cone + (scoops * price);
        double pounds = total / 100.0;

        System.out.printf("That will be %.2f please.%n", pounds);
    }
}
