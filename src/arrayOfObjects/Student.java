package arrayOfObjects;

public class Student {
    private String firstname, lastname;
    private String course, section;
    private int year;

    Student (String firstname){

    }
    Student(String firstname, String lastname, String course, String section, int year){
        this.firstname = firstname;
        this.lastname = lastname;
        this.course = course;
        this.section = section;
        this.year = year;
    }

    //Setter
    void setFirstname(String firstname){
        this.firstname = firstname;
    }
    void setLastname(String lastname){
        this.lastname = lastname;
    }
    void setCourse(String course){
        this.course = course;
    }
    void setSection(String section){
        this.section = section;
    }
    int setYear(int year){
        this.year = year;
        return year;
    }

    //Getter
    String getFirstname(){
        return firstname;
    }
    String getLastname(){
        return lastname;
    }
    String getCourse(){
        return course;
    }
    String getSection(){
        return section;
    }
    int getYear(){
        return year;
    }

    void getInformation(){
        System.out.println("\nHi I'm " +firstname+ " " +lastname);
        System.out.println(course + " " + year + " " +section );
    }


}
