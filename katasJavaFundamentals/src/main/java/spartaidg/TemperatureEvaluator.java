package spartaidg;

public class TemperatureEvaluator {
    public final double HIGH_FEVER = 38.5;
    public final double FEVER = 38;
    public final double NORMAL = 37;
    public final double HYPOTHERMIA = 35;
    public final double ERROR = 30;

    public String evaluateTemperature(double temperature) {
        if (temperature >= HIGH_FEVER) {
            return "High Fever";
        } else if (temperature >= FEVER) {
            return "Fever";
        } else if (temperature >= NORMAL) {
            return "Normal";
        } else if (temperature >= HYPOTHERMIA) {
            return "Hypothermia";
        } else {
            return "Error";
        }
    }

    public static void main(String[] args) {
        TemperatureEvaluator evaluator = new TemperatureEvaluator();
        double temperatureReading = 36.5; // Example temperature reading
        String evaluation = evaluator.evaluateTemperature(temperatureReading);
        System.out.println("Temperature Evaluation: " + evaluation);
    }
}

