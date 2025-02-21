#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini parameter yöntemi ile doğrulayınız.
#Daha sonra aynı bilgilerle tekrar Create yapılamadığını doğrulayınız. (negatif test)

Feature: Citizenship functionality

  Scenario Outline: Create citizenship
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Citizenship
    When Create a citizenship name as "<name>" shortname as "<shortname>"
    Then Success message should be displayed
    When Create a citizenship name as "<name>" shortname as "<shortname>"
    Then Already exist message should be displayed
    Examples:
      | name       | shortname |
      | qazwsx11111z | sdfg11111  |
      | qazwsx1121z  | sdfg112a   |
      | qazwsx1131z  | sdfg1131   |
      | qazwsx1141z  | sdfg1141   |
      | qazwsx1151z  | sdfg1151   |




