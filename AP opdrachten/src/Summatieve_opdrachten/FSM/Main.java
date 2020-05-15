package Summatieve_opdrachten.FSM;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Node n0 = new Node("n0");
        Node n1 = new Node("n1");
        Node n2 = new Node("n2");
        Node n3 = new Node("n3");
        Node n4 = new Node("n4");
        Node n5 = new Node("n5");
        Node n6 = new Node("n6");
        Node g1 = new Node("1");
        Node g2 = new Node("2");
        Node g3 = new Node("3");
        Node g4 = new Node("4");
        Node g5 = new Node("5");
        Node g6 = new Node("6");

        Run r1 = new Run();

        Map<Node, Integer> d0 = new HashMap<Node, Integer>();
        d0.put(n2, 5);
        d0.put(n2, 5);
        n0.setOvergang(d0);

        Map<Node, Integer> d1 = new HashMap<Node, Integer>();
        d1.put(g1, 5);
        d1.put(g2, 5);
        n1.setOvergang(d1);

        Map<Node, Integer> d2 = new HashMap<Node, Integer>();
        d2.put(g3, 50);
        d2.put(g4, 50);
        n2.setOvergang(d2);


        r1.currentNode(n0);
        r1.run();
    }
}
