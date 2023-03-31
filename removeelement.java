import java.util.Scanner;

public class removeelement{
  public static void main(String args[]){
    Scanner ip=new Scanner(System.in);
    int arr[]=new int[5];
    for(int i=0;i<=arr.length;i++){
      System.out.println("Enter the number:"+(i+1));
      arr[i]=ip.nextInt();
      }
    int newarr[]=new int[4];
    for(int i=1;i<=newarr.length;i++){
      newarr[i-1]=arr[i];
    }
    for(int i=0;i<=newarr.length;i++)
      {
        System.out.println(+newarr[i]);
      }
  }
}
