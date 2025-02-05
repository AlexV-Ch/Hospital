import java.text.DecimalFormat;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Patient patient = new Patient();
        System.out.println(patient.getReportList(patient.getArrayPatient(), patient.generatePatientsTemperatures()));
        patient.getReport(patient.getArrayPatient(), patient.generatePatientsTemperatures());

    }
}