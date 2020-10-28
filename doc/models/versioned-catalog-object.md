
# Versioned Catalog Object

A reference to a Catalog object at a specific version. In general this is
used as an entry point into a graph of catalog objects, where the objects exist
at a specific version.

## Structure

`VersionedCatalogObject`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `ObjectId` | `String` | Optional | The ID of the referenced object. | String getObjectId() |
| `CatalogVersion` | `Long` | Optional | The version of the object. | Long getCatalogVersion() |

## Example (as JSON)

```json
{
  "object_id": "object_id8",
  "catalog_version": 126
}
```

