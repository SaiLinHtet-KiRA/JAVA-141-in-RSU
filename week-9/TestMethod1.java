class TestMethod1 {
    public static void main(String[] args) {
        plus1(10, 20);
        plus1(30, 40);
    }// end main

    static void plus1(int num1, int num2) {
        int num3 = num1 + num2;
        System.out.print("num1=" + num1 + "; num2 = " + num2 + "num3 = num1 + num2 = " + num3);
    }

}
