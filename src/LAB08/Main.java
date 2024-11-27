package LAB08;

public class Main {
    public static void main(String[] args) {
        Thread x1 = new Thread (new FileDownloaderA());
        Thread x2 = new Thread(new FileDownloaderB());
        x1.start();
        x2.start();
        System.out.println("\n"+ "Todos os downloads concluídos!" + "\n");
    }
}
