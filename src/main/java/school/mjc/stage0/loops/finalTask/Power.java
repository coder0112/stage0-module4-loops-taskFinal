package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int n, int m) {
        long p = 1;
        for (int i = 0; i < m; i++) {
            p *= n;
        }
        System.out.println(p);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
