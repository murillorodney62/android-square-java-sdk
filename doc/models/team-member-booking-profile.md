
# Team Member Booking Profile

The booking profile of a seller's team member, including the team member's ID, display name, description and whether the team member can be booked as a service provider.

## Structure

`TeamMemberBookingProfile`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `TeamMemberId` | `String` | Optional | The ID of the [TeamMember](../../doc/models/team-member.md) object for the team member associated with the booking profile.<br>**Constraints**: *Maximum Length*: `32` | String getTeamMemberId() |
| `Description` | `String` | Optional | The description of the team member.<br>**Constraints**: *Maximum Length*: `65536` | String getDescription() |
| `DisplayName` | `String` | Optional | The display name of the team member.<br>**Constraints**: *Maximum Length*: `512` | String getDisplayName() |
| `IsBookable` | `Boolean` | Optional | Indicates whether the team member can be booked through the Bookings API or the seller's online booking channel or site (`true) or not (`false`). | Boolean getIsBookable() |
| `ProfileImageUrl` | `String` | Optional | The URL of the team member's image for the bookings profile.<br>**Constraints**: *Maximum Length*: `2048` | String getProfileImageUrl() |

## Example (as JSON)

```json
{
  "team_member_id": "team_member_id0",
  "description": "description0",
  "display_name": "display_name0",
  "is_bookable": false,
  "profile_image_url": "profile_image_url6"
}
```

