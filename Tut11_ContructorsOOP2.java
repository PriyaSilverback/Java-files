
public class Tut11_ContructorsOOP2 {

  
    public static void main(String[] args) {
 
        
        Tut11_ContructorsOOP1 person1 = new Tut11_ContructorsOOP1( "Ollie" , 20, "14/14/14");
        Tut11_ContructorsOOP1 person2 = new Tut11_ContructorsOOP1("Name" , 1 , "12/12/12");
        Tut11_ContructorsOOP1 person3 = new Tut11_ContructorsOOP1("Name3", 2, "13/13/13");
        
   
   System.out.println("Person1 :\n" 
            + "Name: "+ person1.name +"\n" 
   + "Age:" + person1.age + "\n"
   + "DOB  is" +  person1.DOB + "\n");
   
   
   System.out.println("Person2: \n" 
   + "Name:" + person2.name + "\n" 
   + "Age: " + person2.age + "\n" 
   + "DOB:" + person2.DOB + "\n");
   
   
   System.out.println("Person3:\n"
   + "Name: " + person3.name + "\n"
   + "Age: " + person3.age + "\n"
   + "DOB" + person3.DOB + "\n");
        
         
    }
    
}
