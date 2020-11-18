import java.util.InputMismatchException;
import java.util.List;

public class Question1 implements Question {
    @Override
    public void run() {
        try {
            System.out.println("数字を１０個入力してください。例：1 2 3 4 5 6 7 8 9 0");
            List<Integer> list = ListScanner.scanListInt();
            List<Integer> dualList = UtilityOfList.MakeListElementDual(list);
            ListPrinter.printIntList(dualList);
        } catch (InputMismatchException e) {
            System.err.println("数字を入力してください。");
        }
    }
}
