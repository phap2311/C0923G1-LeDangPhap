package case_study.models.facility;

public class Facility {
    private String codeService;
    private String nameService;
    private String area;
    private String expense;
    private String maxPerson;
    private String typeHire;

    public Facility() {
    }

    public Facility(String codeService, String nameService, String area, String expense, String maxPerson, String typeHire) {
        this.codeService = codeService;
        this.nameService = nameService;
        this.area = area;
        this.expense = expense;
        this.maxPerson = maxPerson;
        this.typeHire = typeHire;
    }

    public String getCodeService() {
        return codeService;
    }

    public void setCodeService(String codeService) {
        this.codeService = codeService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExpense() {
        return expense;
    }

    public void setExpense(String expense) {
        this.expense = expense;
    }

    public String getMaxPerson() {
        return maxPerson;
    }

    public void setMaxPerson(String maxPerson) {
        this.maxPerson = maxPerson;
    }

    public String getTypeHire() {
        return typeHire;
    }

    public void setTypeHire(String typeHire) {
        this.typeHire = typeHire;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "codeService='" + codeService + '\'' +
                ", nameService='" + nameService + '\'' +
                ", area='" + area + '\'' +
                ", expense='" + expense + '\'' +
                ", maxPerson='" + maxPerson + '\'' +
                ", typeHire='" + typeHire + '\'' +
                '}';
    }
}
