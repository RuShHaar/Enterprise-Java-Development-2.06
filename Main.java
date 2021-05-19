package LAB;

import java.util.HashMap;
import java.util.Map;

public class Main {



    public static void main(String[] args) {

        Student student1 = new Student("Horst", 30);
        Student student2 = new Student("Melanie", 45);
        Student student3 = new Student("Anke", 60);
        Student student4 = new Student("Heinz", 15);


        HashMap<String,Student> studentMap = new HashMap();
        studentMap.put(student1.getName(),student1);
        studentMap.put(student2.getName(),student2);
        studentMap.put(student3.getName(),student3);
        studentMap.put(student4.getName(),student4);

        makeItBetter(studentMap);
        for (Student value : studentMap.values()){
            System.out.println(value.getName() + ": " + value.getGrade());
        }

    }

    public static HashMap<String, Student> makeItBetter(HashMap<String, Student> studentMap) {
        for (Student value : studentMap.values()) {
            value.setGrade(value.getGrade()*110/100);

        }
        return studentMap;




    }


}
