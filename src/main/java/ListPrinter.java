import java.util.List;

public class ListPrinter {
    public static void printIntList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) System.out.print(list.get(i) + " ");
    }

    public static void printDoubleList(List<Double> list) {
        for (int i = 0; i < list.size(); i++) System.out.print(list.get(i) + " ");
    }

    public static void printTwoDimArray(int[][] TwoDimArray) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++)
                System.out.printf(" %2d", TwoDimArray[i][j]);

            System.out.println();
        }
    }

    public static void printBinary(int[] binary) {
        for (int i = 0; i < 16; i++)
            System.out.print(binary[i]);
    }
}
