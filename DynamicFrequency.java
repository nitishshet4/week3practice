import java.util.Scanner;

public class DynamicFrequency{
   public static void main(String[] args){
    Scanner ip=new Scanner (System.in);
     int arr[]=new int[6];
     System.out.println("enter the number");
     for(int i=0;i<arr.length;i++)
       arr[i]=ip.nextInt();    // int[] arr={1,2,2,1,3,4,5};
            //  1 2   2   1 1
     int[] visted=new int[7]; //i want to store the count and also want to store visted status
 
     int count=1;
           // 2   6<7          6
     for(int i=0;i<arr.length;i++){
       count=1;
            //  7=6+1  7<7        
       for(int j=i+1;j<arr.length;j++){
              // 5==
           if(arr[i]==arr[j]){
             count++;   //1+1
             visted[j]=-1;   //[2,2,-1,-1,1,1,1] visted array
           }                 // 0 1 2   3 4 5 6
          
       }
  // visted[6]=  0 != -1
      if(visted[i]!=-1){    //
         visted[i]=count;
       }
      
     }
    for(int i=0;i<arr.length;i++){
      if(visted[i]!=-1){
      System.out.println(arr[i]+" comes  "+count+"times");
     }
    }
     
   }
 
  
}