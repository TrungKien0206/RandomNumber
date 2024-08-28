
package randomnumber;

public class Randomnumber {

    
    public static void main(String[] args) {
        int numbers [] = new int[10]; 
        System.out.println("number: ");
        for(int i=0; i<10; i++)
        {
            System.out.println(numbers[i]+ " " );
    }
        numbers[0]= 27; 
        numbers[3]= -6; 
        System.out.println("\nNumbers sau khi gan gia tri: ");
        for(int i=0; i<10; i++)
        {
            System.out.println(numbers[i]+" ");
        }
        System.out.println();
        if(numbers[3]<0)
        {
            System.out.println("element 3 is negative.");
        }
          else
        {
            System.out.println("\n Element 3 is Positive.");
        }
    }
    }
    

