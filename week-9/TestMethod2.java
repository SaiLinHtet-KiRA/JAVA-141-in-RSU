class TestMethod2 {
    public static void main(String[] args) {
        System.out.print("round 1 = " + plus2(10, 20));
        System.out.print("round 2 = " + plus2(30, 40));
    }

    static int plus2(int num1, int num2) {
        int num3 = num1 + num2;
        return num3;
    }

}
