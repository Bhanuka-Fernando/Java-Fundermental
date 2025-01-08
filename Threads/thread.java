package Threads;

// In Java everything runs with the help of threads
// thread is a smallest unit of a process
// so each thread completes a task one at a time
// so to run multiple threads at once we need to extends Thread class
// and should create a run method or can change the method name to run
// start will create new thread

// the problem with extending the class thread os you can't extend another class. so solution is 
// implement runnable. so we have to create Thread object
// Thread t1 = new Thread(ob1);
// Thread t2 = new Thread(ob2);
// so we have to join these threads too (t1.join()/ t2.join())


class A extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("hi");
            Thread.sleep(10) // checked exception(Forcing to compiler for error) - sleeping for 10 miliseconds
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("hello");
        }
    }
}

public class thread {
    public static void main(String args[]){

        A ob1 = new A();
        B ob2 = new B();

        ob1.setPriority(Thread.MAX_PRIORITY); // setting prority


        ob1.start();
        ob2.start();

    }
}
