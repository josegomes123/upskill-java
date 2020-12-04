package testemodelo2;

// Pergunta 1

import java.util.HashMap;

public class Car {
    private String licencePlate;
    private int yearOfConstruction;
    public Car(String licencePlate, int yearOfConstruction) {
        this.licencePlate = licencePlate;
        this.yearOfConstruction = yearOfConstruction;
    }
    public String getlicencePlate() {
        return licencePlate;
    }
    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "licencePlate='" + licencePlate + '\'' +
                ", yearOfConstruction=" + yearOfConstruction +
                '}';
    }

    // Pergunta 2
    public String toCurrentPlate() {
        return this.getlicencePlate().replaceAll("-","");
    }

    public static void main(String[] args) {
        // Cria hashmap para guardar carros por matricula
        Car car1 = new Car("00-00-AA", 1992);
        Car car2 = new Car("12-00-AA", 1993);
        Car car3 = new Car("14-00-AA", 1994);
        Car car4 = new Car("16-00-AA", 1996);
        HashMap<String, Car> mapCars = new HashMap<>();
        // Coloca carros no mapa e consulta o mesmo
        mapCars.put(car1.getlicencePlate(), car1);
        mapCars.put(car2.getlicencePlate(), car2);
        mapCars.put(car3.getlicencePlate(), car3);
        mapCars.put(car4.getlicencePlate(), car4);
        System.out.println(mapCars.get(car1.getlicencePlate()));
        // Testa matricula pergunta 2
        System.out.println(car1.toCurrentPlate());




    }


}
