/* 
Problem: Merge two sorted Arrays without extra space

Given two sorted arrays, we need to merge them in O((n+m)*log(n+m)) time
with O(1) extra space into a sorted array, when n is the size of the first array, and m is the size of the second array.
*/
import java.io.*;
import java.util.Arrays;

public class Q4{

    public static void insert(int[] ar1, int[] ar2, int pos){
        int last = ar1[ar1.length-1];
        int add = ar2[0];

        int t = ar1[ar1.length-1];
        ar1[ar1.length-1] = ar2[0];
        ar2[0] = t;

        for(int i = ar1.length-1; i>pos+1;i--){
             t = ar1[i];
            ar1[i] = ar1[i-1];
            ar1[i-1] =t;
        }
        Arrays.sort(ar2);


    }
    public static void main(String[] args)throws IOException {
        int ar1[] = {1, 2, 5, 9, 11, 15, 20};
        int ar2[] = {2, 3, 8, 9, 13};

        for (int i = 0; i < ar1.length-1; i++) {
           // System.out.println("i = "+i);
            if(ar1[i] <= ar2[0] && ar2[0] <= ar1[i+1]){
                insert(ar1, ar2, i);
            }
            else if(ar1[i] < ar2[0] && ar2[0] > ar1[i+1])
                continue;
            else{
                insert(ar1, ar2,0);
            }

        }
        for (int i: ar1) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i: ar2) {
            System.out.print(i+" ");
        }
    }
}