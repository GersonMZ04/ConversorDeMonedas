# Conversor de Monedas

Este proyecto implementa un conversor de monedas que utiliza la API ExchangeRate-API para obtener tasas de cambio en tiempo real y realizar conversiones entre diferentes monedas. El programa está escrito en Java y utiliza las bibliotecas Gson, HttpClient y HttpRequest para gestionar las solicitudes y respuestas HTTP.

## Funcionalidades

- Conversión de monedas basada en tasas en tiempo real obtenidas de ExchangeRate-API.
- Selección de moneda base y moneda objetivo para la conversión.
- Ingreso de monto a convertir.
- Manejo de errores en caso de problemas con la API o datos de entrada incorrectos.

## Requisitos

- JDK 11 o superior.
- Acceso a Internet para consultar la API ExchangeRate-API.

## Configuración

1. **Obtención de API Key:**
   - Regístrate en [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener tu API Key gratuita.

2. **Configuración del Proyecto:**
   - Clona este repositorio en tu máquina local.

3. **Librerías Utilizadas:**
   - Gson: Para el manejo de JSON.
   - HttpClient y HttpRequest: Para realizar solicitudes HTTP.

## Uso

1. **Ejecución del Programa:**
   - Compila y ejecuta la clase `ConversorDeMonedas.java` desde tu entorno de desarrollo o línea de comandos.

2. **Interacción con el Programa:**
   - Selecciona la moneda base y la moneda objetivo según el menú proporcionado.
   - Ingresa el monto que deseas convertir.
   - La aplicación mostrará el monto convertido según la tasa de cambio actual.

3. **Finalización del Programa:**
   - Para salir del programa, selecciona la opción correspondiente en el menú.

## Ejemplo

```bash
$ java ConversorDeMonedas
Seleccione la moneda base:
1. ARS - Peso argentino
2. BOB - Boliviano boliviano
3. BRL - Real brasileño
4. CLP - Peso chileno
5. COP - Peso colombiano
6. USD - Dólar estadounidense
7. Salir
> 6
Seleccione la moneda objetivo:
1. ARS - Peso argentino
2. BOB - Boliviano boliviano
3. BRL - Real brasileño
4. CLP - Peso chileno
5. COP - Peso colombiano
6. USD - Dólar estadounidense
> 3
Ingrese el monto a convertir:
> 100
El monto convertido es: 389.10 BRL
