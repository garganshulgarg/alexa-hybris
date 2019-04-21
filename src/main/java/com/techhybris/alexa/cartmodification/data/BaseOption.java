
package com.techhybris.alexa.cartmodification.data;

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
    "options",
    "selected",
    "variantType"
})
public class BaseOption {

    @JsonProperty("options")
    private List<Option> options = null;
    @JsonProperty("selected")
    private Selected selected;
    @JsonProperty("variantType")
    private String variantType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("options")
    public List<Option> getOptions() {
        return options;
    }

    @JsonProperty("options")
    public void setOptions(List<Option> options) {
        this.options = options;
    }

    @JsonProperty("selected")
    public Selected getSelected() {
        return selected;
    }

    @JsonProperty("selected")
    public void setSelected(Selected selected) {
        this.selected = selected;
    }

    @JsonProperty("variantType")
    public String getVariantType() {
        return variantType;
    }

    @JsonProperty("variantType")
    public void setVariantType(String variantType) {
        this.variantType = variantType;
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
