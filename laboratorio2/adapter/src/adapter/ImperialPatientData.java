package adapter;

public class ImperialPatientData {
    private double weightPounds;
    private double heightFeet;

    public ImperialPatientData(double weightPounds, double heightFeet) {
        this.weightPounds = weightPounds;
        this.heightFeet = heightFeet;
    }

    public double getWeightPounds() {
        return weightPounds;
    }

    public double getHeightFeet() {
        return heightFeet;
    }
}
