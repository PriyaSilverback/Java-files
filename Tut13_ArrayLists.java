
import java.util.ArrayList;


public class Tut13_ArrayLists {

  
    public static void main(String[] args) {
        // in Array list, there is no need to give a set lenght. It is dynamic
        ArrayList list = new ArrayList();
        String name1 = "Ollie";
        String nam2 ="Aidan";
        list.add(name1);
        list.add(nam2);
        
        System.out.println(list.get(0)); //list.get(index0 is name1 above
        
         System.out.println(list.get(1)); 
         
         //method to remove from list
         list.remove(name1);
         list.remove(1);
           System.out.println(list.get(0));
         
         
     
    }
    
}
