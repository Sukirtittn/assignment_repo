
interface StudentRecordAccess{
    void accessRecord();
}

class StudentDetails{
    private int studentId;
    private String studentName;
    private int studentAge;


    public StudentDetails(int studentId, String studentName, int studentAge) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                '}';
    }
}

class Record implements StudentRecordAccess{
    StudentDetails studentDetails;
    public Record(StudentDetails studentDetails) {
        this.studentDetails = studentDetails;
    }

    @Override
    public void accessRecord() {
        System.out.println("Accessing records of students :: ");
        System.out.println(studentDetails);
    }

}

class RecordProxy extends Record {
    private boolean isAdmin = false;
    private String userName;
    private String password;

    public RecordProxy(StudentDetails studentDetails, String userName, String password) {
        super(studentDetails);
        this.userName=userName;
        this.password=password;

        if ("Sukirti".equals(userName) && "suki2404".equals(password))
            isAdmin = true;
    }

    @Override
    public void accessRecord() {
        if (isAdmin)
            super.accessRecord();
        else
            System.out.println("Cannot access the records");
    }
}

class StudentProxyMain {
    public static void main(String[] args) {
        StudentDetails studentDetails = new StudentDetails(101,"Shivangi",23);
        StudentRecordAccess studentRecordAccess = new RecordProxy(studentDetails, "Sukirti", "suki2404");
        studentRecordAccess.accessRecord();
        StudentDetails studentDetails1 = new StudentDetails(101,"Shivangi",23);
        StudentRecordAccess studentRecordAccess1 = new RecordProxy(studentDetails1, "Shivi", "shivi10");
        studentRecordAccess1.accessRecord();
    }
}
