package day12_customMethods;

public class emailDomain {

    public static void main(String[] orgs){

      emailDomain("Cydeo@gmail.com");


    }

    public static void emailDomain(String email){

        String domain = email.substring(email. indexOf('@') + 1,email.lastIndexOf('.'));

        System.out.println(domain);
    }
}
/*
1. Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail

 */