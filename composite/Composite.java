/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composite;

/**
 *
 * @author johan
 */
public class Composite {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();
        editor.load();
        System.out.println("Drawing initial graphics:");
        editor.draw();

        Graphic dot = new Dot(2, 3);
        Graphic circle = new Circle(4, 5, 6);
        editor.groupSelected(new Graphic[] { dot, circle });

        System.out.println("\nDrawing graphics after grouping selected components:");
        editor.draw();
    }
}

