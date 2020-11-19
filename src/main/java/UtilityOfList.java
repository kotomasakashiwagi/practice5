import java.util.ArrayList;
import java.util.List;

public class UtilityOfList {
    public static List<Integer> makeListElementDual(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) list.set(i, list.get(i) * 2);
        return list;
    }

    public static List<Integer> makeListUpsideDown(List<Integer> integerList) {
        List<Integer> upDownList = new ArrayList<>();
        for (int i = 0; i < integerList.size(); i++) upDownList.add(integerList.get(integerList.size() - i - 1));
        return upDownList;
    }

    public static List<List<Integer>> separateListEvenOdd(List<Integer> integerList) {
        List<List<Integer>> evenAndOdd = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        for (int i = 0; i < integerList.size(); i++) {
            boolean even = UtilityOfInt.isEven(integerList.get(i));
            if (even) {
                evenList.add(integerList.get(i));
            } else {
                oddList.add(integerList.get(i));
            }
        }
        evenAndOdd.add(evenList);
        evenAndOdd.add(oddList);
        return evenAndOdd;
    }

    public static double calculateSumOfDoubleList(List<Double> doubleList) {
        double sum = 0;
        for (Object o : doubleList) {
            sum += (double) o;
        }
        return sum;
    }

}
