
package com.techhybris.alexa.product.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Facet {

    private Boolean category;
    private Boolean multiSelect;
    private String name;
    private Integer priority;
    private List<Value> values = null;
    private Boolean visible;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Boolean getCategory() {
        return category;
    }

    public void setCategory(Boolean category) {
        this.category = category;
    }

    public Boolean getMultiSelect() {
        return multiSelect;
    }

    public void setMultiSelect(Boolean multiSelect) {
        this.multiSelect = multiSelect;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public List<Value> getValues() {
        return values;
    }

    public void setValues(List<Value> values) {
        this.values = values;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
