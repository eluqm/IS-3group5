# EcoWalkers: Aplicación móvil enfocada a la reducción del CO2

EcoWalkers es una aplicacion que consiste en brindar información acerca de la cantidad de  CO2 producido por las actividades siguientes: caminar, montar bicicleta, usar algún tipo de transporte de servicio público y el uso de un automóvil personal. Toda la recopilación de los datos mencionados serán presentados al usuario de forma clara y estructurada dentro de la aplicación, por ello los detalles de esta y otras funcionalidades de la aplicación como: itinerario, tabla de posición y tienda de recompensas también son resueltos en este documento. 

La informacion esta detallada en el documento:
https://docs.google.com/document/d/1s1gV0AmxZG5u029aQwCnikhdyj4lpGjF/edit?usp=sharing&ouid=114740062015742038860&rtpof=true&sd=true

### Metodología Kaban 
Esta metodologia ágil nos ayudará a gestionar la realización de las tareas necesarias para el desarrollo de la aplicación hasta que estas sean culminadas. 
Ya que esta metodología hace referencia a tarjetas visuales es que utilizaremos la herramienta Trello; ya que esta herramienta nos permite organizar las tarjetas en listas que nos permitirán llevar de una mejor manera  el flujo de las tareas. 
Creamos 4 listas: To do, In progress, Done y To maintenance
![image](https://user-images.githubusercontent.com/64268942/177435854-cbba0220-d0c3-4e8b-a27f-23b2a0ebe75e.png)
## Requisitos Funcionales
* RF01 - Registrar Usuarios 
  - El sistema permite al usuario registrarse. El usuario debe suministrar datos como: Nombre, Apellido, E-mail 
  - Flujo principal 
    - El usuario ingresa su Nombre
    - El usuario ingresa su Apellido.
    - El usuario ingresa su E-mail.
    - El Sistema valida el registro
  - Flujo Alternativo
    - Si el usuario ingresa incorrectamente sus datos: El sistema mandará un mensaje de error en su respectivo campos
  - Precondiciones: El usuario no debe de existir en el sistema
  - Postcondiciones: La cuenta del usuario se registra
* RF02 - Inicio de Sesión
  - El administrador debe suministrar datos como: Usuario y Contraseña.
  - Flujo Principal
    - El administrador ingresa su nombre Usuario.
    - El administrador ingresa su Contraseña.
    - El sistema valida los datos ingresados
  - Flujo Alternativo
    - Si el administrador  no ingresa correctamente su nombre de Usuario y Contraseña: El sistema mandará un mensaje de error en su respectivo campo
  - Precondiciones: La cuenta del administrador debe registrarse previamente.
  - Postcondiciones: El administrador inicia sesión en el sistema.   
* RF03 - Iniciar Actividad
  - El usuario puede ingresar la posición final e iniciar el recorrido
  - Flujo principal
    - El usuario: Selecciona “Iniciar”
  - Flujo alternativo
    - El usuario Selecciona “Parar”
  - Precondiciones: La cuenta del usuario debe de iniciar sesión.
  - Postcondiciones:  Actividad guardada.
* RF04 - Consultar Ranking
  - El usuario puede seleccionar o indagar la información proporcionada acerca del ranking.
  - Flujo principal
    - El usuario: Elige la opción Actividad.
    - El usuario: Visualiza el ranking
  - Flujo alternativo
    - N/A
  - Precondiciones: La cuenta del administrador o del usuario debe de iniciar sesión
  - Postcondiciones: Actividad guardada.
* RF05 - Consultar Actividad
  - El usuario puede seleccionar o indagar la información proporcionada acerca de su actividad.
  - Flujo principal
    - El administrador o el usuario: Elige Actividad.
    -El administrador o el usuario: Visualiza el gráfico que representa en porcentaje su actividad
  - Flujo alternativo
    - N/A
  - Precondiciones: La cuenta del usuario debe de iniciar sesión.
  - Postcondiciones: Actividad guardada.
* RF06 - Consultar Tienda
  - El administrador o usuario puede seleccionar o indagar la información proporcionada de cada cupón o descuento que elija. 
  - Flujo principal
    - El administrador o el usuario: Elige la opción Tienda.
    - El administrador o el usuario: Visualiza el listado de los productos.
    - El administrador o el usuario: Selecciona el producto deseado
  - Flujo alternativo
    - N/A
  - Precondiciones: La cuenta del administrador o del usuario debe de iniciar sesión.
  - Postcondiciones: Actividad guardada.
* RF07 - Canjear Puntos
  - El usuario puede seleccionar la opción de canjear sus puntos por productos que están dentro del costo establecido.
  - Flujo principal
    - El usuario: Selecciona Tienda
    - El usuario: Visualiza los productos.
    - El usuario: Selecciona algún producto.
    - El usuario: Selecciona “Canjear”.
  - Flujo alternativo
    - Si el usuario no tiene los puntos suficientes: El sistema no permite la adquisición del producto.
  - Precondiciones: La cuenta del usuario debe de iniciar sesión.
  - Postcondiciones: Actividad guardada.
* RF08 - Consultar Información personal
  - El usuario puede seleccionar o indagar la información
  - Flujo principal
    - El administrador o el usuario: Selecciona “Home”.
    - El administrador o el usuario: Selecciona su perfil que se encuentra en la parte superior.
    - El administrador o el usuario: Visualiza la información personal
  - Flujo alternativo
    - N/A
  - Precondiciones: La cuenta del administrador o del usuario debe de iniciar sesión.
  - Postcondiciones: Actividad guardada.
* RF09 - Modificar Información personal 
  - El usuario puede seleccionar y modificar la información proporcionada.
  - Flujo principal
    - El usuario: Selecciona “Home”.
    - El usuario: Selecciona su perfil que se encuentra en la parte superior.
    - El usuario: Modifica el campo.
    - El usuario: Selecciona “Guardar”.
  - Flujo alternativo
    - El usuario: Selecciona “Home”.
    - El usuario: Selecciona su perfil que se encuentra en la parte superior.
    - El usuario: Modifica el campo.
    - El usuario: Selecciona “Cancelar”
  - Precondiciones: La cuenta del usuario debe de iniciar sesión.
  - Postcondiciones: Actividad guardada.
* RF10 - Activar GPS
  - El usuario puede seleccionar la opción de activar el GPS para que la aplicación pueda monitorear la actividad.
  - Flujo principal
    - El usuario: Selecciona “Home”.
    - El usuario: Selecciona “GPS”.
    - El usuario: Selecciona “Activar GPS”.
  - Flujo alternativo
    - El usuario: Selecciona “Home”.
    - El usuario: Selecciona “GPS”.
    - El usuario: Selecciona “Desactivar”
  - Precondiciones: La cuenta del usuario debe de iniciar sesión.
  - Postcondiciones: Actividad guardada.
* RF11 - Consultar Información de usuarios
  - El usuario puede seleccionar o indagar la información proporcionada.
  - Flujo principal
    - El administrador: Selecciona “Usuarios” .
    - El administrador: Visualiza el listado de los usuarios.
  - Flujo alternativo
    - N/A
  - Precondiciones: La cuenta del administrador debe de iniciar sesión.
  - Postcondiciones: Actividad guardada.
* RF12 - Modificar usuarios
  - Permite al administrador actualizar datos de un usuario.
  - Flujo principal
    - El administrador: Selecciona “Usuarios”.
    - El administrador: Selecciona “Modificar” el campo que desea.
    - El administrador: Selecciona “Guardar”
  - Flujo alternativo
    - N/A
  - Precondiciones: El administrador debe de iniciar sesión.
  - Postcondiciones: Actividad guardada.
* RF13 - Agregar Productos
  - Permite al administrador agregar un nuevo producto.
  - Flujo principal
    - El administrador: Selecciona Producto.
    - El administrador: Introduce el Nombre.
    - El administrador: Introduce el Precio (puntaje).
    - El administrador: Introduce el Stock.
    - El administrador: Introduce una breve Descripción.
    - El administrador: Selecciona “Guardar”.
  - Flujo alternativo
    - N/A
  - Precondiciones: El administrador debe de iniciar sesión.
  - Postcondiciones: Actividad guardada.
* RF14 - Modificar Producto
  - Permite al administrador actualizar datos de un producto.
  - Flujo principal
    - El administrador: Selecciona el producto.
    - El administrador: Selecciona “Modificar” el campo que desea.
    - El administrador: Selecciona “Guardar”.
  - Flujo alternativo
    - N/A
  - Precondiciones: El administrador debe de iniciar sesión.
  - Postcondiciones: Actividad guardada.
* RF15 - Eliminar Producto
  - Permite al administrador eliminar productos de la tienda.
  - Flujo principal
    - El administrador: Selecciona Productos. 
    - El administrador: Elige el producto.
    - El administrador: Selecciona “Eliminar”.
    - El administrador: El sistema muestra un mensaje de advertencia.
  - Flujo alternativo
    - N/A
  - Precondiciones: El administrador debe de iniciar sesión.
  - Postcondiciones: 
  
## Requisitos No Funcionales


## Mockups
Los mockups se desarrollaron en la pagina Figma en total tenemos 7 donde mostramos las principales interfaces de nuestra aplicacion android

![image](https://user-images.githubusercontent.com/49428509/177020746-eb731c43-766d-453f-8ba4-1f123807ed4a.png)
![image](https://user-images.githubusercontent.com/49428509/177020759-8c7bd0c3-548e-430b-8939-d836f9d16a00.png)

Primero tenemos nuestros dos mockups para poder iniciar sesión tambien para crear una cuenta .Los dos piden datos basicos como nombre, correo , contraseña entre otros datos


Luego tenemos la pagina principal la cual mostrara el mapa para ver nuestra ubicacion actual y tambien un pequeño resumen de las estadisticas al momento de caminar

![image](https://user-images.githubusercontent.com/49428509/177020835-8f87f8f6-4775-4c11-814d-36483d504a67.png)


Tambien tenemos un mockup para la parte de las estadisticas de nuestras actividades, en esta se mostrara un pequeñoo grafico y un resumen de lo que realizo en los ultimos 7 dias

![image](https://user-images.githubusercontent.com/49428509/177020858-693abef6-74df-47fc-9d70-d709faae29a3.png)


Luego tenemos dos mockups especialmente diseñados para la tienda interna de la app donde se ofreceran varioa avaatares y walpapers para usar en la app lo cuales se van a canjear con puntos que se iran dando por cumplir objetivos

![image](https://user-images.githubusercontent.com/49428509/177020883-6e96f7aa-3072-47bd-aba4-f9941f1d1c5b.png)
![image](https://user-images.githubusercontent.com/49428509/177020889-70bc1935-4a3c-4eab-93de-bf04809f64d3.png)


Para finalizar tenemos un mockup para el perfil de cada usuario donde podra ver sus datos y tambien tendra la opcion de cerrar su sesión

![image](https://user-images.githubusercontent.com/49428509/177020949-063fdb88-840d-4328-8666-ea0d810753c6.png)

## Modelos de base de datos
Los modelos se desarrollaron en la pagina Moqups.
<br/>
El diseño de los modelos de bases de datos se puede ver en este [Enlace](https://app.moqups.com/Q1vdJRphWudQZaOnlHNssINQ0HhTATt2/view/page/abbaf8365)
### Modelo Entidad Relacional
![Modelo Entidad Relacional](https://user-images.githubusercontent.com/49489730/177257605-62166fb8-b1d2-45dd-ae6c-f89dd8aae8ae.PNG)

### Modelo Relacional 
![Modelo Relacional](https://user-images.githubusercontent.com/49489730/177257613-d84f1bec-a59a-4505-b989-7481a9b5421c.PNG)


## Diagrama de clases
![diagrama de clases is3](https://user-images.githubusercontent.com/49292220/178048220-6b0e7369-31ba-4459-b54d-8cc1c480efbc.JPG)



