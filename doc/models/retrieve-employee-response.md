
# Retrieve Employee Response

## Structure

`RetrieveEmployeeResponse`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `Employee` | [`Employee`](/doc/models/employee.md) | Optional | An employee object that is used by the external API. | Employee getEmployee() |
| `Errors` | [`List<Error>`](/doc/models/error.md) | Optional | Any errors that occurred during the request. | List<Error> getErrors() |

## Example (as JSON)

```json
{
  "employee": {
    "id": "id8",
    "first_name": "first_name8",
    "last_name": "last_name6",
    "email": "email8",
    "phone_number": "phone_number6"
  },
  "errors": [
    {
      "category": "AUTHENTICATION_ERROR",
      "code": "MISSING_PIN",
      "detail": "detail1",
      "field": "field9"
    },
    {
      "category": "INVALID_REQUEST_ERROR",
      "code": "MISSING_ACCOUNT_TYPE",
      "detail": "detail2",
      "field": "field0"
    },
    {
      "category": "RATE_LIMIT_ERROR",
      "code": "INVALID_POSTAL_CODE",
      "detail": "detail3",
      "field": "field1"
    }
  ]
}
```

