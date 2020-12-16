
# Retrieve Dispute Response

Defines fields in a `RetrieveDispute` response.

## Structure

`RetrieveDisputeResponse`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `Errors` | [`List<Error>`](/doc/models/error.md) | Optional | Information about errors encountered during the request. | List<Error> getErrors() |
| `Dispute` | [`Dispute`](/doc/models/dispute.md) | Optional | Represents a dispute a cardholder initiated with their bank. | Dispute getDispute() |

## Example (as JSON)

```json
{
  "errors": [
    {
      "category": "AUTHENTICATION_ERROR",
      "code": "VALUE_TOO_SHORT",
      "detail": "detail1",
      "field": "field9"
    },
    {
      "category": "INVALID_REQUEST_ERROR",
      "code": "VALUE_TOO_LONG",
      "detail": "detail2",
      "field": "field0"
    },
    {
      "category": "RATE_LIMIT_ERROR",
      "code": "VALUE_TOO_LOW",
      "detail": "detail3",
      "field": "field1"
    }
  ],
  "dispute": {
    "dispute_id": "dispute_id8",
    "amount_money": {
      "amount": 40,
      "currency": "BWP"
    },
    "reason": "CANCELLED",
    "state": "INQUIRY_PROCESSING",
    "due_at": "due_at4"
  }
}
```

