package composite;

import java.util.ArrayList;
import java.util.List;
//Composite – corresponds to "Composite" in the UML diagram
class TabGroup implements TabComponent {
 private final String name;
 private final List<TabComponent> children = new ArrayList<>();

 public TabGroup(String name) {
     this.name = name;
 }

 // Corresponds to addNode() from the UML diagram
 public void add(TabComponent component) {
     children.add(component);
 }

 // Corresponds to removeNode() from the UML diagram
 public void remove(TabComponent component) {
     children.remove(component);
 }

 @Override
 public void close() {
     // Recursive close – corresponds to specificMethod() in UML diagram
     System.out.println("Closing tab group: " + name);
     for (TabComponent child : children) {
         child.close(); // Uniform treatment of child components
     }
 }

 @Override
 public void search(String keyword) {
     if (name.contains(keyword)) {
         System.out.println("Match found in group: " + name);
     }
     for (TabComponent child : children) {
         child.search(keyword); // Recursive search through structure
     }
 }

 @Override
 public String getName() {
     return name;
 }
}