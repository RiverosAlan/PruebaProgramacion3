/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class OperacionesArchivos {
    public void crearDirectorio() {
        Path path =  Paths.get("F:\\incos\\ProgramacionIII");
        try {
            if (!Files.exists(path)) {
                //no existe el archivo, debemos crearlo
                Files.createDirectories(path);
                System.out.println("Archivo creado");
            } else {
                System.out.println("El archivo ya esta creado");
            }
        } catch (IOException e) {
            e.printStackTrace();
            //System.out.println(e);
        }
    }

    public void crearArchivo() {
        Path path = Paths.get("F:\\incos\\programacionIII\\miArchivo.txt");
        try {
            if (!Files.exists(path)) {
                //no existe el archivo, debemos crearlo
                Files.createFile(path);
                System.out.println("Archivo creado");
            } else {
                System.out.println("El archivo ya esta creado");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void agregarContenido() {
        Path ruta = Paths.get("F:\\incos\\programacionIII\\miArchivo.txt");
        String contenido, res;
        Scanner leer = new Scanner(System.in);
        try {
            System.out.println("¿Desea adicionar contenido al archivo S/N?");
            res = leer.nextLine();
            while (res.equalsIgnoreCase("S")) {
                //se desea adicionar contenido
                contenido = leer.nextLine();
                contenido = contenido + "\n";

                Files.write(ruta, contenido.getBytes(), StandardOpenOption.APPEND);
                System.out.println("Contenido adicionado, desea seguir agregando contenido al archivo S/N");
                res = leer.nextLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void mostrarContenido(){
    Path ruta = Paths.get("F:\\incos\\programacionIII\\miArchivo.txt");
        try {
            List <String> contenidoArchivo = Files.readAllLines(ruta);
            System.out.println("El contenido es :");
            for (String linea : contenidoArchivo) {
                System.out.println(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
