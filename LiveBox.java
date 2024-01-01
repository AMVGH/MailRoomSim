public class LiveBox extends Box{
    private String animal;
    private int age;
    LiveBox(){
        animal = "";
        age = 0;
    }
    LiveBox(String deliveryAddressPass, String returnAddressPass, double widthPass, double lengthPass, double heightPass,
            int countPass, String animalPass, int agePass){
        super(deliveryAddressPass, returnAddressPass, widthPass, lengthPass, heightPass, countPass);
        animal = animalPass;
        age = agePass;
    }
    public String getAnimal(){
        return animal;
    }
    public int getAge(){
        return age;
    }
    @Override
    public String toString(){
        String LiveBoxInformation = super.toString()
                +"\nAnimal: "+getAnimal()
                +"\nCount: "+getCount()
                +"\nAge (Days): " +getAge();
        return LiveBoxInformation;
    }
}
