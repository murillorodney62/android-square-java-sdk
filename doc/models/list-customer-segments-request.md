## List Customer Segments Request

Defines the valid parameters for requests to __ListCustomerSegments__.

### Structure

`ListCustomerSegmentsRequest`

### Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Cursor` | `String` | Optional | A pagination cursor returned by previous calls to __ListCustomerSegments__.<br>Used to retrieve the next set of query results.<br><br>See the [Pagination guide](https://developer.squareup.com/docs/docs/working-with-apis/pagination) for more information. |
| `Limit` | `Long` | Optional | Sets the maximum number of results to be returned in a single page.<br>Limit values outside the supported range are ignored.<br><br>Minimum value: `1`<br>Maximum value: `1,000` |

### Example (as JSON)

```json
{}
```

