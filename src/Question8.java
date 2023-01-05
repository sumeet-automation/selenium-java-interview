public class Question8 {

    public static void main(String[] args) {
        final int num = 123456;
        System.out.println(getLastDigit(num));
        System.out.println(getFirstDigit(num));
    }

    private static int getLastDigit(final int num) {
        return num % 10;
    }

    private static int getFirstDigit(final int num) {
        return Integer.parseInt(String.valueOf(num).substring(0,1));
    }
}
