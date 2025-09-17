public class testStringmethod6 {
    public static void main(String[] args) {
        String studentWord1 = "Welcome to Java, Hello everybody, My name is Somsri,  Hello!!!";
        int pos1 = studentWord1.indexOf("Hello");
        System.out.println("index = " + pos1);
        int pos2 = studentWord1.indexOf("Hello", 25);
        System.out.println("index = " + pos2);
        int pos3 = studentWord1.lastIndexOf("Hello");
        System.out.println("index = " + pos3);
        int pos4 = studentWord1.lastIndexOf("Hello", 25);
        System.out.println("index = " + pos4);
    }
}
