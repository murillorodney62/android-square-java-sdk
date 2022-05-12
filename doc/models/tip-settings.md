
# Tip Settings

## Structure

`TipSettings`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `AllowTipping` | `Boolean` | Optional | Indicates whether tipping is enabled for this checkout. Defaults to false. | Boolean getAllowTipping() |
| `SeparateTipScreen` | `Boolean` | Optional | Indicates whether tip options should be presented on the screen before presenting<br>the signature screen during card payment. Defaults to false. | Boolean getSeparateTipScreen() |
| `CustomTipField` | `Boolean` | Optional | Indicates whether custom tip amounts are allowed during the checkout flow. Defaults to false. | Boolean getCustomTipField() |
| `TipPercentages` | `List<Integer>` | Optional | A list of tip percentages that should be presented during the checkout flow, specified as<br>up to 3 non-negative integers from 0 to 100 (inclusive). Defaults to 15, 20, and 25. | List<Integer> getTipPercentages() |
| `SmartTipping` | `Boolean` | Optional | Enables the "Smart Tip Amounts" behavior.<br>Exact tipping options depend on the region in which the Square seller is active.<br><br>For payments under 10.00, in the Australia, Canada, Ireland, United Kingdom, and United States, tipping options are presented as no tip, .50, 1.00 or 2.00.<br><br>For payment amounts of 10.00 or greater, tipping options are presented as the following percentages: 0%, 5%, 10%, 15%.<br><br>If set to true, the `tip_percentages` settings is ignored.<br>Defaults to false.<br><br>To learn more about smart tipping, see [Accept Tips with the Square App](https://squareup.com/help/us/en/article/5069-accept-tips-with-the-square-app). | Boolean getSmartTipping() |

## Example (as JSON)

```json
{
  "allow_tipping": null,
  "separate_tip_screen": null,
  "custom_tip_field": null,
  "tip_percentages": null,
  "smart_tipping": null
}
```

