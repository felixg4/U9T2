public class Laptop extends Computer{
    private double screenSize;
    public Laptop(String c, double p, double s) {
        super(c, p);
        screenSize = s;
    }
    public void sendToRepairShop() {
        System.out.println("being repaired at a repair shop...");
    }
    public double getScreenSize() {
        return screenSize;
    }
}
