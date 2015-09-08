
public class Tut7_Loops {
    public static void main (String[] args){
        // loop takes a parameter of boolean variable and as long as the boolean is true, it keeps looping.
         
        int x = 0;
        
        while (x<10){   // As long as the condition is true within the brackets
            System.out.println(); // print ln breaks the line every interstiom
        x++;
        }
        
        int y = 0;
        while (y<100){
            System.out.print("-"); //Print doesnt break the line
            y++;
        }
        
        // Add all even numbers:
         int z = 1;
         int total = 0;
         
         while (z<100) {
             if(z%2 ==0) {
                 total += z; // this line adds the value of z to total
                 if(total >100){
                     break;// Break functionality is alternate to while loop, while loop executes until the cndition is true, we can set a break if we want to stop
                 }
             }
             z++;
         }
         System.out.println("Sum of Even is " + total);
         

    
    // do while and while : Do while will make sure the loop runs atleast once. whereas in a while loop it first checks the condition and if the conditon is false, it wont even execute.
    int a = 50;
    do{
    System.out.println(a);
} while (a >100);
    

}
}