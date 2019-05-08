
package com.techhybris.alexa.orderentry.data;

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
    "code",
    "comparable",
    "description",
    "featureUnit",
    "featureValues",
    "name",
    "range",
    "type"
})
public class Feature {

    @JsonProperty("code")
    private String code;
    @JsonProperty("comparable")
    private Boolean comparable;
    @JsonProperty("description")
    private String description;
    @JsonProperty("featureUnit")
    private FeatureUnit featureUnit;
    @JsonProperty("featureValues")
    private List<FeatureValue> featureValues = null;
    @JsonProperty("name")
    private String name;
    @JsonProperty("range")
    private Boolean range;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("comparable")
    public Boolean getComparable() {
        return comparable;
    }

    @JsonProperty("comparable")
    public void setComparable(Boolean comparable) {
        this.comparable = comparable;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("featureUnit")
    public FeatureUnit getFeatureUnit() {
        return featureUnit;
    }

    @JsonProperty("featureUnit")
    public void setFeatureUnit(FeatureUnit featureUnit) {
        this.featureUnit = featureUnit;
    }

    @JsonProperty("featureValues")
    public List<FeatureValue> getFeatureValues() {
        return featureValues;
    }

    @JsonProperty("featureValues")
    public void setFeatureValues(List<FeatureValue> featureValues) {
        this.featureValues = featureValues;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("range")
    public Boolean getRange() {
        return range;
    }

    @JsonProperty("range")
    public void setRange(Boolean range) {
        this.range = range;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
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
