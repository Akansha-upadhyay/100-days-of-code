
import java.util.Scanner;

public class SearchinArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 5, 4, 27, 89, 105};
        System.err.println("Enter the target element to search: ");
        int n = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }
}

