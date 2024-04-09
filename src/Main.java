import java.util.Scanner;

// Creating the Main class
public class Main {
    public static void main(String[] args) {
        // Create Scanner's object to input from keyboard
        Scanner sc = new Scanner(System.in);
        // Output the message about selection of problem's number for user
        System.out.println("Select problem's number: ");
        // Getting the problem's number from user
        int problemNum = sc.nextInt();

        // Select the problem depending on the entered number
        switch (problemNum) {
            // For each problem from 1 to 10, corresponding methods are executed
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
            case 9:
                System.out.println("Answer to problem 9:");
                problem9();
                break;
            case 10:
                System.out.println("Answer to problem 10:");
                problem10();
                break;
            case 11:
                System.out.println("Answer to defend task:");
                defendTask();
                break;
        }
    }

    // Problem 1: Finding the minimum number in an array
    public static void problem1() {
        // Start time recording of execution this method
        double startTime = System.nanoTime();
        int [] num = {5, 10, 1, 32, 3, 45};
        // Call the method to find minimum number
        int min = findMin(num.length, num);
        // End time recording of execution this method
        double endTime = System.nanoTime();
        // Calculate the duration of execution
        double duration = (endTime - startTime) / 1000000;
        // Output our result and execution time of findMin() method
        System.out.println(min);
        System.out.println("Time taken: " + duration + " milliseconds");
    }

    /**
     * The findMin() method searches for the minimum element in the array.
     * This method goes through all the elements of the array once to find the minimum element.
     * Time complexity: 0(n), where n is the size of the input array
     * @param n The number of elements in the array
     * @param arr Input array
     * @return Minimum element of the array
     */
    public static int findMin(int n, int[] arr) {
        // Initializing the minimal number
        int min = arr[0];
        // Loop for iterating through array elements
        for (int i = 1; i < n; i++) {
            // If the current element is smaller than the current minimum
            if (arr[i] < min) {
               // Update the minimum
                min = arr[i];
            }
        }
        // Return the minimum found
        return min;
    }

    // Problem 2: Calculating the average value of an array
    public static void problem2() {
        // Start time recording of execution this method
        double startTime = System.nanoTime();
        // Array of numbers
        int [] num = {4, 3, 2, 1};
        // Call the method to calculate the average value
        double avr = findAverage(num.length, num);
        // End time recording of execution this method
        double endTime = System.nanoTime();
        // Calculate the duration of execution
        double duration = (endTime - startTime) / 1000000;
        // Output our result and execution time of findAverage() method
        System.out.println(avr);
        System.out.println("Time taken: " + duration + " milliseconds");
    }

    /**
     * The findAverage() method calculates the average value of elements in the array.
     * This method goes through all the elements of the array once to calculate the sum of elements.
     * Then it divides the sum by the number of elements to get the average.
     * Time complexity: O(n), where n is the size of the input array
     * @param n The number of elements in the array
     * @param arr Input array
     * @return Average value of elements in the array
     */
    public static double findAverage(int n, int[] arr) {
        // Initializing the sum of elements
        int sum = 0;
        // Loop for iterating through array elements
        for (int i = 0; i < n; i++) {
            // Add the current element to the sum
            sum += arr[i];
        }
        // Calculate the average by dividing the sum by the number of elements and return it
        return (double) sum / n;
    }

