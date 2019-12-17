## Catalog Info Response Limits

### Structure

`CatalogInfoResponseLimits`

### Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `BatchUpsertMaxObjectsPerBatch` | `Integer` | Optional | The maximum number of objects that may appear within a single batch in a<br>`/v2/catalog/batch-upsert` request. |
| `BatchUpsertMaxTotalObjects` | `Integer` | Optional | The maximum number of objects that may appear across all batches in a<br>`/v2/catalog/batch-upsert` request. |
| `BatchRetrieveMaxObjectIds` | `Integer` | Optional | The maximum number of object IDs that may appear in a `/v2/catalog/batch-retrieve`<br>request. |
| `SearchMaxPageLimit` | `Integer` | Optional | The maximum number of results that may be returned in a page of a<br>`/v2/catalog/search` response. |
| `BatchDeleteMaxObjectIds` | `Integer` | Optional | The maximum number of object IDs that may be included in a single<br>`/v2/catalog/batch-delete` request. |
| `UpdateItemTaxesMaxItemIds` | `Integer` | Optional | The maximum number of item IDs that may be included in a single<br>`/v2/catalog/update-item-taxes` request. |
| `UpdateItemTaxesMaxTaxesToEnable` | `Integer` | Optional | The maximum number of tax IDs to be enabled that may be included in a single<br>`/v2/catalog/update-item-taxes` request. |
| `UpdateItemTaxesMaxTaxesToDisable` | `Integer` | Optional | The maximum number of tax IDs to be disabled that may be included in a single<br>`/v2/catalog/update-item-taxes` request. |
| `UpdateItemModifierListsMaxItemIds` | `Integer` | Optional | The maximum number of item IDs that may be included in a single<br>`/v2/catalog/update-item-modifier-lists` request. |
| `UpdateItemModifierListsMaxModifierListsToEnable` | `Integer` | Optional | The maximum number of modifier list IDs to be enabled that may be included in<br>a single `/v2/catalog/update-item-modifier-lists` request. |
| `UpdateItemModifierListsMaxModifierListsToDisable` | `Integer` | Optional | The maximum number of modifier list IDs to be disabled that may be included in<br>a single `/v2/catalog/update-item-modifier-lists` request. |

### Example (as JSON)

```json
{
  "batch_upsert_max_objects_per_batch": null,
  "batch_upsert_max_total_objects": null,
  "batch_retrieve_max_object_ids": null,
  "search_max_page_limit": null,
  "batch_delete_max_object_ids": null,
  "update_item_taxes_max_item_ids": null,
  "update_item_taxes_max_taxes_to_enable": null,
  "update_item_taxes_max_taxes_to_disable": null,
  "update_item_modifier_lists_max_item_ids": null,
  "update_item_modifier_lists_max_modifier_lists_to_enable": null,
  "update_item_modifier_lists_max_modifier_lists_to_disable": null
}
```

