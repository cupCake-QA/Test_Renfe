Feature: Payment_Alerts
  @wip
  Scenario Outline: Verify the payment alert appears when user enters wrong credit card information
    Given user is on the homepage
    And enters the "Desde" station information with the value "Valencia Joaquín Sorolla" and selects "desde estación" option
    And enters the "Hasta" station information with the value "Barcelona-Sants" and selects "hasta estación" option
    And selects from Ida y vuelta dropdown option "Sólo ida"
    And selects the first available date
    And on homepage clicks the "Acceptar" button
    And on homepage clicks the "Buscar Billete" button
    And on select train page selects the first price option
    And on select train page clicks "SELECCIONAR" button
    And on popup clicks "No, quiero continuar" option
    And on payment details page fills the field "Nombre" with the value "<Nombre>"
    And on payment details page fills the field "Apellido 1" with the value "<Apellido>"
    And on payment details page from "Tipo de documento" dropdown select value "<Tipo de documento>"
    And on payment details page fills the field "Nº documento" with the value "<Nº documento>"
    And on payment details page fills the field "E-mail" with the value "<E-mail>"
    And on payment details page fills the field "Teléfono viajero" with the value "<Telefono>"
    And on payment details page fills the field "Teléfono comprador" with the value "<Telefono>"
    And on payment details page checks radio button "Tarjeta/Google Pay Apple Pay" is selected
    And on payment details page checks the "Condiciones legales" checkbox
    And on payment details page clicks "COMPRAR" button
    And on pay with card page fills the field "Nº Tarjeta" with the value "<Nº Tarjeta>"
    And on pay with card page fills the field "mm" with the value "<mm>"
    And on pay with card page fills the field "aa" with the value "<aa>"
    And on pay with card page fills the field "CVV" with the value "<CVV>"
    When on pay with card page clicks the "Pagar" button
    Then the alert appears with the message "<message>"

    Examples:
      | Nombre | Apellido | Tipo de documento          | Nº documento | E-mail            | Telefono  | Nº Tarjeta   | mm | aa | CVV | message                                                               |
      | Taylor | Swift    | Pasaporte/Doc. comunitario | P123456789   | tester@tester.com | 666666666 | 000000000000 | 12 | 25 | 123 | Debe Introducir un número de tarjeta válido (sin espacios ni guiones).|











