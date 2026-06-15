package clase_9.factory;

public class Main {
    public static void main(String[] args) {
        // El cliente opera a través de la abstracción Logistics
        Logistics logistics;

        System.out.println("=== CLIENTE SOLICITA LOGÍSTICA TERRESTRE ===");
        logistics = new RoadLogistics();
        logistics.planDelivery();

        System.out.println("\n=== CLIENTE SOLICITA LOGÍSTICA MARÍTIMA ===");
        logistics = new SeaLogistics();
        logistics.planDelivery();
        
        System.out.println("\n=== CLIENTE SOLICITA LOGÍSTICA por bici ===");
        logistics = new EarthLogistics();
        logistics.planDelivery();
    }
}
