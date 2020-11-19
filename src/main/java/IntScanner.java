import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IntScanner {

    public static int scanInt() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(br.readLine());
    }

    public static IntPair scanIntPair() {
        Scanner scan = new Scanner(System.in);
        return new IntPair(scan.nextInt(), scan.nextInt());
    }

    public static IntPair scanKuKu() {
        IntPair kuKuPair = scanIntPair();
        if (kuKuPair.getX() < 1 || kuKuPair.getY() < 1 || kuKuPair.getX() > 9 || kuKuPair.getY() > 9) {
            System.out.println("正しい数字を入力してください");
            System.exit(0);
        }
        return kuKuPair;
    }
}
