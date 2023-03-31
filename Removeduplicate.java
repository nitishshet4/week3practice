import java.util.Scanner;

public class Removeduplicate{
  public static void main(String args[]){
  Scanner s=new Scanner(System.in);
   int arr[]=new int[5];
     System.out.println("enter the number");
  for(int i=0;i<=arr.length;i++){ 
  arr[i]=s.nextInt();
  }
   for(int i=0;i<=arr.length;i++){
      for(int j=0;j<=arr.length;j++){
        if(arr[i]<arr[j]){
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
        if(arr[j]>arr[i]){
          int temp=arr[j];
          arr[j]=arr[i];
          arr[i]=temp;
        }
      }
    }
    System.out.println(+arr[i]);
  }
}
}
