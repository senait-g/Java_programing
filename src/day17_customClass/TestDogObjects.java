package day17_customClass;

public class TestDogObjects {

    public String name;  // instance variable
    public String breed;
    public String size;
    public char gender;
    public int age;
    public String color;

                         // "Max" ,    "Husky",       'M',       4,        "Small",      "White"
    public void setInfo(String name,String breed, char gender, int age, String size, String color){

        this.name = name;  // this keyword is used for calling the instance variable name
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.age = age;
        this.color = color;

    } // this method can help us to set all the information of the dog at once


public void eat(){

    System.out.println(name + " is eating");
}

}
