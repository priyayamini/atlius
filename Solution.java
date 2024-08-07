import java.util.*;

public class Main {
    public static void main(String[] args) {
      //time complexity is O(n), since we used optimised kadanes algorithm
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int array[]=new int[n];
      for(int i=0;i<n;i++)
      {
        array[i]=in.nextInt();
      }
      System.out.println(maxSubArray(array));
  }
  public static int maxSubArray(int array[])
  {
    int sum=0;//initialize current sum to 0
    int max=Integer.MIN_VALUE;//initilaise the maximum sum to smallest possible Integer
    //Edge case: if the array has only one elment, return that element
    if(array.length==1)
    {
      return array[0];
    }
    //Iterate through the array's each element
    for(int i=0;i<array.length;i++)
    {
      //Add the current element to the running sum
      sum=sum+array[i];
      //update the max if the current sum is greater than the previous max
      max=Math.max(max,sum);
      if(sum<0)
      {
        sum=0;
      }
    }
    //return the maximum sum found.
    return max;
  }
}