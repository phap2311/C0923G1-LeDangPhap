package case_study.models.facility;

import case_study.models.facility.Facility;

public class House extends Facility {
    private String standardRoom;
    private String floorNumber;

    public House() {
    }

    public House(String codeService, String nameService, String area, String expense, String maxPerson, String typeHire, String standardRoom, String floorNumber) {
        super(codeService, nameService, area, expense, maxPerson, typeHire);
        this.standardRoom = standardRoom;
        this.floorNumber = floorNumber;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return "House{" +
                "standardRoom='" + standardRoom + '\'' +
                ", floorNumber='" + floorNumber + '\'' +
                '}';
    }
}
