# ConversorMoneda-ChallengeONE-Java 
El Conversor de Monedas es una herramienta fácil de usar que permite convertir monedas en tiempo real usando tasas de cambio actualizadas de la API de Exchange Rate API.

## Índice
1. [Descripción del Proyecto](#descripción-del-proyecto)
2. [Estado del Proyecto](#estado-del-proyecto)
3. [Características de la Aplicación y Demostración](#características-de-la-aplicación-y-demostración)
4. [Acceso al Proyecto](#acceso-al-proyecto)
5. [Tecnologías Utilizadas](#tecnologías-utilizadas)


## Descripción del Proyecto
El Conversor de Monedas es una herramienta eficiente y fácil de usar diseñada para convertir distintas monedas del mundo a través de un menú donde los usuarios pueden seleccionar las monedas de su interés y realizar conversiones precisas en tiempo real. La aplicación se conecta a la API de Exchange Rate API para obtener las tasas de cambio actualizadas, asegurando así la precisión de todas las conversiones.


## Estado del Proyecto
El proyecto está finalizado y ha sido completado con éxito. La herramienta ahora permite a los usuarios realizar conversiones de su preferencia de manera fácil y precisa.


### Fases Completadas:
1. **Configuración del Ambiente Java:** Se preparó el entorno de desarrollo con todos los programas y archivos necesarios.
2. **Creación del Proyecto:** Se estableció la estructura base del proyecto en Java.
3. **Consumo de la API:** Se realizaron solicitudes a la API de Exchange Rate API para obtener tasas de cambio.
4. **Análisis de la Respuesta JSON:** Utilizando la biblioteca Gson, se procesaron las respuestas JSON de la API.
5. **Filtro de Monedas:** Se implementó un sistema para filtrar y seleccionar las monedas de interés.
6. **Exhibición de Resultados a los Usuarios:** Se desarrolló una interfaz de usuario basada en consola para mostrar los resultados de las conversiones.


## Caracteristicas de la Aplicación y Demostración

 ### Cracteristicas
1. **Uso de HttpClient, HttpRequest y HttpResponse:** Empleo de estas clases en Java para realizar, configurar y gestionar las solicitudes y respuestas HTTP de manera eficiente.
2. **Consumo de la API:** Realización de solicitudes a la API de Exchange Rate API para obtener tasas de cambio actualizadas.
3. **Análisis de la Respuesta JSON:** Uso de la biblioteca Gson para procesar y manipular los datos JSON recibidos de la API.
4. **Manipulación y Análisis de Datos JSON con Gson:** Mapeo eficiente de los datos JSON a objetos Java para facilitar la extracción y manipulación de información.
5. **Filtro de Monedas:** Implementación de un sistema para seleccionar y mostrar las monedas de interés.
6. **Exhibición de Resultados a los Usuarios:** Desarrollo de una interfaz de usuario basada en consola para mostrar los resultados de las conversiones.
7. **Interacción con el Usuario:** Implementación de una interfaz textual con menú interactivo para la selección de opciones de conversión de monedas, utilizando la clase Scanner para capturar la entrada del usuario.
8. **Historial de Conversiones:** Funcionalidad para rastrear y mostrar el historial de las últimas conversiones realizadas.

### Demostración 

1. **Menú de conversiones** 

![Captura de pantalla del menu](https://github.com/CristinaReyes99/ConversorMoneda-ChallengeONE-Java/blob/main/CapturasDelPrograma/menu.jpg?raw=true)

2. **Impresion del historial de conversiones**


![Captura de pantalla de la impresion del historial](https://github.com/CristinaReyes99/ConversorMoneda-ChallengeONE-Java/blob/main/CapturasDelPrograma/impresionHistorial.jpg?raw=true)

## Acceso al Proyecto

Para acceder al proyecto, puedes clonar el repositorio desde GitHub usando el siguiente enlace:

```sh
git clone https://github.com/CristinaReyes99/ConversorMoneda-ChallengeONE-Java.git
```

### Requisitos

1. **Obtener tu propia API key "Exchange Rate API":** Es necesario realizar un registro inicial ingresando tu correo electrónico (como se muestra en la imagen a continuación). Después de esto, se recibirá una clave en el correo electrónico proporcionado y estará lista para su uso. 

![Interfaz Exchange Rate API](/CapturasDelPrograma/API-key.jpg)

2. **Ingresa tu API Key al sistema:** Una vez obtenido tu API key, reemplaza la variable llamada "keyAPI" dentro de la clase ConsultaConversor.

![Captura de la clase ConsultaConversor](/CapturasDelPrograma/remplaza-APIkey.jpg)

### Uso

**Menu** El programa presenta un menú principal con opciones numeradas que el usuario debe seleccionar usando valores enteros. Ingresando posteriormente la cantidad que desea convertir.

![alt text](/CapturasDelPrograma/uso-menu.jpg)

**Impresion Historial** El usuario al escoger la opción 9, el sistema le imprime en consola el historial de las conversiones que ha realizado en el transcurso del uso del programa.

![alt text](/CapturasDelPrograma/uso-historial.jpg)

**Finalizar** El sistema solo finalizará si el usuario escoje la opción 10 del menú 

![alt text](/CapturasDelPrograma/uso-finalizar.jpg)


#### Valores no validos:

- **Seleccionar opción del Menú** No se aceptan valores tipo String y double. Valores fuera del rango del Menú (1-10). 
- **Ingrese la cantidad a convertir:** No se aceptan valores tipo String 
![alt text](/CapturasDelPrograma/uso-mensajeDeError.jpg)
- **Campos vacios:** El sistema no procede con la conversión hasta tener los datos correctos.
![alt text](/CapturasDelPrograma/uso-mensajeDeError-CampoVacio.jpg)


## Tecnologías Utilizadas

1. **Java:** Ideal para aplicaciones que requieren manejar operaciones complejas como el consumo de APIs y manipulación de datos.

2. **HttpClient:** En este proyecto se utiliza para interactuar con la API de Exchange Rate API, realizando solicitudes GET para obtener las tasas de cambio actuales. HttpClient facilita la configuración y gestión de las solicitudes y respuestas HTTP de manera eficiente.

3. **Gson:** Se utiliza para analizar las respuestas JSON obtenidas de la API y mapearlas a objetos Java, facilitando así la extracción y manipulación de datos.

4. **API de Exchange Rate:** Exchange Rate API es el servicio externo que proporciona las tasas de cambio utilizadas en la aplicación. Esta API ofrece datos de tasas de cambio actualizados en tiempo real, permitiendo al Conversor de Monedas realizar conversiones precisas y actuales. La interacción con esta API es fundamental para el funcionamiento de la herramienta.

5. **Postman:** Se utilizó para probar las solicitudes HTTP a la API de Exchange Rate, asegurando que las respuestas fueran correctas y comprendiendo mejor la estructura de los datos recibidos.

6. **Trello:** Se utilizó para planificar y seguir el progreso de las distintas fases de desarrollo, asegurando que todas las tareas fueran completadas a tiempo y facilitando la organización del trabajo.

## Autores

|[<img src="https://avatars.githubusercontent.com/u/156963931?v=4" width=115><br><sub>Cristina Reyes</sub>](https://github.com/CristinaReyes99)|
|:---:|