package LAB06;


public class Main {
    public static void main(String[] args) {
        Thread x1 = new Thread (new EmailSender());
        Thread x2 = new Thread(new ReportProcessor());
        x1.start();
        x2.start();
        System.out.println("\n"+ "Envio de E-mails e Relatórios Concluído!" + "\n");
    }
}
