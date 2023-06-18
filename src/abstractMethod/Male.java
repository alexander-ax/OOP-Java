package abstractMethod;

public class Male extends Human {
    @Override
    void setGenderName(String[] genderName) {
        this.genderName = genderName;
    }

    @Override
    void genderDescription() {
        System.out.println("\n" + genderName[0]);
        System.out.println("This sub classification includes individuals who identify as male or were assigned male at birth based on biological characteristics. It encompasses individuals who align with masculine gender norms and roles as defined by their culture or society.");
    }
}
