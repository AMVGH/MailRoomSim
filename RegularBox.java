public class RegularBox extends Box{
    private String items;
    private double weight;
    RegularBox(){
        weight = 0;
        items = "";
    }
    RegularBox(String deliveryAddressPass, String returnAddressPass, double widthPass, double lengthPass, double heightPass,
               int countPass, String itemsPass, double weightPass){
        super(deliveryAddressPass, returnAddressPass, widthPass, lengthPass, heightPass, countPass);
        items = itemsPass;
        weight = weightPass;
    }
    public String getItems(){
        return items;
    }
    public double getWeight(){
        return weight;
    }
    @Override
    public String toString(){
        String regularBoxInformation = super.toString() +
                "\nItems: " + getItems() +
                "\nCount: " + getCount() +
                "\nWeight: " + getWeight();
        return regularBoxInformation;
    }
}
