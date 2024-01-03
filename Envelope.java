abstract public class Envelope extends Mail {
    private double thickness;
    Envelope(){
        thickness = 0;
    }
    Envelope(String deliveryAddressPass, String returnAddressPass, double widthPass, double lengthPass, double thicknessPass){
        super(deliveryAddressPass, returnAddressPass, widthPass, lengthPass);
        thickness = thicknessPass;
    }
    public double getThickness() {
        return thickness;
    }
    @Override
    public String toString(){
        String envelopeInformation = super.toString() +
                "\n"+getWidth()+" x " + getLength() +" x "+getThickness();
        return envelopeInformation;
    }
}
