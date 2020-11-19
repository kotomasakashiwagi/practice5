import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question5 implements Question {
    private static final int SIZE = 16;
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TWO = 2;

    @Override
    public void run() throws IOException {
        System.out.println("正の整数を入力してください");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int value = Integer.parseInt(br.readLine());

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

// 配列 binaryに0か1を代入する

            for (int i = 0; i < SIZE; i++)
                System.out.print(binary[i]);
        } catch (NumberFormatException e) {
            System.out.println("正の整数を入力してください");
        }
    }
}
