import java.text.DecimalFormat;

public class PatientV2 {
    private final String name;
    private final float temperature;

    public PatientV2(String name, float temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public float getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return name + " - " + temperature + "\n";
    }

    public static float generatePatientsTemperaturesV2() {
        double minTemp = 32;
        double maxTemp = 40;
            double temperature = (Math.random() * (maxTemp - minTemp)) + minTemp;
            return  (float) (Math.round(temperature * 10) / 10.0);
    }

    public static String getReportListV2(PatientV2[] patientV2s) {
        StringBuilder listAll = new StringBuilder();
        for (int i = 0; i < patientV2s.length; i++  ) {
            listAll.append(patientV2s[i].toString());
        }
        return listAll.toString().trim();
    }

    public static void getReport(PatientV2[] patientV2s) {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        float sum = 0.0f;
        int healthy = 0;
        for (int i = 0; i < patientV2s.length; i++  ) {
            sum += patientV2s[i].getTemperature();
            if ((patientV2s[i].getTemperature() >= 36.2f) &&
                    (patientV2s[i].getTemperature() <= 36.9f)) {
                healthy++;
            }
        }
        System.out.println("Среднее арифметическое значение температуры - " +
                decimalFormat.format((sum / patientV2s.length)));
        System.out.println("Количество здоровых пациентов с температурой\n" +
                "от 36,2 до 36,9 градусов - " + healthy);
    }

}
