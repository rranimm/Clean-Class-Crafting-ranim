package carsquestion;

/**
 *
 * @author Ranim
 */
public class Cars {

    //fielda 
    private String carID;
    private String carBrand;
    private int carYear;
    private String carFuelType;
    private String carGearType;
    private int carDoorNo;
    private double carPrice;

    //constructor
    public Cars(String carID, String carBrand, int carYear, String carFuelType, String carGearType, int carDoorNo, double carPrice) {
        this.carID = carID;
        this.carBrand = carBrand;
        this.carYear = carYear;
        this.carFuelType = carFuelType;
        this.carGearType = carGearType;
        this.carDoorNo = carDoorNo;
        this.carPrice = carPrice;
    }

    //setters 
    public void setCarID(String carID) {
        this.carID = carID;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public void setCarFuelType(String carFuelType) {
        this.carFuelType = carFuelType;
    }

    public void setCarGearType(String carGearType) {
        this.carGearType = carGearType;
    }

    public void setCarDoorNo(int carDoorNo) {
        this.carDoorNo = carDoorNo;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    //getters
    public String getCarID() {
        return carID;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public int getCarYear() {
        return carYear;
    }

    public String getCarFuelType() {
        return carFuelType;
    }
    public String getCarGearType() {
       return carGearType;
    }

    public int getCarDoorNo() {
        return carDoorNo;
    }

    public double getCarPrice() {
        return carPrice;
    }

    // the toString method
    @Override
    public String toString() {
        return "carID: " + carID + ", carBrand: " + carBrand + ", carYear: " + carYear + ", carFuelType: " + carFuelType + ", carGearType: " + carGearType + ", carDoorNo: " + carDoorNo + ", carPrice: " + carPrice;
    }

}
