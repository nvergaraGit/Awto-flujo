@loginretiroentienda
Feature: Feature_RetiroEnTienda

Scenario: Modulo de Retiro en tienda
Given Que es necesario tener un modulo para retiro en tienda	
When Se presione Retiro en tienda en el menu	
Then Se debe abrir el modulo de retiro en tienda con los filtros y botones correspondientes

Scenario: Buscar reserva por RUT
Given Que un cliente requiere retirar productos de una reserva con rut
When El encargado de entrega a cliente quiere buscar un producto por RUT	
Then La pantalla de retiro devuelve las reservas filtradas por el RUT

Scenario: Buscar reserva por Orden de venta
Given Que un cliente requiere retirar productos de una reserva con orden
When El encargado de entrega a cliente quiere buscar un producto por orden de venta	
Then La pantalla de retiro devuelve las reservas filtradas por orden de venta