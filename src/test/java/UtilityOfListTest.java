import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UtilityOfListTest {
    public static List<Integer> createList() {
        List<Integer> testList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            testList.add(i);
        }
        return testList;
    }

    public static List<Double> createDoubleList() {
        List<Double> testList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            testList.add((double) i);
        }
        return testList;
    }

    @Test
    public void makeListElementDualTest() {
        List<Integer> testList = createList();
        List<Integer> elementDualList = UtilityOfList.makeListElementDual(testList);
        assertEquals(0, elementDualList.get(0));
        assertEquals(2, elementDualList.get(1));
        assertEquals(4, elementDualList.get(2));
        assertEquals(6, elementDualList.get(3));
        assertEquals(10, elementDualList.size());
    }

    @Test
    public void makeListUpsideDownTest() {
        List<Integer> testList = createList();
        List<Integer> upsideDownList = UtilityOfList.makeListUpsideDown(testList);
        assertEquals(9, upsideDownList.get(0));
        assertEquals(8, upsideDownList.get(1));
        assertEquals(7, upsideDownList.get(2));
        assertEquals(6, upsideDownList.get(3));
        assertEquals(10, upsideDownList.size());
    }

    @Test
    public void separateListEvenOddTest() {
        List<Integer> testList = createList();
        List<List<Integer>> evenAndOddLists = UtilityOfList.separateListEvenOdd(testList);
        assertEquals(0, evenAndOddLists.get(0).get(0));
        assertEquals(2, evenAndOddLists.get(0).get(1));
        assertEquals(4, evenAndOddLists.get(0).get(2));
        assertEquals(1, evenAndOddLists.get(1).get(0));
        assertEquals(3, evenAndOddLists.get(1).get(1));
        assertEquals(5, evenAndOddLists.get(1).get(2));
        assertEquals(5, evenAndOddLists.get(0).size());
        assertEquals(5, evenAndOddLists.get(1).size());
    }

    @Test
    public void makeListAscendingOrderTest() {
        List<Integer> testList = createList();
        testList.add(5);
        testList.add(2);
        List<Integer> ascendingOrderList = UtilityOfList.makeListAscendingOrder(testList);
        assertEquals(0, ascendingOrderList.get(0));
        assertEquals(1, ascendingOrderList.get(1));
        assertEquals(2, ascendingOrderList.get(2));
        assertEquals(2, ascendingOrderList.get(3));
        assertEquals(3, ascendingOrderList.get(4));
        assertEquals(5, ascendingOrderList.get(7));
        assertEquals(12, ascendingOrderList.size());
    }

    @Test
    public void calculateSumOfDoubleListTest() {
        List<Double> testList = createDoubleList();
        double sumOfList = UtilityOfList.calculateSumOfDoubleList(testList);
        assertEquals(45.0, sumOfList);
    }

    @Test
    public void kuKuTest() {
        int[][] kuKu = UtilityOfList.createKuKu();
        assertEquals(81, kuKu[8][8]);
        assertEquals(42, kuKu[5][6]);
        assertEquals(7, kuKu[0][6]);
    }

    @Test
    public void calculateKuKuTest() {
        IntPair kuKuPair56 = new IntPair(5, 6);
        IntPair kuKuPair27 = new IntPair(2, 7);
        IntPair kuKuPair38 = new IntPair(3, 8);
        assertEquals(30, UtilityOfList.calculateKuKu(kuKuPair56));
        assertEquals(14, UtilityOfList.calculateKuKu(kuKuPair27));
        assertEquals(24, UtilityOfList.calculateKuKu(kuKuPair38));
    }

}