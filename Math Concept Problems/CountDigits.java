package MathConceptProblems;
import java.io.*;
import java.util.*;

//Count Digits
//https://practice.geeksforgeeks.org/problems/count-digits5716/1
public class CountDigits {

	public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));
        }
    }

}


class Solution{
    static int evenlyDivides(int N){
        int c=0;
        int x=N;
        first:
            while(x>0){
                if(N==0)
                    return 0;
                int r=x%10;
                if(r==0){
                    x/=10;
                    continue first;
                    }
                    
                if(N%(r)==0){
                    c++;
                }
                x/=10;
            }
        return c;
    }
}