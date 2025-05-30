package composite;
//Pattern 1
//The first thing this browser should have is tab grouping. Everybody hates the mess of 100 tabs
//being open and searching through them. We should be able to group them into logical units
//like:
//	“Work stuff”
//	“Procrastination”
//	“Tabs I swear I’ll read later”
//Each group can contain tabs or other tab groups. Closing a group should recursively close all
//contained tabs and I should be able to also search through them. Both the tabs and the groups
//will have names.

//Client code – uses both leaf and composite uniformly
public class Main {

	public static void main(String[] args) {
		// WHY THE COMPOSITE PATTERN?
        // Because both individual tabs and tab groups must be treated uniformly.
        // Groups can contain other tabs or groups, forming a tree-like structure.

        // BENEFITS:
        // - Provides a consistent interface for all components
        // - Recursive operations like closing and searching are simple and scalable
        // - Easy to add new types of tabs or groups without modifying client logic

        // Create tabs
        TabComponent youtube = new Tab("YouTube");
        TabComponent gmail = new Tab("Gmail");
        TabComponent github = new Tab("GitHub");

        // Create a group and add tabs to it
        TabGroup devTools = new TabGroup("Developer Tools");
        devTools.add(gmail);
        devTools.add(github);

        // Create the main group and nest everything
        TabGroup allTabs = new TabGroup("All Tabs");
        allTabs.add(youtube);
        allTabs.add(devTools);

        // Perform search
        System.out.println("Search results for 'GitHub':");
        allTabs.search("GitHub");

        // Perform recursive close
        System.out.println("\nClosing all:");
        allTabs.close();
    }

}
