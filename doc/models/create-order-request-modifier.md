## Create Order Request Modifier

__Deprecated__: Please use the [OrderLineItemModifier](#type-orderlineitemmodifier) type
instead.

Represents a modifier applied to a single line item.

Modifiers can reference existing objects in a merchant catalog or be constructed ad hoc at the time of purchase by providing a name and price.

### Structure

`CreateOrderRequestModifier`

### Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `CatalogObjectId` | `String` | Optional | The catalog object ID of a [CatalogModifier](#type-catalogmodifier). |
| `Name` | `String` | Optional | Only used for ad hoc modifiers. The name of the modifier. `name` cannot exceed 255 characters.<br><br>Do not provide a value for `name` if you provide a value for `catalog_object_id`. |
| `BasePriceMoney` | [`Money`](/doc/models/money.md) | Optional | Represents an amount of money. `Money` fields can be signed or unsigned.<br>Fields that do not explicitly define whether they are signed or unsigned are<br>considered unsigned and can only hold positive amounts. For signed fields, the<br>sign of the value indicates the purpose of the money transfer. See<br>[Working with Monetary Amounts](https://developer.squareup.com/docs/build-basics/working-with-monetary-amounts)<br>for more information. |

### Example (as JSON)

```json
{
  "catalog_object_id": null,
  "name": null,
  "base_price_money": null
}
```

