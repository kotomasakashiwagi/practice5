import java.util.InputMismatchException;

public class Question7 implements Question {
    @Override
    public void run() {
        System.out.println("九九を計算します。数字を二つ入力してください。例； 3 4");

        try {
            IntPair kuKuPair = IntScanner.scanIntPair();
            int answer = UtilityOfList.calculateKuKu(kuKuPair);
            OneCharacterPrinter.printInt(answer);
        } catch (
                InputMismatchException e) {
            System.err.println("数字を入力してください。");

        }
    }
}
