## Create Checkout Response

Defines the fields that are included in the response body of
a request to the [CreateCheckout](#endpoint-createcheckout) endpoint.

### Structure

`CreateCheckoutResponse`

### Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Checkout` | [`Checkout`](/doc/models/checkout.md) | Optional | Square Checkout lets merchants accept online payments for supported<br>payment types using a checkout workflow hosted on squareup.com. |
| `Errors` | [`List<Error>`](/doc/models/error.md) | Optional | Any errors that occurred during the request. |

### Example (as JSON)

```json
{
  "checkout": {
    "id": "CAISEHGimXh-C3RIT4og1a6u1qw",
    "checkout_page_url": "https://connect.squareup.com/v2/checkout?c=CAISEHGimXh-C3RIT4og1a6u1qw&l=CYTKRM7R7JMV8",
    "ask_for_shipping_address": true,
    "merchant_support_email": "merchant+support@website.com",
    "pre_populate_buyer_email": "example@email.com",
    "pre_populate_shipping_address": {
      "address_line_1": "1455 Market St.",
      "address_line_2": "Suite 600",
      "locality": "San Francisco",
      "administrative_district_level_1": "CA",
      "postal_code": "94103",
      "country": "US",
      "first_name": "Jane",
      "last_name": "Doe"
    },
    "redirect_url": "https://merchant.website.com/order-confirm",
    "order": {
      "location_id": "CYTKRM7R7JMV8",
      "reference_id": "reference_id",
      "line_items": [
        {
          "name": "Printed T Shirt",
          "quantity": "2",
          "taxes": [
            {
              "name": "Sales Tax",
              "type": "ADDITIVE",
              "percentage": "8.5",
              "applied_money": {
                "amount": 103,
                "currency": "USD"
              }
            }
          ],
          "discounts": [
            {
              "name": "7% off previous season item",
              "type": "FIXED_PERCENTAGE",
              "percentage": "7",
              "applied_money": {
                "amount": 210,
                "currency": "USD"
              },
              "scope": "LINE_ITEM"
            },
            {
              "name": "Father's day 12% OFF",
              "type": "FIXED_PERCENTAGE",
              "percentage": "12",
              "applied_money": {
                "amount": 335,
                "currency": "USD"
              },
              "scope": "ORDER"
            },
            {
              "name": "$3 off Customer Discount",
              "type": "FIXED_AMOUNT",
              "amount_money": {
                "amount": 300,
                "currency": "USD"
              },
              "applied_money": {
                "amount": 300,
                "currency": "USD"
              },
              "scope": "LINE_ITEM"
            },
            {
              "name": "Global Sales $55 OFF",
              "type": "FIXED_AMOUNT",
              "amount_money": {
                "amount": 5500,
                "currency": "USD"
              },
              "applied_money": {
                "amount": 949,
                "currency": "USD"
              },
              "scope": "ORDER"
            }
          ],
          "base_price_money": {
            "amount": 1500,
            "currency": "USD"
          },
          "total_tax_money": {
            "amount": 103,
            "currency": "USD"
          },
          "total_discount_money": {
            "amount": 1794,
            "currency": "USD"
          },
          "total_money": {
            "amount": 1309,
            "currency": "USD"
          }
        },
        {
          "name": "Slim Jeans",
          "quantity": "1",
          "taxes": [
            {
              "name": "Sales Tax",
              "type": "ADDITIVE",
              "percentage": "8.5",
              "applied_money": {
                "amount": 105,
                "currency": "USD"
              }
            }
          ],
          "discounts": [
            {
              "name": "Father's day 12% OFF",
              "type": "FIXED_PERCENTAGE",
              "percentage": "12",
              "applied_money": {
                "amount": 300,
                "currency": "USD"
              },
              "scope": "ORDER"
            },
            {
              "name": "Global Sales $55 OFF",
              "type": "FIXED_AMOUNT",
              "amount_money": {
                "amount": 5500,
                "currency": "USD"
              },
              "applied_money": {
                "amount": 968,
                "currency": "USD"
              },
              "scope": "ORDER"
            }
          ],
          "base_price_money": {
            "amount": 2500,
            "currency": "USD"
          },
          "total_tax_money": {
            "amount": 105,
            "currency": "USD"
          },
          "total_discount_money": {
            "amount": 1268,
            "currency": "USD"
          },
          "total_money": {
            "amount": 1337,
            "currency": "USD"
          }
        },
        {
          "name": "Wooven Sweater",
          "quantity": "3",
          "taxes": [
            {
              "name": "Fair Trade Tax",
              "type": "ADDITIVE",
              "percentage": "5",
              "applied_money": {
                "amount": 228,
                "currency": "USD"
              }
            },
            {
              "name": "Sales Tax",
              "type": "ADDITIVE",
              "percentage": "8.5",
              "applied_money": {
                "amount": 387,
                "currency": "USD"
              }
            }
          ],
          "discounts": [
            {
              "name": "Father's day 12% OFF",
              "type": "FIXED_PERCENTAGE",
              "percentage": "12",
              "applied_money": {
                "amount": 1260,
                "currency": "USD"
              },
              "scope": "ORDER"
            },
            {
              "name": "$11 off Customer Discount",
              "type": "FIXED_AMOUNT",
              "amount_money": {
                "amount": 1100,
                "currency": "USD"
              },
              "applied_money": {
                "amount": 1100,
                "currency": "USD"
              },
              "scope": "LINE_ITEM"
            },
            {
              "name": "Global Sales $55 OFF",
              "type": "FIXED_AMOUNT",
              "amount_money": {
                "amount": 5500,
                "currency": "USD"
              },
              "applied_money": {
                "amount": 3583,
                "currency": "USD"
              },
              "scope": "ORDER"
            }
          ],
          "base_price_money": {
            "amount": 3500,
            "currency": "USD"
          },
          "total_tax_money": {
            "amount": 615,
            "currency": "USD"
          },
          "total_discount_money": {
            "amount": 5943,
            "currency": "USD"
          },
          "total_money": {
            "amount": 5172,
            "currency": "USD"
          }
        }
      ],
      "total_money": {
        "amount": 7818,
        "currency": "USD"
      },
      "total_tax_money": {
        "amount": 823,
        "currency": "USD"
      },
      "total_discount_money": {
        "amount": 9005,
        "currency": "USD"
      }
    },
    "created_at": "2017-06-16T22:25:35Z",
    "additional_recipients": [
      {
        "location_id": "057P5VYJ4A5X1",
        "description": "Application fees",
        "amount_money": {
          "amount": 60,
          "currency": "USD"
        }
      }
    ]
  }
}
```

