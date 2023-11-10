// Class Main
public class Main {
    public static void main(String[] args) {
        // Pembuatan objek dari masing-masing kelas
        Person person = new Person(1, "John Cena", 27);
        Lecturer lecturer = new Lecturer(2, "Prof. Agus", 58, 50000.0, "Computer Science");
        Student student = new Student(3, "Yusuf Setiawan", 22, 3.4, "Computer Science");

        // Output informasi dari objek
        System.out.println("Person Info: ID=" + person.getID() + ", Name=" + person.getName() + ", Age=" + person.getAge());
        System.out.println("Lecturer Info: ID=" + lecturer.getID() + ", Name=" + lecturer.getName() +
                ", Age=" + lecturer.getAge() + ", Salary=" + lecturer.getSalary() + ", Faculty=" + lecturer.getFaculty());
        System.out.println("Student Info: ID=" + student.getID() + ", Name=" + student.getName() +
                ", Age=" + student.getAge() + ", GPA=" + student.getGPA() + ", Major=" + student.getMajor());
    }
}

// Class Person
class Person {
    private int ID;
    private String name;
    private int age;

    // Constructor
    public Person(int ID, String name, int age) {
        this.ID = ID;
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

// Class Lecturer (Dosen)
class Lecturer extends Person {
    private double salary;
    private String faculty;

    // Constructor
    public Lecturer(int ID, String name, int age, double salary, String faculty) {
        super(ID, name, age);
        this.salary = salary;
        this.faculty = faculty;
    }

    // Getter methods
    public double getSalary() {
        return salary;
    }

    public String getFaculty() {
        return faculty;
    }

    // Setter methods
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}

// Class Student (Mahasiswa)
class Student extends Person {
    private double GPA;
    private String major;

    // Constructor
    public Student(int ID, String name, int age, double GPA, String major) {
        super(ID, name, age);
        this.GPA = GPA;
        this.major = major;
    }

    // Getter methods
    public double getGPA() {
        return GPA;
    }

    public String getMajor() {
        return major;
    }

    // Setter methods
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
