package Summatieve_opdrachten.FSM_2;

import java.util.*;

public class Node {
    private String naam;
    private Map<String, Node> overgang = new Hashtable<String, Node>();

    public Node(String nm) {
        naam = nm;
    }

    public String getNaam() {
        return naam;
    }

    public void setOvergang(String waarde, Node ovrgng) {
        overgang.put(waarde, ovrgng);
    }

    public Map<String, Node> getOvergang() {
        return overgang;
    }

    public Node verwerkInput(String s, Node current) {
//        System.out.println(s);
//        System.out.println(overgang);
        for (Map.Entry<String, Node> i : current.overgang.entrySet()) {
            String key = i.getKey();
            Node value = i.getValue();
            if (i.getKey().equals(s)) {
                return i.getValue();
            }
        }
        Node error = new Node("ERROR");
        System.out.println("ERROR: Deze stap zit niet in dit ding");
        return error;
    }
}
