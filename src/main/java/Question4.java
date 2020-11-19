import java.util.InputMismatchException;
import java.util.List;

public class Question4 implements Question {
    @Override
    public void run() {
        try {
            System.out.println("数字を１０個入力するか100以上の数まで入力してください。例：1 2 3 4 5 6 7 8 9 0　または　1 2 3 4 120");
            List<Double> scannedList = ListScanner.scanListUnderXorUntilYTimes();
            double sumOfList = UtilityOfList.calculateSumOfDoubleList(scannedList);
            OneCharacterPrinter.printDouble(sumOfList);
        } catch (InputMismatchException e) {
            System.err.println("数字を入力してください。");
        }
    }
}
