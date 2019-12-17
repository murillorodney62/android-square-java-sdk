## Catalog Id Mapping

A mapping between a client-supplied temporary ID and a permanent server ID.

### Structure

`CatalogIdMapping`

### Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `ClientObjectId` | `String` | Optional | The client-supplied, temporary `#`-prefixed ID for a new `CatalogObject`. |
| `ObjectId` | `String` | Optional | The permanent ID for the CatalogObject created by the server. |

### Example (as JSON)

```json
{
  "client_object_id": null,
  "object_id": null
}
```

