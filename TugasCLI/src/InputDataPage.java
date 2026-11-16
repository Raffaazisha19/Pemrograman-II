import java.util.Scanner;

public class InputDataPage extends Page {
    private Scanner scanner;
    private String name;
    private String nim;
    private String jurusan;

    public InputDataPage(Scanner scanner) {
        super("Halaman Input Data User");
        this.scanner = scanner;
    }

    public String getName() {
        return name;
    }

    public String getNim() {
        return nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    @Override
    public void execute() {
        displayHeader();

        System.out.print("Masukkan Nama    : ");
        this.name = scanner.nextLine();

        System.out.print("Masukkan NIM     : ");
        this.nim = scanner.nextLine();

        System.out.print("Masukkan Jurusan : ");
        this.jurusan = scanner.nextLine();

        System.out.println("\nHasil Scan Data User");
        System.out.println("Nama    : " + this.name);
        System.out.println("NIM     : " + this.nim);
        System.out.println("Jurusan : " + this.jurusan);
    }
}