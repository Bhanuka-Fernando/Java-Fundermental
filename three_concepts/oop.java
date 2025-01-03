package three_concepts;

// In Encapsulation we make all properties private and generate setter and getter to access in main program

class Keyboard{
    // final keyword is used for constants and cannot be changed
    final int con = 2;
    private int keys;    // These are Instance variables
    private String color;

    //constructor
    public Keyboard(){
        keys = 100;
        color = "White";
    }

    public int getKeys() {
        return keys;
    }
    public void setKeys(int keys) {
        this.keys = keys;            //this represents current object in java
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void pressed(){   // to call these methods we need to create objects
        System.out.println("Signal Sent");
    }
    public void throwIt(){
        System.out.println("Got hit and have " + keys);
    }
}

//INHERITENCE
class AdvKeyboard extends Keyboard{
    String light = "blue";

    public void turnOn(){
        System.out.println("Turned on "+light+" light");
    }
}

class oop {
    public static void main(String args[]){

        //Created objects
        Keyboard obj = new Keyboard();
        obj.pressed();
        obj.setKeys(2);
        obj.throwIt();

        //inherietence
        AdvKeyboard Nobj = new AdvKeyboard();
        //Nobj.pressed();
        //Nobj.turnOn();

        
        
    }
}
