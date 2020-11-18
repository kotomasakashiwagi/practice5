import java.util.List;

public class UtilityOfList {
    public static List<Integer> MakeListElementDual(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) list.set(i, list.get(i) * 2);
        return list;
    }
}
