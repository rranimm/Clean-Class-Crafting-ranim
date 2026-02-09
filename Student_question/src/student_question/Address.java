
package student_question;

/**
 *
 * @author Ranim
 */
public class Address {

    private String streetName, cityName, postCode;

    public Address(String streetName, String cityName, String postCode) {
        this.streetName = streetName;
        this.cityName = cityName;
        this.postCode = postCode;
    }

    // Getters and Setters
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return streetName + ", " + cityName + " (" + postCode + ")";
    }
}

