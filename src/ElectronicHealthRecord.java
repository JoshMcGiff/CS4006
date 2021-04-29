//A trivial implementation of a Electronic Health Record:
public class ElectronicHealthRecord {
    private String name;
    private int systolicBloodPressure;
    private int diastolicBloodPressure;
    private boolean hasFever;
    private boolean hasDryCough;
    private boolean hasFatigue;

    private String diagnosis;


    public ElectronicHealthRecord(String name, int systolicBloodPressure, int diastolicBloodPressure, boolean hasFever, boolean hasDryCough, boolean hasFatigue){
        this.systolicBloodPressure = systolicBloodPressure;
        this.diastolicBloodPressure = diastolicBloodPressure;
        this.hasFever = hasFever;
        this.hasDryCough = hasDryCough;
        this.hasFatigue = hasFatigue;
        this.name = name;
    }

    public boolean isHasFatigue() {
        return hasFatigue;
    }

    public boolean isHasDryCough() {
        return hasDryCough;
    }

    public boolean isHasFever() {
        return hasFever;
    }

    public int getDiastolicBloodPressure() {
        return diastolicBloodPressure;
    }

    public int getSystolicBloodPressure() {
        return systolicBloodPressure;
    }

    public String getName() {
        return name;
    }
}
