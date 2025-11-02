/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp08_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Largo-PC
 */
public class LecturaArchivo {
    public static void ejecutar(){
        try {
            File archivo = new File("texto.txt");
            Scanner sc = new Scanner(archivo); 
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: archivo no encontrado");
        }
    }
}
