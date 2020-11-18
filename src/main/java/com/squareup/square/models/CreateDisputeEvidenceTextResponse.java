
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.squareup.square.http.client.HttpContext;
import java.util.List;
import java.util.Objects;

/**
 * This is a model class for CreateDisputeEvidenceTextResponse type.
 */
public class CreateDisputeEvidenceTextResponse {
    private HttpContext httpContext;
    private final List<Error> errors;
    private final DisputeEvidence evidence;

    /**
     * Initialization constructor.
     * @param errors List of Error value for errors.
     * @param evidence DisputeEvidence value for evidence.
     */
    @JsonCreator
    public CreateDisputeEvidenceTextResponse(
            @JsonProperty("errors") List<Error> errors,
            @JsonProperty("evidence") DisputeEvidence evidence) {
        this.errors = errors;
        this.evidence = evidence;
    }

    public HttpContext getContext() {
        return httpContext;
    }

    /**
     * Getter for Errors.
     * Any errors that occurred during the request.
     * @return Returns the List of Error
     */
    @JsonGetter("errors")
    public List<Error> getErrors() {
        return this.errors;
    }

    /**
     * Getter for Evidence.
     * @return Returns the DisputeEvidence
     */
    @JsonGetter("evidence")
    public DisputeEvidence getEvidence() {
        return this.evidence;
    }

    @Override
    public int hashCode() {
        return Objects.hash(errors, evidence);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateDisputeEvidenceTextResponse)) {
            return false;
        }
        CreateDisputeEvidenceTextResponse other = (CreateDisputeEvidenceTextResponse) obj;
        return Objects.equals(errors, other.errors)
            && Objects.equals(evidence, other.evidence);
    }

    /**
     * Converts this CreateDisputeEvidenceTextResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateDisputeEvidenceTextResponse [" + "errors=" + errors + ", evidence=" + evidence
                + "]";
    }

    /**
     * Builds a new {@link CreateDisputeEvidenceTextResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateDisputeEvidenceTextResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .errors(getErrors())
                .evidence(getEvidence());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateDisputeEvidenceTextResponse}.
     */
    public static class Builder {
        private HttpContext httpContext;
        private List<Error> errors;
        private DisputeEvidence evidence;



        /**
         * Setter for httpContext.
         * @param httpContext HttpContext value for httpContext.
         * @return Builder
         */
        public Builder httpContext(HttpContext httpContext) {
            this.httpContext = httpContext;
            return this;
        }

        /**
         * Setter for errors.
         * @param errors List of Error value for errors.
         * @return Builder
         */
        public Builder errors(List<Error> errors) {
            this.errors = errors;
            return this;
        }

        /**
         * Setter for evidence.
         * @param evidence DisputeEvidence value for evidence.
         * @return Builder
         */
        public Builder evidence(DisputeEvidence evidence) {
            this.evidence = evidence;
            return this;
        }

        /**
         * Builds a new {@link CreateDisputeEvidenceTextResponse} object using the set fields.
         * @return {@link CreateDisputeEvidenceTextResponse}
         */
        public CreateDisputeEvidenceTextResponse build() {
            CreateDisputeEvidenceTextResponse model =
                    new CreateDisputeEvidenceTextResponse(errors, evidence);
            model.httpContext = httpContext;
            return model;
        }
    }
}
