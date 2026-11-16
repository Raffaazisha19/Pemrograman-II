import java.util.Scanner;

public class CLIApp {
    private Scanner scanner;
    private InputDataPage inputPage;
    private InfoPage infoPage;
    private boolean isRunning;

    public CLIApp() {
        this.scanner = new Scanner(System.in);
        this.inputPage = new InputDataPage(this.scanner);
        this.infoPage = new InfoPage();
        this.isRunning = true;
    }

    public void start() {
        while (isRunning) {
            printMenu();
            System.out.print("Pilihan Menu: ");
            String choice = scanner.nextLine();
            System.out.println();

            switch (choice) {
                case "1":
                    inputPage.execute();
                    break;
                case "2":
                    infoPage.execute();
                    break;
                case "0":
                    System.out.println("Terima kasih, program selesai.");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.\n");
                    break;
            }
        }
    }

    private void printMenu() {
        System.out.println("=== MENU UTAMA CLI ===");
        System.out.println("1. Scan Input User & Tampilkan");
        System.out.println("2. Informasi Aplikasi");
        System.out.println("0. Keluar");
    }
}