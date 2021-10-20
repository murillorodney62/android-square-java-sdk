
# Customer Tax Ids

Represents the tax ID associated with a customer profile. The corresponding `tax_ids` field is available only for customers of sellers in France, Ireland, or the United Kingdom.
For more information, see [Customer tax IDs](https://developer.squareup.com/docs/customers-api/what-it-does#customer-tax-ids).

## Structure

`CustomerTaxIds`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `EuVat` | `String` | Optional | The EU VAT identification number for the customer. For example, `IE3426675K`. The ID can contain alphanumeric characters only.<br>**Constraints**: *Maximum Length*: `20` | String getEuVat() |

## Example (as JSON)

```json
{
  "eu_vat": "eu_vat2"
}
```

