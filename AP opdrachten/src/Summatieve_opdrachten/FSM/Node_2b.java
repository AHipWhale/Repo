package Summatieve_opdrachten.FSM;

import java.util.*;
import java.util.stream.IntStream;

public class Node_2b {
    private Map<Node_2b, Integer> overgang;
    private String naam;
    private ArrayList<Node_2b> kans;

    public Node_2b(String nm) {
        naam = nm;
        kans = new ArrayList<>();
    }

    public String getNaam() {
        return naam;
    }

    public void setOvergang(Map<Node_2b, Integer> overgang) {
        this.overgang = overgang;
    }

    public Map<Node_2b, Integer> getOvergang() {
        return overgang;
    }

    public Node_2b verwerkInput(Node_2b g) {
        for (Map.Entry<Node_2b, Integer> i : g.overgang.entrySet()) {
            Node_2b key = i.getKey();
            int value = i.getValue();
            IntStream.range(0, value).forEachOrdered(n -> {
                kans.add(key);
//              Bron : https://stackoverflow.com/questions/16570091/for-loop-like-python-range-function/31867991
            });
        }
        Node_2b error = new Node_2b("ERROR");

        if (kans.size() == 100) {
            Random rand = new Random();
            int randomIndex = rand.nextInt(kans.size());
            Node_2b volgendeNode2a = kans.get(randomIndex);
            kans.clear();
            return volgendeNode2a;
        }
        else {
            System.out.println("ERROR: De meegegeven kansen komen opgeteld niet uit op 100");
            return error;
        }
    }
}
