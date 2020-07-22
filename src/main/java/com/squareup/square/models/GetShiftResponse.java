package com.squareup.square.models;

import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.squareup.square.http.client.HttpContext;


/**
 * This is a model class for GetShiftResponse type.
 */
public class GetShiftResponse {

    /**
     * Initialization constructor.
     * @param shift
     * @param errors
     */
    @JsonCreator
    public GetShiftResponse(
            @JsonProperty("shift") Shift shift,
            @JsonProperty("errors") List<Error> errors) {
        this.shift = shift;
        this.errors = errors;
    }

    private HttpContext httpContext;
    private final Shift shift;
    private final List<Error> errors;

    public HttpContext getContext() {
        return httpContext;
    }

    /**
     * Getter for Shift.
     * A record of the hourly rate, start, and end times for a single work shift
     * for an employee. May include a record of the start and end times for breaks
     * taken during the shift.
     */
    @JsonGetter("shift")
    public Shift getShift() {
        return this.shift;
    }

    /**
     * Getter for Errors.
     * Any errors that occurred during the request.
     */
    @JsonGetter("errors")
    public List<Error> getErrors() {
        return this.errors;
    }

 
    @Override
    public int hashCode() {
        return Objects.hash(shift, errors);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(!(obj instanceof GetShiftResponse)) {
            return false;
        }
        GetShiftResponse getShiftResponse = (GetShiftResponse) obj;
        return Objects.equals(shift, getShiftResponse.shift) &&
            Objects.equals(errors, getShiftResponse.errors);
    }

    /**
     * Builds a new {@link GetShiftResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetShiftResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
            .shift(getShift())
            .errors(getErrors());
            return builder;
    }

    /**
     * Class to build instances of {@link GetShiftResponse}
     */
    public static class Builder {
        private HttpContext httpContext;
        private Shift shift;
        private List<Error> errors;

        /**
         * Initialization constructor
         */
        public Builder() {
           
        }

        /**
         * Setter for httpContext
         * @param httpContext
         * @return Builder
         */
        public Builder httpContext(HttpContext httpContext) {
            this.httpContext = httpContext;
            return this;
        }
        /**
         * Setter for shift
         * @param shift
         * @return Builder
         */
        public Builder shift(Shift shift) {
            this.shift = shift;
            return this;
        }
        /**
         * Setter for errors
         * @param errors
         * @return Builder
         */
        public Builder errors(List<Error> errors) {
            this.errors = errors;
            return this;
        }

        /**
         * Builds a new {@link GetShiftResponse} object using the set fields.
         * @return {@link GetShiftResponse}
         */
        public GetShiftResponse build() {
            GetShiftResponse model = new GetShiftResponse(shift,
                errors);
            model.httpContext = httpContext;
            return model;
        }
    }
}
