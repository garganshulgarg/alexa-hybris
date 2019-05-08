
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
    "closed",
    "closingTime",
    "openingTime",
    "weekDay"
})
public class WeekDayOpeningList {

    @JsonProperty("closed")
    private Boolean closed;
    @JsonProperty("closingTime")
    private ClosingTime_ closingTime;
    @JsonProperty("openingTime")
    private OpeningTime_ openingTime;
    @JsonProperty("weekDay")
    private String weekDay;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("closed")
    public Boolean getClosed() {
        return closed;
    }

    @JsonProperty("closed")
    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    @JsonProperty("closingTime")
    public ClosingTime_ getClosingTime() {
        return closingTime;
    }

    @JsonProperty("closingTime")
    public void setClosingTime(ClosingTime_ closingTime) {
        this.closingTime = closingTime;
    }

    @JsonProperty("openingTime")
    public OpeningTime_ getOpeningTime() {
        return openingTime;
    }

    @JsonProperty("openingTime")
    public void setOpeningTime(OpeningTime_ openingTime) {
        this.openingTime = openingTime;
    }

    @JsonProperty("weekDay")
    public String getWeekDay() {
        return weekDay;
    }

    @JsonProperty("weekDay")
    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
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
