import java.util.Scanner;

public class Primenoarray{
  
  
  public static void main(String [] args){

    Scanner s=new Scanner (System.in);
   
    System.out.println("how many values");
    int n=s.nextInt();
    System.out.println("enter the" +n +"values");
    int arr[]=new int[n];
    for(int i=0;i<=arr.length;i++){
      arr[i]=s.nextInt();
      
    
    }
  }
}