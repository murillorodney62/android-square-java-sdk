## Catalog Query

A query to be applied to a `SearchCatalogObjectsRequest`.
Only one query field may be present.

Where an attribute name is required, it should be specified as the name of any field
marked "searchable" from the structured data types for the desired result object type(s)
(`CatalogItem`, `CatalogItemVariation`, `CatalogCategory`, `CatalogTax`,
`CatalogDiscount`, `CatalogModifierList`, `CatalogModifier`).

For example, a query that should return Items may specify attribute names from
any of the searchable fields of the `CatalogItem` data type, namely
`"name"`, `"description"`, and `"abbreviation"`.

### Structure

`CatalogQuery`

### Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `SortedAttributeQuery` | [`CatalogQuerySortedAttribute`](/doc/models/catalog-query-sorted-attribute.md) | Optional | - |
| `ExactQuery` | [`CatalogQueryExact`](/doc/models/catalog-query-exact.md) | Optional | - |
| `PrefixQuery` | [`CatalogQueryPrefix`](/doc/models/catalog-query-prefix.md) | Optional | - |
| `RangeQuery` | [`CatalogQueryRange`](/doc/models/catalog-query-range.md) | Optional | - |
| `TextQuery` | [`CatalogQueryText`](/doc/models/catalog-query-text.md) | Optional | - |
| `ItemsForTaxQuery` | [`CatalogQueryItemsForTax`](/doc/models/catalog-query-items-for-tax.md) | Optional | - |
| `ItemsForModifierListQuery` | [`CatalogQueryItemsForModifierList`](/doc/models/catalog-query-items-for-modifier-list.md) | Optional | - |
| `ItemsForItemOptionsQuery` | [`CatalogQueryItemsForItemOptions`](/doc/models/catalog-query-items-for-item-options.md) | Optional | - |
| `ItemVariationsForItemOptionValuesQuery` | [`CatalogQueryItemVariationsForItemOptionValues`](/doc/models/catalog-query-item-variations-for-item-option-values.md) | Optional | - |

### Example (as JSON)

```json
{
  "sorted_attribute_query": null,
  "exact_query": null,
  "prefix_query": null,
  "range_query": null,
  "text_query": null,
  "items_for_tax_query": null,
  "items_for_modifier_list_query": null,
  "items_for_item_options_query": null,
  "item_variations_for_item_option_values_query": null
}
```

