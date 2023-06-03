package day17_customClass;

public class Car {

public String make;
public String model;
public String year;
public String color;
public String price;

public void setInfo(String make,String model,String year,String color,String price){

    this.make = make;
    this.model = model;
    this.year = year;
    this.color = color;
    this.price = price;

}

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", color='" + color + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
/*
Create a custom class named Car
		Attributes:
			make, model, year, color, price

		Actions:
			setInfo(): sets all the fields of the car object
			toString(): when a car object is passed in print statement,
			it should display all the information of the car object
			start()
 */