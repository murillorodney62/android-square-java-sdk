
# Business Appointment Settings

The service appointment settings, including where and how the service is provided.

## Structure

`BusinessAppointmentSettings`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `LocationTypes` | [`List<String>`](/doc/models/business-appointment-settings-booking-location-type.md) | Optional | Types of the location allowed for bookings.<br>See [BusinessAppointmentSettingsBookingLocationType](#type-businessappointmentsettingsbookinglocationtype) for possible values | List<String> getLocationTypes() |
| `AlignmentTime` | [`String`](/doc/models/business-appointment-settings-alignment-time.md) | Optional | Time units of a service duration for bookings. | String getAlignmentTime() |
| `MinBookingLeadTimeSeconds` | `Integer` | Optional | The minimum lead time in seconds before a service can be booked. Bookings must be created at least this far ahead of the booking's starting time. | Integer getMinBookingLeadTimeSeconds() |
| `MaxBookingLeadTimeSeconds` | `Integer` | Optional | The maximum lead time in seconds before a service can be booked. Bookings must be created at most this far ahead of the booking's starting time. | Integer getMaxBookingLeadTimeSeconds() |
| `AnyTeamMemberBookingEnabled` | `Boolean` | Optional | Indicates whether a customer can choose from all available time slots and have a staff member assigned<br>automatically (`true`) or not (`false`). | Boolean getAnyTeamMemberBookingEnabled() |
| `MultipleServiceBookingEnabled` | `Boolean` | Optional | Indicates whether a customer can book multiple services in a single online booking. | Boolean getMultipleServiceBookingEnabled() |
| `MaxAppointmentsPerDayLimitType` | [`String`](/doc/models/business-appointment-settings-max-appointments-per-day-limit-type.md) | Optional | Types of daily appointment limits. | String getMaxAppointmentsPerDayLimitType() |
| `MaxAppointmentsPerDayLimit` | `Integer` | Optional | The maximum number of daily appointments per team member or per location. | Integer getMaxAppointmentsPerDayLimit() |
| `CancellationWindowSeconds` | `Integer` | Optional | The cut-off time in seconds for allowing clients to cancel or reschedule an appointment. | Integer getCancellationWindowSeconds() |
| `CancellationFeeMoney` | [`Money`](/doc/models/money.md) | Optional | Represents an amount of money. `Money` fields can be signed or unsigned.<br>Fields that do not explicitly define whether they are signed or unsigned are<br>considered unsigned and can only hold positive amounts. For signed fields, the<br>sign of the value indicates the purpose of the money transfer. See<br>[Working with Monetary Amounts](https://developer.squareup.com/docs/build-basics/working-with-monetary-amounts)<br>for more information. | Money getCancellationFeeMoney() |
| `CancellationPolicy` | [`String`](/doc/models/business-appointment-settings-cancellation-policy.md) | Optional | The category of the seller’s cancellation policy. | String getCancellationPolicy() |
| `CancellationPolicyText` | `String` | Optional | The free-form text of the seller's cancellation policy. | String getCancellationPolicyText() |
| `SkipBookingFlowStaffSelection` | `Boolean` | Optional | Indicates whether customers has an assigned staff member (`true`) or can select s staff member of their choice (`false`). | Boolean getSkipBookingFlowStaffSelection() |

## Example (as JSON)

```json
{
  "location_types": [
    "BUSINESS_LOCATION",
    "CUSTOMER_LOCATION"
  ],
  "alignment_time": "HALF_HOURLY",
  "min_booking_lead_time_seconds": 38,
  "max_booking_lead_time_seconds": 48,
  "any_team_member_booking_enabled": false
}
```

