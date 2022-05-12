
# List Team Member Booking Profiles Request

## Structure

`ListTeamMemberBookingProfilesRequest`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `BookableOnly` | `Boolean` | Optional | Indicates whether to include only bookable team members in the returned result (`true`) or not (`false`). | Boolean getBookableOnly() |
| `Limit` | `Integer` | Optional | The maximum number of results to return in a paged response.<br>**Constraints**: `>= 1`, `<= 100` | Integer getLimit() |
| `Cursor` | `String` | Optional | The pagination cursor from the preceding response to return the next page of the results. Do not set this when retrieving the first page of the results.<br>**Constraints**: *Maximum Length*: `65536` | String getCursor() |
| `LocationId` | `String` | Optional | Indicates whether to include only team members enabled at the given location in the returned result.<br>**Constraints**: *Maximum Length*: `32` | String getLocationId() |

## Example (as JSON)

```json
{
  "bookable_only": null,
  "limit": null,
  "cursor": null,
  "location_id": null
}
```

