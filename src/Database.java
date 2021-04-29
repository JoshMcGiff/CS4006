import java.util.ArrayList;
// A trivial example of how Electronic Health Records would be stored, used for the purpose of showing the workings of the EHR analysis:
public class Database {
    private ArrayList<ElectronicHealthRecord> healthRecords;

    public Database(){
        healthRecords = new ArrayList<>();
    }

    public void AddEntry(ElectronicHealthRecord ehr){
        healthRecords.add(ehr);
    }

    public ElectronicHealthRecord GetEntry(int index){
        return healthRecords.get(index);
    }

    public int GetSize(){
        return healthRecords.size();
    }

    public String GetDiagnosis(ElectronicHealthRecord ehr){
        String preDiagnosis = "The diagnosis for " + ehr.getName() + " is:\n";
        String diagnosis =  preDiagnosis;

        if(ehr.isHasDryCough() && ehr.isHasFatigue() && ehr.isHasFever()){
            diagnosis += "The patient has COVID-19 as a result of their dry cough, increased fatique and fever\n";
        }else if(ehr.isHasDryCough() || ehr.isHasFatigue() || ehr.isHasFever()){
            diagnosis += "The patient has symptoms of COVID-19 and should get a test.\n";
        }
        if(ehr.getSystolicBloodPressure() < 120 && ehr.getDiastolicBloodPressure() < 80){
            diagnosis += "The patient has normal blood pressure\n";
        }
        else if(ehr.getSystolicBloodPressure() < 130 && ehr.getDiastolicBloodPressure() < 80){
            diagnosis += "The patient has stage 1 high blood pressure\n";
        }
        else if(ehr.getSystolicBloodPressure() < 180 && ehr.getDiastolicBloodPressure() < 120){
            diagnosis += "The patient has stage 2 high blood pressure\n";
        }
        else{
            diagnosis += "The patient is having a hypertensive crisis\n";
        }

        return diagnosis.equals(preDiagnosis) ? diagnosis + "The patient is healthy" : diagnosis;
    }

}
