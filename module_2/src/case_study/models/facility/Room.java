package case_study.models.facility;

import case_study.models.facility.Facility;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String codeService, String nameService, String area, String expense, String maxPerson, String typeHire, String freeService) {
        super(codeService, nameService, area, expense, maxPerson, typeHire);
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
