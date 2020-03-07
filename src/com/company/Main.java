package com.company;



public class Main {

    public static void main(String[] args) {
        try {

            for (int i = 1; i < 5; i++) {
                Runner runner = new Runner("Бегун " + i);

                runner.setPriority(i);
                runner.start();
                runner.join();
                if (runner.getPriority() < 5)
                    System.out.println(runner.getName() + " бежит к " + "Бегун " + (runner.getNumplus() + i));
            }
            for (int j = 5; j < 10; j--) {
                Runner runner = new Runner("Бегун " + j);
                runner.setPriority(j);
                runner.start();
                runner.join();
                runner.setNumines(j - 1);
                if (runner.getPriority() > 1 && runner.getPriority() < 6)
                    System.out.println(runner.getName() + " бежит к " + "Бегун " + runner.getNumplus());
            }
        } catch (Exception e) {
        }
    }
}
