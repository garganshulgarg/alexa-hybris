
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
    "code",
    "name",
    "specialDayOpeningList",
    "weekDayOpeningList"
})
public class OpeningHours {

    @JsonProperty("code")
    private String code;
    @JsonProperty("name")
    private String name;
    @JsonProperty("specialDayOpeningList")
    private List<SpecialDayOpeningList> specialDayOpeningList = null;
    @JsonProperty("weekDayOpeningList")
    private List<WeekDayOpeningList> weekDayOpeningList = null;
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

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("specialDayOpeningList")
    public List<SpecialDayOpeningList> getSpecialDayOpeningList() {
        return specialDayOpeningList;
    }

    @JsonProperty("specialDayOpeningList")
    public void setSpecialDayOpeningList(List<SpecialDayOpeningList> specialDayOpeningList) {
        this.specialDayOpeningList = specialDayOpeningList;
    }

    @JsonProperty("weekDayOpeningList")
    public List<WeekDayOpeningList> getWeekDayOpeningList() {
        return weekDayOpeningList;
    }

    @JsonProperty("weekDayOpeningList")
    public void setWeekDayOpeningList(List<WeekDayOpeningList> weekDayOpeningList) {
        this.weekDayOpeningList = weekDayOpeningList;
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
