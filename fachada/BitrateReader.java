/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package fachada;

//Simula la lectura y conversión de la tasa de bits del archivo.
class BitrateReader {
    public static byte[] read(String filename, Object codec) {
        System.out.println("BitrateReader: reading file...");
        // Simulación de lectura de archivo
        return filename.getBytes();
    }

    public static byte[] convert(byte[] buffer, Object codec) {
        System.out.println("BitrateReader: converting file...");
        // Simulación de conversión de archivo
        return buffer;
    }
}
