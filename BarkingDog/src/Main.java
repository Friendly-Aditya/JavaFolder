public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        boolean test1 = BarkingDog.shouldWakeUp(true, 4);
        System.out.println(test1);
        boolean test2 = BarkingDog.shouldWakeUp(false,9);
        System.out.println(test2);
        boolean test3 = BarkingDog.shouldWakeUp(true,24);
        System.out.println(test3);
    }
}