public class Car extends Vehicle {
    @Override
    void calrent(int jarak, float harga) {
        float fare = jarak * harga;
        fare = fare - 100.00f;
        System.out.println("Harga sewa mobil = " + fare);
    }
}