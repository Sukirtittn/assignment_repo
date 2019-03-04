public class Student {
    private int Id;
    private String Name;
    private int Age;
    private String Father_Name;
    private String Mother_Name;
    private String Grade;
    private String Section;

    public Student(StudentBuilder studentBuilder) {
        Id = studentBuilder.getId();
        Name = studentBuilder.getName();
        Age = studentBuilder.getAge();
        Father_Name = studentBuilder.getFather_Name();
        Mother_Name = studentBuilder.getMother_Name();
        Grade = studentBuilder.getGrade();
        Section = studentBuilder.getSection();
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getFather_Name() {
        return Father_Name;
    }

    public void setFather_Name(String father_Name) {
        Father_Name = father_Name;
    }

    public String getMother_Name() {
        return Mother_Name;
    }

    public void setMother_Name(String mother_Name) {
        Mother_Name = mother_Name;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public String getSection() {
        return Section;
    }

    public void setSection(String section) {
        Section = section;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Father_Name='" + Father_Name + '\'' +
                ", Mother_Name='" + Mother_Name + '\'' +
                ", Grade='" + Grade + '\'' +
                ", Section='" + Section + '\'' +
                '}';
    }
}

class StudentBuilder {
    private int Id;
    private String Name;
    private int Age;
    private String Father_Name;
    private String Mother_Name;
    private String Grade;
    private String Section;

    public StudentBuilder(int id) {
        Id = id;
    }

    public int getId() {
        return Id;
    }

    public StudentBuilder hasId(int Id) {
        this.Id = Id;
        return this;
    }

    public String getName() {
        return Name;
    }

    public StudentBuilder setName(String name) {
        Name = name;
        return this;
    }

    public int getAge() {
        return Age;
    }

    public StudentBuilder setAge(int age) {
        Age = age;
        return this;
    }

    public String getFather_Name() {
        return Father_Name;
    }

    public StudentBuilder setFather_Name(String father_Name) {
        Father_Name = father_Name;
        return this;
    }

    public String getMother_Name() {
        return Mother_Name;
    }

    public StudentBuilder setMother_Name(String mother_Name) {
        Mother_Name = mother_Name;
        return this;
    }

    public String getGrade() {
        return Grade;
    }

    public StudentBuilder setGrade(String grade) {
        Grade = grade;
        return this;
    }

    public String getSection() {
        return Section;
    }

    public StudentBuilder setSection(String section) {
        Section = section;
        return this;
    }

    public Student create() {
        return new Student(this);
    }
}

class builder {
    public static void main(String[] args) {
        Student student = new StudentBuilder(1)
                .setAge(22)
                .setFather_Name("Devender")
                .setGrade("MCA")
                .setMother_Name("Archna")
                .setName("Sukirti")
                .setSection("A")
                .create();
        System.out.println(student);

    }
}