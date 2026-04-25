package adapter;

public class IMCService {

    public void calculateIMC(PatientData data) {
        double weight = data.getWeightKg();
        double height = data.getHeightMeters();

        double imc = weight / (height * height);

        System.out.println("Peso (kg): " + weight);
        System.out.println("Altura (m): " + height);
        System.out.println("IMC: " + imc);

        if (imc < 18.5) {
            System.out.println("Clasificación: Bajo peso");
        } else if (imc < 25) {
            System.out.println("Clasificación: Normal");
        } else {
            System.out.println("Clasificación: Sobrepeso");
        }
    }
}
