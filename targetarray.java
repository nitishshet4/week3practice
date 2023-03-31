import java.util.Scanner;
public class AddArr
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
        System.out.println("Enter the target number");
        int t=s.nextInt();
        for(int i=0;i<arr.length;i++)
        {
          for(int j=i+1;j<arr.length;j++)
            {
              if(arr[i]+arr[j]==t)
              {
                System.out.println("Output is "+"["+arr[i] +","+arr[j]+"]");
              }
            }
        }
  }
}