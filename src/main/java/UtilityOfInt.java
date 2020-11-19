public class UtilityOfInt {
    private static final int SIZE = 16;
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TWO = 2;

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int[] changeXToBinary(int value) {
        int[] binary = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            if (value == ONE) {
                binary[SIZE - i - 1] = ONE;
                for (int j = 0; j < SIZE - i - 1; j++) {
                    binary[j] = ZERO;
                }
                break;
            } else {
                int ZeroOrOne = value % TWO;
                binary[SIZE - i - 1] = ZeroOrOne;
                value = (value - ZeroOrOne) / TWO;
            }
        }
        return binary;
    }
}
