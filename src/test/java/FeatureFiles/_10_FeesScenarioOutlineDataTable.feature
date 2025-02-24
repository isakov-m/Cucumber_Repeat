#Senaryo:
#  Daha önceki Fee Functionality Senaryosunu
#  name, code, intCode ve priority için 5 farklı kombinasyon için çalıştırınız.

Feature: Fees multiple values functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Fee Functionality
    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | fees       |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput       | <name>     |
      | codeInput       | <code>     |
      | integrationCode | <intCode>  |
      | priorityCode    | <priority> |

    And Click on the element in Dialog
      | toggleBar  |
      | saveButton |

    Then Success message should be displayed

    And User delete the element from Dialog
      | <name> |

    Then Success message should be displayed

    Examples:
      | name    | code | intCode  | priority |
      | maqee11 | 98821 | PayPal   | 988235     |
      | maqee21 | 98831 | Cash     | 988236     |
      | maqee31 | 98841 | Cheque   | 988237     |
      | maqee41 | 98851 | ApplaPay | 988238     |
      | maqee51 | 98861 | Crypto   | 988239     |