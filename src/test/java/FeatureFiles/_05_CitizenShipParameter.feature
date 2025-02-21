#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini parameter yöntemi ile doğrulayınız.
#Daha sonra aynı bilgilerle tekrar Create yapılamadığını doğrulayınız. (negatif test)

  Feature: Citizenship functionality

    Scenario: Create citizenship
      Given Navigate to Campus
      When Enter username and password and click login button
      Then User should login successfully
      And Navigate to Citizenship
      When Create a citizenship name as "ulefone11" shortname as "qasdf"
      Then Success message should be displayed
      When Create a citizenship name as "ulefone11" shortname as "qasdf"
      Then Already exist message should be displayed

