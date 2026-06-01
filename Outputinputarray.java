
import java.util.Scanner;

public class Outputinputarray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //    int[] x = new int[7];
        //   int n = x.length;
        //  for (int i = 0; i < n; i++) {
        //      System.out.println(x[i]+" ");
        //    }

        int[] arr = new int[7];
  //      for (int i = 0; i < 7; i++) {
    //        System.err.println(arr[i]);
      //      }

            //input
            for (int i = 0; i < 7; i++) {
                arr[i] = sc.nextInt();

            }
            //print
            for (int i = 0; i < 7; i++) {
                System.err.println(arr[i]+" ");
                
            }

        }
    }

