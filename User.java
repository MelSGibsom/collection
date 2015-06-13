package collection;

/**
 * Created by Alexander on 30.05.2015.
 */
public class User {
    private String firstName;
    private String mobilePhone;

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                '}';
    }

    public User(String firstName, String mobilePhone) {
        this.firstName = firstName;
        this.mobilePhone = mobilePhone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
}
