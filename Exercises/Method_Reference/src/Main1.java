public class Main1 {

    static class Utils {
        public static void sayHi() {
            System.out.println("Hello World");
        }
    }

    @FunctionalInterface
    interface MyInterface {
        void greeting();
    }
    public static void main(String[] args) {

        MyInterface obj = Utils::sayHi;
        obj.greeting();
    }
}