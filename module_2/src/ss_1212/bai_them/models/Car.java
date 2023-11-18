package ss_1212.bai_them.models;

import ss_1212.bai_them.models.Vehicle;

public class Car extends Vehicle {
    private Long numberChair;
    private String typeTourism;
    private String typeCoach;

    public Car() {
    }

    public Car(String controlPlate, String nameCompany, Long yearProduce, String owner, Long numberChair, String typeTourism, String typeCoach) {
        super(controlPlate, nameCompany, yearProduce, owner);
        this.numberChair = numberChair;
        this.typeTourism = typeTourism;
        this.typeCoach = typeCoach;
    }

    public Long getNumberChair() {
        return numberChair;
    }

    public void setNumberChair(Long numberChair) {
        this.numberChair = numberChair;
    }

    public String getTypeCoach() {
        return typeCoach;
    }


    public void setTypeCoach(String typeCoach) {
        this.typeCoach = typeCoach;
    }
    public String getTypeTourism(){
        return typeTourism;
    }
    public void setTypeTourism(String typeTourism){
        this.typeTourism = typeTourism;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberChair=" + numberChair +
                ", typeCoach='" + typeCoach + '\'' +
                ", typeTourism='" + typeTourism + '\'' +
                '}';
    }
}
