@loginadmpicking
Feature: Feature_AdmPicking

  Scenario: Listar reservas filtros minimos
    Given Mostrar datos en grilla
    When Se realice la busqueda
    Then Debe mostrar todos los datos de la base de datos para esas caracteristicas

  Scenario: Listar reservas con filtros
    Given Filtrar reservas en grilla
    When Se realice una busqueda con filtros
    Then Debe mostrar las reservas con los filtros indicados

  Scenario: Quiebre de producto
    Given Hacer un quiebre de una reserva
    When Se procese a ingresar el quiebre en pantalla DAD
    Then Se debe poder ingresar SKU substituto del articulo Quebrado

  Scenario: Sustituto en blanco
    Given Se tiene un quiebre de una reserva
    When No se tenga el SKU substituto del articulo quebrado
    Then Se debe poder dejar en blanco el campo SKU Substituto

  Scenario: Sustituto valido
    Given Se requiere ingresar SKU substituto de articulo quebrado
    When Se ingrese SKU substituto
    Then Se debe efectuar validacion para verificar si el SKU es valido -Familia y SKU valido-
