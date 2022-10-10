public class Monkey extends RescueAnimal {
   private String breed;//variable
   public final static String[] MONKEY_BREEDS = {
      "Capuchin",
      "Tamarin"
      "Macaque",
      "Marmoset",
      "Squirrel monkey",
      "Guenon",
   };
   //constructor
   public Monkey( 
      String name, String breed, String gender, String age,
      String weight, String acquisitionDate, String acquisitionCountry,
      String trainingStatus, boolean reserved, String inServiceCountry
   ) {
      setName(name);
      setBreed(breed);
      setGender(gender);
      setAge(age);
      setWeight(weight);
      setAcquisitionDate(acquisitionDate);
      setAcquisitionLocation(acquisitionCountry);
      setTrainingStatus(trainingStatus);
      setReserved(reserved);
      setInServiceCountry(inServiceCountry);
   }
   //accessor
   public String getBreed() {
      return breed;
   }
   //mutator
   public void setBreed(String monkeyBreed) {
      breed = monkeyBreed;
   }
}
