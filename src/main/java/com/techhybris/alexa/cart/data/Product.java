
package com.techhybris.alexa.cart.data;

import java.util.HashMap;
import java.util.Map;

public class Product {

    private Boolean availableForPickup;
    private String code;
    private String name;
    private Boolean purchasable;
    private Stock stock;
    private String url;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Boolean getAvailableForPickup() {
        return availableForPickup;
    }

    public void setAvailableForPickup(Boolean availableForPickup) {
        this.availableForPickup = availableForPickup;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getPurchasable() {
        return purchasable;
    }

    public void setPurchasable(Boolean purchasable) {
        this.purchasable = purchasable;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
