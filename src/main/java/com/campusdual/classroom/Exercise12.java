package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car myCar = new Car("Citroen", "Xsara", "Diesel");

        if (myCar.isTachometerEqualToZero()){
            System.out.println("El valor del tacómetro es: 0");
        };

        myCar.start();

        myCar.start();

        myCar.stop();

        myCar.start();
        myCar.accelerate();

        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();


        myCar.brake();
        myCar.brake();
        myCar.brake();
        myCar.brake();
        myCar.brake();

        myCar.turnAngleOfWheels(40);
        myCar.turnAngleOfWheels(60);

        myCar.setReverse(true);


        myCar.accelerate();
        myCar.setReverse(true);

        }
    }

