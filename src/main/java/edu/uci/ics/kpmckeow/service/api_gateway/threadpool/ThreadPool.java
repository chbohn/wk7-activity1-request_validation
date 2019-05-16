package edu.uci.ics.kpmckeow.service.api_gateway.threadpool;

public class ThreadPool {
    private int numWorkers;
    private Worker[] workers;
    private ClientRequestQueue queue;

    public ThreadPool(int numWorkers) {

    }

    public void add(ClientRequest clientRequest) {
        queue.enqueue(clientRequest);
    }

    public ClientRequest remove() {
        return queue.dequeue();
    }

    public ClientRequestQueue getQueue() {
        return queue;
    }
}
