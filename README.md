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

*  
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




