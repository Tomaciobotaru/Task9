package flyweight;
//Pattern 2
//Emojis are everywhere in this browser. Every tab, every notification, every cookie warning has
//them. But the memory usage is outrageous.
//Each emoji type (😂, 🤦, 👀, etc.) is rendered repeatedly, sometimes thousands of times
//across the UI. Find away to reduce this memory footprint.

public class Main {
	//Client – corresponds to "Client" in the UML diagram
	public static void main(String[] args) {
		 // Sample symbols and UI locations (context)
        String[] symbols = {"😂", "🤦", "👀"};
        String[] locations = {"Tab", "Notification", "Cookie"};

        // Simulate rendering 1000 emoji appearances
        for (int i = 0; i < 1000; i++) {
            // Select a repeated emoji symbol and context
            String symbol = symbols[i % symbols.length];
            String context = locations[i % locations.length] + " #" + i;

            // Request the emoji object from the factory (shared instance)
            EmojiFlyweight emoji = EmojiFactory.getEmoji(symbol);

            // Render the emoji in a specific context (external state)
            emoji.render(context);
        }

        // Output how many actual Emoji objects were created
        System.out.println("\nTotal unique emoji instances created: " + EmojiFactory.getInstanceCount());

        // This number should be small (e.g., 3), demonstrating memory efficiency
    }

}
