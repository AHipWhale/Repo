package Summatieve_opdrachten.FSM;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//      Nodes van 2b
        Node n0_2b = new Node("n0");
        Node n1_2b= new Node("n1");
        Node n2_2b = new Node("n2");
        Node n3_2b = new Node("n3");
        Node n4_2b = new Node("n4");
        Node n5_2b = new Node("n5");
        Node n6_2b = new Node("n6");
        Node g1_2b = new Node("1");
        Node g2_2b = new Node("2");
        Node g3_2b = new Node("3");
        Node g4_2b = new Node("4");
        Node g5_2b = new Node("5");
        Node g6_2b = new Node("6");

//      Node van 2a
        Node s0_2a = new Node("s0");
        Node s1_2a = new Node("s1");
        Node s2_2a = new Node("s2");
        Node s3_2a = new Node("s3");

//      Run van 2b
        Run r1_2b = new Run();

//      Run van 2a
        Run r1_2a = new Run();

//      de overgangen van 2b
        Map<Node, Integer> d0 = new HashMap<Node, Integer>();
        d0.put(n2_2b, 50);
        d0.put(n1_2b, 50);
        n0_2b.setOvergang_2b(d0);

        Map<Node, Integer> d1 = new HashMap<Node, Integer>();
        d1.put(g1_2b, 50);
        d1.put(g2_2b, 50);
        n1_2b.setOvergang_2b(d1);

        Map<Node, Integer> d2 = new HashMap<Node, Integer>();
        d2.put(g3_2b, 25);
        d2.put(g4_2b, 25);
        d2.put(g5_2b, 25);
        d2.put(g6_2b, 25);
        n2_2b.setOvergang_2b(d2);

//      de overgangen van 2a
        s0_2a.setOvergang_2a("A", s1_2a);
        s0_2a.setOvergang_2a("B", s2_2a);
        s0_2a.setOvergang_2a("C", s3_2a);

        s1_2a.setOvergang_2a("A", s1_2a);
        s1_2a.setOvergang_2a("B", s2_2a);

        s2_2a.setOvergang_2a("B", s3_2a);

        s3_2a.setOvergang_2a("A", s3_2a);
        s3_2a.setOvergang_2a("B", s0_2a);

//      lijst met strings voor volgorde
        String[] f = {"B", "A", "A", "B"};
        String[] g = {"B", "B", "B", "A"};

//      test run van 2b
        r1_2b.currentNode(n0_2b);
        r1_2b.run_2b();
        System.out.println();

//      test 1 run van 2a
        r1_2a.currentNode(s0_2a);
        r1_2a.run_2a(f);
        System.out.println();

//      test 2 run van 2a
        r1_2a.currentNode(s0_2a);
        r1_2a.run_2a(g);
        System.out.println();
    }
}
