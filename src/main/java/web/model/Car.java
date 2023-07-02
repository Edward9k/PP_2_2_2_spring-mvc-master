package web.model;

public class Car {
    private String model;
    private String tuningAndTransmission;
    private int price;

    public Car() {
    }

    public Car(String model, String tuningAndTransmission, int price) {
        this.model = model;
        this.tuningAndTransmission = tuningAndTransmission;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTuningAndTransmission() {
        return tuningAndTransmission;
    }

    public void setTuningAndTransmission(String tuningAndTransmission) {
        this.tuningAndTransmission = tuningAndTransmission;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Машина: { " +
                "Модель = '" + model + '\'' +
                ". " +
                "Тюнинг и коробка передач = '" + tuningAndTransmission + '\'' +
                ". " +
                "Демократичная цена = " + price +
                ". }";
    }
}
