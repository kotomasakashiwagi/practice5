import java.util.HashMap;
import java.util.Map;

public class QuestionSearcher {
    private static final Map<String, Question> questionMap = new HashMap<String, Question>() {
        {
            put("5-1", new Question1());
            put("5-2", new Question2());
            put("5-3", new Question3());
            put("5-4", new Question4());
            put("err", new OutOfQuestion());
        }
    };

    public static void selectQuestion(String questionNumber) {
        System.out.println(questionNumber);
        try {
            questionMap.get(questionNumber).run();
        } catch (NullPointerException e) {
            questionMap.get("err").run();
        }
    }
}
