/*
 * @author Andrzej Wiech
 */

package com.wiech.algorithms.general.easy;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {

    private Lock lock;
    private int balance = 100;

    public static void main(String[] args) {
        LockTest lockTest = new LockTest();
        new Thread(lockTest::deposit).start();
        new Thread(lockTest::withdraw).start();
    }

    private LockTest() {
        this.lock = new ReentrantLock();
    }

    private void withdraw() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.lock();
        balance--;
        System.out.println("withdraw " + balance);
        lock.unlock();
    }

    private void deposit() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.lock();
        balance++;
        System.out.println("deposit " + balance);
        lock.unlock();
    }
}
