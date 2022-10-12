//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
    }

}
// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> result = new ArrayList<>();
        int left = 0;
        int right = 0;
        long sum = 0;
        
        while(right<arr.length){
           
              sum = sum + arr[right];
               while(left<right && sum>s){
                sum = sum - arr[left];
                left++;
            
              }
              if(sum==s){
                 
                 result.add(left+1);
                 result.add(right+1);
                 return result;
              }
             
              right++;
              
        }
        result.add(-1);
        return result;
        // Your code here
    }
}