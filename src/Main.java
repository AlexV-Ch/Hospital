import java.text.DecimalFormat;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Версия 1 класс Patient
        Patient patient = new Patient();
        System.out.println(patient.getReportList(patient.getArrayPatient(), patient.generatePatientsTemperatures()));
        patient.getReport(patient.getArrayPatient(), patient.generatePatientsTemperatures());


        // Версия 2 класс PatientV2
        PatientV2[] patientV2s = new PatientV2[100];

        for (int i = 0; i < patientV2s.length; i++) {
            String name = "Пациент" + i;
            patientV2s[i] = new PatientV2(name, PatientV2.generatePatientsTemperaturesV2());
        }

        System.out.println(PatientV2.getReportListV2(patientV2s));
        PatientV2.getReport(patientV2s);

    }
}