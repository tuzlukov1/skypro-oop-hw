package ru.skypro;

public class Bicycle extends Vehicle implements CheckService{

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void check() {
        updateTyres();
    }
}
