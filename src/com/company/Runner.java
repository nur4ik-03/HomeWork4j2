package com.company;

public class Runner extends Thread {
    private  int numplus ;


    public Runner(String name) {
        super(name);
    }

    public int getNumplus() {
        return numplus;
    }

    public void setNumplus(int numplus) {
        this.numplus = numplus;
    }

    synchronized public  void run(){
        System.out.println(this.getName() + " берет палочку");

        try {

            if (getPriority() >= 5 ) {
                System.out.println(getName() + " бежит к финишу");
                System.out.println(getName() + " бежит к " + "Бегун " + (getNumplus()));
            } else {
                System.out.println(getName() + " бежит к " + "Бегун " + (getNumplus()));

            }

        } catch (Exception e) { }
    }
}





