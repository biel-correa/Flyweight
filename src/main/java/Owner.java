public class Owner {
    private String name;
    private Car car;

    public Owner(String name, String carModel) {
        this.name = name;
        this.setCar(carModel);
    }

    public String getName() {
        return name;
    }

    public void setName(String model) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(String model) {
        this.car = CarFactory.getCar(model);
    }
}
