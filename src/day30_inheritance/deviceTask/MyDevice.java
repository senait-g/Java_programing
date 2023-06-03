package day30_inheritance.deviceTask;

public class MyDevice {

    private String Brand,model,color,size;

    private double price;

    private boolean hasBattery, hasPowerButton;


    public MyDevice(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
      setBrand(brand);
        setModel(model);
        setColor(color);
        setSize(size);
        setSize(size);
        setHasBattery(hasBattery);

        setHasPowerButton(hasPowerButton);
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public void turnOn(){


    }
}
/*
deviceTask (Extra Spicy)
	1. Create a class named Device
			Variables:
				brand, model, color, size, price
				hasBattery, hasPowerButton

			Encapsulate all the fields
					Conditions:
						1. brand, model can not be null (
						2. brand, model can not be empty or blank
						3. price can not be zero or negative

			Methods
				turnOn()
				turnOff()
				toString()


	2. Create The following sub classes of Devica

			1. Phone
				Extra methods:
					call(), text()

			2. TV
				Extra methods:
					channelUp()
					channelDown()

			3. Computer
				Add any extra variables/methods if needed

	3. Create the following sub classes of Phone and add any extra methods that are needed:

				1. Iphone
				2. Samsung
				3. BlackBerry
				4. Google
				5. Nokia


	4. Create the following sub classes of Computer and add any extra methods that are needed:
				1. PersonalComputer
				2. Desktop
				3. Laptop

	5. Create the following sub classes of TV and add any extra methods that are needed:
				1. SmartTV


	6. Create a class named MyDevices:
			Create the objects of each sub classes and

			test all the functions of each objects

            Analyze the relationships between the classes





 */