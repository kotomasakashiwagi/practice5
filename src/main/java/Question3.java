import java.util.InputMismatchException;
import java.util.List;

public class Question3 implements Question {
    @Override
    public void run() {
        try {
            System.out.println("数字を１０個入力してください。例：1 2 3 4 5 6 7 8 9 0");
            List<Integer> tenIntegersList = ListScanner.scanListInt();
            List<List<Integer>> lists = UtilityOfList.separateListEvenOdd(tenIntegersList);
            System.out.print("偶数");
            ListPrinter.printIntList(lists.get(0));
            System.out.print("\n");
            System.out.print("奇数");
            ListPrinter.printIntList(lists.get(1));
        } catch (InputMismatchException e) {
            System.err.println("数字を入力してください。");
        }

    }

}
