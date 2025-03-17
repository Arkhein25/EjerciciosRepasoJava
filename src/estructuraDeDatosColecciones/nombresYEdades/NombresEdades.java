package estructuraDeDatosColecciones.nombresYEdades;

import java.util.HashMap;
import java.util.Map;

public class NombresEdades {
    public static void main(String[] args) {
        HashMap<String, Integer> datos = new HashMap<>();
        datos.put("Israel", 30);
        datos.put("Rafael", 9);
        datos.put("Micaela", 5);
        datos.put("Jorge", 63);
        datos.put("Marlies", 61);
        datos.put("Thrysis", 33);
        System.out.println("la edad de Rafael es: " + datos.get("Rafael"));
        //mostrar el HashMap en pantalla
        for (Map.Entry<String, Integer> entry : datos.entrySet()) {
            String nombre = entry.getKey();
            int edad = entry.getValue();
            System.out.println("Nombre: " + nombre +
                    ", Edad: " + edad);
        }
    }
}
