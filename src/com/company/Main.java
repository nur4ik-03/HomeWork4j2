package com.company;



public class Main {

    public static void main(String[] args) {
        try {

            for (int i = 1; i < 5; i++) {
                Runner runner = new Runner("Бегун " + i);
                runner.setNamePlus(1 + i);
                runner.setPriority(i);
                runner.start();
                runner.join();

            }
            for (int j = 5; j > 1; j--) {
                Runner runner = new Runner("Бегун " + j); 
                runner.setNamePlus(j - 1);
                runner.setPriority(j);
                runner.start();
                runner.join();

            }
            }catch(Exception e){
        }

    }

}