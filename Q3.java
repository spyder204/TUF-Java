/* 
Problem:
Find the repeating and the missing.

Given an unsorted array of size n. Array elements are in the range from 1 to n.
One number from set {1, 2, …n} is missing and one number occurs twice in the array. Find these two numbers.
*/
import java.io.*;
import java.util.HashMap;
public class Q3{

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
    public static void function(int[] arr){

        int duplicate = findDuplicate(arr);
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum+=arr[i];
        }
        int sum = (arr.length* (arr.length+1))/2;

        if(sum > currentSum)
            System.out.println(sum - currentSum + duplicate);
        else if(sum < currentSum)
            System.out.println(duplicate - (currentSum-sum));
        else
            System.out.println("Roomba");

    }





    /*public static void soln(int[] arr){
        HashMap<Integer, Integer> mp = new HashMap<>();
        int duplicate=-1, sumOfKeys=0;
        int sum = (arr.length * (arr.length+1))/2;

        for (int i = 0; i < arr.length; i++) {
            if(mp.containsKey(arr[i])){
                duplicate = arr[i];
            }
            else{
                mp.put(arr[i],1);
                sumOfKeys+=arr[i];
            }
        }
        System.out.println("Repeating = "+duplicate+" Missing = "+ (sum-sumOfKeys));
    }*/
    public static void main(String[] args)throws IOException {
        int arr[] = {3, 1, 3};//{4,3,2,6,3,1};
        function(arr);


    }
}