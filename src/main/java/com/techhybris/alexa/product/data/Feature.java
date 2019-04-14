
package com.techhybris.alexa.product.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Feature {

    private String code;
    private Boolean comparable;
    private FeatureUnit featureUnit;
    private List<FeatureValue> featureValues = null;
    private String name;
    private Boolean range;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getComparable() {
        return comparable;
    }

    public void setComparable(Boolean comparable) {
        this.comparable = comparable;
    }

    public FeatureUnit getFeatureUnit() {
        return featureUnit;
    }

    public void setFeatureUnit(FeatureUnit featureUnit) {
        this.featureUnit = featureUnit;
    }

    public List<FeatureValue> getFeatureValues() {
        return featureValues;
    }

    public void setFeatureValues(List<FeatureValue> featureValues) {
        this.featureValues = featureValues;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getRange() {
        return range;
    }

    public void setRange(Boolean range) {
        this.range = range;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
