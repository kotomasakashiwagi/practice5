import java.util.InputMismatchException;
import java.util.List;

public class Question8 implements Question {
    @Override
    public void run() {
        try {
            System.out.println("整数を１０個入力してください。例：1 2 3 4 5 6 7 8 9 0");
            List<Integer> tenIntegersList = ListScanner.scanListInt();
            List<Integer> ascendingOrderList = UtilityOfList.makeListAscendingOrder(tenIntegersList);
            ListPrinter.printIntList(ascendingOrderList);
        }catch (InputMismatchException e) {
            System.err.println("整数を入力してください。");
        }

    }
}
