public class Task4{
    public static void main(String[] args) {
        int arr[] = new int[] {12,34,45,21,33,4};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("Array Sum = "+sum);
        
    }
}