package edu.uci.ics.kpmckeow.service.api_gateway.threadpool;

import edu.uci.ics.kpmckeow.service.api_gateway.logger.ServiceLogger;

public class Worker extends Thread {
    int id;
    ThreadPool threadPool;

    private Worker(int id, ThreadPool threadPool) {

    }

    public static Worker CreateWorker(int id, ThreadPool threadPool) {

    }

    public void process() {
        // Do the work

        // Add response to database
    }

    @Override
    public void run() {
        while (true) {
            // Get request from queue
        }
    }
}
