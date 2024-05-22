/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package fachada;

//Representa el archivo resultante después de la conversión y proporciona un método para guardar el archivo.
class File {
    private byte[] data;

    public File(byte[] data) {
        this.data = data;
    }

    public void save() {
        System.out.println("File: saving file...");
        // Simulación de guardar el archivo
    }
}


