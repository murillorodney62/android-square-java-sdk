## Team Member

A record representing an individual team member for a business.

### Structure

`TeamMember`

### Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Id` | `String` | Optional | The unique ID for the team member. |
| `ReferenceId` | `String` | Optional | A second ID used to associate the team member with an entity in another system. |
| `IsOwner` | `Boolean` | Optional | Whether the team member is the owner of the Square account. |
| `Status` | [`String`](/doc/models/team-member-status.md) | Optional | Enumerates the possible statuses the team member can have within a business. |
| `GivenName` | `String` | Optional | The given (i.e., first) name associated with the team member. |
| `FamilyName` | `String` | Optional | The family (i.e., last) name associated with the team member. |
| `EmailAddress` | `String` | Optional | The email address associated with the team member. |
| `PhoneNumber` | `String` | Optional | The team member's phone number in E.164 format. Examples:<br>+14155552671 - the country code is 1 for US<br>+551155256325 - the country code is 55 for BR |
| `CreatedAt` | `String` | Optional | The timestamp in RFC 3339 format describing when the team member was created.<br>Ex: "2018-10-04T04:00:00-07:00" or "2019-02-05T12:00:00Z" |
| `UpdatedAt` | `String` | Optional | The timestamp in RFC 3339 format describing when the team member was last updated.<br>Ex: "2018-10-04T04:00:00-07:00" or "2019-02-05T12:00:00Z" |
| `AssignedLocations` | [`TeamMemberAssignedLocations`](/doc/models/team-member-assigned-locations.md) | Optional | An object that represents a team member's assignment to locations. |

### Example (as JSON)

```json
{
  "id": null,
  "reference_id": null,
  "is_owner": null,
  "status": null,
  "given_name": null,
  "family_name": null,
  "email_address": null,
  "phone_number": null,
  "created_at": null,
  "updated_at": null,
  "assigned_locations": null
}
```

