mport java.util.Scanner;
public class reversearray
{
    public static void main(String args[])
  { 
    Scanner s=new Scanner(System.in);
    int arr[]=new int[5];
      for(int i=0;i<arr.length;i++)
        {
          System.out.println("Enter the number" +(i+1));
          arr[i]=s.nextInt();
        }
        for(int i=4;i<arr.length;i--)
        {
          System.out.println(arr[i]);
        }
  }
}