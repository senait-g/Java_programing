package day04_concatenation;

public class ShippingAddress {


    public static void main(String[] args) {

        String name = "Aaron Kissinger";
        String buildingNumber = "13621A";
        String streetName = "Legacy Circle";
        String city = "Fairfax";
        String state = "VA";
        String zipcode = "22030";

        System.out.println("Your Shipping address is:");
        System.out.println("\t" + name);
        System.out.println("\t" + buildingNumber + " " + streetName);
        System.out.println("\t" + city + " , " + state + " " +  22030);


        System.out.println("------------------------------------------------");


        System.out.println("Your Shipping address is:\n\t" + name + "\n\t " + buildingNumber + " "
                + streetName + "\n\t" + city + "," + state + " " + zipcode);




    }
}
