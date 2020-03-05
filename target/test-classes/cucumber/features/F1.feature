@loginLinkedin
Feature: login

Scenario: Ingreso de usuario y password
    Given Abrir pagina principal e ingresar datos
    When  Digito Usuario y Password
    Then  Puedo hacer click en boton inicia cesion

Scenario: Validacion boton inicio sesion
    Given Verificar acci�n de boton
    When  Se hace click
    Then  Se abre siguiente pagina

Scenario: Validacion ingreso exitoso
    Given Login correcto
    When  Los datos son correctos
    Then  Se visualiza feed principal

Scenario: Validacion ingreso no exitoso
    Given Login incorrecto
    When  Los datos no son correctos
    Then  Solicita reingresar los datos



