package Formatieve_opdrachten.FSM_2a;
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
            nieuwNode = currentNode.verwerkInput(i);
            currentNode = nieuwNode;
            nd = nieuwNode.getNaam();
            list.add(nd);
        }
        System.out.println(list);
        list.clear();
    }
}
