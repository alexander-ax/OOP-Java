package abstractMethod;

public class Female extends Human{
    @Override
    void setGenderName(String[] genderName) {
        this.genderName = genderName;
    }
    @Override
    void genderDescription() {
        System.out.println(genderName[1]);
        System.out.println("This sub classification includes individuals who identify as female or were assigned female at birth based on biological characteristics. It encompasses individuals who align with feminine gender norms and roles as defined by their culture or society.");
    }
}
