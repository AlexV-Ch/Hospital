import java.text.DecimalFormat;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] arrayPatient = new String[100];
        for (int i = 0; i < arrayPatient.length; i++) {
            arrayPatient[i] = "Пациент-" + i;
        }

        getReport(arrayPatient, generatePatientsTemperatures());

    }

    public static void getReport(String[] arrayPatient, float[] arrayTemp) {
        StringBuilder listPatTemp = new StringBuilder();
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        float sum = 0.0f;
        int healthy = 0;
        for (int i = 0; i < arrayPatient.length; i++  ) {
            listPatTemp.append(arrayPatient[i]).append(" - ").append(arrayTemp[i]).append("\n");
            sum += arrayTemp[i];
            if ((arrayTemp[i] >= 36.2f) && (arrayTemp[i] <= 36.9f)) {
                healthy++;
            }

        }
        System.out.println(listPatTemp.toString().trim());
        System.out.println("Среднее арифметическое значение температуры - " +
                decimalFormat.format((sum / arrayTemp.length)));
        System.out.println("Количество здоровых пациентов с температурой\n" +
                "от 36,2 до 36,9 градусов - " + healthy);
    }

    public static float[] generatePatientsTemperatures() {
        float[] arrayTemp = new float[100];
        double minTemp = 32;
        double maxTemp = 40;

        for (int i = 0; i < arrayTemp.length; i++) {
            double temperatures = (Math.random() * (maxTemp - minTemp)) + minTemp;
            arrayTemp[i] = (float) (Math.round(temperatures * 10) / 10.0);
        }
        return arrayTemp;
    }
}