package day30_inheritance.typesOfInheritanc;

import java.time.LocalDate;

public class President extends Person {

    private LocalDate electedDate;

    public President(String name, char gender, LocalDate DOB, LocalDate electedDate) {
        super(name, gender, DOB);
        this.electedDate = electedDate;
    }

    public LocalDate getElectedDate(){

        return electedDate;
    }

    public void setElectedDate(LocalDate electedDate){

        this.electedDate = electedDate;
    }

    public void lie(){
        System.out.println(getName()+ " is lying");

    }
}
