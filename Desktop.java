public class Desktop extends Computer {
    private double caseVolume;
    public Desktop(String c, double p, double cv) {
        super(c, p);
        caseVolume = cv;
    }
    public void replacePart(String partToReplace, String newPart) {
        System.out.println("replacing " + partToReplace + " with a " + newPart);
    }
    public double getCaseVolume() {
        return caseVolume;
    }
}
