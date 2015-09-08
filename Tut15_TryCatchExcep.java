
public class Tut15_TryCatchExcep {


    public static void main(String[] args) {
    
        int[] array = {0,1};
         
        try{
         System.out.println(array[2]);
         } catch (Exception e) {
             System.err.println("custom err that prints in red");
             e.printStackTrace(System.err);
         }
            
        
        
    }
    
}
