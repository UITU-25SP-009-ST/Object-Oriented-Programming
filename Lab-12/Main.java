// Step 1: Implement AutoCloseable
class Resource implements AutoCloseable {
    public Resource() {
        System.out.println("Resource created.");
    }

    public void doWork() {
        System.out.println("Working...");
    }

    // Step 2: Override the close() method (This is your "Destructor")
    @Override
    public void close() {
        System.out.println("Resource closed/cleaned up immediately!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Step 3: Put it in a try(...) block
        try (Resource res = new Resource()) {
            res.doWork();
        } 
        
        // Step 4: Java AUTOMATICALLY calls close() here, even if errors occur.
        
        System.out.println("End of main.");
    }
}