package ss_1212.bai_them.models;

public class Vehicle {
    private String controlPlate;
    private String nameCompany;
    private Long yearProduce;
    private String owner;

    public Vehicle() {
    }

    public Vehicle(String controlPlate, String nameCompany, Long yearProduce, String owner) {
        this.controlPlate = controlPlate;
        this.nameCompany = nameCompany;
        this.yearProduce = yearProduce;
        this.owner = owner;
    }

    public String getControlPlate() {
        return controlPlate;
    }

    public void setControlPlate(String controlPlate) {
        this.controlPlate = controlPlate;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public Long getYearProduce() {
        return yearProduce;
    }

    public void setYearProduce(Long yearProduce) {
        this.yearProduce = yearProduce;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "controlPlate='" + controlPlate + '\'' +
                ", nameCompany='" + nameCompany + '\'' +
                ", yearProduce=" + yearProduce +
                ", owner='" + owner + '\'' +
                '}';
    }
}
