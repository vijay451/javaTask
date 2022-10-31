package oopsEx;

public class class2 extends class1{  //inheritance
    void printName() {  //method overriding
        System.out.println("My name is vishal");
    }

    public static void main(String[] args) {
        class2 c = new class2();
        c.printName();
        c.printName("vijay");
        System.out.println(c.name);
        //age is private so we can't access it

    }
}
