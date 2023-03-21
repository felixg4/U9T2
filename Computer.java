class Computer {
    private String cpu;
    private double price;
    public Computer(String c, double p) {
        cpu = c;
        price = p;
    }
    public void turnOn() {
        System.out.println("turning on...");
    }
    public String getCPU() {
        return cpu;
    }
    public double getPrice() {
        return price;
    }
}