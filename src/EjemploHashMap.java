/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.HashMap;
/**
 *
 * @author jhpcp
 */
public class EjemploHashMap {
     public static void main(String[] args) {
        HashMap<String, Integer> mapa = new HashMap<>();

        // Insertar datos
        mapa.put("Juan", 25);
        mapa.put("Ana", 30);
        mapa.put("Pedro", 28);

        // Obtener valor
        System.out.println("La edad de Juan es: " + mapa.get("Juan"));

        // Verificar existencia de clave
        if (mapa.containsKey("Ana")) {
            System.out.println("Ana está en el mapa.");
        }
    }
}
