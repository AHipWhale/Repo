package Summatieve_opdrachten.FSM;

import java.util.ArrayList;

public class Run {
    private Node nieuwNode;
    private Node currentNode;
    private ArrayList<String> list;
    private String nd;

    public Run() {
        list = new ArrayList<>();
    }

    public Node currentNode(Node n) {
        currentNode = n;
        return n;
    }

    public ArrayList<String> run_2b() {
        list = new ArrayList<>();
        list.add(currentNode.getNaam());
        while (currentNode.getOvergang_2b() != null) {
            nieuwNode = currentNode.verwerkInput_2b(currentNode);
            currentNode = nieuwNode;
            nd = nieuwNode.getNaam();
            list.add(nd);
            }
        System.out.println(list);
        return list;
    }

    public void run_2a(String[] f) {
        try {
            run(f, list);
        }

        catch (NullPointerException s) {
            System.out.println("Error: geen mogelijke overgang");
        }
    }

    public ArrayList<String> run(String[] f, ArrayList<String>list) {
        list.add(currentNode.getNaam());
        for (String i : f) {
            System.out.println(currentNode.getNaam());
            if (currentNode.verwerkInput_2a(i, currentNode).getNaam().equals("ERROR")) {
                break;
            }
            nieuwNode = currentNode.verwerkInput_2a(i, currentNode);
            currentNode = nieuwNode;
            nd = nieuwNode.getNaam();
            list.add(nd);
        }
        System.out.println(list);
        return list;
    }
}
