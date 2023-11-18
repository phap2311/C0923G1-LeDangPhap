package ss12_java_collection_framework.bai_them.view;
//
////import ss12_java_collection_framework.bai_them.constrollers.CarController;
////import ss12_java_collection_framework.bai_them.constrollers.MotorBikeController;
////import ss12_java_collection_framework.bai_them.constrollers.TruckController;
////import ss12_java_collection_framework.bai_them.models.Car;
////import ss12_java_collection_framework.bai_them.models.MotorBike;
////import ss12_java_collection_framework.bai_them.models.Vehicle;
////
////import java.util.Scanner;
//
//public class VehicleView {
//    private Scanner scanner =  new Scanner(System.in);
////    private CarController carController = new CarController();
//    private TruckController truckController = new TruckController();
//    private MotorBikeController motorBikeController = new MotorBikeController();
//    public void menuVehicle(){
//        int choice;
//        do {
//            System.out.println("-------------------");
//            System.out.println("Quản lý phương tiện");
//            System.out.println("1. Thêm mới phương tiện");
//            System.out.println("2. Hiện thị phương tiện");
//            System.out.println("3. Xóa phương tiện");
//            System.out.println("4. Tìm kiếm theo biển kiểm soát");
//            System.out.println("5.Thoát");
//            choice = Integer.parseInt(scanner.nextLine());
//         switch (choice){
//             case 1:
////                 System.out.println("Phương tiện bạn muốn thêm");
////                 Vehicle
////                 Car car = (Car) inputInfoCar();
////                 carController.addCar(car);
////                 System.out.println("Thêm mới thành công");
////                 break;
//         }
//        }
//        while (choice!=0);
//    }
//
//    private Vehicle inputInfoCar() {
//        System.out.println("Nhập biển kiểm soát");
//        String controlPlate = scanner.nextLine();
//        System.out.println("Tên hãng sản xuất");
//        String nameCompany = scanner.nextLine();
//        System.out.println("Năm sản xuất");
//        Long yearProduce = Long.valueOf(scanner.nextLine());
//        System.out.println("Chủ sở hữu");
//        String owner = scanner.nextLine();
//        System.out.println("số chỗ ngồi");
//        Long numberChair = Long.valueOf(scanner.nextLine());
//        System.out.println("Loại xe du lịch");
//        String typeTourism = scanner.nextLine();
//        System.out.println("Loại xe khách");
//        String typeCoach = scanner.nextLine();
//        return new Car(controlPlate,nameCompany,yearProduce,owner,numberChair,typeTourism,typeCoach);
//    }
//
//
//
//}
