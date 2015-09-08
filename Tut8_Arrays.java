
public class Tut8_Arrays {


    public static void main(String[] args) {
      String [] namesOfWorkers = {"Bill" , " Bob", "Ollie", " Jade"};
      System.out.println(namesOfWorkers[0]);  // 0 stores the first one in the array

      // Different way of initialising Array at declartion
      
      String [] names = new String [4];
      names [0] = "Priya";
      names[1] = "Test";
      names[2] = "Good";
      names[3] = "Ok";
      
      System.out.println(names[0]);
     
      //names.length; // The arrays declared has lots of methods such as length
      System.out.println("There are" + names.length + "workers");
      int x = 0;
      while(x<4){
          
          System.out.println(names[x]);
          x++;
      }
      
      
      
      
    }
    
}
