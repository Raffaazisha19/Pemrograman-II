public abstract class Page implements Displayable {
    private String title;

    public Page(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void displayHeader() {
        System.out.println("========================================");
        System.out.println("         " + title.toUpperCase());
        System.out.println("========================================");
    }

    public abstract void execute();
}