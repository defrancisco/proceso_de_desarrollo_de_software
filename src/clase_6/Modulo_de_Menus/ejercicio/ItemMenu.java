package clase_6.Modulo_de_Menus.ejercicio;

public interface ItemMenu {
    String nombre();
    double precio(boolean dia);
}


// Se debe tener presente que el menú depende del momento del día; y estos pueden cambiar
//completamente, al igual que es posible que se puedan pedir platos en forma individual.