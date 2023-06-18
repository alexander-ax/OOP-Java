package abstractMethod;

public class GenderQueer extends Human{
    @Override
    void setGenderName(String[] genderName) {
        this.genderName = genderName;
    }

    @Override
    void genderDescription() {
        System.out.println(genderName[2]);
        System.out.println("This sub classification includes individuals who do not exclusively identify as male or female. They may identify outside the traditional gender binary or reject gender categorizations altogether. Non-binary or genderqueer individuals may identify as both genders, as neither gender, or as a different gender entirely.");
    }
}
