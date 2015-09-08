
public class Tut6_if_Else_And_Or {
    
    public static void main (String []  args){
        
    
    //multiple conditions in one boolean
    int a = 10;
    int b = 20;
    int c = 30;
    
    boolean test = (a<b) && ((b>c)|| (b+a ==c)); //&& and , || = OR 
    boolean test2 = (a<b)|| (b>c) ; // OR 
    
    System.out.println("Test is a "+  test);
    
}

}
