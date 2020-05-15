package Summatieve_opdrachten.FSM;

import org.junit.jupiter.api.Test;

import java.util.*;


import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @org.junit.jupiter.api.Test
    void getNaam() {
        Node n1 = new Node("node_1");
        assertEquals("node_1", n1.getNaam());
    }

    @org.junit.jupiter.api.Test
    void setOvergang_2b() {
        Node n1 = new Node("node_1");
        Map<Node, Integer> dict = new HashMap<Node, Integer>();
        dict.put(n1, 25);
        n1.setOvergang_2b(dict);
        assertEquals(dict.get(n1), 25);
    }

    @Test
    void getOvergang_2b() {
        Node n1 = new Node("n1");
        Map<Node, Integer> dict = new HashMap<Node, Integer>();
        dict.put(n1, 25);
        n1.setOvergang_2b(dict);
        assertEquals(25, n1.getOvergang_2b().get(n1));
    }

    @org.junit.jupiter.api.Test
    void setOvergang_2a() {
        Node n1 = new Node("n1");
        Node n2 = new Node("n2");
        n1.setOvergang_2a("A", n2);
        assertEquals(n2, n1.getOvergang_2a().get("A"));
    }

    @org.junit.jupiter.api.Test
    void getOvergang_2a() {
        Node n1 = new Node("n1");
        Node n2 = new Node("n2");
        n1.setOvergang_2a("A", n2);
        assertEquals(n2, n1.getOvergang_2a().get("A"));
    }

    @org.junit.jupiter.api.Test
    void verwerkInput_2b() {
        Node n1 = new Node("n1");
        Node n2 = new Node("n2");
        Map<Node, Integer> dict = new HashMap<Node, Integer>();
        dict.put(n2, 100);
        n1.setOvergang_2b(dict);
        assertEquals(n2, n1.verwerkInput_2b(n1));
    }

    @org.junit.jupiter.api.Test
    void verwerkInput_2a() {
        Node n1 = new Node("n1");
        Node n2 = new Node("n2");
        n1.setOvergang_2a("A", n2);
        n1.setOvergang_2a("B", n1);
        assertEquals(n1, n1.verwerkInput_2a("B", n1));
    }
}