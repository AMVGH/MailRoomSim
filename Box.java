abstract public class Box extends Mail {
    private double height;
    private int count;
    Box(){
        height = 0;
        count = 0;
    }
    Box(String deliveryAddressPass, String returnAddressPass, double widthPass, double lengthPass, double heightPass,
        int countPass){
        super(deliveryAddressPass, returnAddressPass, widthPass, lengthPass);
        height = heightPass;
        count = countPass;
    }
    public double getHeight(){
        return height;
    }

    public int getCount(){
        return count;
    }

    @Override
    public String toString(){
        String boxInformation = super.toString() +
                "\n"+getWidth()+" x "+getLength()+" x "+getHeight();
        return boxInformation;
    }
}
