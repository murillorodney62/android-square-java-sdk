
# Bulk Retrieve Vendors Request

Represents an input to a call to [BulkRetrieveVendors.](../../doc/api/vendors.md#bulk-retrieve-vendors)

## Structure

`BulkRetrieveVendorsRequest`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `VendorIds` | `List<String>` | Optional | IDs of the [Vendor](../../doc/models/vendor.md) objects to retrieve. | List<String> getVendorIds() |

## Example (as JSON)

```json
{
  "vendor_ids": [
    "INV_V_JDKYHBWT1D4F8MFH63DBMEN8Y4"
  ]
}
```

