class Tut3_StringsNMathematicalOperators {
    // A String is a set of characters
    
    public static void main(String[] args){
    
    String helloWorld = "Hello World"; // variable name conventions must me camel casing
    System.out.println(helloWorld);
    
    //Mathematical Operators
    int a = 100;
    int b = 200;
    
    int c = (a+b)* b;
    int d = c*c;
    
      System.out.println(d);
      
      
      // Modulus operator : remiander of a divion.
      
      int e = 10% 5 ; // no remainder
      int f = 11% 5 ; // remainder is 1 
      
      // Mathematical operator on a non number ;
      
      String hello = "Hello";
      String world = "World";
      
      String helloWorld1 = hello + world;
      
      System.out.println(helloWorld1);
    
}
}