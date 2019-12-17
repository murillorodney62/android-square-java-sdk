## Error

Represents an error encountered during a request to the Connect API.

See [Handling errors](#handlingerrors) for more information.

### Structure

`Error`

### Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Category` | [`String`](/doc/models/error-category.md) |  | Indicates which high-level category of error has occurred during a<br>request to the Connect API. |
| `Code` | [`String`](/doc/models/error-code.md) |  | Indicates the specific error that occurred during a request to a<br>Square API. |
| `Detail` | `String` | Optional | A human-readable description of the error for debugging purposes. |
| `Field` | `String` | Optional | The name of the field provided in the original request (if any) that<br>the error pertains to. |

### Example (as JSON)

```json
{
  "category": "INVALID_REQUEST_ERROR",
  "code": "VALUE_TOO_LOW",
  "detail": null,
  "field": null
}
```

