/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author estudiante
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
  
        HashMap<String, Double> menu = new HashMap<>();

  
        menu.put("Hamburguesa Clásica", 8.99);
        menu.put("Pizza Margarita", 12.50);
        menu.put("Ensalada César", 6.75);
        menu.put("Sopa del día", 4.25);
        menu.put("Postre de la casa", 3.50);
        menu.put("Postre de la TIENDA", 3.50);

        System.out.println("MENÚ DEL RESTAURANTE:");
        for (Map.Entry<String, Double> item : menu.entrySet()) {
            System.out.println(item.getKey() + " - $" + item.getValue());
        }


        String platillo = "Pizza Margarita";
        if (menu.containsKey(platillo)) {
            System.out.println("El precio de " + platillo + " es $" + menu.get(platillo));
        } else {
            System.out.println("\n" + platillo + " no está disponible en el menú.");
        }

 
        menu.remove("Hamburguesa Clásica");

        System.out.println("MENÚ ACTUALIZADO:");
        for (Map.Entry<String, Double> item : menu.entrySet()) {
            System.out.println(item.getKey() + " - $" + item.getValue());
        }
    }
}

