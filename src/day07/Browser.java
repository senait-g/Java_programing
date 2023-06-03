package day07;

public class Browser {
    public static void main(String[] args) {

        String browser = "abc";

        if (browser == "chrome" || browser == "firefox" || browser == "opera" || browser == "safari" || browser == "edge") {


            if (browser == "chrome") {
                System.out.println("Chrome Browser is selected");
            } else if (browser == "firefox") {
                System.out.println("Firefox Browser is selected");
            } else if (browser == "opera") {
                System.out.println("Opera Browser is selected");
            } else if (browser == "safari") {
                System.out.println("Safari Browser is selected");
            } else {
                System.out.println("Edge Browser is selected");
            }


        } else {
            System.out.println("Invalid Browser is selected");


        }
    }
}