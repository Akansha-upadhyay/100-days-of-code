public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = {10, 6, 8, 4, 20, 82};
        int n = arr.length;
        int i = 0 , j= n-1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for (int num : arr) {
            System.out.println(num);
        }
    }
}   