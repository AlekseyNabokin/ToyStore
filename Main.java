import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Создание объекта ToyStore
        ToyStore toyStore = new ToyStore();

        toyStore.addToy("1", "конструктор", 2);
        toyStore.addToy("2", "робот", 2);
        toyStore.addToy("3", "кукла", 6);

        try (FileWriter writer = new FileWriter("output.txt")) {
            for (int i = 0; i < 10; i++) {
                writer.write(toyStore.getToy() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}