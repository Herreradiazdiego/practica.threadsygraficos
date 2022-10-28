public class runnables implements Runnable{
    private int d1;
    private int d2;
    private int d3;
    private int d4;
    public runnables(int r1, int r2, int r3, int r4){
        d1 = r1;
        d2 = r2;
        d3 = r3;
        d4 = r4;

        int total;
        int r3_1;
        int r3_2;
        int r3_3;
        int r3_4;

        total = d1 + d2 + d3 + d4;
        r3_1 = d1 * 360 / total;
        r3_2 = d2 * 360 / total;
        r3_3 = d3 * 360 / total;
        r3_4 = (360 - r3_1 - r3_2 - r3_3);
        values angs = new values(r3_1, r3_2, r3_3, r3_4);
    }
    @Override
    public void run() {
        System.out.println("-RUN-");
        System.out.println(Thread.currentThread().getName() + " d1:" + d1);
        System.out.println(Thread.currentThread().getName() + " d2:" + d2);
        System.out.println(Thread.currentThread().getName() + " d3:" + d3);
        System.out.println(Thread.currentThread().getName() + " d4:" + d4);

    }
}