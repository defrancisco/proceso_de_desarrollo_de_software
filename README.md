# 🛠️ Práctica de Patrones de Diseño en Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Proceso de Desarrollo de Software](https://img.shields.io/badge/Materia-Proceso_de_Desarrollo_de_Software-blue?style=for-the-badge)

Repositorio personal de práctica para el **Segundo Parcial** de la materia **Proceso de Desarrollo de Software**.
Aquí se encuentran implementados en Java los principales patrones de diseño (Creacionales, Estructurales y de Comportamiento) vistos durante la cursada, preparados para ser ejecutados y probados desde IntelliJ IDEA.

---

## 📚 Patrones Implementados

A continuación, el listado de patrones practicados en este repositorio, divididos por categoría:

### 🏛️ Arquitectónicos
* **MVC (Model-View-Controller):** Separación de responsabilidades entre los datos, la interfaz de usuario y la lógica de control.

### 🏗️ Creacionales
* **Singleton:** Garantiza que una clase (ej. `ConfigurationManager`) tenga una única instancia y proporciona un punto de acceso global a ella.
* **Simple Factory:** Extrae la lógica de instanciación a una clase fábrica básica.
* **Factory Method:** Define una interfaz para crear un objeto, pero deja que las subclases decidan qué clase instanciar (ej. `RoadLogistics` vs `SeaLogistics`).

### 🧩 Estructurales
* **Adapter:** Permite que interfaces incompatibles trabajen juntas (ej. integraciones con APIs externas como Twilio).
* **Composite:** Compone objetos en estructuras de árbol para representar jerarquías (parte-todo). Permite tratar objetos individuales y composiciones de manera uniforme (ej. Módulo de Menús o Categorías de Productos).
* **Decorator:** Añade responsabilidades u opciones adicionales a un objeto dinámicamente, envolviéndolo (ej. Módulo de Stock y Precios, Café con adicionales).

### ⚙️ Comportamiento
* **Strategy:** Define una familia de algoritmos, los encapsula y los hace intercambiables en tiempo de ejecución (ej. Métodos de pago o envío de notificaciones).
* **State:** Permite a un objeto alterar su comportamiento cuando cambia su estado interno (ej. Estado de una propiedad en una inmobiliaria: Disponible, Reservada, Alquilada).
* **Observer:** Define una dependencia de uno-a-muchos para que cuando un objeto cambie de estado, todos sus dependientes sean notificados (ej. Sistema de notificaciones de cambios de precio / GarbariSI).
