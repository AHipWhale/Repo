package Formatieve_opdrachten.FSM_2b;

public class Main {
    public static void main(String[] args) {
        Node n0 = new Node("n0");
        Node n1 = new Node("n1");
        Node n2 = new Node("n2");
        Node n3 = new Node("n3");
        Node n4 = new Node("n4");
        Node n5 = new Node("n5");
        Node n6 = new Node("n6");
        Node g1 = new Node("1");
        Node g8 = new Node("2");
        Node g9 = new Node("3");
        Node g10 = new Node("4");
        Node g11 = new Node("5");
        Node g12 = new Node("6");

        Run r1 = new Run();

        n0.setOvergangA(n1);
        n0.setOvergangB(n2);

        n1.setOvergangA(n3);
        n1.setOvergangB(n4);

        n2.setOvergangA(n5);
        n2.setOvergangB(n6);

        n3.setOvergangA(n1);
        n3.setOvergangB(g1);

        n4.setOvergangA(g8);
        n4.setOvergangB(g9);

        n5.setOvergangA(g10);
        n5.setOvergangB(g11);

        n6.setOvergangA(g12);
        n6.setOvergangB(n2);

        r1.currentNode(n0);
        r1.run();
    }
}
