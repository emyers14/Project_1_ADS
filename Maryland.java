package CPSC34000;

public class Maryland extends State {
    Maryland() { /* null constructor */ }

    public void printMe() {
        System.out.println("Read it.");
    }

    public static void main(String[] args) {
        Region east = new State();
        State md = new Maryland();
        Object obj = new Place();
        Place usa = new Region();

        md.printMe(); // Read it.
        east.printMe(); // Ship it.
        ((Place) obj).printMe(); // Buy it.
        usa.printMe(); // Box it.
        ((Maryland) md).printMe(); // Read it.
    }
}

class State extends Region {
    State() { /* null constructor */ }

    public void printMe() {
        System.out.println("Ship it.");
    }
}

class Region extends Place {
    Region() { /* null constructor */ }

    public void printMe() {
        System.out.println("Box it.");
    }
}

class Place extends Object {
    Place() { /* null constructor */ }

    public void printMe() {
        System.out.println("Buy it.");
    }
}
