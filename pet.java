/*
 * Benjamin Leanna
 * benjamin.leanna@snhu.edu
 * Pet.java for Module 4 - Project 1
 */



/*
 * Still have a few FIXME in here since I'll
 * need to link together a few classes
 * and get them to update each other.
 */

package pet;
import java.util.Scanner;

public class pet {
	private String petType;
	private String petName;
	private int petAge;
	private int daysStay;
	private double amountDue;
	
	static int dogSpace = 30;
	static int catSpace = 12;
	
    // Default constructor for Pet class
    public pet(String petType, String petName, int petAge, int dogSpace, int catSpace, int daysStay, double amountDue) {
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
        pet.dogSpace = dogSpace;
        pet.catSpace = catSpace;
        this.daysStay = daysStay;
        this.amountDue = amountDue;
    }
	// checkOut method FIXME: not implemented yet
    // finish this
	public void checkOut() {
	    checkOut();
	}
	// getPet method FIXME: not implemented yet
	public void getPet() {
	    getPet();
	}
	// createPet method FIXME: not implemented yet
	public void createPet() {
	    createPet();
	}
	// updatePet method FIXME: not implemented yet
	public void updatePet() {
	    updatePet();
	}
	public String getPetType() {
	    return petType;
	}
	public void setPetType(String petType) {
	    this.petType = petType;
	}
	public String getPetName() {
	    return petName;
	}
	public void setPetName(String petName) {
	    this.petName = petName;
	}
	public int getPetAge() {
	    return petAge;
	}
	public void setPetAge(int petAge) {
	    this.petAge = petAge;
	}
	public int getDogSpace() {
	    return dogSpace;
	}
	public void setDogSpace(int dogSpace) {
	    pet.dogSpace = dogSpace;
	}
	public int getCatSpace() {
	    return catSpace;
	}
	public void setCatSpace(int catSpace) {
	    pet.catSpace = catSpace;
	}
	public int getDaysStay() {
	    return daysStay;
	}
	public void setDaysStay(int daysStay) {
	    this.daysStay = daysStay;
	}
	public double getAmountDue() {
	    return amountDue;
	}
	public void setAmountDue(double amountDue) {
	    this.amountDue = amountDue;
	}
    // checkIn method
    public void checkIn() {
        System.out.print("Will you be checking in a cat or a dog?: ");

        // input from Scanner class
        Scanner input = new Scanner(System.in);
        String petChoice = input.nextLine().toLowerCase(); //make sure that input is lowered to ignore case sensitive typing

        // determine if user is checking in a cat or dog
        if (petChoice.equals("cat")) {
            System.out.println("Checking if there are available cat spaces....");
            // check if cat space is available
            if (getCatSpace() >= 1) {
                System.out.println("There is available space for your cat!");
                System.out.println("Has your cat been here before? (y/n): ");
                // check if cat has been here before
                String catVisitor = input.nextLine().toLowerCase();
                if (catVisitor.equals("n")) {
                	
                    System.out.println("Welcome kitty! Let's get some information: ");
                    
                    System.out.println("What is your cat's name?");
                    String newCatName = input.nextLine();
                    //set the cat's name
                    setPetName(newCatName);
                    
                    System.out.println("How old is your cat? ");
                    int newCatAge = input.nextInt();
                    //set the cat's age
                    setPetAge(newCatAge);
   
                    System.out.println("How many days will your cat be staying with us?");
                    int catDays = input.nextInt();
                    // set stay length
                    setDaysStay(catDays);

                    System.out.println("Thank you for the cat's information!");
                    System.out.println("All set! See you in " + catDays + "!");

                    --catSpace; //minus cat space
                    
          
                } 
                else if (catVisitor.equals("y")) {
                    System.out.println("Welcome back!");
                    System.out.println("Has any information changed about your cat?");
                    String infoChange = input.nextLine().toLowerCase();
                    	if (infoChange.equals("y")) {
                            System.out.println("What is your cat's name?");
                            String newCatName = input.nextLine();
                            //set the cat's name
                            setPetName(newCatName);
                            
                            System.out.println("How old is your cat? ");
                            int newCatAge = input.nextInt();
                            //set the cat's age
                            setPetAge(newCatAge);
           
                            System.out.println("How many days will your cat be staying with us?");
                            int catDays = input.nextInt();
                            // set stay length
                            setDaysStay(catDays);

                            System.out.println("Thank you for the cat's information!");
                            System.out.println("All set! See you in " + catDays + "!");
                    		updatePet();
                    	}
                        else {
                        	System.out.println("How many days will your cat be staying with us?");
                        	int catDays = input.nextInt();
                        	// set stay length
                        	setDaysStay(catDays);
                        	System.out.println("Thank you for the cat's information!");
                        	System.out.println("All set! See you in " + catDays + "!");
                    
                    	--catSpace; //minus cat space
                        }
                    }
            }

             
        	else {
                System.out.println("There are no more available cat spaces, sorry!");
            }
        }
     
    	else if (petChoice.equals("dog")) {
            System.out.println("Checking if there are available dog spaces...");
            // check if dog space is available
            if (getDogSpace() >= 1) {
                System.out.println("There is available space for your dog!");
                System.out.println("Has your dog been here before?");
                // check if dog has been here before
                String dogVisitor = input.nextLine().toLowerCase();
                if (dogVisitor.equals("n")) {
                	System.out.println("Welcome doggy! Let's get some information: ");
                    
                    System.out.println("What is your dog's name?");
                    String newDogName = input.nextLine();
                    //set the dog's name
                    setPetName(newDogName);
                    
                    System.out.println("How old is your dog? ");
                    int newDogAge = input.nextInt();
                    //set the cat's age
                    setPetAge(newDogAge);
   
                    System.out.println("How many days will your dog be staying with us?");
                    int dogDays = input.nextInt();
                    	if (dogDays >= 2) {
                    		// FIXME: getGrooming() from dog.java
                    		// FIXME: update price?
                    		setDaysStay(dogDays);
                    	}
                    	else {
                    	setDaysStay(dogDays);
                    	}
                    System.out.println("Thank you for your dog's information!");
                    System.out.println("All set! See you in " + dogDays + "!");

                    --dogSpace; //minus dog space
                    
          
                } 
                else if (dogVisitor.equals("y")) {
                    System.out.println("Welcome back!");
                    System.out.println("Has any information changed about your dog?");
                    String infoChange = input.nextLine().toLowerCase();
                    	if (infoChange.equals("y")) {
                    		System.out.println("What is your dog's name?");
                            String newDogName = input.nextLine();
                            //set the dog's name
                            setPetName(newDogName);
                            
                            System.out.println("How old is your dog? ");
                            int newDogAge = input.nextInt();
                            //set the cat's age
                            setPetAge(newDogAge);
           
                            System.out.println("How many days will your dog be staying with us?");
                            int dogDays = input.nextInt();
                            	if (dogDays >= 2) {
                            		// FIXME: getGrooming() from dog.java
                            		// FIXME: update price?
                            		setDaysStay(dogDays);
                            	}
                            	else {
                            	setDaysStay(dogDays);
                            	}
                            System.out.println("Thank you for your dog's information!");
                    		updatePet();
                    		System.out.println("All set! See you in " + dogDays + "!");
                    	}
                        else {
                        	System.out.println("How many days will your dog be staying with us?");
                        	int dogDays = input.nextInt();
                        	if (dogDays >= 2) {
                        		// FIXME : getGrooming from dog.java
                        		// FIXME : update price?
                        		setDaysStay(dogDays);
                        		System.out.println("Thank you for your dog's information!");
                        		System.out.println("All set! See you in " + dogDays + "!");
                        	}
                        	else {
                        	setDaysStay(dogDays);
                        	System.out.println("Thank you for your dog's information!");
                        	System.out.println("All set! See you in " + dogDays + "!");
                    
                    	--dogSpace; //minus dog space
                        }
                    }
            }
            else {
                System.out.println("Sorry no room left in Dog space");
            }
        } 
        else {
        	System.out.println("Invalid choice! please type 'cat or 'dog'");
            checkIn();
        }

    	}
    }
}
	

