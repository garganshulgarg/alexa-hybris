
package com.techhybris.alexa.orderentry.data;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "countryIso",
    "isocode",
    "isocodeShort",
    "name"
})
public class Region_ {

    @JsonProperty("countryIso")
    private String countryIso;
    @JsonProperty("isocode")
    private String isocode;
    @JsonProperty("isocodeShort")
    private String isocodeShort;
    @JsonProperty("name")
    private String name;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("countryIso")
    public String getCountryIso() {
        return countryIso;
    }

    @JsonProperty("countryIso")
    public void setCountryIso(String countryIso) {
        this.countryIso = countryIso;
    }

    @JsonProperty("isocode")
    public String getIsocode() {
        return isocode;
    }

    @JsonProperty("isocode")
    public void setIsocode(String isocode) {
        this.isocode = isocode;
    }

    @JsonProperty("isocodeShort")
    public String getIsocodeShort() {
        return isocodeShort;
    }

    @JsonProperty("isocodeShort")
    public void setIsocodeShort(String isocodeShort) {
        this.isocodeShort = isocodeShort;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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
