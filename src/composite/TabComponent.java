package composite;

//Component – corresponds to "AbstractComponent" in the UML Composite diagram
interface TabComponent {
 void close();                    // Represents the specific action from UML: specificMethod()
 void search(String keyword);     // Additional behavior needed for the problem scenario
 String getName();                // Name is required for search and identification
}
