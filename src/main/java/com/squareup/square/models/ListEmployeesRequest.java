
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * This is a model class for ListEmployeesRequest type.
 */
public class ListEmployeesRequest {
    private final String locationId;
    private final String status;
    private final Integer limit;
    private final String cursor;

    /**
     * Initialization constructor.
     * @param  locationId  String value for locationId.
     * @param  status  String value for status.
     * @param  limit  Integer value for limit.
     * @param  cursor  String value for cursor.
     */
    @JsonCreator
    public ListEmployeesRequest(
            @JsonProperty("location_id") String locationId,
            @JsonProperty("status") String status,
            @JsonProperty("limit") Integer limit,
            @JsonProperty("cursor") String cursor) {
        this.locationId = locationId;
        this.status = status;
        this.limit = limit;
        this.cursor = cursor;
    }

    /**
     * Getter for LocationId.
     * @return Returns the String
     */
    @JsonGetter("location_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLocationId() {
        return locationId;
    }

    /**
     * Getter for Status.
     * The status of the Employee being retrieved.
     * @return Returns the String
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStatus() {
        return status;
    }

    /**
     * Getter for Limit.
     * The number of employees to be returned on each page.
     * @return Returns the Integer
     */
    @JsonGetter("limit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getLimit() {
        return limit;
    }

    /**
     * Getter for Cursor.
     * The token required to retrieve the specified page of results.
     * @return Returns the String
     */
    @JsonGetter("cursor")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCursor() {
        return cursor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(locationId, status, limit, cursor);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListEmployeesRequest)) {
            return false;
        }
        ListEmployeesRequest other = (ListEmployeesRequest) obj;
        return Objects.equals(locationId, other.locationId)
            && Objects.equals(status, other.status)
            && Objects.equals(limit, other.limit)
            && Objects.equals(cursor, other.cursor);
    }

    /**
     * Converts this ListEmployeesRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListEmployeesRequest [" + "locationId=" + locationId + ", status=" + status
                + ", limit=" + limit + ", cursor=" + cursor + "]";
    }

    /**
     * Builds a new {@link ListEmployeesRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListEmployeesRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .locationId(getLocationId())
                .status(getStatus())
                .limit(getLimit())
                .cursor(getCursor());
        return builder;
    }

    /**
     * Class to build instances of {@link ListEmployeesRequest}.
     */
    public static class Builder {
        private String locationId;
        private String status;
        private Integer limit;
        private String cursor;



        /**
         * Setter for locationId.
         * @param  locationId  String value for locationId.
         * @return Builder
         */
        public Builder locationId(String locationId) {
            this.locationId = locationId;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for limit.
         * @param  limit  Integer value for limit.
         * @return Builder
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Setter for cursor.
         * @param  cursor  String value for cursor.
         * @return Builder
         */
        public Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        /**
         * Builds a new {@link ListEmployeesRequest} object using the set fields.
         * @return {@link ListEmployeesRequest}
         */
        public ListEmployeesRequest build() {
            return new ListEmployeesRequest(locationId, status, limit, cursor);
        }
    }
}
