public class Main {

    public static void main(String[] args) {
        // Create an object of NumberPrinter
        NumberPrinter np = new NumberPrinter();

        // Test the printStartingFromX function
        System.out.println("Calling function printStartingFromX with arguments 4 and 5. Expected output: 4 5 6 7 8.");
        np.printStartingFromX(4, 5);

        // Test the printFromStringArguments function with valid inputs
        System.out.println("Calling function printFromStringArguments with arguments '4' and '10'. Expected output: 4 5 6 7 8 9 10.");
        np.printFromStringArguments("4", "10");

        // Test the printFromStringArguments function with invalid inputs (non-numeric)
        System.out.println("Calling function printFromStringArguments with arguments 'four' and 'ten'. Expected output: Error message for invalid input.");
        np.printFromStringArguments("four", "ten");

        // Test the printWithRandomNumbers function
        System.out.println("Calling function printWithRandomNumbers with no arguments.");
        np.printWithRandomNumbers();
    }
}
