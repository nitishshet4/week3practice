import java.util.Scanner;
public class arrayasc
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
      for(int i=0;i<arr.length;i++)
        {
          for(int j=i+1;j<arr.length;j++)
            {
              if(arr[i]>arr[j])
              {
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp; 
              }
            }
          System.out.println(arr[i]);
        }
  }
}