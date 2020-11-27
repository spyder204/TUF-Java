/* 1. Find the duplicate in an array of N+1 integers*/
/* Tortoise hare */
public class Q1{
    public static int findDuplicate(int[] arr){
        int slow = arr[0], fast = arr[0];
        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while(slow != fast);

        fast = arr[0];
        while(slow != fast){
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,2,4};
        System.out.println(findDuplicate(arr));

        

    }
}