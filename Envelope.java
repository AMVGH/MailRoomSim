abstract public class Envelope extends Mail {
    private double thickness;
    Envelope(){
        //Calls parent default constructor by default when instantiated?
        thickness = 0;
    }
    Envelope(String deliveryAddressPass, String returnAddressPass, double widthPass, double lengthPass, double thicknessPass){
        //If passing to parent constructor, super must be first statement in constructor body
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
