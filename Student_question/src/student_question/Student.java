
package student_question;

public class Student {

    private String stdId, stdName;
    private Address stdAddress;
    private Date birthdate;

//    public Student(String stdId, String stdName, Address stdAddress, Date birthdate) {
//        this.stdId = stdId;
//        this.stdName = stdName;
//        this.stdAddress = stdAddress;
//        this.birthdate = birthdate;
//    }
//    

    public Student(String sI, String sN, Address sA, Date bD) {
        this.stdId = sI;
        this.stdName = sN;
        this.stdAddress = sA;
        this.birthdate = bD;
    }

    // (E) Methods inside the class
    public Student copyObject() {
        return new Student(this.stdId, this.stdName, this.stdAddress, this.birthdate);
    }

    public boolean checkEquality(Student other) {
        return this.stdId.equals(other.stdId);
    }

    // Getters and Setters
    public String getStdId() {
        return stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public Address getStdAddress() {
        return stdAddress;
    }

    public Date getBirthdate() {
        return birthdate;
    }
}
