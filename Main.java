package LAB;

import java.util.HashMap;
import java.util.Map;

public class Main {



    public static void main(String[] args) {

        //Instanziieren der 4 Studenten (Name , Grade)
        Student student1 = new Student("Horst", 30);
        Student student2 = new Student("Melanie", 45);
        Student student3 = new Student("Anke", 60);
        Student student4 = new Student("Heinz", 15);


        //Erstellen der HashMap
        HashMap<String,Student> studentMap = new HashMap();

        //Hinzufügen der Studenten (<Name, Objekt Student>)
        studentMap.put(student1.getName(),student1);
        studentMap.put(student2.getName(),student2);
        studentMap.put(student3.getName(),student3);
        studentMap.put(student4.getName(),student4);

        //Aufrufen der Methode "makeItBetter" -> Übergabe der HashMap
        makeItBetter(studentMap);

        //Iterieren und Ausgeben der geänderten Hashmap
        for (Student value : studentMap.values()){
            System.out.println(value.getName() + ": " + value.getGrade());
        }

    }
        //Methode "makeItBetter", um Grade um 10% zu erhöhen
    public static HashMap<String, Student> makeItBetter(HashMap<String, Student> studentMap) {
        //Iterieren durch die Hashmap
        for (Student value : studentMap.values()) {
        //Grade um 10% erhöhen
            value.setGrade(value.getGrade()*110/100);

        }
        return studentMap;




    }


}
