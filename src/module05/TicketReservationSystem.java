package module05;

import java.util.ArrayList;
import java.util.Random;

public class TicketReservationSystem {
    private static int seats = 10;

    public synchronized void reserve(int tickets, long id) {
        if (seats - tickets > 0) {
            seats -= tickets;
            System.out.printf("\nCustomer %s reserved %s tickets", id, tickets);
        } else {
            System.out.printf("\nCustomer %s couldn't reserve %s tickets.", id, tickets);
        }
    }

    public static void main(String[] args) {
        TicketReservationSystem trs = new TicketReservationSystem();
        ArrayList<Thread> customers = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            Thread t = new Thread(new Customer(trs));
            customers.add(t);
        }
        for (Thread t : customers) {
            t.start();
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class Customer implements Runnable {
    public static Random rand = new Random();

    private static int increment = 1;
    private final int id;
    private final TicketReservationSystem ticketReservationSystem;

    public Customer(TicketReservationSystem t) {
        this.ticketReservationSystem = t;
        this.id = increment++;
    }


    @Override
    public void run() {
        ticketReservationSystem.reserve(rand.nextInt(3) + 1, this.id);
    }
}

