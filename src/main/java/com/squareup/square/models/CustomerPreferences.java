
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * This is a model class for CustomerPreferences type.
 */
public class CustomerPreferences {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final Boolean emailUnsubscribed;

    /**
     * Initialization constructor.
     * @param  emailUnsubscribed  Boolean value for emailUnsubscribed.
     */
    @JsonCreator
    public CustomerPreferences(
            @JsonProperty("email_unsubscribed") Boolean emailUnsubscribed) {
        this.emailUnsubscribed = emailUnsubscribed;
    }

    /**
     * Getter for EmailUnsubscribed.
     * The customer has unsubscribed from receiving marketing campaign emails.
     * @return Returns the Boolean
     */
    @JsonGetter("email_unsubscribed")
    public Boolean getEmailUnsubscribed() {
        return emailUnsubscribed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailUnsubscribed);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CustomerPreferences)) {
            return false;
        }
        CustomerPreferences other = (CustomerPreferences) obj;
        return Objects.equals(emailUnsubscribed, other.emailUnsubscribed);
    }

    /**
     * Converts this CustomerPreferences into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CustomerPreferences [" + "emailUnsubscribed=" + emailUnsubscribed + "]";
    }

    /**
     * Builds a new {@link CustomerPreferences.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CustomerPreferences.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .emailUnsubscribed(getEmailUnsubscribed());
        return builder;
    }

    /**
     * Class to build instances of {@link CustomerPreferences}.
     */
    public static class Builder {
        private Boolean emailUnsubscribed;



        /**
         * Setter for emailUnsubscribed.
         * @param  emailUnsubscribed  Boolean value for emailUnsubscribed.
         * @return Builder
         */
        public Builder emailUnsubscribed(Boolean emailUnsubscribed) {
            this.emailUnsubscribed = emailUnsubscribed;
            return this;
        }

        /**
         * Builds a new {@link CustomerPreferences} object using the set fields.
         * @return {@link CustomerPreferences}
         */
        public CustomerPreferences build() {
            return new CustomerPreferences(emailUnsubscribed);
        }
    }
}
