import java.util.HashMap;
import java.util.Map;

public class QuestionSearcher {
    private static final Map<String, Question> questionMap = new HashMap<String, Question>() {
        {
            put("5-1", new Question1());
            put("err", new OutOfQuestion());
        }
    };

    public static void selectQuestion(String s) {
        System.out.println(s);
        try {
            questionMap.get(s).run();
        } catch (NullPointerException e) {
            questionMap.get("err").run();
        }
    }
}
