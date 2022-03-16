
# List Cards Request

Retrieves details for a specific Card. Accessible via
HTTP requests at GET https://connect.squareup.com/v2/cards

## Structure

`ListCardsRequest`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `Cursor` | `String` | Optional | A pagination cursor returned by a previous call to this endpoint.<br>Provide this to retrieve the next set of results for your original query.<br><br>See [Pagination](https://developer.squareup.com/docs/basics/api101/pagination) for more information.<br>**Constraints**: *Maximum Length*: `256` | String getCursor() |
| `CustomerId` | `String` | Optional | Limit results to cards associated with the customer supplied.<br>By default, all cards owned by the merchant are returned. | String getCustomerId() |
| `IncludeDisabled` | `Boolean` | Optional | Includes disabled cards.<br>By default, all enabled cards owned by the merchant are returned. | Boolean getIncludeDisabled() |
| `ReferenceId` | `String` | Optional | Limit results to cards associated with the reference_id supplied. | String getReferenceId() |
| `SortOrder` | [`String`](../../doc/models/sort-order.md) | Optional | The order (e.g., chronological or alphabetical) in which results from a request are returned. | String getSortOrder() |

## Example (as JSON)

```json
{}
```

