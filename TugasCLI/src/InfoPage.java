public class InfoPage extends Page {

    public InfoPage() {
        super("Halaman Informasi");
    }

    @Override
    public void execute() {
        displayHeader();
        System.out.println("Sitem Input Data Mahasiswa:");
        System.out.println("Fitur utama:");
        System.out.println("1. Halaman Menu");
        System.out.println("2. Pengisian & Menampilkan Data Mahasiswa");
    }
}