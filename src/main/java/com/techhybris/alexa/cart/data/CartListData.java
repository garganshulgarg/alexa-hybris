
package com.techhybris.alexa.cart.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CartListData {

    private List<Cart> carts = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<Cart> getCarts() {
        return carts;
    }

    public void setCarts(List<Cart> carts) {
        this.carts = carts;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
