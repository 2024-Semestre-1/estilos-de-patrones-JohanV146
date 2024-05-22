/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flyweight;

public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.plantTree(1, 2, "Oak", "Green", "Leafy");
        forest.plantTree(3, 4, "Pine", "Brown", "Needles");
        forest.plantTree(5, 6, "Birch", "White", "Smooth");

        forest.draw("MyCanvas");
    }
}

