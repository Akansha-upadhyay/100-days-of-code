import java.util.Arrays;
public class Arraysort {
    public static void main(String[] args) {
        int[] arr ={10,60,4, 8,90};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] arr) {
        for (int i = 0; i < 10; i++) {

            System.out.print(arr[i] + " ");
            System.out.println();

            
        }

    }
}


