//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            int[] arr = new int[N];
            
            for(int i=0; i<N; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.makeProductOne(arr,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public int makeProductOne(int[] arr, int n) {
        int ans = 0;
        int count0 = 0;
        int countneg = 0;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == -1) {
                countneg++;
            }
            if (arr[i] < -1) {
                countneg++;
                ans += Math.abs(arr[i] + 1);
            }
            if (arr[i] > 1) {
                ans += Math.abs(arr[i] - 1);
            }
            if (arr[i] == 0) {
                count0++;
                ans++;
            }
        }
        
        if (countneg % 2 != 0) {
            if (count0 == 0) {
                ans += 2;
            }
        }
        
        return ans;
    }
}
