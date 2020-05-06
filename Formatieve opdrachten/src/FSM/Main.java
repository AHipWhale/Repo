package FSM;

public class Main {
    public static void main(String[] args) {
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");
        Node s3 = new Node("s3");

        Run r1 = new Run();

        s0.setOvergangA(s2);
        s0.setOvergangB(s1);

        s1.setOvergangA(s1);
        s1.setOvergangB(s2);

        s2.setOvergangB(s3);

        s3.setOvergangA(s3);
        s3.setOvergangB(s0);

        String[] f = {"B", "A", "A", "B"};
        String[] g = {"B", "A", "B", "A"};

        r1.currentNode(s0);
        r1.run(f);

        r1.currentNode(s0);
        r1.run(g);
    }
}
