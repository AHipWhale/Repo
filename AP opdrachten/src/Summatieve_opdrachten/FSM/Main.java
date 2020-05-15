package Summatieve_opdrachten.FSM;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Node_2b n0 = new Node_2b("n0");
        Node_2b n1 = new Node_2b("n1");
        Node_2b n2 = new Node_2b("n2");
        Node_2b n3 = new Node_2b("n3");
        Node_2b n4 = new Node_2b("n4");
        Node_2b n5 = new Node_2b("n5");
        Node_2b n6 = new Node_2b("n6");
        Node_2b g1 = new Node_2b("1");
        Node_2b g2 = new Node_2b("2");
        Node_2b g3 = new Node_2b("3");
        Node_2b g4 = new Node_2b("4");
        Node_2b g5 = new Node_2b("5");
        Node_2b g6 = new Node_2b("6");

        Run_2b r1 = new Run_2b();

        Map<Node_2b, Integer> d0 = new HashMap<Node_2b, Integer>();
        d0.put(n2, 99);
        d0.put(n1, 1);
        n0.setOvergang(d0);

        Map<Node_2b, Integer> d1 = new HashMap<Node_2b, Integer>();
        d1.put(g1, 50);
        d1.put(g2, 50);
        n1.setOvergang(d1);

        Map<Node_2b, Integer> d2 = new HashMap<Node_2b, Integer>();
        d2.put(g3, 25);
        d2.put(g4, 25);
        d2.put(g5, 25);
        d2.put(g6, 25);
        n2.setOvergang(d2);


        r1.currentNode(n0);
        r1.run();
    }
}
