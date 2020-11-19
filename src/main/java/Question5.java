import java.io.IOException;

public class Question5 implements Question {

    @Override
    public void run() throws IOException {
        System.out.println("正の整数を入力してください");
        try {
            int value = IntScanner.scanInt();
            int[] binary = UtilityOfInt.changeXToBinary(value);
            ListPrinter.printBinary(binary);
        } catch (NumberFormatException e) {
            System.out.println("正の整数を入力してください");
        }
    }
}
