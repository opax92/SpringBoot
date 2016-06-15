package com.example;

import org.springframework.stereotype.Component;

/**
 * Created by Seb on 2016-01-29.
 */
@Component
public class RequestLogger {

    public RequestLogger() {
        new Thread(new Z()).start();
    }

    private class Z implements Runnable {

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.currentThread().sleep(1000);
                    int count = RequestsCounter.getValue();
                    System.out.println("Count: " + count);
                } catch (Throwable t) {
                }
            }
        }
    }
}
