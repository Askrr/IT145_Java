import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	//array lists
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    public static void main(String[] args) {
        initializeDogList();
        initializeMonkeyList();
        //starting menu
        boolean acceptingInput = true;
        Scanner input = new Scanner(System.in);
        /**
         * @see public static void displayMenu() for order of cases
         */
        do {
            displayMenu();
            String option = input.nextLine().trim().toLowerCase(); //get everything in lowercase
            switch(option) {
                case "1":
                    intakeNewDog(input);
                    break;
                case "2":
                    intakeNewMonkey(input);
                    break;
                case "3":
                    reserveAnimal(input);
                    break;
                case "4":
                    printAnimals("dog");
                    break;
                case "5":
                    printAnimals("monkey");
                    break;
                case "6":
                    printAnimals("available");
                    break;
                case "q":
                    acceptingInput = false;
                    break;
                default:
                    System.out.println("Invalid option, try again.");
                    break;
            }
        } while(acceptingInput);

        System.out.println("Goodbye");
    }
    //print the menu options
    public static void displayMenu() {
        System.out.println("Rescue Animal System Menu:");
        System.out.println("1) Intake a new dog.");
        System.out.println("2) Intake a new monkey.");
        System.out.println("3) Reserve an animal.");
        System.out.println("4) Print dog list.");
        System.out.println("5) Print monkey list.");
        System.out.println("6) Print 'in service' animals.");
        System.out.println("q) Quit.");
        System.out.println();
        System.out.println("Enter selection: ");
    }
    //dogs added for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }
   //monkeys added for testing
   public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("Hops", "Marmoset", "male", "1", "25.6", "05-21-2021", "United States", "intake", false, "United States");
        Monkey monkey2 = new Monkey("Swings", "Macaque", "male", "3", "35.2", "02-29-2002", "United States", "Phase I", false, "United States");
        Monkey monkey3 = new Monkey("Falls", "Tamarin", "female", "4", "25.6", "12-21-2012", "Canada", "in service", false, "Canada");

        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
        monkeyList.add(monkey3);
    }
    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
        // Add the code to instantiate a new dog and add it to the appropriate list
        //get info on dog
        System.out.println("What is " + name + "'s breed?");
        String breed = scanner.nextLine().trim();

        System.out.println("What is " + name + "'s gender? (male or female)");
        String gender = scanner.nextLine().trim().toLowerCase();

        System.out.println("What is " + name + "'s age?");
        String age = scanner.nextLine().trim();

        System.out.println("What is " + name + "'s weight? (in pounds)");
        String weight = scanner.nextLine().trim();

        System.out.println("When was " + name + "'s acquired? (MM-DD-YYYY)");
        String acquisitionDate = scanner.nextLine().trim();

        System.out.println("Where was " + name + "'s acquired? (country)");
        String acquisitionCountry = scanner.nextLine().trim();

        System.out.println("What is " + name + "'s training status?");
        String trainingStatus = scanner.nextLine().trim();

        System.out.println("Is " + name + " reserved? (Y/N)");
        boolean reserved = scanner.nextLine().trim().equalsIgnoreCase("Y");

        System.out.println("What is " + name + "'s service country?");
        String inServiceCountry = scanner.nextLine().trim();

        Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);

        dogList.add(newDog);
    }
    // Complete intakeNewMonkey
    //Instantiate and add the new monkey to the appropriate list
    // For the project submission you must also  validate the input
    // to make sure the monkey doesn't already exist and the species type is allowed
    public static void intakeNewMonkey(Scanner scanner) {
        System.out.println("What is the name of the monkey?");
        String name = scanner.nextLine().trim();
        for(Monkey monkey : monkeyList)
            if(monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis monkey is already exists\n\n");
                return; //returns to menu
            }
        //checking to see if species type
        boolean invalidBreed = true;
        String breed;
        do {
            System.out.println("What is " + name + "'s breed?");
            breed = scanner.nextLine().trim();

            for(String validBreed : Monkey.MONKEY_BREEDS)
                if(breed.equalsIgnoreCase(validBreed))
                invalidBreed = false;

            if(invalidBreed)
                System.out.println("Invalid breed option");
        } while(invalidBreed);

        //get info on monkey
        System.out.println("What is " + name + "'s gender? (male or female)");
        String gender = scanner.nextLine().trim().toLowerCase();

        System.out.println("What is " + name + "'s age?");
        String age = scanner.nextLine().trim();

        System.out.println("What is " + name + "'s weight? (in pounds)");
        String weight = scanner.nextLine().trim();

        System.out.println("When was " + name + "'s acquired? (MM-DD-YYYY)");
        String acquisitionDate = scanner.nextLine().trim();

        System.out.println("Where was " + name + "'s acquired? (country)");
        String acquisitionCountry = scanner.nextLine().trim();

        System.out.println("What is " + name + "'s training status?");
        String trainingStatus = scanner.nextLine().trim();

        System.out.println("Is " + name + " reserved? (Y/N)");
        boolean reserved = scanner.nextLine().trim().equalsIgnoreCase("Y");

        System.out.println("What is " + name + "'s service country?");
        String inServiceCountry = scanner.nextLine().trim();

        Monkey newMonkey = new Monkey(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);

        monkeyList.add(newMonkey);
    }
    //reserve the animal
    public static void reserveAnimal(Scanner scanner) {
        System.out.println("What type of animal will be needed?(dog or monkey)");
        String animalType = scanner.nextLine().trim();

        System.out.println("Where will the animal be serving? (country)");
        String animalServiceCountry = scanner.nextLine().trim();
        //see if input for anmial is dog
        if(animalType.equalsIgnoreCase("dog"))
            for(Dog dog : dogList)
                if(true
                    && dog.getInServiceLocation().equalsIgnoreCase(animalServiceCountry)
                    && !dog.getReserved()
                ) {
                dog.setReserved(true);

                System.out.println(dog.getName() + " has been reserved");
                return;
            }
        //see if input for animal is monkey
        if(animalType.equalsIgnoreCase("monkey"))
            for(Monkey monkey : monkeyList)
                if(true
                    && monkey.getInServiceLocation().equalsIgnoreCase(animalServiceCountry)
                    && !monkey.getReserved()
                ) {
                monkey.setReserved(true);
                System.out.println(monkey.getName() + " has been reserved");
                return;
            }
        System.out.println("Unable to reserve this " + animalType + " at this time");
    }
    public static void printAnimals(String outputType) {
        System.out.println("Name\t\t| Status\t| Acq. Country\t| Reserved"); //tab columns over for lists
        switch(outputType) {
            case "dog":
                for(Dog dog : dogList) {
                    String name = dog.getName();
                    String status = dog.getTrainingStatus();
                    String acquisitionCountry = dog.getAcquisitionLocation();
                    boolean reserved = dog.getReserved();
                    System.out.println(name + "\t\t| " + status + "\t| " + acquisitionCountry + "\t| " + reserved);
                }
                break;
            case "monkey":
                for(Monkey monkey : monkeyList) {
                    String name = monkey.getName();
                    String status = monkey.getTrainingStatus();
                    String acquisitionCountry = monkey.getAcquisitionLocation();
                    boolean reserved = monkey.getReserved();
                    System.out.println(name + "\t\t| " + status + "\t| " + acquisitionCountry + "\t| " + reserved);
                }
                break;
            case "available":
                for(Dog dog : dogList) {
                    String name = dog.getName();
                    String status = dog.getTrainingStatus();
                    String acquisitionCountry = dog.getAcquisitionLocation();
                    boolean reserved = dog.getReserved();

                    boolean available = !reserved && status.equalsIgnoreCase("in service");
                    if(!available)
                        continue;
                        System.out.println(name + " (dog)\t| " + status + "\t| " + acquisitionCountry + "\t| " + reserved);
                }
                for(Monkey monkey : monkeyList) {
                    String name = monkey.getName();
                    String status = monkey.getTrainingStatus();
                    String acquisitionCountry = monkey.getAcquisitionLocation();
                    boolean reserved = monkey.getReserved();

                    boolean available = !reserved && status.equalsIgnoreCase("in service");
                    if(!available)
                        continue;
                        System.out.println(name + " (monkey)\t| " + status + "\t| " + acquisitionCountry + "\t| " + reserved);
                }
                break;
        }
    }
}
