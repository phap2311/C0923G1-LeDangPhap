package ss_1212.bai_them.constrollers;


import ss12_java_collection_framework.bai_them.services.ICarService;

public class CarController {
    private ICarService iCarService = new CarService();
    public void addCar(Car car) {
        iCarService.save(car);
    }
}
