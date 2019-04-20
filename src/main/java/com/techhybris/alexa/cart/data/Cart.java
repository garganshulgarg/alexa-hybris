
package com.techhybris.alexa.cart.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {

    private String code;
    private List<Entry> entries = null;
    private String guid;
    private Integer totalItems;
    private TotalPrice_ totalPrice;
    private TotalPriceWithTax totalPriceWithTax;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    public TotalPrice_ getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(TotalPrice_ totalPrice) {
        this.totalPrice = totalPrice;
    }

    public TotalPriceWithTax getTotalPriceWithTax() {
        return totalPriceWithTax;
    }

    public void setTotalPriceWithTax(TotalPriceWithTax totalPriceWithTax) {
        this.totalPriceWithTax = totalPriceWithTax;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
