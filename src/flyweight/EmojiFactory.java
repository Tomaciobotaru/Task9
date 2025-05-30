package flyweight;
import java.util.HashMap;
import java.util.Map;

//FlyweightFactory – corresponds to "FlyweightFactory" in the UML diagram
class EmojiFactory {
 // Maps to the field: -flyweightCollection : Map in the diagram
 private static final Map<String, EmojiFlyweight> emojiPool = new HashMap<>();

 // Maps to: +getFlyweightObject(key):Flyweight
 public static EmojiFlyweight getEmoji(String symbol) {
     // WHY FLYWEIGHT PATTERN?
     // - Emojis are reused thousands of times in different parts of the UI.
     // - Creating a new object for each usage would waste memory.
     //
     // BENEFIT:
     // - Shared intrinsic state (symbol) reduces memory usage.
     // - External state (context) remains flexible and lightweight.

     if (!emojiPool.containsKey(symbol)) {
         emojiPool.put(symbol, new ConcreteEmoji(symbol));
     }
     return emojiPool.get(symbol);
 }

 public static int getInstanceCount() {
     return emojiPool.size();
 }
}