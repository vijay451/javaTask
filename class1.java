package oopsEx;

public class class1 {
    public String name = "vijay";
    private int age = 25;

    void printName() {   //method overloading
        System.out.println("vijay");
    }

    void printName(String nameInput) {  //method overloading
        System.out.println("My name is "+ nameInput);
    }
}
