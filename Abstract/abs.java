package Abstract;

interface Computer{
    int price = 3000;  // By default its final
    void compiler();
}

class Dekstop extends Computer{
    public void compiler(){
        System.out.println("Compile code faster");
    }
}

class Laptop extends Computer{
    public void compiler(){
        System.out.println("Compile code");
    }
}

class dev{
    public void code( Laptop lap){
        System.out.println("Coding");
        lap.compiler();
    }
}


public class abs {
    public static void main(String args[]){
        Laptop lap = new Laptop();
        dev dev1 = new dev();
        dev1.code(lap);
    }
}
