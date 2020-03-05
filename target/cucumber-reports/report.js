$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/cel1.feature");
formatter.feature({
  "line": 2,
  "name": "grillaAdmPicking",
  "description": "",
  "id": "grillaadmpicking",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@logingrilla"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Listar reservas filtros minimos",
  "description": "",
  "id": "grillaadmpicking;listar-reservas-filtros-minimos",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Mostrar datos en grilla",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Se realice la busqueda",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Debe mostrar todos los datos de la base de datos para esas caracteristicas",
  "keyword": "Then "
});
formatter.match({
  "location": "grillaAdminPicking.mostrar_datos_en_grilla()"
});
formatter.result({
  "duration": 7207982905,
  "status": "passed"
});
formatter.match({
  "location": "grillaAdminPicking.se_realice_la_b_squeda()"
});
formatter.result({
  "duration": 7456762937,
  "status": "passed"
});
formatter.match({
  "location": "grillaAdminPicking.debe_mostrar_todos_los_datos_de_la_base_de_datos_para_esas_caracter_sticas()"
});
formatter.result({
  "duration": 4230962980,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027ag-pinned-left-cols-container\u0027]/div[2]/div[1]/span/span[1]/span[2]\"}\n  (Session info: chrome\u003d66.0.3359.181)\n  (Driver info: chromedriver\u003d2.38.552522 (437e6fbedfa8762dec75e2c5b3ddb86763dc9dcb),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T15:15:08.936Z\u0027\nSystem info: host: \u0027CLS8484NISUM07\u0027, ip: \u002710.0.75.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.38.552522 (437e6fbedfa876..., userDataDir: C:\\Users\\Nisum\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 66.0.3359.181, webStorageEnabled: true}\nSession ID: 3627d8ff6101e84f5c516805246e3feb\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\u0027ag-pinned-left-cols-container\u0027]/div[2]/div[1]/span/span[1]/span[2]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:317)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:419)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:309)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.click(Unknown Source)\r\n\tat pages.Inicio.clickmenuAdmPickGrillaSelF(Inicio.java:55)\r\n\tat cucumber.features.grillaAdminPicking.debe_mostrar_todos_los_datos_de_la_base_de_datos_para_esas_caracter_sticas(grillaAdminPicking.java:104)\r\n\tat ✽.Then Debe mostrar todos los datos de la base de datos para esas caracteristicas(features/cel1.feature:7)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 9,
  "name": "Listar reservas con filtros",
  "description": "",
  "id": "grillaadmpicking;listar-reservas-con-filtros",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "Filtrar reservas en grilla",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "Se realice una busqueda con filtros",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Debe mostrar las reservas con los filtros indicados",
  "keyword": "Then "
});
formatter.match({
  "location": "grillaAdminPicking.filtrar_reservas_en_grilla()"
});
formatter.result({
  "duration": 92370947,
  "status": "passed"
});
formatter.match({
  "location": "grillaAdminPicking.se_realice_una_b_squeda_con_filtros()"
});
formatter.result({
  "duration": 4239610569,
  "status": "passed"
});
formatter.match({
  "location": "grillaAdminPicking.debe_mostrar_las_reservas_con_los_filtros_indicados()"
});
formatter.result({
  "duration": 4104340544,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027ag-pinned-left-cols-container\u0027]/div[2]/div[1]/span/span[1]/span[2]\"}\n  (Session info: chrome\u003d66.0.3359.181)\n  (Driver info: chromedriver\u003d2.38.552522 (437e6fbedfa8762dec75e2c5b3ddb86763dc9dcb),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T15:15:08.936Z\u0027\nSystem info: host: \u0027CLS8484NISUM07\u0027, ip: \u002710.0.75.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.38.552522 (437e6fbedfa876..., userDataDir: C:\\Users\\Nisum\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 66.0.3359.181, webStorageEnabled: true}\nSession ID: 3627d8ff6101e84f5c516805246e3feb\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\u0027ag-pinned-left-cols-container\u0027]/div[2]/div[1]/span/span[1]/span[2]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:317)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:419)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:309)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.click(Unknown Source)\r\n\tat pages.Inicio.clickmenuAdmPickGrillaSelF(Inicio.java:55)\r\n\tat cucumber.features.grillaAdminPicking.debe_mostrar_las_reservas_con_los_filtros_indicados(grillaAdminPicking.java:164)\r\n\tat ✽.Then Debe mostrar las reservas con los filtros indicados(features/cel1.feature:12)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 14,
  "name": "Quiebre de producto",
  "description": "",
  "id": "grillaadmpicking;quiebre-de-producto",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "Hacer un quiebre de una reserva",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "Se procese a ingresar el quiebre en pantalla DAD",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Se debe poder ingresar SKU substituto del articulo Quebrado",
  "keyword": "Then "
});
formatter.match({
  "location": "grillaAdminPicking.hacer_un_quiebre_de_una_reserva()"
});
formatter.result({
  "duration": 88715715,
  "status": "passed"
});
formatter.match({
  "location": "grillaAdminPicking.se_procese_a_ingresar_el_quiebre_en_pantalla_DAD()"
});
formatter.result({
  "duration": 4266324863,
  "status": "passed"
});
formatter.match({
  "location": "grillaAdminPicking.se_debe_poder_ingresar_SKU_substituto_del_articulo_Quebrado()"
});
formatter.result({
  "duration": 4095700713,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027ag-pinned-left-cols-container\u0027]/div[2]/div[1]/span/span[1]/span[2]\"}\n  (Session info: chrome\u003d66.0.3359.181)\n  (Driver info: chromedriver\u003d2.38.552522 (437e6fbedfa8762dec75e2c5b3ddb86763dc9dcb),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T15:15:08.936Z\u0027\nSystem info: host: \u0027CLS8484NISUM07\u0027, ip: \u002710.0.75.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.38.552522 (437e6fbedfa876..., userDataDir: C:\\Users\\Nisum\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 66.0.3359.181, webStorageEnabled: true}\nSession ID: 3627d8ff6101e84f5c516805246e3feb\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\u0027ag-pinned-left-cols-container\u0027]/div[2]/div[1]/span/span[1]/span[2]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:317)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:419)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:309)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.click(Unknown Source)\r\n\tat pages.Inicio.clickmenuAdmPickGrillaSelF(Inicio.java:55)\r\n\tat cucumber.features.grillaAdminPicking.se_debe_poder_ingresar_SKU_substituto_del_articulo_Quebrado(grillaAdminPicking.java:226)\r\n\tat ✽.Then Se debe poder ingresar SKU substituto del articulo Quebrado(features/cel1.feature:17)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 19,
  "name": "Sustituto en blanco",
  "description": "",
  "id": "grillaadmpicking;sustituto-en-blanco",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "Se tiene un quiebre de una reserva",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "No se tenga el SKU substituto del articulo quebrado",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "Se debe poder dejar en blanco el campo SKU Substituto",
  "keyword": "Then "
});
formatter.match({
  "location": "grillaAdminPicking.se_tiene_un_quiebre_de_una_reserva()"
});
formatter.result({
  "duration": 107334266,
  "status": "passed"
});
formatter.match({
  "location": "grillaAdminPicking.no_se_tenga_el_SKU_substituto_del_articulo_quebrado()"
});
formatter.result({
  "duration": 4287937135,
  "status": "passed"
});
formatter.match({
  "location": "grillaAdminPicking.se_debe_poder_dejar_en_blanco_el_campo_SKU_Substituto()"
});
formatter.result({
  "duration": 4107448514,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027ag-pinned-left-cols-container\u0027]/div[2]/div[1]/span/span[1]/span[2]\"}\n  (Session info: chrome\u003d66.0.3359.181)\n  (Driver info: chromedriver\u003d2.38.552522 (437e6fbedfa8762dec75e2c5b3ddb86763dc9dcb),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T15:15:08.936Z\u0027\nSystem info: host: \u0027CLS8484NISUM07\u0027, ip: \u002710.0.75.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.38.552522 (437e6fbedfa876..., userDataDir: C:\\Users\\Nisum\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 66.0.3359.181, webStorageEnabled: true}\nSession ID: 3627d8ff6101e84f5c516805246e3feb\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\u0027ag-pinned-left-cols-container\u0027]/div[2]/div[1]/span/span[1]/span[2]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:317)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:419)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:309)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.click(Unknown Source)\r\n\tat pages.Inicio.clickmenuAdmPickGrillaSelF(Inicio.java:55)\r\n\tat cucumber.features.grillaAdminPicking.se_debe_poder_dejar_en_blanco_el_campo_SKU_Substituto(grillaAdminPicking.java:289)\r\n\tat ✽.Then Se debe poder dejar en blanco el campo SKU Substituto(features/cel1.feature:22)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 24,
  "name": "Sustituto valido",
  "description": "",
  "id": "grillaadmpicking;sustituto-valido",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "Se requiere ingresar SKU substituto de articulo quebrado",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "Se ingrese SKU substituto",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "Se debe efectuar validacion para verificar si el SKU es valido -Familia y SKU valido-",
  "keyword": "Then "
});
formatter.match({
  "location": "grillaAdminPicking.se_requiere_ingresar_SKU_substituto_de_articulo_quebrado()"
});
formatter.result({
  "duration": 123793388,
  "status": "passed"
});
formatter.match({
  "location": "grillaAdminPicking.se_ingrese_SKU_substituto()"
});
formatter.result({
  "duration": 4262264473,
  "status": "passed"
});
formatter.match({
  "location": "grillaAdminPicking.se_debe_efectuar_validaci_n_para_verificar_si_el_SKU_es_v_lido_Familia_y_SKU_valido()"
});
formatter.result({
  "duration": 4088152937,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027ag-pinned-left-cols-container\u0027]/div[2]/div[1]/span/span[1]/span[2]\"}\n  (Session info: chrome\u003d66.0.3359.181)\n  (Driver info: chromedriver\u003d2.38.552522 (437e6fbedfa8762dec75e2c5b3ddb86763dc9dcb),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T15:15:08.936Z\u0027\nSystem info: host: \u0027CLS8484NISUM07\u0027, ip: \u002710.0.75.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.38.552522 (437e6fbedfa876..., userDataDir: C:\\Users\\Nisum\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 66.0.3359.181, webStorageEnabled: true}\nSession ID: 3627d8ff6101e84f5c516805246e3feb\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\u0027ag-pinned-left-cols-container\u0027]/div[2]/div[1]/span/span[1]/span[2]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:317)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:419)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:309)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.click(Unknown Source)\r\n\tat pages.Inicio.clickmenuAdmPickGrillaSelF(Inicio.java:55)\r\n\tat cucumber.features.grillaAdminPicking.se_debe_efectuar_validaci_n_para_verificar_si_el_SKU_es_v_lido_Familia_y_SKU_valido(grillaAdminPicking.java:349)\r\n\tat ✽.Then Se debe efectuar validacion para verificar si el SKU es valido -Familia y SKU valido-(features/cel1.feature:27)\r\n",
  "status": "failed"
});
});