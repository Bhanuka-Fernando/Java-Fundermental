package three_concepts;

class PKeyboard{
    int keys;
    String color = "red";

    public void checkColor(){
        System.out.println(color);
    }
    //OVERLOADING - compile time polymorphism
    public void checkColor(int keys){

    }
}

class NewPkeyboard extends PKeyboard{

    //OVERIDING - runtime polymorphism
    public void checkColor(){
        System.err.println("Color is "+ color);
    }
}


public class polymorph {
    public static void main(String args[]){

        PKeyboard k1 = new NewPkeyboard();
        k1.checkColor();
    }
}
