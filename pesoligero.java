import java.util.HashMap;
import java.util.Map;

// La clase TreeType representa el Flyweight en el patrón Flyweight.
class TreeType {
    private String name;
    private String color;
    private String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(String canvas, int x, int y) {
        // Simulación del método draw, aquí se podría implementar la lógica para dibujar el árbol en el lienzo.
        System.out.println("Drawing tree of type: " + name + ", color: " + color + ", texture: " + texture + " at position (" + x + ", " + y + ")");
    }
}

// La fábrica TreeFactory se encarga de gestionar y reutilizar los objetos TreeType (Flyweights).
class TreeFactory {
    private static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        String key = name + color + texture;
        TreeType type = treeTypes.get(key);
        if (type == null) {
            type = new TreeType(name, color, texture);
            treeTypes.put(key, type);
        }
        return type;
    }
}

// La clase Tree representa el objeto contextual que utiliza el Flyweight.
class Tree {
    private int x;
    private int y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(String canvas) {
        type.draw(canvas, x, y);
    }
}

// La clase Forest actúa como cliente de Flyweight, creando y manejando objetos Tree.
class Forest {
    private Map<Integer, Tree> trees = new HashMap<>();

    public void plantTree(int x, int y, String name, String color, String texture) {
        TreeType type = TreeFactory.getTreeType(name, color, texture);
        Tree tree = new Tree(x, y, type);
        trees.put(trees.size() + 1, tree);
    }

    public void draw(String canvas) {
        for (Tree tree : trees.values()) {
            tree.draw(canvas);
        }
    }
}

// Ejemplo de uso:
public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.plantTree(1, 2, "Oak", "Green", "Leafy");
        forest.plantTree(3, 4, "Pine", "Brown", "Needles");

        forest.draw("MyCanvas");
    }
}
