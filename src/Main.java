public class Main {
    public static void main(String[] args) {
        Fighter halim = new Fighter("Halim", 10, 120, 95,40);
        Fighter mehmet = new Fighter("Mehmet", 15,85,90,30);

        Ring ring = new Ring(halim,mehmet,85,100);
        ring.run();
    }
}
