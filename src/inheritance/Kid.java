package inheritance;

public class Kid extends Toddler {
    int grade;
    Kid(int grade){ //inherited to toddler
        this.grade = grade;
        System.out.println(grade);
    }

    void checkGrade(){
        System.out.println(grade);
    }
}
