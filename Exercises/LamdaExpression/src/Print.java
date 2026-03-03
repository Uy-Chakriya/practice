
//Lamda Expression 1

public class Print {

    interface MyInterface{
        void print();
    }

    public static void main(String[] args) {
        MyInterface obj = ()-> System.out.println("Hello World");
        obj.print();
    }

}