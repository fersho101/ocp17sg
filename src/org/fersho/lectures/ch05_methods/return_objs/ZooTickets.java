package org.fersho.lectures.ch05_methods.return_objs;

public class ZooTickets {
    public static int addTickets(int tickets) {
        tickets++;
        return tickets;
    }

    public static String addGuests(String guests) {
        guests += "d";
        return guests;
    }

    public static void main(String[] args) {
        int tickets = 2;
        String guests = "abc";
        addTickets(tickets);
        guests = addGuests(guests);
        System.out.println(tickets + guests);
    }
}
