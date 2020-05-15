package Summatieve_opdrachten.FSM;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class RunTest {

    @Test
    void currentNode() {
        Run r1 = new Run();
        Node n1 = new Node("n1");
        r1.currentNode(n1);
        assertEquals("n1", r1.currentNode(n1).getNaam());
    }

    @Test
    void run_2b() {
        Run r1 = new Run();
        Node n0 = new Node("n0");
        Node n1 = new Node("n1");
        Node n2 = new Node("n2");
        Map<Node, Integer> d0 = new HashMap<Node, Integer>();
        d0.put(n2, 50);
        d0.put(n1, 50);
        n0.setOvergang_2b(d0);
        r1.currentNode(n0);
        assertEquals(2, r1.run_2b().size());
    }

    @Test
    void run() {
//        Ik had geen idee hoe ik deze kon testen
    }

    @Test
    void testRun_2a() {
        Node s0 = new Node("n0");
        Node s1 = new Node("n1");
        Node s2 = new Node("n2");
        Node s3 = new Node("n3");

        s0.setOvergang_2a("A", s1);
        s0.setOvergang_2a("B", s2);
        s0.setOvergang_2a("C", s3);
        Run r1 = new Run();
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> lijst = new ArrayList<>();
        String[] f = {"B", "A"};
        r1.currentNode(s0);
        lijst.add("n0");
        lijst.add("n2");
        assertEquals(lijst, r1.run(f, list));
    }
}