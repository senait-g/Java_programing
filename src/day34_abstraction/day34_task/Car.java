package day34_abstraction.day34_task;

public  abstract class Car {

    private final String make,model;
    private final int year;
    private double price;
    private String color;

    public Car(String make, String model,int year,double price,String color){

        if (make == null || make.isEmpty()){
            terminate("Invalid make: " + make);

        }
        this.make = make;
        if(model == null || model.isEmpty()){
            terminate("Invalid model: "+model);
        }
        this.model = model;
        if(year < 1886){
            terminate("Invalid year: "+year);
        }
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    private void terminate(String message){
        System.err.println(message);
        System.exit(1);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color == null || color.isEmpty()){
            terminate("Invalid make: "+color);
        }
        this.color = color;
    }

    public abstract void drive();

    public abstract void start();

    public final void stop(){
        System.out.println("Press the break to stop the car "+make+" "+model);
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public abstract void autoPilot();
}








/*
Car Task:
	1. Create an Abstract class named Car:
				Variables:
					make (final), model (final), year (final), price, color

				Encapsulate all the fields

				Add a constructor that can set all the fields

				Condition for setting the fields:
						1. make, model, color can not be null
						2. make, model, color can not be empty
						2. year can not be less than 1886
						2. price can not be negative

				abstract methods:
					start();
					drive();

				none abstract methods:
					stop()
					toString()


	2. Create an interface named AutoPark
				Variables:
					hasAutoPark

				Abstract method:
					autoPark();

	3. Create a child interface of AutoPark named AutoPilot
						hint: interface can inherit from another interface by using extend keyword
				Variables:
					hasAutoPilot

				Abstract method:
					selfDrive();

	4. Create an interface named Flyable
				Variables:
						canFly

				Abstract Method
					fly();


	5. Create a subclass of Car named Toyota

	6. Create a sub class of Car named Honda

	7. Create a subclass of Car named BMW

	8. Create two sub class of Car named Audi &  Mercedes that implements AutoPark interface

	9. Create Two sub classes of Car named Tesla & Nio that implements AutoPark & AutoPilot interfaces

	10 Create a sub class of Car named CydeoCar that implements AutoPark, AutoPilot and Flyable interfaces

	11. Create a class named CarShop:
			Create an object from each concrete class

			Test all the functions of each objects

            Analyze the relationships between the classes


 */