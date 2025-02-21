#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini parameter yöntemi ile doğrulayınız.
#Daha sonra aynı bilgilerle tekrar Create yapılamadığını doğrulayınız. (negatif test)
#oluşturulan her CitizenShip i siliniz.
#yukarıdaki senaryoyu farklı 5 değer için çalıştırınız

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

    When User delete the "<name>"
    Then Success message should be displayed

    Examples:
      | name          | shortname  |
      | 1qwerttyyu | csdfg11fr |
      | 2qwerttyyu | csdfg1121   |
      | 3qwerttyyu | csdfg1131   |
      | 4qwerttyyu | csdfg1141   |
      | 5qwerttyyu | csdfg1151   |




