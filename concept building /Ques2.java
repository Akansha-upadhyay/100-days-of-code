// ...existing code...
import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements in the array: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid array size.");
            sc.close();
            return;
        }

        int sum = 0;
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("The sum of the elements in the array is: " + sum);
        sc.close();
    }
}