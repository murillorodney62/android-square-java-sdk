
# List Payouts Request

A request to retrieve payout records.

## Structure

`ListPayoutsRequest`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `LocationId` | `String` | Optional | The ID of the location for which to list the payouts.<br>By default, payouts are returned for the default (main) location associated with the seller.<br>**Constraints**: *Maximum Length*: `255` | String getLocationId() |
| `Status` | [`String`](../../doc/models/payout-status.md) | Optional | Payout status types | String getStatus() |
| `BeginTime` | `String` | Optional | The timestamp for the beginning of the payout creation time, in RFC 3339 format.<br>Inclusive. Default: The current time minus one year. | String getBeginTime() |
| `EndTime` | `String` | Optional | The timestamp for the end of the payout creation time, in RFC 3339 format.<br>Default: The current time. | String getEndTime() |
| `SortOrder` | [`String`](../../doc/models/sort-order.md) | Optional | The order (e.g., chronological or alphabetical) in which results from a request are returned. | String getSortOrder() |
| `Cursor` | `String` | Optional | A pagination cursor returned by a previous call to this endpoint.<br>Provide this cursor to retrieve the next set of results for the original query.<br>For more information, see [Pagination](https://developer.squareup.com/docs/basics/api101/pagination).<br>If request parameters change between requests, subsequent results may contain duplicates or missing records. | String getCursor() |
| `Limit` | `Integer` | Optional | The maximum number of results to be returned in a single page.<br>It is possible to receive fewer results than the specified limit on a given page.<br>The default value of 100 is also the maximum allowed value. If the provided value is<br>greater than 100, it is ignored and the default value is used instead.<br>Default: `100` | Integer getLimit() |

## Example (as JSON)

```json
{}
```

