
package com.techhybris.alexa.product.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "category",
    "multiSelect",
    "name",
    "priority",
    "values",
    "visible"
})
public class Facet {

    @JsonProperty("category")
    private Boolean category;
    @JsonProperty("multiSelect")
    private Boolean multiSelect;
    @JsonProperty("name")
    private String name;
    @JsonProperty("priority")
    private Integer priority;
    @JsonProperty("values")
    private List<Value> values = null;
    @JsonProperty("visible")
    private Boolean visible;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("category")
    public Boolean getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(Boolean category) {
        this.category = category;
    }

    @JsonProperty("multiSelect")
    public Boolean getMultiSelect() {
        return multiSelect;
    }

    @JsonProperty("multiSelect")
    public void setMultiSelect(Boolean multiSelect) {
        this.multiSelect = multiSelect;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("priority")
    public Integer getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @JsonProperty("values")
    public List<Value> getValues() {
        return values;
    }

    @JsonProperty("values")
    public void setValues(List<Value> values) {
        this.values = values;
    }

    @JsonProperty("visible")
    public Boolean getVisible() {
        return visible;
    }

    @JsonProperty("visible")
    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
