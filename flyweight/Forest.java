/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package flyweight;

import java.util.HashMap;
import java.util.Map;

//es como el cliente, almacena los arboles
public class Forest {
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
