import java.util.Scanner;

public class strongnumber {
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("please enter the number to check the number is strong no or not:");
    
      int n=s.nextInt();
   int sum=0,rem=0,i,factorial;
    int temp =n;
    while(n){
      i=1 ;
        factorial=1;
      rem=n%10;
      
    
    while(i<=rem){
      factorial=factorial*i;
    }
    sum=sum+factorial;
    n=n/10;
  }
    if(sum==temp){
      System.out.println(+temp+" is a strong number");
    }
    else{
       System.out.println(+temp+" is a not astrong number");
    }
  
}
}