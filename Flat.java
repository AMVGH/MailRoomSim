public class Flat extends Envelope {
    private String contents;
    Flat(){
        contents = "";
    }
    Flat(String deliveryAddressPass, String returnAddressPass, double widthPass, double lengthPass, double thicknessPass,
         String contentsPass){
        super(deliveryAddressPass, returnAddressPass, widthPass, lengthPass, thicknessPass);
        contents = contentsPass;
    }
    public String getContents(){
        return contents;
    }
}
