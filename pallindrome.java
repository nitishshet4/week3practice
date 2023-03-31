import java.util.Scanner;

public class pallindrome{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number to cheeck whether the number is pallindrome or not :");
    int num=s.nextInt();
    int n,rem=0,rev=0;
    n=num;
    while(num!=0){
      rem=num%10;
      rev=(rev*10)+rem;
      num=num/10;
    } 
    if(n==rev){
      System.out.println("the number is a pallindrome");
      
    }
    else{
         System.out.println("the number is a not pallindrome");
      
    }
  }
}