package LAB06;

public class ReportProcessor  extends  Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(3000);
                System.out.println("Enviando relatórios " + i + "/3... ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
