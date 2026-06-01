public class PassingArray {
    public static void main(String[] args) {
        int[] arr = {10,3,29,38,4,6};
        System.out.println(arr[2]);

        change(arr);
        System.out.println(arr[2]);

    }

    public static void change(int[] array) {
        array[2] = 99;
    } 
}
