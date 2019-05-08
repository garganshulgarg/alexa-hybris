
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
    "elements",
    "isLeaf",
    "parentVariantCategory",
    "variantOption",
    "variantValueCategory"
})
public class VariantMatrix {

    @JsonProperty("elements")
    private List<Element> elements = null;
    @JsonProperty("isLeaf")
    private Boolean isLeaf;
    @JsonProperty("parentVariantCategory")
    private ParentVariantCategory parentVariantCategory;
    @JsonProperty("variantOption")
    private VariantOption variantOption;
    @JsonProperty("variantValueCategory")
    private VariantValueCategory variantValueCategory;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("elements")
    public List<Element> getElements() {
        return elements;
    }

    @JsonProperty("elements")
    public void setElements(List<Element> elements) {
        this.elements = elements;
    }

    @JsonProperty("isLeaf")
    public Boolean getIsLeaf() {
        return isLeaf;
    }

    @JsonProperty("isLeaf")
    public void setIsLeaf(Boolean isLeaf) {
        this.isLeaf = isLeaf;
    }

    @JsonProperty("parentVariantCategory")
    public ParentVariantCategory getParentVariantCategory() {
        return parentVariantCategory;
    }

    @JsonProperty("parentVariantCategory")
    public void setParentVariantCategory(ParentVariantCategory parentVariantCategory) {
        this.parentVariantCategory = parentVariantCategory;
    }

    @JsonProperty("variantOption")
    public VariantOption getVariantOption() {
        return variantOption;
    }

    @JsonProperty("variantOption")
    public void setVariantOption(VariantOption variantOption) {
        this.variantOption = variantOption;
    }

    @JsonProperty("variantValueCategory")
    public VariantValueCategory getVariantValueCategory() {
        return variantValueCategory;
    }

    @JsonProperty("variantValueCategory")
    public void setVariantValueCategory(VariantValueCategory variantValueCategory) {
        this.variantValueCategory = variantValueCategory;
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
