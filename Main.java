import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        Car[] cars = new Car[] {
            new Car("Audi", 500000, 2020, "Blue", new String[] {"spare nuts", "keys"}),
            new Car("Tata", 850000, 2019, "Black", new String[] {"tires", "keys"}),
            new Car("Toyota", 500000, 2017, "Red", new String[] {"tires", "filter"}),
            new Car("Honda", 700000, 2019, "Neon", new String[] {"spare nuts", "filter"}),
            new Car("Mercedes", 1200000, 2015, "Black", new String[] {"tires", "filter", "transmission"})
        };
        
        Dealership dealership = new Dealership(cars);
        

        System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");
        System.out.print("Welcome! Enter the type of car you're looking for: ");
        String make = scan.nextLine();
        System.out.print("Enter your budget: ");
        int budget = scan.nextInt();          

        int index = dealership.search(make, budget);

        switch (index) {

            case 404: System.out.println("Feel free to browse through our collection of cars.\n");
            System.out.println(dealership);
            break;

            default: scan.nextLine();
            String decision = scan.nextLine();
            if (decision.equalsIgnoreCase("yes")) {
                dealership.sell(index);
            }

        }

    scan.close();

    }
}
