
package com.techhybris.alexa.cart.data;

import java.util.HashMap;
import java.util.Map;

public class TotalPrice_ {

    private String currencyIso;
    private Double value;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getCurrencyIso() {
        return currencyIso;
    }

    public void setCurrencyIso(String currencyIso) {
        this.currencyIso = currencyIso;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
