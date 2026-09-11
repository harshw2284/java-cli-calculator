package calculator;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private final List<Calculation> history = new ArrayList<>();

    public double add(double a, double b) {
        double result = a + b;
        history.add(new Calculation(a, b, "+", result));
        return result;
    }

    public double subtract(double a, double b) {
        double result = a - b;
        history.add(new Calculation(a, b, "-", result));
        return result;
    }

    public void exportHistory(String filename) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(filename)) {
            gson.toJson(history, writer);
        }
    }

    public List<Calculation> getHistory() {
        return history;
    }
}
