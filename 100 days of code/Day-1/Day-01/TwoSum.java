public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,8,9,4,8,5};
        int target = 13;
        for (int i = 0; i < arr.length; i++) {
            for (int j= i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==target){
                    System.out.println("Two numbers found: " + arr[i] + " and " + arr[j]);
                }
                
            }
            
        }
    }
    
}