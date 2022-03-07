package org.sanity.instagraph;

import java.util.List;
import java.util.Map;

public class ResultSet {
    private List<Map<String, String>> dataset;

    private int currentRow = 0;

    public boolean next() {
        if(currentRow < dataset.size()) {
            currentRow++;
            return true;
        }

        return false;
    }

    public int getInt(String columnName) {
        Map<String, String> currentRowValues = this.dataset.get(this.currentRow);

        return Integer.parseInt(currentRowValues.get(columnName));
    }

    public double getDouble(String columnName) {
        Map<String, String> currentRowValues = this.dataset.get(this.currentRow);

        return Double.parseDouble(currentRowValues.get(columnName));
    }

    public String getString(String columnName) {
        Map<String, String> currentRowValues = this.dataset.get(this.currentRow);

        return currentRowValues.get(columnName);
    }
}
