## List Payments Request

Retrieves a list of refunds taken by the account making the request.

Max results per page: 100

### Structure

`ListPaymentsRequest`

### Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `BeginTime` | `String` | Optional | Timestamp for the beginning of the reporting period, in RFC 3339 format.<br>Inclusive. Default: The current time minus one year. |
| `EndTime` | `String` | Optional | Timestamp for the end of the requested reporting period, in RFC 3339 format.<br><br>Default: The current time. |
| `SortOrder` | `String` | Optional | The order in which results are listed.<br>- `ASC` - oldest to newest<br>- `DESC` - newest to oldest (default). |
| `Cursor` | `String` | Optional | A pagination cursor returned by a previous call to this endpoint.<br>Provide this to retrieve the next set of results for the original query.<br><br>See [Pagination](https://developer.squareup.com/docs/basics/api101/pagination) for more information. |
| `LocationId` | `String` | Optional | ID of location associated with payment |
| `Total` | `Long` | Optional | The exact amount in the total_money for a `Payment`. |
| `Last4` | `String` | Optional | The last 4 digits of `Payment` card. |
| `CardBrand` | `String` | Optional | The brand of `Payment` card. For example, `VISA` |

### Example (as JSON)

```json
{}
```

