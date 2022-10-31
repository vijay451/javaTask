import java.util.LinkedList;
//Java program to insert the specified element at the specified position in the linked list
public class Exercise2 {
    public static void main(String[] args) {
        LinkedList <String> l_list = new LinkedList <String> ();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
        l_list.add(1, "Yellow");
        System.out.println("The linked list:" + l_list);
    }
}
