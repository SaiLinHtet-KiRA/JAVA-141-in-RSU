public class testStringmethod {
    public static void main(String[] args) {
        String a, b;
        a = "AREE";
        b = "aree";
        if (a.equalsIgnoreCase(b)) {
            System.out.print(a + " equals " + b);
        } else
            System.out.print(a + "not equals " + b);
    }
}
