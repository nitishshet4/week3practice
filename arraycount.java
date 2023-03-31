import java.util.Scanner;
public class Occurance
{
    public static void main(String args[])
  { 
    int count=0;
    Scanner s=new Scanner(System.in);
    int arr[]=new int[5];
      for(int i=0;i<arr.length;i++)
        {
          System.out.println("Enter the number" +(i+1));
          arr[i]=s.nextInt();
        }
      System.out.println("Enter the number whose count to be known :");
      int n=s.nextInt();
      for(int i=0;i<arr.length;i++)
        {
          if(n==arr[i])
          {
            count++;
          }
        }
    System.out.println("The number in the array is "+n +" whose count is : "+count);
  }
}