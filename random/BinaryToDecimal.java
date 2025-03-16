package random;
public class BinaryToDecimal {
    public static void main(String[] args) {
        // Example binary number as an array of integers
        int[] binaryArray = {1, 0, 1, 1}; // Represents binary number 1011

        // Convert binary to decimal
        int decimal = binaryToDecimal(binaryArray);

        // Print the result
        System.out.println("Binary: 1011 to Decimal: " + decimal);
    }

    // Method to convert binary array to decimal
    public static int binaryToDecimal(int[] binaryArray) {
        int decimal = 0;
        int length = binaryArray.length;

        // Loop through each element in the binary array
        for (int i = 0; i < length; i++) {
            // Calculate the decimal value by multiplying the binary digit by 2 raised to the power of its position from the right end
            decimal += binaryArray[i] * Math.pow(2, length - 1 - i);
        }

        return decimal;
    }
}
