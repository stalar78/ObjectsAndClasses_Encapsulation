import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Task-1
         */
        Elevator elevator = new Elevator(-3, 26);
        while (true) {
            System.out.print("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
            break; // дописал break, так как не работал код 2-го задания (ошибкам "unreachable statement")
        }

        /*
        Task-2
         */

        Dimensions dimensions = new Dimensions(130, 20, 3);
        dimensions = dimensions.setWidth(100); // ?выдает предупреждение дублирования кода?
        dimensions = dimensions.setHeight(25);
        dimensions = dimensions.setLength(5);

        CargoDeliv cargoDeliv = new CargoDeliv(dimensions, 40, "Санкт-Петербург, Невский, 130", true,
                "12121000BVCQWE63", true);
        cargoDeliv = cargoDeliv.setMass(50);
        cargoDeliv = cargoDeliv.setAddress("Москва, Манежная, 2-10");
        System.out.println(cargoDeliv);
    }
}
