import java.util.Scanner;

  public class Practicemenu{
        Scanner s=new Scanner (System.in);
    
    public void insertfirst(int arr[],int len){
      System.out.println("enter the first number to be inserted:");
      int n=s.nextInt();
      arr[0]=n;
      for(int i=0;i<len;i++){
        System.out.println(+arr[i]);
      }
    }
  public void insertlast(int arr[],int len){
    System.out.println("enter the number to be inserted:");
    int n=s.nextInt();
    arr[len-1]=n;
    for(int i=0;i<len;i++){
      System.out.println(+arr[i]);
    }
  }
    public void insertspecific(int arr[],int len){
      System.out.println("enter the postion to be inserted:");
      int p=s.nextInt();
      System.out.println("enter the number to be inserted:");
      int n=s.nextInt();
      int newarr[]=new int[len-1];
      for(int i=0;i<len;i++) {
        newarr[i]=arr[i];
      }
      newarr[p]=n;
      for(int i=p+1;i<len;i++){
        newarr[i]=arr[i-1];
      }
     for(int i=0;i<len+1;i++){
        System.out.println(newarr[i]);
      }
        
      }

    public void removefirst(int arr[],int len){
      
      
    }
    



  public void viewoptions(int arr[],int len){
      System.out.println("=========================================");
    System.out.println("enter the number you want to execute:");
      System.out.println("=========================================");
    System.out.println("1.enter the number to be inserted at first position :");
    System.out.println("2.enter the number to be inserted at last position:");
    System.out.println("3.enter the number to be inserted at the specific position:");
    
     System.out.println("========================================="); 
      int option=s.nextInt();
    switch(option){
      case 1:insertfirst(arr,len);
        break;
      case 2:insertlast(arr,len);
        break;
      case 3:insertspecific(arr,len);
        break;
          default:System.out.println("Enter valid option");
                break;
    }
  }  



    public static void main(String args[]){
      Scanner s=new Scanner (System.in);
      System.out.println("enter the length of the array");
      int len=s.nextInt();
       System.out.println("=============================");
       int arr[]=new int[len];
      System.out.println("enter the array elements");
       System.out.println("=============================");
      for(int i=0;i<len;i++){
      System.out.println("enter the array number"+(i+1));
        System.out.println("=============================");
         arr[i]=s.nextInt();
      }
        Practicemenu obj =new Practicemenu();
      obj.viewoptions(arr,len);
      
      
      
    }
  }
