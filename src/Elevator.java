public class Elevator {
    private int currentFloor = 1;
    private int minFloor;
    private int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        currentFloor--;
    }

    public void moveUp() {
        currentFloor++;
    }

    public void move(int floor) {
        if (floor < minFloor || floor > maxFloor || floor == 0) {
            System.out.println("Задан неверный этаж :(");
        }

        if (floor == currentFloor) {
            System.out.println("Вы на текущем этаже!");
        }

        while (currentFloor > floor) {
            moveDown();
            if (currentFloor == 0) {
                moveDown();
            }
            System.out.println("Текущий этаж: " + currentFloor);
            break;
        }

        while (currentFloor < floor) {
            moveUp();
            if (currentFloor == 0) {
                moveUp();
            }
            System.out.println("Текущий этаж: " + currentFloor);
            break;
        }
    }
}



