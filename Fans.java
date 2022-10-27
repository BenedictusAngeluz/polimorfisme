public class Fans {
    private String name;

    public Fans() {
        name = "noname: ";
    }

    public Fans(String name) {
        this.name = name;
    }

    public void showName() {
        System.out.print(name + ": ");
    }

    public void watchingPerformance() {
        System.out.println(name + " melihat idolanya dari youtube");
    }

    public void watchingPerformance(Musician musician) {
        System.out.print(name + ": " + " melihat idolanya ");
        musician.perform();
    }
}