Feature: Verifying Adactin search hotel details

  Scenario Outline: Verifying Booking details with all fields
    Given User should login in the adactin page using "<userName>" and "<password>"
    When User should search hotel by "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"

    Examples: 
      | userName  | password    | location | hotels      | roomType | numberOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | Karthi007 | Karthi@1989 | Sydney   | Hotel Creek | Standard | 2 - Two       | 27/03/2021  | 28/03/2021   | 2 - Two       | 3 - Three       |

  Scenario Outline: Verifying Booking details with only mandatory fields
    Given User should login in the adactin page using "<userName>" and "<password>"
    When User should search hotel by "<location>","<numberOfRooms>","<checkInDate>","<checkOutDate>" and "<adultsPerRoom>"

    Examples: 
      | userName  | password    | location | numberOfRooms | checkInDate | checkOutDate | adultsPerRoom |
      | Karthi007 | Karthi@1989 | Sydney   | 1 - One       | 27/03/2021  | 28/03/2021   | 1 - One       |

  Scenario Outline: Verifying Checkin and Checkout date fields
    Given User should login in the adactin page using "<userName>" and "<password>"
    When User should search hotel by "<checkInDate>","<checkOutDate>"

    Examples: 
      | userName  | password    | checkInDate | checkOutDate |
      | Karthi007 | Karthi@1989 | 27/04/2021  | 28/03/2021   |

  Scenario Outline: Verifying search hotel without entering any fields
    Given User should login in the adactin page using "<userName>" and "<password>"
    When User should search hotel

    Examples: 
      | userName  | password    |
      | Karthi007 | Karthi@1989 |
