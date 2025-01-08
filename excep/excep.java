package excep;

public class excep {
    public static void main(String args[]){

        int i = 4; // normal statement
        int j = 2;  // normal statement
        int result = 0;
        int nums[] = {2,3,4};
        //int result  = i/j;   // Critical Statement


        try{
            result = i/j;
            if(result == 2)
                throw new ArithmeticException();
            System.out.println(nums[4]);
        } catch(ArithmeticException e){
            System.out.println("cannot divide by zero");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Out of bound");
        }catch(Exception e){
            System.out.println("something went wrong");
        }finally{
            System.out.println("Bye");  // finally block will execute either exception is created or not 
        }
        

        System.out.println(result);  // Normal statement
        System.out.println("Bye");

    }
}
