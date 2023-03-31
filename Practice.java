import java.util.Scanner;
public class Practice
{
    public void sortArr(int arr[])
    {
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
          System.out.print("  " +arr[i]);
        }
  }
  public void dupl(int arr[])
  {
     for(int i=0;i<arr.length;i++)
       {
         for(int j=0;j<arr.length;j++)
           {
              if(arr[i]==arr[j])
              {
                 arr[i]=arr[j+1];
              }
              arr[i]=arr[j];
           }
       
    System.out.print("  " +arr[i]);
       }
  }
    public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int arr[]=new int[5];
    for(int i=0;i<arr.length;i++)
        {
          System.out.println("Enter the number" +(i+1));
          arr[i]=s.nextInt();
        }
     Practice obj= new Practice();
     obj.sortArr(arr);
     obj.Practice(arr);
}
}