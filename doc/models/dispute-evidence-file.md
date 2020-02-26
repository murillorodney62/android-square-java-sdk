## Dispute Evidence File

A file to be uploaded as dispute evidence.

### Structure

`DisputeEvidenceFile`

### Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Filename` | `String` | Optional | The file name including the file extension. For example: "receipt.tiff". |
| `Filetype` | `String` | Optional | Dispute evidence files must one of application/pdf, image/heic, image/heif, image/jpeg, image/png, image/tiff formats. |

### Example (as JSON)

```json
{
  "filename": null,
  "filetype": null
}
```

