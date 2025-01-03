package one_Demo;
class Demo
{
    public static void main(String args[])
    // main is the staring point of execution
    {
        //run the code according to the order
        
        show();  //  below created method is called

        int num = 5;
        double d = 9.5;
        float f = 8.5f;
        char name = 'A';

        System.out.println(name + " " + num); // for concatinate keep space using inverted commas
    }
    
    public static void show()
    {
        System.out.println("Show off");
    }
}