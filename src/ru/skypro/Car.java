package ru.skypro;

public class Car extends Vehicle implements CheckService{

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void check() {
        updateTyres();
        checkEngine();
    }

}
