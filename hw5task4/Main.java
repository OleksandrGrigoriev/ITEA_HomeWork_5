package hw5task4;

/**
 * Створіть проєкт з класом Main.java.
 * Створити клас - якась ‘невідома’ машина
 * Клас має поля
 * model - назва машини
 * power - від 0.0 до 200.0
 * speed - від 0 до 320
 * price - від 0.0 до 50000.0
 * yearOfManufacture  = 1967 //  для всіх один рік i оголошується лише один раз
 * Створити 4 екземпляри машин
 * Ford
 * Mitsubishi
 * Toyota
 * KIA
 * Створити клас - CarInfo
 * Цей клас повинен вміти:
 * - мати список машин які які будуть передавати на перевірку
 * - мати метод який отримує якусь машину і додає її в свій список
 * - мати метод який повертає найшвидшу машину
 * - мати метод який повертає найдорожчу машину
 * - мати метод який повертає найпотужнішу машину
 * Знаходимо ці три машини - найшвидшу/найдорожчу/найпотужнішу - і  виводимо про неї всю інформацію у форматі
 * Brand: KIA Rio
 * Power: 600
 * Speed: 189
 * Price: 3458.90
 * Year:  1967
 */
public class Main {
    public static void main(String[] args) {
        Car Ford        = new Car("Ford Focus", 100, 190, 20_000);
        Car Mitsuishi   = new Car("Mitsubishi Lancer Evo", 200, 200, 15_000);
        Car Toyota      = new Car("Toyota Corolla", 120, 220, 13_000);
        Car Kia         = new Car("Kia Sorrento", 150, 210, 16_000);

        CarInfo listOfCars = new CarInfo();

        listOfCars.addCar(Ford);
        listOfCars.addCar(Mitsuishi);
        listOfCars.addCar(Toyota);
        listOfCars.addCar(Kia);

        System.out.println("Fastest Car: \n" + listOfCars.getFastestCar() + "\n");
        System.out.println("Most Expensive Car: \n" + listOfCars.getMostExpensiveCar() + "\n");
        System.out.println("Most Powerful Car: \n" + listOfCars.getMostPowerfulCar() + "\n");
    }
}