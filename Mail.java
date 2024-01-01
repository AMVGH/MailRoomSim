abstract public class Mail {
    private String deliveryAddress;
    private String returnAddress;
    private double width;
    private double length;
    private int id;
    private static int nextId = 0;
    Mail(){
        deliveryAddress = "";
        returnAddress = "";
        width = 0;
        length = 0;
        id = nextId;
        nextId++;
    }
    Mail(String deliveryAddressPass, String returnAddressPass, double widthPass, double lengthPass){
        deliveryAddress = deliveryAddressPass;
        returnAddress = returnAddressPass;
        width = widthPass;
        length = lengthPass;
        id = nextId;
        nextId++;
    }
    public String getDeliveryAddress() {
        return deliveryAddress;
    }
    public String getReturnAddress(){
        return returnAddress;
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public int getId(){
        return id;
    }

    @Override
    public String toString(){
        String mailInformation = getId()
                +"\n"+getDeliveryAddress()
                +"\n"+getReturnAddress();
        return mailInformation;
    }

}
