

public class Main {
    public static void main(String[] args) {
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
}