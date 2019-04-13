
package com.techhybris.alexa.product.data;

import java.util.HashMap;
import java.util.Map;

public class Stock {

    private String stockLevelStatus;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getStockLevelStatus() {
        return stockLevelStatus;
    }

    public void setStockLevelStatus(String stockLevelStatus) {
        this.stockLevelStatus = stockLevelStatus;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
