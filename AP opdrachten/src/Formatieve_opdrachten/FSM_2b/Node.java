package Formatieve_opdrachten.FSM_2b;

public class Node {
    private Node overgangA;
    private Node overgangB;
    private String naam;

    public Node(String nm) {
        naam = nm;
    }

    public String getNaam() {
        return naam;
    }

    public void setOvergangA(Node overgangA) {
        this.overgangA = overgangA;
    }

    public void setOvergangB(Node overgangB) {
        this.overgangB = overgangB;
    }

    public Node getOvergangA() {
        return overgangA;
    }

    public Node getOvergangB() {
        return overgangB;
    }

    public double getRandom() {
        return Math.random();
    }

    public Node verwerkInput(Node g) {
        if (getRandom() <= 0.5) {
            return overgangA;
        }
        else {
            return overgangB;
        }
    }
}