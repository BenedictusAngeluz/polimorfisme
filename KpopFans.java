public class KpopFans extends Fans {
    public KpopFans() {
    }

    public KpopFans(String name) {
        super(name);
    }

    public void watchingPerformance(Musician musician, String expression) {
        showName();
        System.out.print(expression + " melihat idolanya ");
        musician.perform();
    }
}