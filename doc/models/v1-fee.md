## V1 Fee

V1Fee

### Structure

`V1Fee`

### Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Id` | `String` | Optional | The fee's unique ID. |
| `Name` | `String` | Optional | The fee's name. |
| `Rate` | `String` | Optional | The rate of the fee, as a string representation of a decimal number. A value of 0.07 corresponds to a rate of 7%. |
| `CalculationPhase` | [`String`](/doc/models/v1-fee-calculation-phase.md) | Optional | - |
| `AdjustmentType` | [`String`](/doc/models/v1-fee-adjustment-type.md) | Optional | - |
| `AppliesToCustomAmounts` | `Boolean` | Optional | If true, the fee applies to custom amounts entered into Square Point of Sale that are not associated with a particular item. |
| `Enabled` | `Boolean` | Optional | If true, the fee is applied to all appropriate items. If false, the fee is not applied at all. |
| `InclusionType` | [`String`](/doc/models/v1-fee-inclusion-type.md) | Optional | - |
| `Type` | [`String`](/doc/models/v1-fee-type.md) | Optional | - |
| `V2Id` | `String` | Optional | The ID of the CatalogObject in the Connect v2 API. Objects that are shared across multiple locations share the same v2 ID. |

### Example (as JSON)

```json
{
  "id": null,
  "name": null,
  "rate": null,
  "calculation_phase": null,
  "adjustment_type": null,
  "applies_to_custom_amounts": null,
  "enabled": null,
  "inclusion_type": null,
  "type": null,
  "v2_id": null
}
```

