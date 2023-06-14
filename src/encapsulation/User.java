package encapsulation;

public class User {
    private int userID;
    private String userName;
    private String firstName, lastName;

    User (int userID, String userName, String firstName, String lastName){
        this.userID = userID;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Setter
    void setUserID (int userID){
        this.userID = userID;
    }
    void setUserName (String userName){
        this.userName = userName;
    }
    void setFirstName (String firstName){
        this.firstName = firstName;
    }
    void setLastName (String lastName){
        this.lastName = lastName;
    }

    //Getter
    int getUserID(){
        return userID;
    }
}
