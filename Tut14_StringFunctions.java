
public class Tut14_StringFunctions {

    
    public static void main(String[] args) {
        //String is a java object
        String name = "Ollie";
        String name2 = "jade";
        
//        if(name.equals(name2)) {
            //Split function : seperates a string via regex(characters that you want to split
           
            String sentence = "why so much of things for one simple";
            String[] data = sentence.split(" ", 1); // integer nextto regex is how many times you want to split  limits the spaces from the right to left
            System.out.println(data[0]);
            
              
            String sentence1 = "      why so much of things for one simple       ";
            //trim function removes the extra space
            sentence = sentence1.trim(); // the trim returns value to itself
            
            System.out.println(sentence);
        }
    }
    

