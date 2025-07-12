import java.util.*;

class Item {
    int value;
    int weight;

    Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

class Solution {
    double fractionalKnapsack(int[] values, int[] weights, int W) {
        int n = values.length;
        Item[] items = new Item[n];
        
        // Build item array
        for (int i = 0; i < n; i++) {
            items[i] = new Item(values[i], weights[i]);
        }

        // Sort items by value/weight ratio descending
        Arrays.sort(items, (a, b) -> {
            double ratio1 = (double)a.value / a.weight;
            double ratio2 = (double)b.value / b.weight;
            return Double.compare(ratio2, ratio1);
        });

        double maxValue = 0.0;

        for (int i = 0; i < n; i++) {
            if (W == 0) break;

            if (items[i].weight <= W) {
                maxValue += items[i].value;
                W -= items[i].weight;
            } else {
                // Take fractional part
                maxValue += (items[i].value * ((double) W) / items[i].weight);
                W = 0;
            }
        }
        return maxValue;
    }
}
