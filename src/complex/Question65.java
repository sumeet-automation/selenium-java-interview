package complex;

public class Question65 {

    private int a;
    private Integer b;

    Question65(int a, Integer b) {
        a=a;
        b=b;
    }

    public void outputPrint() {
        System.out.println(String.format("a = %s, b = %s",a,b));
    }

    public static void main(String[] args) {
        Question65 question = new Question65(10,50);
        question.outputPrint();
    }
}
