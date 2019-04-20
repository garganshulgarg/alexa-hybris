
package com.techhybris.alexa.cart.data;

import java.util.HashMap;
import java.util.Map;

public class Stock {

    private Integer stockLevel;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(Integer stockLevel) {
        this.stockLevel = stockLevel;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
