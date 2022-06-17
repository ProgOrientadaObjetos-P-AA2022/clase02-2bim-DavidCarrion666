/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author Usuario iTC
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;
        int numCred = 5;
        double costCred = 50.55;

        EstudiantePresencial est1 = new EstudiantePresencial(nombre,
                apellido,
                identificacion,
                edad,
                numCred,
                costCred);

        est1.calcularMatriculaPresencial();

        System.out.println(est1);
    }
}
