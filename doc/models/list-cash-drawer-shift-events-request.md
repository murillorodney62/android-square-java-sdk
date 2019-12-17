## List Cash Drawer Shift Events Request

### Structure

`ListCashDrawerShiftEventsRequest`

### Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `LocationId` | `String` |  | The ID of the location to list cash drawer shifts for. |
| `Limit` | `Integer` | Optional | Number of resources to be returned in a page of results (200 by<br>default, 1000 max). |
| `Cursor` | `String` | Optional | Opaque cursor for fetching the next page of results. |

### Example (as JSON)

```json
{
  "location_id": "location_id4",
  "limit": null,
  "cursor": null
}
```

