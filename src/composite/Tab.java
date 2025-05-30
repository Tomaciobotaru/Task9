package composite;
//Leaf – corresponds to "LeafNode" in the UML diagram
class Tab implements TabComponent {
 private final String name;

 public Tab(String name) {
     this.name = name;
 }

 @Override
 public void close() {
     // Leaf-specific close logic
     System.out.println("Closing tab: " + name);
 }

 @Override
 public void search(String keyword) {
     if (name.contains(keyword)) {
         System.out.println("Match found in tab: " + name);
     }
 }

 @Override
 public String getName() {
     return name;
 }
}
