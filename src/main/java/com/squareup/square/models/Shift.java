
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Objects;

/**
 * This is a model class for Shift type.
 */
public class Shift {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String employeeId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String locationId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String timezone;
    private final String startAt;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String endAt;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final ShiftWage wage;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final List<Break> breaks;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String status;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final Integer version;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String createdAt;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String updatedAt;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String teamMemberId;

    /**
     * Initialization constructor.
     * @param  startAt  String value for startAt.
     * @param  id  String value for id.
     * @param  employeeId  String value for employeeId.
     * @param  locationId  String value for locationId.
     * @param  timezone  String value for timezone.
     * @param  endAt  String value for endAt.
     * @param  wage  ShiftWage value for wage.
     * @param  breaks  List of Break value for breaks.
     * @param  status  String value for status.
     * @param  version  Integer value for version.
     * @param  createdAt  String value for createdAt.
     * @param  updatedAt  String value for updatedAt.
     * @param  teamMemberId  String value for teamMemberId.
     */
    @JsonCreator
    public Shift(
            @JsonProperty("start_at") String startAt,
            @JsonProperty("id") String id,
            @JsonProperty("employee_id") String employeeId,
            @JsonProperty("location_id") String locationId,
            @JsonProperty("timezone") String timezone,
            @JsonProperty("end_at") String endAt,
            @JsonProperty("wage") ShiftWage wage,
            @JsonProperty("breaks") List<Break> breaks,
            @JsonProperty("status") String status,
            @JsonProperty("version") Integer version,
            @JsonProperty("created_at") String createdAt,
            @JsonProperty("updated_at") String updatedAt,
            @JsonProperty("team_member_id") String teamMemberId) {
        this.id = id;
        this.employeeId = employeeId;
        this.locationId = locationId;
        this.timezone = timezone;
        this.startAt = startAt;
        this.endAt = endAt;
        this.wage = wage;
        this.breaks = breaks;
        this.status = status;
        this.version = version;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.teamMemberId = teamMemberId;
    }

    /**
     * Getter for Id.
     * UUID for this object
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Getter for EmployeeId.
     * The ID of the employee this shift belongs to. DEPRECATED at version 2020-08-26. Use
     * `team_member_id` instead
     * @return Returns the String
     */
    @JsonGetter("employee_id")
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * Getter for LocationId.
     * The ID of the location this shift occurred at. Should be based on where the employee clocked
     * in.
     * @return Returns the String
     */
    @JsonGetter("location_id")
    public String getLocationId() {
        return locationId;
    }

    /**
     * Getter for Timezone.
     * Read-only convenience value that is calculated from the location based on `location_id`.
     * Format: the IANA Timezone Database identifier for the location timezone.
     * @return Returns the String
     */
    @JsonGetter("timezone")
    public String getTimezone() {
        return timezone;
    }

    /**
     * Getter for StartAt.
     * RFC 3339; shifted to location timezone + offset. Precision up to the minute is respected;
     * seconds are truncated.
     * @return Returns the String
     */
    @JsonGetter("start_at")
    public String getStartAt() {
        return startAt;
    }

    /**
     * Getter for EndAt.
     * RFC 3339; shifted to timezone + offset. Precision up to the minute is respected; seconds are
     * truncated.
     * @return Returns the String
     */
    @JsonGetter("end_at")
    public String getEndAt() {
        return endAt;
    }

    /**
     * Getter for Wage.
     * The hourly wage rate used to compensate an employee for this shift.
     * @return Returns the ShiftWage
     */
    @JsonGetter("wage")
    public ShiftWage getWage() {
        return wage;
    }

    /**
     * Getter for Breaks.
     * A list of any paid or unpaid breaks that were taken during this shift.
     * @return Returns the List of Break
     */
    @JsonGetter("breaks")
    public List<Break> getBreaks() {
        return breaks;
    }

    /**
     * Getter for Status.
     * Enumerates the possible status of a `Shift`
     * @return Returns the String
     */
    @JsonGetter("status")
    public String getStatus() {
        return status;
    }

    /**
     * Getter for Version.
     * Used for resolving concurrency issues; request will fail if version provided does not match
     * server version at time of request. If not provided, Square executes a blind write;
     * potentially overwriting data from another write.
     * @return Returns the Integer
     */
    @JsonGetter("version")
    public Integer getVersion() {
        return version;
    }

