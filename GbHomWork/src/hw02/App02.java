package hw02;

public class App02 {
    public static void main(String[] args) {

        Contestants[] contestants = {
                new Human(600, 100),
                new Cat(900, 200),
                new Robot(500, 60),
        };

        Crossable[] obstacles = {
                new Barrier(50),
                new Track(500),
                new Barrier(70)
        };

        for (Contestants contestant : contestants) {
            for (Crossable obstackle: obstacles) {
                obstackle.cross(contestant);
            }
        }
    }
}
