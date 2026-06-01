import java.util.Scanner;

public class MissingNumber {

    static int missingNumber(int arr[]) {
        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);   // Create scanner

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int result = missingNumber(arr);
        System.out.println("Missing Number is: " + result);

        sc.close();   
    }
}