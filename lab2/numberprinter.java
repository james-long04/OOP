import java.util.Random;

public class NumberPrinter {

    // Private method that prints numbers from a to b (inclusive)
    private void printFromAtoB(int a, int b) {
        int start = Math.min(a, b);
        int end = Math.max(a, b);
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }

    // Public method to print y integers starting from x
    public void printStartingFromX(int x, int y) {
        printFromAtoB(x, x + y - 1);
    }

    // Public method to print numbers from two strings
    public void printFromStringArguments(String a, String b) {
        try {
            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);
            printFromAtoB(x, y);
        } catch (NumberFormatException e) {
            System.out.println("Error: invalid integer input");
        }
    }

    // Public method to print random integers
    public void printWithRandomNumbers() {
        Random rand = new Random();
        int x = rand.nextInt(100);  // Random number between 0 and 99
        int y = rand.nextInt(100);  // Random number between 0 and 99
        System.out.println("Printing numbers between " + x + " and " + y + ":");
        printFromAtoB(x, y);
    }

    public static void main(String[] args) {
        NumberPrinter np = new NumberPrinter();

        // Test the printStartingFromX function
        System.out.println("Calling function printStartingFromX with arguments 4 and 5. Expected output: 4 5 6 7 8.");
        np.printStartingFromX(4, 5);

        // Test the printFromStringArguments function
        System.out.println("Calling function printFromStringArguments with arguments '4' and '10'. Expected output: 4 5 6 7 8 9 10.");
        np.printFromStringArguments("4", "10");

        // Test the printWithRandomNumbers function
        System.out.println("Calling function printWithRandomNumbers with no arguments.");
        np.printWithRandomNumbers();
    }
}

