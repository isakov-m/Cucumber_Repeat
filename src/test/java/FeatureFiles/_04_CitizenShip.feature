#Senaryo
#Citizenships sayfasına gidiniz.
#1 adet Citizenships kaydı yapılabildiğini doğrulayınız.

  Feature: Citizenship functionality

    Scenario: Create a Citizenship
      Given Navigate to Campus
      When Enter username and password and click login button
      Then User should login successfully
      And Navigate to Citizenship
      When Create a citizenship
      Then Success message should be displayed

