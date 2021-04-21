
# Inventory Count

Represents Square's estimated quantity of items in a particular state at a
particular location based on the known history of physical counts and
inventory adjustments.

## Structure

`InventoryCount`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `CatalogObjectId` | `String` | Optional | The Square generated ID of the<br>`CatalogObject` being tracked.<br>**Constraints**: *Maximum Length*: `100` | String getCatalogObjectId() |
| `CatalogObjectType` | `String` | Optional | The `CatalogObjectType` of the<br>`CatalogObject` being tracked. Tracking is only<br>supported for the `ITEM_VARIATION` type.<br>**Constraints**: *Maximum Length*: `14` | String getCatalogObjectType() |
| `State` | [`String`](/doc/models/inventory-state.md) | Optional | Indicates the state of a tracked item quantity in the lifecycle of goods. | String getState() |
| `LocationId` | `String` | Optional | The Square ID of the [Location](/doc/models/location.md) where the related<br>quantity of items are being tracked.<br>**Constraints**: *Maximum Length*: `100` | String getLocationId() |
| `Quantity` | `String` | Optional | The number of items affected by the estimated count as a decimal string.<br>Can support up to 5 digits after the decimal point.<br>**Constraints**: *Maximum Length*: `26` | String getQuantity() |
| `CalculatedAt` | `String` | Optional | A read-only timestamp in RFC 3339 format that indicates when Square<br>received the most recent physical count or adjustment that had an affect<br>on the estimated count.<br>**Constraints**: *Maximum Length*: `34` | String getCalculatedAt() |

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

