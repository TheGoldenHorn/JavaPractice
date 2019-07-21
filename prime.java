    class prime{  
     public static void main(String args[]){  
      int m=0,flag=0;    
      int n=191;//it is the number to be checked
      System.out.println("The number to be checked is: "+n);  
      m=n/2;    
      for(int i=2;i<=m;i++){    
       if(n%i==0){    
       System.out.println(n+" is not a prime number.");    
       flag=1;    
       break;    
       }    
      }    
      if(flag==0){    
      System.out.println(n+" is a prime number.");}    
    }  
  }  