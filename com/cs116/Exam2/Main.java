package com.cs116.Exam2;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Car(4, 5, "Honda", "Civic");
        vehicles[1] = new Truck(1000, 5000, "Ford", "F-150");
        vehicles[2] = new Truck(1200, 5500, "Chevrolet", "Silverado");
        vehicles[3] = new Truck(1100, 6000, "Ram", "1500");

        for(Vehicle v : vehicles) {
            System.out.println(v.drive());
            System.out.println(v);
            System.out.println();
        }

        System.out.println(getPayloadCapacitySum(vehicles));
        System.out.println(getTowingCapacitySum(vehicles));
    }

    public static int getPayloadCapacitySum(Vehicle[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] instanceof Truck)
                sum += ((Truck) arr[i]).getPayloadCapacity();
        }
        return sum;
    }

    public static int getTowingCapacitySum(Vehicle[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] instanceof Truck)
                sum += ((Truck) arr[i]).getTowingCapacity();
        }
        return sum;
    }
}
