package two_Operators;

public class Operators {
    public static void main(String args[])
    {
        int n1 = 1;
        int n2 = 5;
        
        int result = n1/n2; //no points value will results
        boolean r2 = n1 < n2;  // retrun false
        boolean r3 = n1 != n2; //checking not equal so it returns true

        //conditions
        // if got any one statement in each block we dont need to put curly brackets
        if(n1 > n2)
            System.out.println("hi");
        else if (n1 < n2)
            System.out.println("Bye");
        else
            System.out.println("goodbye");    

        // Conditional Statements
        int Cresult = n1>0?2:3;

        // SWITCH STATEMENTS
        switch(n2)
        {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Nothing");
        }

        // WHILE LOOP
        int i = 0;
        while(i<5){
            System.out.println(i);
            i++;
        }
        
        // FOR LOOPS
        for(int m = 0; m < 5; m++)
            System.out.println(m);

    }
}
