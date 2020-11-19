import java.util.List;

public class ListPrinter {
    public static void printIntList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) System.out.print(list.get(i) + " ");
    }

    public static void printDoubleList(List<Double> list) {
        for (int i = 0; i < list.size(); i++) System.out.print(list.get(i) + " ");
    }
}
