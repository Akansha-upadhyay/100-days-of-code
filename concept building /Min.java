
public class Min {

    public static void main(String[] args) {
        int[] arr = {10, 3, 6, 8, 36};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                System.out.println("New minimum found: " + min);
            }

        }
    }
}
