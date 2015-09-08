
public class Tut9_ForLoop {

 
    public static void main(String[] args) {
        String [] names = {"Ollie", " Ron" , "Jade", " JSON"};
        
        // SYNTAX FOR LOOP: variable, condition , increment/decrement
        for(int x = 0; x<names.length; x++){
            System.out.println(names[x]);
            
        }
        
        // Enhanced Forloop
        for( String name : names) { // in each iteation, the value of name is equal to names.
            System.out.println(name);
            
        }
        
    }
    
}
