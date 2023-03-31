import java.util.Scanner;
public class Menubased
  {
    Scanner s=new Scanner(System.in);
    public void insertOne(int a[],int len)
    {
      System.out.println("Enter the first element to be inserted :");
      int p=s.nextInt();
      a[0]=p;
      for(int i=0;i<len;i++)
       {
         System.out.println("Output is "+a[i]);
       }
    }
    public void insertLast(int a[],int len)
    {
      System.out.println("Enter the last element to be inserted :");
      int p=s.nextInt();
      a[len-1]=p;
      for(int i=0;i<len;i++)
       {
         System.out.println("Output is "+a[i]);
       }
    }
    public void insertSpeci(int a[],int len)
    {
      System.out.println("Enterindex number where element has to be inserted ");
      int pos=s.nextInt();
      System.out.println("Enter the element to be inserted");
      int t=s.nextInt();
      int newa[]=new int[len+1];
      for(int i=0;i<len;i++)
      {
        newa[i]=a[i];
      }
     newa[pos]=t;
     for(int i=pos+1;i<len+1;i++)
       {
         newa[i]=a[i-1];
       }
    for(int i=0;i<len+1;i++)
    { 
     System.out.println(newa[i]);
    }
    }
    public void removeOne(int a[],int len)
    {
    int newa[]=new int[len];
    for(int i=0;i<len;i++)
    {
     newa[i]=a[i];
    }
    for(int i=1;i<newa.length;i++)
    { 
     System.out.println(newa[i]);
    }
    }
    public void removeLast(int a[],int len)
    {
    int newa[]=new int[len];
    for(int i=0;i<len;i++)
    {
     newa[i]=a[i];
    }
    for(int i=0;i<len-1;i++)
    { 
     System.out.println(newa[i]);
    }
    }
    public void removeSpeci(int a[],int len)
    {
      System.out.println("Enter the index number to be removed ");
      int p=s.nextInt();
      int newa[]=new int[len];
      for(int i=0;i<len-1;i++)
      {
      if(i>=p)
      {
        newa[i]=a[i+1];
      }
      else
      {
       newa[i]=a[i];
      } 
      }
      for(int i=0;i<len-1;i++)
      { 
       System.out.println(newa[i]);
       }
       }
     public void lastOccur(int a[],int len)
    {
      System.out.println("Enter the search element: ");
        int search= s.nextInt();
       for (int i=len-1;i>=0;i--) 
       {
            if (a[i]==search)
            {
                a[i]=0;
                break;
            }
        }
      for(int i=0;i<len-1;i++)
        {
       System.out.println(a[i]);
       }
    }
     public void firstOccur(int a[],int len)
    {
      System.out.println("Enter the search element: ");
      int search= s.nextInt();
       for (int i=0;i<len;i++) 
       {
            if (a[i]==search)
            {
                a[i]=0;
                break;
            }
        }
      for(int i=0;i<len-1;i++) 
       {
            if (a[i]==0)
            {
              a[i]=a[i+1];
              a[i+1]=0;
            }
       }
      for(int i=0;i<len-1;i++)
       {
       System.out.println(a[i]);
       }
    }
    public void speciOccur(int a[],int len)
    {
      System.out.println("Enter the search element: ");
      int search= s.nextInt();
      for(int i=0;i<len;i++)
      {
         System.out.println(a[i]);
        //program yet to write
      }
    //  System.out.println(a[i]);
    }
    public void viewOptions(int a[],int len)
    {
      System.out.println("Enter the number you want to execute :");
      System.out.println("1. To insert element to first position in array");
      System.out.println("2. To insert element to last position in array");
      System.out.println("3. To insert element to specific position in array");
      System.out.println("4. To remove an element from first position ");
      System.out.println("5. To remove an element from last position ");
      System.out.println("6. To remove element from specific position ");
      System.out.println("7. To remove last occurance of search element");
      System.out.println("8. To remove first occurance of search element");
      System.out.println("9. To remove all occurance of search element");
    int option=s.nextInt();
    switch(option)
      {
       case 1:insertOne(a,len);
               break;
       case 2:insertLast(a,len);
               break;
       case 3: insertSpeci(a,len);
                break;
        case 4:removeOne(a,len);
               break;
        case 5:removeLast(a,len);
               break;
        case 6:removeSpeci(a,len);
               break;
        case 7:lastOccur(a,len);
               break;
        case 8:firstOccur(a,len);
               break;
        case 9:speciOccur(a,len);
               break;
        default:System.out.println("Enter valid option");
                break;
      }
    }
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the length of the array : ");
      int len=s.nextInt();
      int a[]=new int[len];
      System.out.println("Enter the array elements :");
      for(int i=0;i<len;i++)
        {
           System.out.println("Enter the number" +(i+1));
           a[i]=s.nextInt();
        }
      Menubased obj =new Menubased();
      obj.viewOptions(a,len);
    }
  }