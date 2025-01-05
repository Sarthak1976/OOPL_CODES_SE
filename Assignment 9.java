import java.util.Scanner;

// Abstract class defining the Car blueprint
abstract class Car {
    String company, carName;
    double price;

    abstract void getPrice(double price);
    abstract void getDetails(String comp, String carN);
    abstract void accessories();

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of company:");
        company = sc.next();
        System.out.println("Enter name of car:");
        carName = sc.next();
        System.out.println("Enter rough budget in lakhs:");
        price = sc.nextDouble();
    }

    public void display() {
        getPrice(price);
        getDetails(company, carName);
        accessories();
    }
}

// Factory class to create instances of different car types
class CarFactory {
    public static final String SMALL = "SMALL";
    public static final String SEDAN = "SEDAN";
    public static final String HATCHBACK = "HATCHBACK";
    public static final String LUXURY = "LUXURY";

    public Car buildCar(String carType) {
        switch (carType.toUpperCase()) {
            case SMALL:
                return new SmallCar();
            case SEDAN:
                return new SedanCar();
            case HATCHBACK:
                return new HatchbackCar();
            case LUXURY:
                return new LuxuryCar();
            default:
                System.out.println("Invalid car type specified!");
                return null;
        }
    }
}

// SmallCar implementation
class SmallCar extends Car {
    String featuresAvail;

    @Override
    void getPrice(double price) {
        featuresAvail = price > 2 ? "YES" : "NO";
    }

    @Override
    public void getDetails(String comp, String carN) {
        System.out.println("Company: " + comp);
        System.out.println("Car Name: " + carN);
        System.out.println("Colors: Black, White, Grey, Navy Blue, Yellow, Purple");
        System.out.println("Gears: Manual");
    }

    @Override
    public void accessories() {
        System.out.println("Types of Wheels: MRF, CEAT");
        System.out.println("Airbags: " + featuresAvail);
        System.out.println("Back Wiper: " + featuresAvail);
        System.out.println("Touch Screen Music Player: " + featuresAvail);
    }
}

// SedanCar implementation
class SedanCar extends Car {
    String featuresAvail;

    @Override
    void getPrice(double price) {
        featuresAvail = price > 5 ? "YES" : "NO";
    }

    @Override
    public void getDetails(String comp, String carN) {
        System.out.println("Company: " + comp);
        System.out.println("Car Name: " + carN);
        System.out.println("Colors: Black, White, Navy Blue, Yellow, Purple");
        System.out.println("Gears: Manual");
    }

    @Override
    public void accessories() {
        System.out.println("Types of Wheels: MRF, CEAT");
        System.out.println("Airbags: " + featuresAvail);
        System.out.println("Back Wiper: " + featuresAvail);
        System.out.println("Touch Screen Music Player: " + featuresAvail);
    }
}

// HatchbackCar implementation
class HatchbackCar extends Car {
    String featuresAvail;

    @Override
    void getPrice(double price) {
        featuresAvail = price > 5 ? "YES" : "NO";
    }

    @Override
    public void getDetails(String comp, String carN) {
        System.out.println("Company: " + comp);
        System.out.println("Car Name: " + carN);
        System.out.println("Colors: Black, White, Golden, Navy Blue");
        System.out.println("Gears: Auto");
    }

    @Override
    public void accessories() {
        System.out.println("Types of Wheels: MRF, CEAT");
        System.out.println("Airbags: " + featuresAvail);
        System.out.println("Back Wiper: " + featuresAvail);
        System.out.println("Touch Screen Music Player: " + featuresAvail);
    }
}

// LuxuryCar implementation
class LuxuryCar extends Car {
    String featuresAvail;

    @Override
    void getPrice(double price) {
        featuresAvail = price > 15 ? "YES" : "NO";
    }

    @Override
    public void getDetails(String comp, String carN) {
        System.out.println("Company: " + comp);
        System.out.println("Car Name: " + carN);
        System.out.println("Colors: Black, White, Golden, Silver, Navy Blue, Apple Red");
        System.out.println("Gears: Auto");
    }

    @Override
    public void accessories() {
        System.out.println("Types of Wheels: MRF, CEAT");
        System.out.println("Airbags: " + featuresAvail);
        System.out.println("Back Wiper: " + featuresAvail);
        System.out.println("Touch Screen Music Player: " + featuresAvail);
        System.out.println("Sunroof: " + featuresAvail);
    }
}

// Main class for testing
public class Assignment9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CarFactory carFactory = new CarFactory();
        String choice;

        do {
            System.out.println("\nWelcome to Factory Design Pattern Program");
            System.out.println("1. Small Car");
            System.out.println("2. Sedan Car");
            System.out.println("3. Hatchback Car");
            System.out.println("4. Luxury Car");
            System.out.println("Enter which car you want to build (SMALL, SEDAN, HATCHBACK, LUXURY): ");
            choice = sc.next();

            Car car = carFactory.buildCar(choice);
            if (car != null) {
                car.input();
                car.display();
            } else {
                System.out.println("Invalid choice. Please try again.");
            }

            System.out.println("Do you want to continue? (yes/no): ");
            choice = sc.next();
        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Program Terminated Successfully!");
        sc.close();
    }
}
