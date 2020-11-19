public class Question6 implements Question {
    @Override
    public void run() {
        int[][] kuKu = UtilityOfList.createKuKu();
        ListPrinter.printTwoDimArray(kuKu);
    }
}
