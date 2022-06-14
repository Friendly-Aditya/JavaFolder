public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double test1 = AreaCalculator.area(21);
        System.out.println(test1);
        double test2 = AreaCalculator.area(24,11);
        System.out.println(test2);
        double test3 = AreaCalculator.area(-21);
        System.out.println(test3);
        double test4 = AreaCalculator.area(-1,32);
        System.out.println(test4);
    }
}