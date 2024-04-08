package by.javaguru;

public class CarDto {

    private String brandOfCar;
    private int price;
    private int maxSpeed;

    public CarDto(String brandOfCar, int price, int maxSpeed) {
        this.brandOfCar = brandOfCar;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    public String getBrandOfCar() {
        return brandOfCar;
    }

    public void setBrandOfCar(String brandOfCar) {
        this.brandOfCar = brandOfCar;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

}
