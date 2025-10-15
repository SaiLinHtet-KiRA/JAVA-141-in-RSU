import java.util.Scanner;

public class Practice3 {
    static int minimum(int[] arr) {
        int minimum = 0;

        for (int number : arr) {
            if (minimum == 0) {
                minimum = number;
            }
            if (number < minimum) {
                minimum = number;
            }
        }

        return minimum;
    }

    static int maximum(int[] arr) {
        int maximum = 0;

        for (int number : arr) {
            if (number > maximum) {
                maximum = number;
            }

        }

        return maximum;
    }

    static int search(int[] arr) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please input integer number which is for search: ");
        int toFind = sc.nextInt();

        int position = 6;

        for (int i = 1; i <= 5; i++) {
            if (arr[i - 1] == toFind) {
                position = i - 1;
            }
        }

        return position;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];

        for (int i = 1; i <= 5; i++) {
            System.out.print("Please input integer for " + i + " value: ");
            num[i - 1] = sc.nextInt();
        }

        System.out.println("Minimum value: " + minimum(num));
        System.out.println("Maximum value: " + maximum(num));

        int position = search(num);

        if (position < num.length) {
            System.out.println("Your value in array position is : " + position);
        } else {
            System.out.println("Your value in array position is not found ");
        }
        while (true) {
            for (int i = 1; i <= num.length; i++) {

                if (num[i - 1] < num[i]) {
                    int temp = num[i - 1];
                    num[i - 1] = num[i];
                    num[i] = temp;
                }

            }
            break;
        }

        for (int i = 1; i <= 5; i++) {
            System.out.print("sorted:" + num[i - 1]);
        }
    }
}
