import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select problem's number: ");
        int problemNum = sc.nextInt();

        switch (problemNum) {
            case 1:
                System.out.print("Answer to problem 1: ");
                problem1();
                break;
            case 2:
                System.out.println("Answer to problem 2: ");
                problem2();
                break;
            case 3:
                System.out.print("Answer to problem 3: ");
        }
    }

    public static void problem1() {
        int [] num = {5, 10, 1, 32, 3, 45};
        int min = findMin(num.length, num);
        System.out.println(min);
    }

    public static int findMin(int n, int[] arr) {
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void problem2() {
        int [] num = {4, 3, 2, 1};
        double avr = findAverage(num.length, num);
        System.out.println(avr);
    }
    public static double findAverage(int n, int[] arr) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return (double) sum / n;
    }
}