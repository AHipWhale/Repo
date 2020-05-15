package Summatieve_opdrachten.FSM;

import com.sun.deploy.cache.BaseLocalApplicationProperties;

import java.util.*;
import java.util.stream.IntStream;

public class Node {
    private Map<Node, Integer> overgang_2b;
    private Map<String, Node> overgang_2a = new Hashtable<String, Node>();
    private String naam;
    private ArrayList<Node> kans;

    public Node(String nm) {
        naam = nm;
        kans = new ArrayList<>();
    }

    public String getNaam() {
        return naam;
    }

    public void setOvergang_2b(Map<Node, Integer> overgang) {
        this.overgang_2b = overgang;
    }

    public Map<Node, Integer> getOvergang_2b() {
        return overgang_2b;
    }

    public void setOvergang_2a(String waarde, Node ovrgng) {
        overgang_2a.put(waarde, ovrgng);
    }

    public Map<String, Node> getOvergang_2a() {
        return overgang_2a;
    }

    public Node verwerkInput_2b(Node g) {
        for (Map.Entry<Node, Integer> i : g.overgang_2b.entrySet()) {
            Node key = i.getKey();
            int value = i.getValue();
            IntStream.range(0, value).forEachOrdered(n -> {
                kans.add(key);
//              Bron : https://stackoverflow.com/questions/16570091/for-loop-like-python-range-function/31867991
            });
        }
        Node error = new Node("ERROR");

        if (kans.size() == 100) {
            Random rand = new Random();
            int randomIndex = rand.nextInt(kans.size());
            Node volgendeNode = kans.get(randomIndex);
            kans.clear();
            return volgendeNode;
        }
        else {
            System.out.println("ERROR: De meegegeven kansen komen opgeteld niet uit op 100");
            return error;
        }
    }
    public Node verwerkInput_2a(String s, Node current) {
        for (Map.Entry<String, Node> i : current.overgang_2a.entrySet()) {
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
