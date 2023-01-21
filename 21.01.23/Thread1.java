package com.worldhello.lambdas;

public class Thread1 implements Runnable{
    private Thread thr;
    private int[] arrNumber;
    private int maximum;

    public Thread1(int[] arrNumber) {
        this.arrNumber = arrNumber;
        thr = new Thread(this, "Thread1");
        thr.start();
    }

    @Override
    public void run() {
        int max = arrNumber[0];
        for (int i = 0; i < arrNumber.length; i++) {
            if (max < arrNumber[i])
                max = arrNumber[i];
        }
        maximum = max;
    }

    public Thread getThread() { return thr; }
    public int getMax() { return maximum; }
    int getPriority() {
        // вызывается getPriority()
        return thr.getPriority();
    }
}
