package Summatieve_opdrachten.FSM_2;

import java.util.ArrayList;

public class Run {
    private Node nieuwNode;
    private Node currentNode;
    private String[] f;
    private ArrayList<String> list;
    private String nd;

    public Run() {
        list = new ArrayList<>();
    }

    public void currentNode(Node n) {
        currentNode = n;
    }

    public void run(String[] f) {
        try {
            run(f, list);
        }

        catch (NullPointerException s) {
            System.out.println("Error: geen mogelijke overgang");
        }
    }

    public void run(String[] f, ArrayList<String>list) {
        list.add(currentNode.getNaam());
        for (String i : f) {
            System.out.println(currentNode.getNaam());
            if (currentNode.verwerkInput(i, currentNode).getNaam().equals("ERROR")) {
                break;
            }
            nieuwNode = currentNode.verwerkInput(i, currentNode);
            currentNode = nieuwNode;
            nd = nieuwNode.getNaam();
            list.add(nd);
        }
        System.out.println(list);
        list.clear();
    }
}
