public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int MyValue = 1000;
        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer MIn Value = "+myMinValue);
        System.out.println("Integer Max Value = "+myMaxValue);
        System.out.println("Busted Max Value = "+ (myMaxValue + 1));
        System.out.println("Busted Min Value = "+ (myMinValue - 1));
        int Maxnumber = 2147483647;
        System.out.println(Maxnumber);
    
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short MIn Value = "+myMinShortValue);
        System.out.println("Short Max Value = "+myMaxShortValue);

        byte Abite = 55;
        short Ashort = 555;
        int Aint = 5555;
        long Along = 50000 + 10 * (Abite + Ashort + Aint);
        System.out.println(Along);
        long Blong = 50000L + 10 * (long) (Abite + Ashort + Aint);
        System.out.println(Blong);
        short Bshort = 1000 + 10 * (short) (Abite + Ashort + Aint);
        System.out.println(Bshort);

    }
}