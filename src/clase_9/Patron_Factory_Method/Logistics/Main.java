package clase_9.Patron_Factory_Method.Logistics;


public class Main {
    public static void main(String[] args) {
        // El cliente opera a través de la abstracción Logistics
        Logistics logistics;
        String destino = "Buenos Aires";

        System.out.println("=== CLIENTE SOLICITA LOGÍSTICA TERRESTRE ===");
        logistics = new RoadLogistics();
        logistics.planDelivery(destino);

        System.out.println("\n=== CLIENTE SOLICITA LOGÍSTICA MARÍTIMA ===");
        logistics = new SeaLogistics();
        logistics.planDelivery(destino);

    }
}
