import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select problem's number: ");
        int problemNum = sc.nextInt();

        switch (problemNum) {
            case 1:
                System.out.println("Answer to problem 1:");
                problem1();
                break;
            case 2:
                System.out.println("Answer to problem 2:");
                problem2();
                break;
            case 3:
                System.out.println("Answer to problem 3:");
                problem3();
                break;
            case 4:
                System.out.println("Answer to problem 4:");
                problem4();
                break;
            case 5:
                System.out.println("Answer to problem 5:");
                problem5();
                break;
            case 6:
                System.out.println("Answer to problem 6:");
                problem6();
                break;
            case 7:
                System.out.println("Answer to problem 7:");
                problem7();
                break;
            case 8:
                System.out.println("Answer to problem 8:");
                problem8();
                break;
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

    public static void problem3() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = isPrime(num);
        if (isPrime) {
            System.out.println("Prime");
        }
        else {
            System.out.println("Composite");
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void problem4 () {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = findFactorial(num);
        System.out.println(fact);
    }

    public static int findFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            return n * findFactorial(n - 1);
        }
    }

    public static void problem5 () {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int elementOfFib = elementOfFib(num);
        System.out.println(elementOfFib);
    }

    public static int elementOfFib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        else {
            return elementOfFib(n - 1) + elementOfFib(n - 2);
        }
    }

    public static void problem6 () {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int result = power(a, n);
        System.out.println(result);
    }

    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return a * power(a, n - 1);
        }
    }

    public static void problem7 () {
        //int num = 4;
        //int [] arr = {1, 4, 6, 2};
    }

    //public static...

    public static void problem8 () {
        String s1 = "123456";
        String s2 = "123a12";
        System.out.println(isDigit(s1));
        System.out.println(isDigit(s2));
    }

    public static String isDigit(String s) {
        for (int i = 0; i < s.length(); i++) {
            if(!Character.isDigit(s.charAt(i))) {
                return "No";
            }
        }
        return "Yes";
    }
}