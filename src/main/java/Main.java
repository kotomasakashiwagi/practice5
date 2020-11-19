import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println("引数の数はひとつで問題番号である必要があります。");
            System.exit(0);
        }
        QuestionSearcher.selectQuestion(args[0]);
    }
}
