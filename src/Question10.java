public class Question10 {

    public static void main(String[] args) {
        int number = 9098912;
        System.out.println(countLengthOfInteger_StringLambda(number));
    }

    private static long countLengthOfInteger_StringLambda(int number) {
        return String.valueOf(number).chars().count();
    }
}
