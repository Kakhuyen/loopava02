public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;

    // Constructor khởi tạo tên xe và động cơ
    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++; // Mỗi lần tạo đối tượng, số lượng xe tăng 1
    }

    // Phương thức hiển thị thông tin xe
    public void display() {
        System.out.println("Car name: " + name + ", Engine: " + engine);
    }

    // Lớp Main để chạy chương trình
    public static void main(String[] args) {
        // Tạo các đối tượng Car
        Car car1 = new Car("Mazda 3", "Skyactiv 3");
        Car car2 = new Car("Mazda 6", "Skyactiv 6");
        Car car3 = new Car("Mazda CX-5", "Skyactiv 5");

        // Hiển thị thông tin từng xe
        car1.display();
        car2.display();
        car3.display();

        // Hiển thị số lượng xe đã tạo
        System.out.println("Total number of cars: " + Car.numberOfCars);
    }
}
