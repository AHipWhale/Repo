package Summatieve_opdrachten.FSM_2;

public class Main {
    public static void main(String[] args) {
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");
        Node s3 = new Node("s3");

        Run r1 = new Run();

        s0.setOvergang("A", s1);
        s0.setOvergang("B", s2);
        s0.setOvergang("C", s3);

        s1.setOvergang("A", s1);
        s1.setOvergang("B", s2);

        s2.setOvergang("B", s3);

        s3.setOvergang("A", s3);
        s3.setOvergang("B", s0);

        String[] f = {"B", "A", "A", "B"};
        String[] g = {"B", "B", "B", "A"};

        r1.currentNode(s0);
        r1.run(f);

        r1.currentNode(s0);
        r1.run(g);
    }
}
