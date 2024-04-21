package web.model;
public class Car {
    private String brand;
    private String series;
    private int year;

    public Car(String brand, String series, int year) {
        this.brand = brand;
        this.series = series;
        this.year = year;
    }
    public String getBrand() {
        return brand;
    }

    public String getSeries() {
        return series;
    }

    public int getYear() {
        return year;
    }
}
