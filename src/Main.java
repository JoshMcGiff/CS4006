public class Main {

    /*
       This is the driver for the program. This is a trivial example of how diagnosis of diseases can be
       be classified using artificial intelligence. Of course this is a static decision tree that works
       for a small subset of illnesses. However this concept can be scaled up and automated for enhanced
       accuracy and precision with the use of millions of health records (like discussed in our research
       paper).
    */

    public static void main(String args[]){
        Database db = new Database();
        ElectronicHealthRecord patient1 = new ElectronicHealthRecord("John Doe", 130, 85, false, false ,false);
        db.AddEntry(patient1);

        ElectronicHealthRecord patient2 = new ElectronicHealthRecord("Jane Doe", 110, 60, true, true ,true);
        db.AddEntry(patient2);

        ElectronicHealthRecord patient3 = new ElectronicHealthRecord("Mary Jane", 185, 125, false, false ,false);
        db.AddEntry(patient3);

        ElectronicHealthRecord patient4 = new ElectronicHealthRecord("Jim Bob", 110, 65, true, false ,false);
        db.AddEntry(patient4);

        ElectronicHealthRecord patient5 = new ElectronicHealthRecord("Nicki Minaj", 125, 75, true, true ,true);
        db.AddEntry(patient5);

        for(int i = 0; i < db.GetSize(); i++){
            System.out.println(db.GetDiagnosis(db.GetEntry(i)));
        }
    }


}
