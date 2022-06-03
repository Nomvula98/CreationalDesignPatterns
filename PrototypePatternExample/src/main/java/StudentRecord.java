public class StudentRecord implements Prototype{
    private int id;
    private String name;
    private String sport;
    private String address;

    public StudentRecord(){
        System.out.println("   Student Records of University of South Africa ");
        System.out.println("---------------------------------------------");
        System.out.println("Sid"+"\t"+"Sname"+"\t"+"Ssport"+"\t"+"Saddress");

    }

    public  StudentRecord(int id, String name,String sport, String address) {

        this();
        this.id = id;
        this.name = name;
        this.sport = sport;
        this.address = address;
    }

    public void showRecord(){

        System.out.println(id+"\t"+name+"\t"+sport+"\t"+address);
    }

    @Override
    public Prototype getClone() {

        return new StudentRecord(id,name,sport,address);
    }
}
