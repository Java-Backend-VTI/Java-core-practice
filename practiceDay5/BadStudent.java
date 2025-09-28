package practiceDay5;

public class BadStudent extends Student {
    private int numberOfClaims;

    public BadStudent(int id, String name, int group) {
        super(id, name, group);
    }

    public int getNumberOfClaims() {
        return numberOfClaims;
    }

    public void setNumberOfClaims(int numberOfClaims) {
        this.numberOfClaims = numberOfClaims;
    }

    @Override
    public void diDonVeSinh() {
        System.out.println(this.getName() + " don ve sinh");
    }

    @Override
    public void diemDanh() {
        System.out.println(this.getName() + " điểm danh");
    }

    public void printNumberOfClaims() {
        System.out.println(this.numberOfClaims);
    }

}
