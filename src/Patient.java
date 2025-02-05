import java.text.DecimalFormat;

public class Patient {

    public int totalPatients = 100;


    public String[] getArrayPatient() {
        String[] arrayPatient = new String[totalPatients];
        for (int i = 0; i < arrayPatient.length; i++) {
            arrayPatient[i] = "Пациент-" + i;
        }
        return arrayPatient;
    }

    public float[] generatePatientsTemperatures() {
        float[] arrayTemp = new float[totalPatients];
        double minTemp = 32;
        double maxTemp = 40;

        for (int i = 0; i < arrayTemp.length; i++) {
            double temperatures = (Math.random() * (maxTemp - minTemp)) + minTemp;
            arrayTemp[i] = (float) (Math.round(temperatures * 10) / 10.0);
        }
        return arrayTemp;
    }

    public String getReportList(String[] arrayPatient, float[] arrayTemp) {
        StringBuilder listAll = new StringBuilder();
        for (int i = 0; i < arrayPatient.length; i++  ) {
            listAll.append(arrayPatient[i]).append(" - ").append(arrayTemp[i]).append("\n");
        }
        return listAll.toString().trim();
    }



      public void getReport(String[] arrayPatient, float[] arrayTemp) {

          DecimalFormat decimalFormat = new DecimalFormat("#.#");
          float sum = 0.0f;
          int healthy = 0;
          for (int i = 0; i < arrayPatient.length; i++  ) {
              sum += arrayTemp[i];
            if ((arrayTemp[i] >= 36.2f) && (arrayTemp[i] <= 36.9f)) {
                healthy++;
            }
          }
          System.out.println("Среднее арифметическое значение температуры - " +
                decimalFormat.format((sum / arrayTemp.length)));
          System.out.println("Количество здоровых пациентов с температурой\n" +
                  "от 36,2 до 36,9 градусов - " + healthy);
      }


}
