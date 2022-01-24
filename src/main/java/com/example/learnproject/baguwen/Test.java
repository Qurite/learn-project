package com.example.learnproject.baguwen;

/**
 * @author ：majingyu
 * @date ：Created in 2022/1/17 10:26
 * @description：
 * @modified By：
 */
public class Test {
    public static void main(String[] args) throws InterruptedException,IllegalMonitorStateException{
        System.out.println("-------------");
        Test test = new Test();
        Test finalTest = test;
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    finalTest.testNotify(finalTest);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        finalTest.testWait(finalTest);


    }
    synchronized void testWait(Test finalTest) throws InterruptedException {
        System.out.println("准备wait");
        finalTest.wait();
        System.out.println("被唤醒了");
    }

    synchronized void testNotify(Test finalTest) throws InterruptedException {
        System.out.println("准备唤醒");
        finalTest.notify();
    }

}