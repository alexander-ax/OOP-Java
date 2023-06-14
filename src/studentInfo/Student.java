// Object Method
package studentInfo;

public class Student {
    public static void main (String[] args){
        String[] studentsInfo = {"Alexander", "Caberto", "BSCS","A"};
        int year = 4;
        double[] grades= {100, 100};
        StudentBlueprint s = new StudentBlueprint(studentsInfo, year, grades);
        s.studentsInfo();
        s.studentGrades();
    }
}
