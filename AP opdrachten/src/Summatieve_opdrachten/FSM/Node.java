package Summatieve_opdrachten.FSM;

import java.util.*;
import java.util.stream.IntStream;

public class Node {
    private Map<Node, Integer> overgang;
    private String naam;
    private ArrayList<Node> kans;

    public Node(String nm) {
        naam = nm;
        kans = new ArrayList<>();
    }

    public String getNaam() {
        return naam;
    }

    public void setOvergang(Map<Node, Integer> overgang) {
        this.overgang = overgang;
    }

    public Map<Node, Integer> getOvergang() {
        return overgang;
    }

    public Node verwerkInput(Node g) {
        for (Map.Entry<Node, Integer> i : g.overgang.entrySet()) {
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
}
