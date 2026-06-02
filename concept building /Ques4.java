public class Ques4 {
    static int[] arr = {10,3,29,38,4,6};
    public static void main(String[] args) {
       for (int i = 0; i < arr.length; i++) {
        if(i % 2 != 0){
            arr[i] = 2 * arr[i];  
        }
        else{
            arr[i] = arr[i] + 10;
           
        }
        System.out.print(arr[i] + " ");
        
    }
    System.out.println();
}
}


