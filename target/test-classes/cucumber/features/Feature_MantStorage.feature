@loginmantstorage
Feature: Feature_MantStorage

  Scenario: Modulo de Mantenedor de Storage
    Given Que es necesario tener un modulo para Mantener Storage
    When Se presione Storage en el menu
    Then Se debe abrir el modulo de Mantenedor de Storage con los botones y grilla correspondientes

  Scenario: Modulo de Mantenedor de Storage y Acciones
    Given Validar acciones
    When Haces click en boton acciones
    Then Se despliegan opcciones correspondientes
