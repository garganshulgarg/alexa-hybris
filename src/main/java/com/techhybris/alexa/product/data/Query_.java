
package com.techhybris.alexa.product.data;

import java.util.HashMap;
import java.util.Map;

public class Query_ {

    private Query__ query;
    private String url;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Query__ getQuery() {
        return query;
    }

    public void setQuery(Query__ query) {
        this.query = query;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
