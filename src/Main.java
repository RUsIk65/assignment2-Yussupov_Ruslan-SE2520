import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.printf("How many drivers: ");
        int N = sc.nextInt();
        sc.nextLine();

        Driver[] drivers = new Driver[N];

        for (int i = 0; i < N; i++) {
            System.out.printf("Name: ");
            String name = sc.nextLine();

            System.out.printf("Licence Number: ");
            String licenceNumber = sc.nextLine();

            System.out.printf("Professional(Car/Truck/Motorcycle): ");
            String professional = sc.nextLine();

            drivers[i] = new Driver(name, licenceNumber, professional);
        }



        System.out.println("Car: "); //----------------------------------

        System.out.printf("Brand: ");
        String brand = sc.nextLine();

        System.out.printf("Year: ");
        int year = sc.nextInt();

        System.out.printf("Door: ");
        byte doors = sc.nextByte();
        sc.nextLine();

        System.out.printf("Fuel Type: ");
        String fuelType = sc.nextLine();

        Vehicle car = new Car(brand, year, doors, fuelType);



        System.out.println("Motorcycle: ");//-------------------------------------------------

        System.out.printf("Brand: ");
        brand = sc.nextLine();

        System.out.printf("Year: ");
        year = sc.nextInt();

        System.out.printf("Has Sidecar(true/false): ");
        boolean hasSidecar = sc.nextBoolean();
        sc.nextLine();

        Vehicle motorcycle = new Motorcycle(brand, year, hasSidecar);



        System.out.println("Truck: ");//----------------------------------------------------

        System.out.printf("Brand: ");
        brand = sc.nextLine();

        System.out.printf("Year: ");
        year = sc.nextInt();

        System.out.printf("Capacity: ");
        double capacity = sc.nextDouble();

        System.out.printf("Num Axles: ");
        int numAxles = sc.nextInt();

        Vehicle truck = new Truck(brand, year, capacity, numAxles);



        for(int i = 0; i < drivers.length; i++)//-----------------------------
        {
            switch (drivers[i].getProfessional()) {
                case "Car":
                    car.setDriver(drivers[i]);
                    break;
                case "Truck":
                    truck.setDriver(drivers[i]);
                    break;
                case "Motorcycle":
                    motorcycle.setDriver(drivers[i]);
                    break;
            }
        }



        Vehicle[] vehicles = {car, truck, motorcycle};
        for(int i = 0; i < vehicles.length; i++)
        {
            System.out.println();
            vehicles[i].startEngine();
            vehicles[i].displayInfo();

            if(vehicles[i].getDriver() != null)
            {
                vehicles[i].getDriver().displayDriverInfo();
            }

            vehicles[i].stopEngine();
        }
    }
}