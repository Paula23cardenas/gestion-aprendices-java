package com.sena;

import java.util.ArrayList;

public class App {

  public static void main(String[] args) {

    // 1) creamos objetos (INSTSANCIAS)

    Aprendiz aprendiz1 = new Aprendiz("123456789", "Juan Pérez", "juan@gmail.com", 25);
    Aprendiz aprendiz2 = new Aprendiz("987654321", "María Gómez", "maria@gmail.com", 22);
    Aprendiz aprendiz3 = new Aprendiz("456789123", "Carlos López", "carlos@gmail.com", 28);

    // 2) guardamos los objetos en una lista

    ArrayList<Aprendiz> ficha = new ArrayList<>();
    ficha.add(aprendiz1);
    ficha.add(aprendiz2);
    ficha.add(aprendiz3);

    // 3) mostramos la información de cada aprendiz usando el método presentarse()

    for (Aprendiz aprendiz : ficha) {
      System.out.println(aprendiz.presentarse());
    }

    // 4) ejemplo de encapsulamiento: actualizar con setter
    aprendiz1.setCorreo("juan.perez@outlook.com");

    // 5) mostramos la información actualizada del aprendiz1
    System.out.println("Información actualizada de aprendiz1: " + aprendiz1.presentarse());

    // prueba de validación: intentar asignar un correo inválido
    try {
      aprendiz2.setCorreo("mariagmail.com"); // correo sin '@'
    } catch (IllegalArgumentException e) {
      System.out.println("Error al actualizar correo de aprendiz2: " + e.getMessage());
    }

  }

}


