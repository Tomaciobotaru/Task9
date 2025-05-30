package flyweight;

//ConcreteFlyweight – corresponds to "FlyweightConcrete" in the UML diagram
class ConcreteEmoji implements EmojiFlyweight {
 private final String symbol; // permanentState (shared/intrinsic state)

 public ConcreteEmoji(String symbol) {
     this.symbol = symbol;
 }

 @Override
 public void render(String context) {
     // Operates using external (temporary) state while keeping internal state shared
     System.out.println("Rendering emoji '" + symbol + "' in context: " + context);
 }

 public String getSymbol() {
     return symbol;
 }
}