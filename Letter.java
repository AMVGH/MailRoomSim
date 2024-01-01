public class Letter extends Envelope{
    private String letterBody;
    Letter(){
        letterBody = "";
    }
    Letter(String deliveryAddressPass, String returnAddressPass, double widthPass, double lengthPass,
           double thicknessPass, String letterBodyPass){
        super(deliveryAddressPass, returnAddressPass, widthPass, lengthPass, thicknessPass);
        letterBody = letterBodyPass;
    }

    public String getLetterBody(){
        return letterBody;
    }
}
