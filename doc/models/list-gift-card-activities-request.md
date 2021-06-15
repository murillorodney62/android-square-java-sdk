
# List Gift Card Activities Request

Returns a list of gift card activities. You can optionally specify a filter to retrieve a
subset of activites.

## Structure

`ListGiftCardActivitiesRequest`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `GiftCardId` | `String` | Optional | If you provide a gift card ID, the endpoint returns activities that belong<br>to the specified gift card. Otherwise, the endpoint returns all gift card activities for<br>the seller.<br>**Constraints**: *Maximum Length*: `50` | String getGiftCardId() |
| `Type` | `String` | Optional | If you provide a type, the endpoint returns gift card activities of this type.<br>Otherwise, the endpoint returns all types of gift card activities. | String getType() |
| `LocationId` | `String` | Optional | If you provide a location ID, the endpoint returns gift card activities for that location.<br>Otherwise, the endpoint returns gift card activities for all locations. | String getLocationId() |
| `BeginTime` | `String` | Optional | The timestamp for the beginning of the reporting period, in RFC 3339 format.<br>Inclusive. Default: The current time minus one year. | String getBeginTime() |
| `EndTime` | `String` | Optional | The timestamp for the end of the reporting period, in RFC 3339 format.<br>Inclusive. Default: The current time. | String getEndTime() |
| `Limit` | `Integer` | Optional | If you provide a limit value, the endpoint returns the specified number<br>of results (or less) per page. A maximum value is 100. The default value is 50.<br>**Constraints**: `>= 1`, `<= 100` | Integer getLimit() |
| `Cursor` | `String` | Optional | A pagination cursor returned by a previous call to this endpoint.<br>Provide this cursor to retrieve the next set of results for the original query.<br>If you do not provide the cursor, the call returns the first page of the results. | String getCursor() |
| `SortOrder` | `String` | Optional | The order in which the endpoint returns the activities, based on `created_at`.<br><br>- `ASC` - Oldest to newest.<br>- `DESC` - Newest to oldest (default). | String getSortOrder() |

## Example (as JSON)

```json
{}
```

