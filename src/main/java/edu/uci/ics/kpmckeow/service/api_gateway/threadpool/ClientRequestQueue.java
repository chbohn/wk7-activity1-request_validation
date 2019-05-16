package edu.uci.ics.kpmckeow.service.api_gateway.threadpool;

import edu.uci.ics.kpmckeow.service.api_gateway.logger.ServiceLogger;
import org.glassfish.jersey.internal.util.ExceptionUtils;

import static edu.uci.ics.kpmckeow.service.api_gateway.GatewayService.ANSI_RED;
import static edu.uci.ics.kpmckeow.service.api_gateway.GatewayService.ANSI_RESET;

public class ClientRequestQueue {
    private ListNode head;
    private ListNode tail;

    public ClientRequestQueue() {
        head = tail = null;
    }

    public synchronized void enqueue(ClientRequest clientRequest) {

    }

    public synchronized ClientRequest dequeue() {

    }

    boolean isEmpty() {
        return head == null;
    }

    boolean isFull() {
        return false;
    }
}
