public class Main {
    public static void main(String[] args) {

        //Prototype pattern refers to creating duplicate object while keeping performance in mind.
        //This pattern involves implementing a prototype interface which tells to create a clone of the current object.
        //This pattern should be followed, if the cost of creating a new object is expensive and resource intensive.

        StudentRecord student = new StudentRecord(1, "Nomvula", "Netball", "Johannesburg");
        student.showRecord();


        StudentRecord student2 = (StudentRecord) student.getClone();
        student2.showRecord();
    }
}
