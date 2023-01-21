package com.worldhello.lambdas;

public class Thread2 implements Runnable{
    private Thread thr;
    private double[] arrNumber;
    private double sumOfArr;

    public Thread2(double[] arrNumber) {
        this.arrNumber = arrNumber;
        thr = new Thread(this, "Thread2");
        thr.start();
    }

    @Override
    public void run() {
        double sum = 0;
        for (int i = 0; i < arrNumber.length; i++) {
            sum += arrNumber[i];
        }
        sumOfArr = sum;
    }

    public Thread getThread() { return thr; }
    public double getSum() { return sumOfArr; }

    int getPriority() {
        // вызывается getPriority()
        return thr.getPriority();
    }
}
