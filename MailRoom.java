import java.util.ArrayList;
import java.util.Scanner;

public class MailRoom {
    static boolean handleLetter(Letter letter, ArrayList<Mail> deliver){
        //Series of checks to see if letter is valid
        //Checks for empty return and delivery addresses
        if ((letter.getDeliveryAddress() != "") && (letter.getReturnAddress() != "")){
            //Checks length of the letter
            if ((letter.getLength() >= 5) && (letter.getLength() <= 11.5)){
                //Checks the width of the letter
                if ((letter.getWidth() >= 3.5) && (letter.getWidth() <= 6.125)){
                    //Checks the thickness
                    if ((letter.getThickness() >= 0.007) && (letter.getThickness() <= 0.25)){
                        //Checks if rectangular
                        if ((letter.getLength() - letter.getWidth()) >= 1.5){
                            //If all previous conditions are met, letter is added to the deliver arrayList and returns true
                            deliver.add(letter);
                            return true;
                        }
                    }
                }
            }
        }
        //Else returns false
        return false;
    }
    static boolean handleFlat(Flat flat, ArrayList<Mail> deliver){
        //Series of checks to see if flat is valid
        //Checks for empty return and delivery addresses
        if ((flat.getDeliveryAddress() != "") && (flat.getReturnAddress() != "")){
            //Checks length of the flat
            if ((flat.getLength() >= 11.5) && (flat.getLength() <= 15)){
                //Checks the width of the flat
                if ((flat.getWidth() >= 6.125) && (flat.getWidth() <= 12)){
                    //Checks the thickness of the flat
                    if ((flat.getThickness() >= 0.25) && (flat.getThickness() <= 0.75)){
                        //Checks if contents equals DOCUMENTS
                        if (flat.getContents().equals("DOCUMENTS")){
                           deliver.add(flat);
                           return true;
                        }
                    }
                }
            }
        }
        //Else returns false
        return false;
    }
    static Boolean handleRegularBox(RegularBox regularBox, ArrayList<Mail> deliver){
        //Series of checks to see if RegularBox is valid
        //Checks for empty return and delivery addresses
        if ((regularBox.getDeliveryAddress() != "") && (regularBox.getReturnAddress() != "")){
            //Checks length of the box
            if ((regularBox.getLength() >= 6) && (regularBox.getLength() <= 27)){
                //Checks the width of the box
                if ((regularBox.getWidth() >= 0.25) && (regularBox.getWidth() <= 17)){
                    //Checks the height of the box
                    if ((regularBox.getHeight() >= 3) && (regularBox.getHeight() <= 17)){
                        //Checks the weight of the box
                        if ((regularBox.getWeight() >= 0) && (regularBox.getWeight() <= 70)){
                            //Checks count
                            if ((regularBox.getCount() >= 0) && (regularBox.getCount() <= 50)){
                                deliver.add(regularBox);
                                return true;
                            }

                        }
                    }
                }
            }
        }
        //Else returns false
        return false;
    }

