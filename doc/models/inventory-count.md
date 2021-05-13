
# Inventory Count

Represents Square-estimated quantity of items in a particular state at a
particular seller location based on the known history of physical counts and
inventory adjustments.

## Structure

`InventoryCount`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `CatalogObjectId` | `String` | Optional | The Square-generated ID of the<br>[CatalogObject](/doc/models/catalog-object.md) being tracked.<br>**Constraints**: *Maximum Length*: `100` | String getCatalogObjectId() |
| `CatalogObjectType` | `String` | Optional | The [type](/doc/models/catalog-object-type.md) of the<br>[CatalogObject](/doc/models/catalog-object.md) being tracked. Tracking is only<br>supported for the `ITEM_VARIATION` type.<br>**Constraints**: *Maximum Length*: `14` | String getCatalogObjectType() |
| `State` | [`String`](/doc/models/inventory-state.md) | Optional | Indicates the state of a tracked item quantity in the lifecycle of goods. | String getState() |
| `LocationId` | `String` | Optional | The Square-generated ID of the [Location](/doc/models/location.md) where the related<br>quantity of items is being tracked.<br>**Constraints**: *Maximum Length*: `100` | String getLocationId() |
| `Quantity` | `String` | Optional | The number of items affected by the estimated count as a decimal string.<br>Can support up to 5 digits after the decimal point.<br>**Constraints**: *Maximum Length*: `26` | String getQuantity() |
| `CalculatedAt` | `String` | Optional | An RFC 3339-formatted timestamp that indicates when the most recent physical count or adjustment affecting<br>the estimated count is received.<br>**Constraints**: *Maximum Length*: `34` | String getCalculatedAt() |

## Example (as JSON)

```json
{
  "catalog_object_id": "catalog_object_id6",
  "catalog_object_type": "catalog_object_type6",
  "state": "IN_TRANSIT_TO",
  "location_id": "location_id4",
  "quantity": "quantity6"
}
```

