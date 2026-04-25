package adapter;

public class Main {
    public static void main(String[] args) {

        ImperialPatientData imperialData = new ImperialPatientData(150, 5.8);

        PatientData adaptedData = new ImperialToMetricAdapter(imperialData);

        IMCService service = new IMCService();
        service.calculateIMC(adaptedData);
    }
}
