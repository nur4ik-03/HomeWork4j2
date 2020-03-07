package com.company;

public class Runner extends Thread {
    private  int numplus = 1;
    private  int numines = 6;

    public Runner(String name) {
        super(name);
    }

    public int getNumplus() {
        return numplus;
    }

    public void setNumplus(int numplus) {
        this.numplus = numplus;
    }

    public int getNumines() {
        return numines;
    }

    public void setNumines(int numines) {
        this.numines = numines;
    }

    synchronized public  void run(){
       System.out.println(this.getName() + " берет палочку");
       try {
           if (getPriority() == 5)
               System.out.println(getName() + " бежит к финишу");

       } catch (Exception e) {
       }


    }
}







