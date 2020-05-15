package Summatieve_opdrachten.FSM;

import java.util.ArrayList;

public class Run_2b {
    private Node_2b nieuwNode2a;
    private Node_2b currentNode2a;
    private ArrayList<String> list;
    private String nd;

    public Run_2b() {
        list = new ArrayList<>();
    }

    public void currentNode(Node_2b n) {
        currentNode2a = n;
    }

    public void run() {
        list.add(currentNode2a.getNaam());
        while (currentNode2a.getOvergang() != null) {
            nieuwNode2a = currentNode2a.verwerkInput(currentNode2a);
            currentNode2a = nieuwNode2a;
            nd = nieuwNode2a.getNaam();
            list.add(nd);
            }
        System.out.println(list);
        list.clear();
    }
}
