## Catalog Tax

A tax in the Catalog object model.

### Structure

`CatalogTax`

### Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Name` | `String` | Optional | The tax's name. Searchable. This field has max length of 255 Unicode code points. |
| `CalculationPhase` | [`String`](/doc/models/tax-calculation-phase.md) | Optional | When to calculate the taxes due on a cart. |
| `InclusionType` | [`String`](/doc/models/tax-inclusion-type.md) | Optional | Whether to the tax amount should be additional to or included in the CatalogItem price. |
| `Percentage` | `String` | Optional | The percentage of the tax in decimal form, using a `'.'` as the decimal separator and without a `'%'` sign.<br>A value of `7.5` corresponds to 7.5%. |
| `AppliesToCustomAmounts` | `Boolean` | Optional | If `true`, the fee applies to custom amounts entered into the Square Point of Sale<br>app that are not associated with a particular `CatalogItem`. |
| `Enabled` | `Boolean` | Optional | If `true`, the tax will be shown as enabled in the Square Point of Sale app. |

### Example (as JSON)

```json
{
  "object": {
    "type": "TAX",
    "id": "#SalesTax",
    "present_at_all_locations": true,
    "tax_data": {
      "name": "Sales Tax",
      "calculation_phase": "TAX_SUBTOTAL_PHASE",
      "inclusion_type": "ADDITIVE",
      "percentage": "5.0",
      "fee_applies_to_custom_amounts": true,
      "enabled": true
    }
  }
}
```