    // Problem 3: Checking if a number is prime
    public static void problem3() {
        // Start time to recording of execution this method
        double startTime = System.nanoTime();
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);
        // Read the number from the user
        int num = sc.nextInt();
        // Check if the number is prime
        boolean isPrime = isPrime(num);
        // Output our result
        if (isPrime) {
            System.out.println("Prime");
            // End time recording of execution this method
            double endTime = System.nanoTime();
            // Calculate the duration of execution
            double duration = (endTime - startTime) / 1000000;
            // Output the execution time of isPrime() method
            System.out.println("Time taken: " + duration + " milliseconds");
        }
        else {
            System.out.println("Composite");
            double endTime = System.nanoTime();
            double duration = (endTime - startTime) / 1000000;
            System.out.println("Time taken: " + duration + " milliseconds");
        }
    }

    /**
     * The isPrime() method checks if a given number is prime.
     * It iterates through all numbers from 2 up to the square root of the given number.
     * If any of these numbers divides the given number evenly, it returns false.
     * Otherwise, it returns true.
     * Time complexity: 0(sqrt(n)), where n is the given number
     * @param num The number to check for primality
     * @return True if the number is prime, and false otherwise
     */
    public static boolean isPrime(int num) {
        // If the number is less than 2, it is not prime
        if (num < 2) {
            return false;
        }
        // If the number is 2, it is prime
        if (num == 2) {
            return true;
        }
        // Iterate through all number from 2 to the square root of the given number
        for (int i = 2; i < Math.sqrt(num); i++) {
            // If any of these numbers divides the given number evenly, it is not prime
            if (num % i == 0) {
                return false;
            }
        }
        // If none of the numbers divides the given number evenly, it is prime
        return true;
    }

    // Problem 4: Calculating the factorial of a number
    public static void problem4 () {
        // Start time recording of execution this method
        double startTime = System.nanoTime();
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);
        // Read the number entered by the user
        int num = sc.nextInt();
        // Call method to calculate the factorial of the number
        int fact = findFactorial(num);
        // End time recording of execution this method
        double endTime = System.nanoTime();
        // Calculate the duration of execution
        double duration = (endTime - startTime) / 1000000;
        // Output our result and execution time of findFactorial() method
        System.out.println(fact);
        System.out.println("Time taken: " + duration + " milliseconds");
    }

    /**
     * The findFactorial() method calculates the factorial of a given number.
     * The factorial of a non-negative integer n is the product of all positive integers less than or equal to n.
     * This method uses recursion to calculate the factorial.
     * Time complexity: O(n), where n is the input number
     * @param n The number for which factorial is to be calculated
     * @return The factorial of the given number
     */
    public static int findFactorial(int n) {
        // If 'n' is 0 or 1, factorial equal 1 (Base case)
        if (n == 0 || n == 1) {
            return 1;
        }
        // Multiply 'n' by factorial of (n - 1) (Recursive case)
        else {
            return n * findFactorial(n - 1);
        }
    }

    // Problem 5: Finding the n-th element of the Fibonacci sequence
    public static void problem5 () {
        // Start time recording of execution this method
        double startTime = System.nanoTime();
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);
        // Read the number entered by the user
        int num = sc.nextInt();
        // Call the method to find the n-th Fibonacci number
        int elementOfFib = elementOfFib(num);
        // End time recording of execution this method
        double endTime = System.nanoTime();
        // Calculate the duration of execution
        double duration = (endTime - startTime) / 1000000;
        // Output our result and execution time of elementOfFib() method
        System.out.println(elementOfFib);
        System.out.println("Time taken: " + duration + " milliseconds");
    }

    /**
     * The elementOfFib() method calculates the n-th element of the Fibonacci sequence recursively.
     * This method recursively calculates the Fibonacci number for the given position.
     * Time complexity: O(2^n), where n is the position of the Fibonacci number
     * @param n The position of the Fibonacci number
     * @return The n-th Fibonacci number
     */
    public static int elementOfFib(int n) {
        // If 'n' is 0 or 1, return 'n' (Base case)
        if (n == 0 || n == 1) {
            return n;
        }
        // Calculate the Fibonacci number for 'n' by summing the previous two Fibonacci numbers (Recursive case)
        else {
            return elementOfFib(n - 1) + elementOfFib(n - 2);
        }
    }

    // Problem 6: Calculating the power of a number
    public static void problem6 () {
        // Start time recording of execution this method
        double startTime = System.nanoTime();
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);
        // Read the base(a) and exponent(n) numbers entered by the user
        int a = sc.nextInt();
        int n = sc.nextInt();
        // Call the method to calculate the power
        int result = power(a, n);
        // End time recording of execution this method
        double endTime = System.nanoTime();
        // Calculate the duration of execution
        double duration = (endTime - startTime) / 1000000;
        // Output our result and execution time of power() method
        System.out.println(result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }

    /**
     * The power() method calculates the result of raising a number to a power.
     * This method uses a recursive approach to compute the power.
     * Time complexity: O(n), where n is the exponent value
     * @param a The base
     * @param n The exponent
     * @return The result of raising the base to the exponent
     */
    public static int power(int a, int n) {
        // If exponent(n) is 0, return 1 (Base case)
        if (n == 0) {
            return 1;
        }
        // Compute power recursively (Recursive case)
        else {
            return a * power(a, n - 1);
        }
    }

    // Problem 7: Reversing an array recursively
    public static void problem7 () {
        // Start time recording of execution this method
        double startTime = System.nanoTime();
        // Array of numbers
        int[] arr = {1, 4, 6, 2};
        // Call the method to reverse the array
        reverse(arr.length - 1, arr);
        // End time recording of execution this method
        double endTime = System.nanoTime();
        // Calculate the duration of execution
        double duration = (endTime - startTime) / 1000000;
        // Output the gap between our result execution time of reverse() method and the method itself
        System.out.println();
        System.out.println("Time taken: " + duration + " milliseconds");
    }

    /**
     * The reverse() method reverses the elements of the array recursively.
     * This method starts from the last element of the array and prints it.
     * Then it calls itself recursively with the index decremented by 1.
     * Time complexity: O(n), where n is the size of the input array
     * @param index Index of the element to be printed
     * @param arr Input array
     */
    public static void reverse(int index, int[] arr) {
        // If the index is less than 0, return it (Base case)
        if (index < 0) {
            return;
        }
        // Print the element at the current index and call reverse recursively with the index decremented by 1 (Recursive case)
        else {
            System.out.print(arr[index] + " ");
            reverse(index - 1, arr);
        }
    }


    // Problem 8: Checking if a string consists of only digits
    public static void problem8 () {
        // Start time recording of execution this method
        double startTime = System.nanoTime();
        // Strings to check
        String s1 = "123456";
        String s2 = "123a12";
        // Output our results using isDigit() method to check if s1 and s2 consists of only digits
        System.out.println(isDigit(s1));
        System.out.println(isDigit(s2));
        // End time recording of execution this method
        double endTime = System.nanoTime();
        // Calculate the duration of execution
        double duration = (endTime - startTime) / 1000000;
        // Output execution time of isDigit() method
        System.out.println("Time taken: " + duration + " milliseconds");
    }

    /**
     * The isDigit() method checks if a string consists of only digits.
     * This method iterates through each character of the string and checks if it is a digit.
     * If any character is not a digit, it returns "No", otherwise it returns "Yes".
     * Time complexity: O(n), where n is the length of the input string
     * @param s The input string to be checked
     * @return "Yes" if the string consists of only digits, and otherwise "No"
     */
    public static String isDigit(String s) {
        // Iterate through each character of the string
        for (int i = 0; i < s.length(); i++) {
            // If the character is not a digit, return "No"
            if(!Character.isDigit(s.charAt(i))) {
                return "No";
            }
        }
        // If all characters are digits, return "Yes"
        return "Yes";
    }

    // Problem 9: Find the binomial coefficient
    public static void problem9 () {
        // Start time recording of execution this method
        double startTime = System.nanoTime();
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);
        // Read number of element (n), and selection size (k)
        int n = sc.nextInt();
        int k = sc.nextInt();
        // Call the method to calculate binomial coefficient
        int result = findBinCoeff(n, k);
        // End time recording of execution this method
        double endTime = System.nanoTime();
        // Calculate the duration of execution
        double duration = (endTime - startTime) / 1000000;
        // Output our result and execution time of findBinCoeff() method
        System.out.println(result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }

    /**
     * The findBinCoeff() method calculates the binomial coefficient C(n, k).
     * It uses a recursive approach to calculate the binomial coefficient.
     * Time complexity: O(2^n), where n is the larger of the two numbers n and k
     * @param n The total number of elements
     * @param k The number of elements to select
     * @return The binomial coefficient C(n, k)
     */
    public static int findBinCoeff (int n, int k) {
        // If 'k' is 0 or 'n' is 'k', return 1 (Base case)
        if (k == 0 || n == k) {
            return 1;
        }
        // Calculate binomial coefficient using recursive formula (Recursive case)
        else {
            return findBinCoeff(n - 1, k - 1) + findBinCoeff(n - 1, k);
        }
    }

    // Problem 10: Finding the GCD of two numbers
    public static void problem10 () {
        // Start time recording of execution this method
        double startTime = System.nanoTime();
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);
        // Read two numbers
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Call the method to find GCD
        int gcd = findGCD(a, b);
        // End time recording of execution this method
        double endTime = System.nanoTime();
        // Calculate the duration of execution
        double duration = (endTime - startTime) / 1000000;
        // Output the result and execution time of findGCD() method
        System.out.println(gcd);
        System.out.println("Time taken: " + duration + " milliseconds");
    }

    /**
     * The findGCD() method finds the Greatest Common Divisor (GCD) of two numbers using Euclid's algorithm.
     * Time complexity: O(log(min(a,b))), where a and b are the input numbers.
     * Euclid's algorithm has logarithmic time complexity because each step of the algorithm reduces
     * one of the input numbers by approximately half, leading to a logarithmic number of steps.
     * @param a First input number
     * @param b Second input number
     * @return GCD of the two input numbers
     */
    public static int findGCD(int a, int b) {
        // If 'b' is 0, then GCD(a, 0) = a
        if (b == 0) {
            return a;
        }
        // Apply Euclid's algorithm recursively with 'b' and the remainder of 'a' divided by 'b'
        else {
            return findGCD(b, a % b);
        }
    }

    public static void defendTask () {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPalindrome = isPalindrome(num);
        //isPalindrome(num);
        if (isPalindrome) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }

    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return originalNum == reversedNum;
    }
}