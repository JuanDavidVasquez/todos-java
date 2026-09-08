package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Cycle cicla = new Cycle(10, 3, 2, 3);
        Car carro = new Car(100,50,20,2);

        Actions actions = new Actions();

        cicla.showInfo();
        actions.startUp(cicla);
        actions.stop(cicla);

        carro.showInfo();
        actions.startUp(carro);
        actions.stop(carro);
    }
}
