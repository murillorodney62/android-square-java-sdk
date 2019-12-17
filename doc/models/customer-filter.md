## Customer Filter

Represents a set of `CustomerQuery` filters used to limit the set of
`Customers` returned by SearchCustomers.

### Structure

`CustomerFilter`

### Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `CreationSource` | [`CustomerCreationSourceFilter`](/doc/models/customer-creation-source-filter.md) | Optional | Creation source filter.<br><br>If one or more creation sources are set, customer profiles are included in,<br>or excluded from, the result if they match at least one of the filter<br>criteria. |
| `CreatedAt` | [`TimeRange`](/doc/models/time-range.md) | Optional | Represents a generic time range. The start and end values are<br>represented in RFC-3339 format. Time ranges are customized to be<br>inclusive or exclusive based on the needs of a particular endpoint.<br>Refer to the relevent endpoint-specific documentation to determine<br>how time ranges are handled. |
| `UpdatedAt` | [`TimeRange`](/doc/models/time-range.md) | Optional | Represents a generic time range. The start and end values are<br>represented in RFC-3339 format. Time ranges are customized to be<br>inclusive or exclusive based on the needs of a particular endpoint.<br>Refer to the relevent endpoint-specific documentation to determine<br>how time ranges are handled. |

### Example (as JSON)

```json
{
  "creation_source": null,
  "created_at": null,
  "updated_at": null
}
```

