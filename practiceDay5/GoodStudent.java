package practiceDay5;

public class GoodStudent extends Student implements PerformantEvaluator {
    private int numberOfAward;

    public GoodStudent(int id, String name, int group) {
        super(id, name, group);
    }

    public int getNumberOfAward() {
        return numberOfAward;
    }

    public void setNumberOfAward(int numberOfAward) {
        this.numberOfAward = numberOfAward;
    }

    public void printNumberOfAward() {
        System.out.println(this.numberOfAward);
    }

    @Override
    public void diDonVeSinh() {
        System.out.println(this.getName() + " don ve sinh");
    }

    @Override
    public void diemDanh() {
        System.out.println(this.getName() + " điểm danh");
    }

    @Override
    public double calculatePerformanceScore() {
        return this.numberOfAward;
    }

}
