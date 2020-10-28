
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;


/**
 * This is a model class for V1CreateModifierListRequest type.
 */
public class V1CreateModifierListRequest {
    private final V1ModifierList body;

    /**
     * Initialization constructor.
     * @param body V1ModifierList value for body.
     */
    @JsonCreator
    public V1CreateModifierListRequest(
            @JsonProperty("body") V1ModifierList body) {
        this.body = body;
    }

    /**
     * Getter for Body.
     * V1ModifierList
     * @return Returns the V1ModifierList
     */
    @JsonGetter("body")
    public V1ModifierList getBody() {
        return this.body;
    }

 
    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V1CreateModifierListRequest)) {
            return false;
        }
        V1CreateModifierListRequest other = (V1CreateModifierListRequest) obj;
        return Objects.equals(body, other.body);
    }

    /**
     * Builds a new {@link V1CreateModifierListRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link V1CreateModifierListRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
            .body(getBody());
        return builder;
    }

    /**
     * Class to build instances of {@link V1CreateModifierListRequest}.
     */
    public static class Builder {
        private V1ModifierList body;



        /**
         * Setter for body.
         * @param body V1ModifierList value for body.
         * @return Builder
         */
        public Builder body(V1ModifierList body) {
            this.body = body;
            return this;
        }

        /**
         * Builds a new {@link V1CreateModifierListRequest} object using the set fields.
         * @return {@link V1CreateModifierListRequest}
         */
        public V1CreateModifierListRequest build() {
            return new V1CreateModifierListRequest(body);
        }
    }
}
