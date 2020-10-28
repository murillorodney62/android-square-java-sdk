
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;


/**
 * This is a model class for UpdateLocationRequest type.
 */
public class UpdateLocationRequest {
    private final Location location;

    /**
     * Initialization constructor.
     * @param location Location value for location.
     */
    @JsonCreator
    public UpdateLocationRequest(
            @JsonProperty("location") Location location) {
        this.location = location;
    }

    /**
     * Getter for Location.
     * @return Returns the Location
     */
    @JsonGetter("location")
    public Location getLocation() {
        return this.location;
    }

 
    @Override
    public int hashCode() {
        return Objects.hash(location);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateLocationRequest)) {
            return false;
        }
        UpdateLocationRequest other = (UpdateLocationRequest) obj;
        return Objects.equals(location, other.location);
    }

    /**
     * Builds a new {@link UpdateLocationRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateLocationRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
            .location(getLocation());
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateLocationRequest}.
     */
    public static class Builder {
        private Location location;



        /**
         * Setter for location.
         * @param location Location value for location.
         * @return Builder
         */
        public Builder location(Location location) {
            this.location = location;
            return this;
        }

        /**
         * Builds a new {@link UpdateLocationRequest} object using the set fields.
         * @return {@link UpdateLocationRequest}
         */
        public UpdateLocationRequest build() {
            return new UpdateLocationRequest(location);
        }
    }
}
