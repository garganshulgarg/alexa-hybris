
package com.techhybris.alexa.product.data;

import java.util.HashMap;
import java.util.Map;

public class Value {

    private Integer count;
    private String name;
    private Query_ query;
    private Boolean selected;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Query_ getQuery() {
        return query;
    }

    public void setQuery(Query_ query) {
        this.query = query;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
