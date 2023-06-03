package day34_abstraction;

import day34_abstraction.day34_task.Car;
import day35_polymorphism.transportationTask.AutoPilot;

public class Nio {

    public final class nio extends Car implements AutoPilot {


        public nio(String model, int year, double price, String color) {
            super("Nio", model, year, price, color);
        }

        @Override
        public void drive() {
            System.out.println("Driving "+getMake()+" "+getModel()+" on the road");
        }

        @Override
        public void start() {
            System.out.println("Press the start button to start "+getMake()+" "+getModel());
        }

        @Override
        public void autoPark() {
            System.out.println(getMake()+" "+getModel()+" auto park mode is on");
        }

        @Override
        public void autoPilot() {
            System.out.println(getMake()+" "+getModel()+" auto pilot mode is on");
        }

        @Override
        public void selfDrive() {

        }
    }

}
