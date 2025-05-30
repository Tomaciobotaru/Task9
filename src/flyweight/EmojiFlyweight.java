package flyweight;

//Flyweight Interface – corresponds to "Flyweight" in the UML diagram
interface EmojiFlyweight {
 // Represents the shared operation – maps to +operate(TemporaryState) from the diagram
 void render(String context); // context is external/temporary state
}