import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListScanner {
    public static List<Integer> scanListInt() {
        List<Integer> scannedList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int scannedInt = scan.nextInt();
            scannedList.add(scannedInt);
        }
        return scannedList;
    }

    public static List<Double> scanListUnderXorUntilYTimes(int supX, int maxTimes) {
        List<Double> scannedList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < maxTimes; i++) {
            double scannedDouble = scan.nextDouble();
            if (scannedDouble >= supX) {
                scannedList.add(scannedDouble);
                return scannedList;
            } else {
                scannedList.add(scannedDouble);
            }
        }
        return scannedList;
    }

    public static List<Double> scanListUnderXorUntilYTimes() {
        return scanListUnderXorUntilYTimes(100, 10);
    }
}


