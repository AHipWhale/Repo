package Formatieve_opdrachten.FSM_2b;

import java.util.ArrayList;

public class Run {
    private Node nieuwNode;
    private Node currentNode;
    private ArrayList<String> list;
    private String nd;

    public Run() {
        list = new ArrayList<>();
    }

    public void currentNode(Node n) {
        currentNode = n;
    }

    public void run() {
        list.add(currentNode.getNaam());
        while (currentNode.getOvergangA() != null || currentNode.getOvergangB() != null) {
            nieuwNode = currentNode.verwerkInput(currentNode);
            currentNode = nieuwNode;
            nd = nieuwNode.getNaam();
            list.add(nd);
        }
        System.out.println(nd);
        System.out.println(list);
        list.clear();
    }
}

