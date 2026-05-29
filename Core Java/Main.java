class Car{

    String make,model;
    int year;

    Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void dispalyDetails(){
        System.out.println("Make: "+make+", Model: "+model+", Year: "+year);
    }

}

class Main{
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Honda", "Civic", 2019);
        car1.dispalyDetails();
        car2.dispalyDetails();
    }
    
}