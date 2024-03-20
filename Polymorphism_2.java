// Parent class Sports
class Sports {
    public void play() {
        // Default implementation for playing
        System.out.println("Playing...");
    }
}

// Subclass Football
class Football extends Sports {
    @Override
    public void play() {
        System.out.println("Playing football");
    }
}

// Subclass Basketball
class Basketball extends Sports {
    @Override
    public void play() {
        System.out.println("Playing basketball");
    }
}

// Subclass Rugby
class Rugby extends Sports {
    @Override
    public void play() {
        System.out.println("Playing rugby");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects of Football, Basketball, and Rugby classes
        Football football = new Football();
        Basketball basketball = new Basketball();
        Rugby rugby = new Rugby();

        // Call play method for each sport
        football.play();
        basketball.play();
        rugby.play();
    }
}
