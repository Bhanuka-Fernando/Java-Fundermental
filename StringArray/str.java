package StringArray;

// Student class Blueprint
class Student{
    int rollno;
    String name;
    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

}


public class str {
    public static void main(String args[]){

        // Strings are by default immutable(cannot change         ) but we can make it mutable using StringBuffer
        // String cannot be change -immutable- it will stored in heap memory not changed
        // In below it save in 2 memory location in heap as bhanuka and bhanuka fernando
        String s = "Bhanuka";
        s = s + "Fernando";

        // So to change data use -StringBuffer-
        // By using StringBuffer we can access methods 
        StringBuffer s1 = new StringBuffer("Trinal");
        s1.append("Fernando");

        // How to create a int array
        int nums[] = {1,2,3,4,5};

        // How to create a array by giving fix size and after manually assigned
        int num[] = new int[5];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;

        for(int n = 0; n <= nums.length; n++){
            //System.out.println(n);
        }

        // this is good because if i use the above for loop it will give a exception error of
        // ArrayIndexOutOfBoundsException because of equal sign in array
        for(int i : num){
            //System.out.println(i);
        }

        // create an array using student class
        Student st = new Student(1,"Bhanuka");
        System.out.println(st);


    }
}
