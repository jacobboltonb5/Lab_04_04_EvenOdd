public class Main {

    public static void main(String[] args) {
        int numToExamine = 7;
        int remainder = 0;

        remainder = numToExamine % 2;

        if (remainder == 0) {
            System.out.println("The number " + numToExamine + " is Even.");
        } else {
            System.out.println("The number " + numToExamine + " is Odd.");
        }
    }
}