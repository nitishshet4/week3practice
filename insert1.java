import java.util.Scanner;
public class insert1
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
      System.out.println("Enter the first element to be inserted :");
      int p=s.nextInt();
      arr[]=p;
      for(int i=0;i<arr.length;i++)
       {
         System.out.println("Output is "+arr[i]);
       }
 }
}