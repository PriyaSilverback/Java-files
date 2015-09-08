
public class Tut5_If_Else_boolean1 {
// Boolean : Boolean is a value that holds either true or false
// It takes 1 bits of memory
    public static void main (String [] args) {
        
      
        int a = 10;
        int b = 20;
        
          boolean test = a>b ; // In this statment a is not greater than b, so the value of test is false
          
          boolean test1 = true;
          
          if (test1) {
              System.out.println("Test if true");
              
                } else {
              
              System.out.println("Test is a false");
                            
              
          }
          
          
      int i = 10;
      int j = 20;
      int k =30;
      
      //multiple conditions:
      
      if (i>j){
          System.out.println ("i is greater than j ");
                  
      }
        
      else if (i==j) {
          System.out.println ("i is  == j");
      } else {
          System.out.println("i is less than j");
      }
        
    }
    
}
