
public class SecondLargestElemet {

    public static void main(String[] args) {
        int[] arr = {10, 3, 6, 8, 36};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }

        }
        System.out.println("New second maximum found: " + secondMax);
        System.out.println("Current maximum is: " + max);

    }
}
