package composite;
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