    public static boolean handleLiveBox(LiveBox liveBox, ArrayList<Mail> deliver){
        //Series of checks to see if handleLiveBox is valid
        //Checks for empty return and delivery addresses
        if ((liveBox.getDeliveryAddress() != "") && (liveBox.getReturnAddress() != "")){
            //Checks length of the box
            if ((liveBox.getLength() >= 6) && (liveBox.getLength() <= 27)){
                //Checks the width of the box
                if ((liveBox.getWidth() >= 0.25) && (liveBox.getWidth() <= 17)){
                    //Checks the height of the box
                    if ((liveBox.getHeight() >= 3) && (liveBox.getHeight() <= 17)){
                        //Checks if the box contains a valid animal (Honeybees or Chicken)
                        if ((liveBox.getAnimal().equalsIgnoreCase("HONEYBEES") ) || (liveBox.getAnimal().equalsIgnoreCase("CHICKEN") )){
                            //If the animal is Honeybees, checks if the count is >= 0 and <= 20
                            if (liveBox.getAnimal().equalsIgnoreCase("HONEYBEES") ){
                                if ((liveBox.getCount()) >= 0 && (liveBox.getCount() <= 20)){
                                    //If true, add liveBox to deliver and return true
                                    deliver.add(liveBox);
                                    return true;
                                }
                            //If the animal is Chicken, check if the count is >= 0 and <= 10
                            } else if (liveBox.getAnimal().equalsIgnoreCase("CHICKEN") ) {
                                if ((liveBox.getCount() >= 0) && (liveBox.getCount() <= 10)){
                                    //If true, check ages to make sure not greater than one and non-negative
                                    if ((liveBox.getAge() <= 1) && (liveBox.getAge() >= 0)){
                                        //If true, add liveBox to deliver and return true
                                        deliver.add(liveBox);
                                        return true;
                                    }
                                }

                            }

                        }
                    }
                }
            }
        }
        //Else returns false
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList <Mail> deliver = new ArrayList<>();
        int menuChoice;

        System.out.println("Welcome to KSUPS");
        System.out.println();
        do {
            System.out.println("1- Send letter" +
                    "\n2- Send flat" +
                    "\n3- Send regular box" +
                    "\n4- Send live box" +
                    "\n5- Dispatch items" +
                    "\n6- Quit");
            System.out.print("Enter option: ");
            menuChoice = sc.nextInt();
            sc.nextLine();

            switch (menuChoice){
                case 1:
                    System.out.println();
                    //Reads in user information
                    System.out.print("Enter the delivery address: ");
                    String deliveryAddress = sc.nextLine();

                    System.out.print("Enter the return address: ");
                    String returnAddress = sc.nextLine();

                    System.out.print("Enter the width of your mail: ");
                    double mailWidth = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter the length of your mail: ");
                    double mailLength = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter the thickness of your mail: ");
                    double mailThickness = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter the contents of your letter: ");
                    String mailContents = sc.nextLine();

                    Letter letterSend = new Letter(deliveryAddress, returnAddress, mailWidth, mailLength, mailThickness, mailContents);

                    if (MailRoom.handleLetter(letterSend, deliver) == true){
                        System.out.println();
                        System.out.println("Letter accepted for delivery.");
                    }else{
                        System.out.println();
                        System.out.println("Letter not accepted for delivery.");
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    System.out.print("Enter the delivery address: ");
                    String flatDeliveryAddress = sc.nextLine();

                    System.out.print("Enter the return address: ");
                    String flatReturnAddress = sc.nextLine();

                    System.out.print("Enter the width of your mail: ");
                    double flatWidth = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter the length of your mail: ");
                    double flatLength = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter the thickness of your mail: ");
                    double flatThickness = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter the contents of your flat: ");
                    String flatContents = sc.nextLine();

                    Flat flatSend = new Flat(flatDeliveryAddress, flatReturnAddress, flatWidth, flatLength, flatThickness, flatContents);

                    if (MailRoom.handleFlat(flatSend, deliver) == true){
                        System.out.println();
                        System.out.println("Flat accepted for delivery.");
                    }else{
                        System.out.println();
                        System.out.println("Flat not accepted for delivery.");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    System.out.print("Enter the delivery address: ");
                    String boxDeliveryAddress = sc.nextLine();

                    System.out.print("Enter the return address: ");
                    String boxReturnAddress = sc.nextLine();

                    System.out.print("Enter the width of your mail: ");
                    double boxWidth = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter the length of your mail: ");
                    double boxLength = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter the height of your mail: ");
                    double boxHeight = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter how many items your box has: ");
                    int boxItemCount = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter the weight of your box: ");
                    double boxWeight = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter the contents of your box: ");
                    String boxItems = sc.nextLine();

                    RegularBox boxSend = new RegularBox(boxDeliveryAddress, boxReturnAddress, boxWidth, boxLength, boxHeight,
                            boxItemCount, boxItems, boxWeight);

                    if (MailRoom.handleRegularBox(boxSend, deliver) == true){
                        System.out.println();
                        System.out.println("Regular box accepted for delivery.");
                    }else{
                        System.out.println();
                        System.out.println("Regular box not accepted for delivery.");
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    System.out.print("Enter the delivery address: ");
                    String liveBoxDeliveryAddress = sc.nextLine();

                    System.out.print("Enter the return address: ");
                    String liveBoxReturnAddress = sc.nextLine();

                    System.out.print("Enter the width of your mail: ");
                    double liveBoxWidth = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter the length of your mail: ");
                    double liveBoxLength = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter the height of your mail: ");
                    double liveBoxHeight = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter how many items your box has: ");
                    int liveBoxCount = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter what animal is being shipped: ");
                    String liveBoxAnimal = sc.nextLine().trim();

                    System.out.print("Enter age of oldest animal in days: ");
                    int liveAnimalAge = sc.nextInt();
                    sc.nextLine();

                    LiveBox liveBoxSend = new LiveBox(liveBoxDeliveryAddress, liveBoxReturnAddress, liveBoxWidth, liveBoxLength, liveBoxHeight,
                            liveBoxCount, liveBoxAnimal, liveAnimalAge);
                    if (MailRoom.handleLiveBox(liveBoxSend, deliver) == true){
                        System.out.println();
                        System.out.println("Live box accepted for delivery.");
                    }else{
                        System.out.println();
                        System.out.println("Live box not accepted for delivery.");
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println();

                    if (deliver.size() == 0){
                        System.out.println("Delivery queue is empty");
                    }else{
                        System.out.println("DISPATCHING THE FOLLOWING ITEMS FOR DELIVERY: ");
                        for (int i = 0; i < deliver.size(); i++){
                            System.out.println("========");
                            String print = deliver.get(i).toString();
                            System.out.println(print);
                        }
                        System.out.println("========");
                    }


                    //Removes Mail Objects in delivery for dispatch
                    deliver.removeAll(deliver);
                    System.out.println();
                    break;


            }
        }while(menuChoice != 6);
        System.out.println();
        System.out.println("Quitting...");


    }

}
