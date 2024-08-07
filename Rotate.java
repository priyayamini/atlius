import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=in.nextInt();
        }
        int k=in.nextInt();
        System.out.println("Before rotating by k positions");
        for(int i=0;i<n;i++)
        {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        rotate(nums,k);
        System.out.println("After rotating by k positions");
        for(int i=0;i<n;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
    public static void rotate(int nums[],int k)
    {
        int n=nums.length;//n is the length of the array
        k%=n;//reduce k to be within the bounds of the array length
        //if k is greater than the length of the array, it effectively wraps around
        
        //Step 1: Reverse the entire array
        reverse(nums,0,n-1);
        //Step 2: Reverse the first k elements 
        reverse(nums,0,k-1);
        //Step 3: Reverse the remaining n-k elements
        reverse(nums,k,n-1);
    }
    public static void reverse(int nums[], int start, int end)
    {
        //Helper function to reverse the elements
        while(start<end)
        {
            //swap the elements at the start and end
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            //Move the starting index towards the middle
            start++;
            //Move the ending index towards the middle
            end--;
        }
    }
}