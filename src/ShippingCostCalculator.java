public class ShippingCostCalculator {
    int weight;
    int distance;
    boolean urgent;

    public ShippingCostCalculator(int weight, int distance, boolean urgent) {
        this.weight = weight;
        this.distance = distance;
        this.urgent = urgent;
    }

    public int calculateShippingCost() {
        int cost;

        if (weight >= 1 && weight <= 5) {
            cost = 30000;
        } else if (weight > 5 && weight < 50) { // BUG: điều kiện sai, nên dùng weight <= 50
            cost = 70000;
        } else if (weight > 50 && weight <= 200) {
            cost = 100000;
        } else {
            throw new IllegalArgumentException("Invalid weight");
        }

        if (distance >= 1 && distance <= 100) {
            cost += 100 * distance;
        } else if (distance > 100 && distance <= 250) {
            cost += 250 * distance;
        } else if (distance > 250 && distance <= 1000) {
            cost += 500 * distance;
        } else {
            throw new IllegalArgumentException("Invalid distance");
        }

        if (urgent) {
            cost += (int) (cost * 0.2);
        }

        return cost;
    }
}
