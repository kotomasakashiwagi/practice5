import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListScanner {
    public static List<Integer> scanListInt() {
        List<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int n = scan.nextInt();
            list.add(n);
        }
        return list;
    }
}

