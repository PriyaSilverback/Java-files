
public class Tut4_Methods {
    
    //Methods/funtions:
    // In Java we call methods.
    public static void main (String[] args){  // This is the main method. This is the starting point to Java
        // with a method we give a name and all we do is call the name of that method to execute the code within
        
        print(); // this is calling of a method.
        print1("Hello World"); // caling method2
        add( 10, 2);
        int d = add (10, 20);
        System.out.println ("the answer is " + d);
     
    }
 
    // Syntax for a method : return-type , identifier/method name, parameters
    // return type =  is a variable that the method  will give to the user
    // return type = void = if we dint want to give anything back to user , we give void
    // static is used to so we can use the method inside the main method
    
// Method1: retrn type void , just execte the code dont return
    
     static void print () {
         System.out.println ("Hello world");    
         
     }
    
     
// Method 2: passing parameters
     
   static void print1 (String s) {
           System.out.println (s);  
       
   }
   
 // Method3: Return an output of type int
   
   static int add (int a, int b) {
       int c = a+ b; // method creates a variable c and adds abd puts in method c
       return c;
   }
       
    
}
