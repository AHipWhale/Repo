package Summatieve_opdrachten.FSM_2;

public class Node {
    private String naam;
    private Node overgangA;
    private Node overgangB;

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

    public Node verwerkInput(String s) {
        if (s.equals("A")) {
            return overgangA;
        }
        else {
            return overgangB;
        }
    }
}
