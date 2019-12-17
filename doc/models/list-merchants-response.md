## List Merchants Response

The response object returned by the [ListMerchant](#endpoint-listmerchant) endpoint.

### Structure

`ListMerchantsResponse`

### Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Errors` | [`List<Error>`](/doc/models/error.md) | Optional | Information on errors encountered during the request. |
| `Merchant` | [`List<Merchant>`](/doc/models/merchant.md) | Optional | The requested `Merchant` entities. |
| `Cursor` | `Integer` | Optional | If the  response is truncated, the cursor to use in next  request to fetch next set of objects. |

### Example (as JSON)

```json
{
  "merchants": [
    {
      "id": "DM7VKY8Q63GNP",
      "business_name": "Apple A Day",
      "country": "US",
      "language_code": "en-US",
      "currency": "USD",
      "status": "ACTIVE"
    }
  ]
}
```

