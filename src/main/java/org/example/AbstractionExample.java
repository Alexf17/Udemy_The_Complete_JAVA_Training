package org.example;

abstract class Building {
    protected String name;

    public Building(String name) {
        this.name = name;
    }

    public abstract void open();

    public void close() {
        System.out.println(name + " is closed.");
    }
}

class House extends Building {
    private int numRooms;

    public House(String name, int numRooms) {
        super(name);
        this.numRooms = numRooms;
    }

    public void open() {
        System.out.println(name + " with " + numRooms + " rooms is open.");
    }
}

class Office extends Building {
    private boolean hasMeetingRooms;

    public Office(String name, boolean hasMeetingRooms) {
        super(name);
        this.hasMeetingRooms = hasMeetingRooms;
    }

    public void open() {
        System.out.println(name + " office " + (hasMeetingRooms ? "with meeting rooms" : "without meeting rooms") + " is open.");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        House house = new House("Smith's Residence", 5);
        Office office = new Office("ABC Corp", true);

        house.open();
        office.open();

        house.close();
        office.close();
    }
}