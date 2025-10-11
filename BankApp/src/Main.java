public class Main {
    public static void main(String[] args) {

        Calculator sum = (a,b) -> a + b;
        System.out.println("Sum: " + sum.calculate(10, 20));

        System.out.println();
    }
}