public class Student {
   private long prn;
   private String name, DoB;
   private int marks;

    public Student(long prn, String name, String doB, int marks) {
        this.prn = prn;
        this.name = name;
        DoB = doB;
        this.marks = marks;
    }

    public long getPrn() {
        return prn;
    }

    public String getName() {
        return name;
    }

    public void setPrn(long prn) {
        this.prn = prn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDoB(String doB) {
        DoB = doB;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getDoB() {
        return DoB;
    }

    public int getMarks() {
        return marks;
    }
}
