package string;

public class Question64 {

    record Check(String var1, String var2, String var3) {
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Check check = (Check) o;
            boolean flag1 = ((Check) o).var1.equals(var1) || ((Check) o).var1.equals(var2) || ((Check) o).var1.equals(var3);
            boolean flag2 = ((Check) o).var2.equals(var1) || ((Check) o).var2.equals(var2) || ((Check) o).var2.equals(var3);
            if (flag1 && flag2) {
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        String[] arr1 = {"a:d:e", "d:e:f", "g:h:i"};
        String[] arr2 = {"a:b"};
        String[] data2 = arr2[0].split(":");
        for (String check1 : arr1) {
            String[] data = check1.split(":");
            System.out.println(new Check(data[0], data[1], data[2]).equals(new Check(data2[0], data2[1], null)) + " ---- " + new Check(data[0], data[1], data[2]));
        }
    }
}
