public class NumConvert {
    public static void main(String args[]) {
        // Binary to Decimal
        int binary = 1011;
        int decimal = 0;

        for (int i = 0; binary > 0; i++) {
            int b = binary % 10;
            decimal += Math.pow(2, i) * b;
            binary /= 10;
        }
        System.out.println(decimal);

        // Decimal to Binary
        int adecimal = 11;
        int abinary = 0;
        for (int i = 0; adecimal > 0; i++) {
            abinary = (abinary * 10) + adecimal % 2;
            adecimal /= 2;
        }

        int abbin = 0;
        for (int i = 0; abinary > 0; i++) {
            abbin = (abbin * 10) + abinary % 2;
            abinary /= 10;
        }

        System.out.println(abbin);  // Corrected from abinary to abbin
    }
}
