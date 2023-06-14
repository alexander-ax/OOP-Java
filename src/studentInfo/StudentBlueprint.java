package studentInfo;

public class StudentBlueprint {
    String [] info;
    int year;
    double[] grade;
    StudentBlueprint(String[] info, int year, double[] grade){
        this.info = info; //FirstName,Lastname,Course and Section
        this.year = year;
        this.grade = grade; //MidtermGrade, FinalGrade
    }
    void studentsInfo(){
        System.out.println("Hi " +info[0]+ " " +info[1] + " from " +info[2]+ " " +year +info[3]);
    }

    void studentGrades(){
        System.out.println("Midterm Grade: " +grade[0]);
        System.out.println("Final Grade: " +grade[1]);
        double average = (grade[0] + grade[1]) / grade.length;
        System.out.println("Average Grade is: " +average);
            if( average > 100) System.out.println("Invalid Grade");
            else if( average >= 98) System.out.println("With Highest Honors");
            else if( average >= 95) System.out.println("With High Honors");
            else if( average >= 90) System.out.println("With Honors");
            else if( average >= 75) System.out.println("Passed");
            else System.out.println("Failed");
    }

}
