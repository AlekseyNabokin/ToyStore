import java.util.PriorityQueue;

public class ToyStore {
    private PriorityQueue<Toy> toys;

    public ToyStore() {
        toys = new PriorityQueue<>();
    }

    public void addToy(String id, String name, int weight) {
        Toy toy = new Toy(id, name, weight);
        toys.add(toy);
    }

    public String getToy() {
        int totalWeight = toys.stream().mapToInt(Toy::getWeight).sum();
        int randomWeight = (int) (Math.random() * totalWeight) + 1;

        int cumulativeWeight = 0;
        for (Toy toy : toys) {
            cumulativeWeight += toy.getWeight();
            if (randomWeight <= cumulativeWeight) {
                return toy.getId();
            }
        }

        return null;
    }
}
