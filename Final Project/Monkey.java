public class Monkey extends RescueAnimal {
    //variables
    private String breed;
    private String height;
    private String tailLength;
    private String bodyLength;

    public final static String[] MONKEY_BREEDS = {
        "Capuchin",
        "Tamarin",
        "Macaque",
        "Marmoset",
        "Squirrel monkey",
        "Guenon"
    };
    //constructor
    public Monkey(
        String name, String breed, String gender, String age,
        String weight, String height, String bodyLength, String tailLength,
        String acquisitionDate, String acquisitionCountry,
        String trainingStatus, boolean reserved, String inServiceCountry
    ) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setHeight(height);
        setBodyLength(bodyLength);
        setTailLength(tailLength);
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
    public String getHeight() {
        return height;
    }
    public String getTailLength() {
        return tailLength;
    }
    public String getBodyLength() {
        return bodyLength;
    }
    //mutator
    public void setBreed(String monkeyBreed) {
        breed = monkeyBreed;
    }
    public void setHeight(String monkeyHeight) {
        height = monkeyHeight;
    }
    public void setTailLength(String monkeyTailLength) {
        tailLength = monkeyTailLength;
    }
    public void setBodyLength(String monkeyBodyLength) {
        bodyLength = monkeyBodyLength;
    }
}