    /**
     * Getter for CreatedAt.
     * A read-only timestamp in RFC 3339 format; presented in UTC.
     * @return Returns the String
     */
    @JsonGetter("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * A read-only timestamp in RFC 3339 format; presented in UTC.
     * @return Returns the String
     */
    @JsonGetter("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Getter for TeamMemberId.
     * The ID of the team member this shift belongs to. Replaced `employee_id` at version
     * "2020-08-26"
     * @return Returns the String
     */
    @JsonGetter("team_member_id")
    public String getTeamMemberId() {
        return teamMemberId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, employeeId, locationId, timezone, startAt, endAt, wage, breaks,
                status, version, createdAt, updatedAt, teamMemberId);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Shift)) {
            return false;
        }
        Shift other = (Shift) obj;
        return Objects.equals(id, other.id)
            && Objects.equals(employeeId, other.employeeId)
            && Objects.equals(locationId, other.locationId)
            && Objects.equals(timezone, other.timezone)
            && Objects.equals(startAt, other.startAt)
            && Objects.equals(endAt, other.endAt)
            && Objects.equals(wage, other.wage)
            && Objects.equals(breaks, other.breaks)
            && Objects.equals(status, other.status)
            && Objects.equals(version, other.version)
            && Objects.equals(createdAt, other.createdAt)
            && Objects.equals(updatedAt, other.updatedAt)
            && Objects.equals(teamMemberId, other.teamMemberId);
    }

    /**
     * Converts this Shift into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Shift [" + "startAt=" + startAt + ", id=" + id + ", employeeId=" + employeeId
                + ", locationId=" + locationId + ", timezone=" + timezone + ", endAt=" + endAt
                + ", wage=" + wage + ", breaks=" + breaks + ", status=" + status + ", version="
                + version + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
                + ", teamMemberId=" + teamMemberId + "]";
    }

    /**
     * Builds a new {@link Shift.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Shift.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(startAt)
                .id(getId())
                .employeeId(getEmployeeId())
                .locationId(getLocationId())
                .timezone(getTimezone())
                .endAt(getEndAt())
                .wage(getWage())
                .breaks(getBreaks())
                .status(getStatus())
                .version(getVersion())
                .createdAt(getCreatedAt())
                .updatedAt(getUpdatedAt())
                .teamMemberId(getTeamMemberId());
        return builder;
    }

    /**
     * Class to build instances of {@link Shift}.
     */
    public static class Builder {
        private String startAt;
        private String id;
        private String employeeId;
        private String locationId;
        private String timezone;
        private String endAt;
        private ShiftWage wage;
        private List<Break> breaks;
        private String status;
        private Integer version;
        private String createdAt;
        private String updatedAt;
        private String teamMemberId;

        /**
         * Initialization constructor.
         * @param  startAt  String value for startAt.
         */
        public Builder(String startAt) {
            this.startAt = startAt;
        }

        /**
         * Setter for startAt.
         * @param  startAt  String value for startAt.
         * @return Builder
         */
        public Builder startAt(String startAt) {
            this.startAt = startAt;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for employeeId.
         * @param  employeeId  String value for employeeId.
         * @return Builder
         */
        public Builder employeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }

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
         * Setter for timezone.
         * @param  timezone  String value for timezone.
         * @return Builder
         */
        public Builder timezone(String timezone) {
            this.timezone = timezone;
            return this;
        }

        /**
         * Setter for endAt.
         * @param  endAt  String value for endAt.
         * @return Builder
         */
        public Builder endAt(String endAt) {
            this.endAt = endAt;
            return this;
        }

        /**
         * Setter for wage.
         * @param  wage  ShiftWage value for wage.
         * @return Builder
         */
        public Builder wage(ShiftWage wage) {
            this.wage = wage;
            return this;
        }

        /**
         * Setter for breaks.
         * @param  breaks  List of Break value for breaks.
         * @return Builder
         */
        public Builder breaks(List<Break> breaks) {
            this.breaks = breaks;
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
         * Setter for version.
         * @param  version  Integer value for version.
         * @return Builder
         */
        public Builder version(Integer version) {
            this.version = version;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  String value for createdAt.
         * @return Builder
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  String value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Setter for teamMemberId.
         * @param  teamMemberId  String value for teamMemberId.
         * @return Builder
         */
        public Builder teamMemberId(String teamMemberId) {
            this.teamMemberId = teamMemberId;
            return this;
        }

        /**
         * Builds a new {@link Shift} object using the set fields.
         * @return {@link Shift}
         */
        public Shift build() {
            return new Shift(startAt, id, employeeId, locationId, timezone, endAt, wage, breaks,
                    status, version, createdAt, updatedAt, teamMemberId);
        }
    }
}
