// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Fall seven times ");
        System.out.println("and ");
        System.out.println("stand up eight");
        int num = 1234, reversed = 0;

        while(num != 0) {

            int digit = num % 10;
            reversed = reversed * 10 + digit;

            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}


