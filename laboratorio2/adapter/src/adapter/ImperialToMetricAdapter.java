package adapter;

public class ImperialToMetricAdapter implements PatientData {

    private ImperialPatientData adaptee;

    public ImperialToMetricAdapter(ImperialPatientData adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public double getWeightKg() {
        return adaptee.getWeightPounds() * 0.4536;
    }

    @Override
    public double getHeightMeters() {
        return adaptee.getHeightFeet() * 0.3048;
    }
}
