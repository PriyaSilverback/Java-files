
public class Tut10_OOP2 {

  
    public static void main(String[] args) {
        
        Tut10_OOP1 person1 = new Tut10_OOP1();
        Tut10_OOP1 person2 = new Tut10_OOP1();
        Tut10_OOP1 person3 = new Tut10_OOP1();
        
   person1.name = "Test";
   person1.age= " some age";
   person1.DOB = "10/10/10";
   
   
   person2.name = " test2";
   person2.age = "some age2";
   person2.DOB = " 10/10/11";
   
   person3.name = "test3";
   person3.age  = "age";
   person3.DOB = "12/12/12";
   
   
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
