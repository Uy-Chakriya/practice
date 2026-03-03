import static java.lang.Integer.sum;
//Lamda Expression 2
public class Sum {

    @FunctionalInterface
    interface Maths{
        int sum(int a, int b);
    }


    public static void main(String[] args) {
        Maths sum = (a,b) -> a+b;

        int result = sum(2,10);
        System.out.println(result);

    }

}