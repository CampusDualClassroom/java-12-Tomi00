package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;

    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;
    private static final int ACCELERATION = 30;
    private static final int BRAKING = 30;
    private static final int MIN_WHEELS_ANGLE = -45;
    private static final int MAX_WHEELS_ANGLE = 45;

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car() {
    }

    public void start() {
        if (this.tachometer == 0) {
            this.tachometer = 1000;
            System.out.println("Vehículo encendido");
        } else if (this.tachometer == 1000) {
            System.out.println("El vehículo ya está encendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0) {
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("No se puede apagar el vehículo, primero tiene que estar detenido");
        }
    }

    public void accelerate() {
        if (this.speedometer + ACCELERATION > MAX_SPEED) {
            this.speedometer = MAX_SPEED;
            System.out.println("Se ha alcanzado la velocidad máxima de: " + MAX_SPEED + " km/h.");
        } else {
            this.speedometer += ACCELERATION;
            System.out.println("Acelerando a: " + this.speedometer + " km/h.");
        }
    }



    public void brake() {
        if (this.speedometer - BRAKING < 0) {
            this.speedometer = 0;
            System.out.println("El coche se ha parado");
        } else {
            this.speedometer -= BRAKING;
            System.out.println("Frenando a " + this.speedometer + " km/h.");
        }
    }

    public void turnAngleOfWheels ( int angle){
        if (angle < MIN_WHEELS_ANGLE || angle > MAX_WHEELS_ANGLE) {
            System.out.println("No se puede girar más de: " + MIN_WHEELS_ANGLE + " y " + MAX_WHEELS_ANGLE + " grados.");
            if (angle > 0){
                wheelsAngle = 45;
            }else {
                wheelsAngle = -45;
            }
        } else {
            wheelsAngle = angle;
            System.out.println("El coche está girando " + angle + " grados.");
        }
        }

    public String showTurnAngleOfWheelsDetail(){
        return  "El ángulo es: " + this.wheelsAngle;
    }

    public boolean isReverse(){

        return reverse;
    }

    public void setReverse(boolean reverse) {
        if (reverse)
        if (speedometer == 0) {
            this.reverse = true;
            gear = "R";
            System.out.println("Marcha atrás puesta");
        } else {
            System.out.println("No se puede meter la marcha si el coche está acelerando.");
        } else {
            this.reverse = false;
            gear = "N";
            System.out.println("Marcha atrás quitada");
        }

    }

    public boolean isTachometerGreaterThanZero(){
        return this.tachometer > 0;
    }

    public boolean isTachometerEqualToZero(){
        return this.tachometer == 0;

    }

    public void showDetails(){}

    public static void main(String[] args) {

    }
  }