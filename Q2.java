/*Sort an array of 0’s 1’s 2’s without using extra space or sorting algo*/
// done using Dutch National Flag algo- most optimal

public class Q2 {
    
    public static void swap(int x, int y, int[] arr){
        int t = arr[x];
        arr[x] = arr[y];
        arr[y] = t;
    }

    public static void sort(int[] arr) {
        int low, mid, high;
        low = mid =0;
        high = arr.length-1;
        
        while(mid<=high){
            if(arr[mid] == 1)
                mid++;
            if(arr[mid] == 0)
                swap(mid++, low++, arr);
            if(arr[mid] == 2)
                swap(mid, high--, arr);
            
        }

    }
    
    
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    
}
