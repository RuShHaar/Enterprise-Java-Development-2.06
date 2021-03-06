package LAB;

public class Student {

    private String name;
    private int grade;

    public Student(String name, int grade){
        this.name = name;
        setName(name);
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    //setGrade nur zwischen 0-100 möglich
    //Andernfalls wird ein Defaultwert von 25 gesetzt
    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Note nur zwischen 0-100 möglich. Defaultwert 25 wurde gesetzt.");
            this.grade = 25;
        }
    }
}
