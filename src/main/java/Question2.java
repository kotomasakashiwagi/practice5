import java.util.InputMismatchException;
import java.util.List;

public class Question2 implements Question {
    @Override
    public void run() {
        try {
            System.out.println("数字を１０個入力してください。例：1 2 3 4 5 6 7 8 9 0");
            List<Integer> tenIntegersList = ListScanner.scanListInt();
            List<Integer> upsideDownList = UtilityOfList.makeListUpsideDown(tenIntegersList);
            ListPrinter.printIntList(upsideDownList);
        } catch (InputMismatchException e) {
            System.err.println("数字を入力してください。");
        }
    }
}
