
<!-- PROJECT LOGO -->

[![logo.png](https://i.postimg.cc/4yJq27f3/logo.png)](https://postimg.cc/zbcxVfRm)

<br />
<div align="center">
 

  <h3 align="center">EcoWalkers</h3>

  <p align="center">
    Aplicación móvil enfocado a la reducción del CO2
    <br />
    <a href="https://docs.google.com/document/d/1s1gV0AmxZG5u029aQwCnikhdyj4lpGjF/edit"><strong>Documentación »</strong></a>
    <br />
    <br />
    <a href="https://github.com/eluqm/IS-3group5">View Demo</a>
    ·
    <a href="https://github.com/eluqm/IS-3group5">Report Bug</a>
    ·
    <a href="https://github.com/eluqm/IS-3group5">Request Feature</a>
  </p>
</div>



<!-- TABLE OF CONTENTS -->

# :notebook_with_decorative_cover: Tabla de Contenido

- [Acerca del Proyecto](#star2-acerca-del-proyecto)
  * [Tecnologías Usadas](#space_invader-tecnologías-usadas)
  * [Mockups](#camera-mockups)
  * [Equipo](#wave-equipo)
  * [Gestión del proyecto](#compass-gestión-del-proyecto)
  * [Instalación](#gear-instalación)
- [Descripción General](#dart-descripción-general)
  * [Caso de Uso](#dart-caso-de-uso)
  * [Requisito Funcional](#dart-requisito-funcional)
  * [Requisitos No Funcionales](#dart-requisitos-no-funcionales)
  * [Diagrama Entidad Relación](#dart-diagrama-entidad-relación)
  * [Modelo Relacional](#dart-modelo-relacional)
  * [Diagrama de Clases](#dart-diagrama-de-clases)
  * [Arquitectura](#dart-arquitectura)
  * [Base de Datos](#dart-base-de-datos)
  * [Diagrama de Clase](#dart-diagrama-de-clase)
- [Licencia](#warning-licencia)
- [Contacto](#handshake-contacto)


## :star2: Acerca del Proyecto
=======
# EcoWalkers: Aplicación móvil enfocada a la reducción del CO2

EcoWalkers es una aplicacion que consiste en brindar información acerca de la cantidad de  CO2 producido por las actividades siguientes: caminar, montar bicicleta, usar algún tipo de transporte de servicio público y el uso de un automóvil personal. Toda la recopilación de los datos mencionados serán presentados al usuario de forma clara y estructurada dentro de la aplicación, por ello los detalles de esta y otras funcionalidades de la aplicación como: itinerario, tabla de posición y tienda de recompensas también son resueltos en este documento. 

### :space_invader: Tecnologías Usadas
* [Android](https://developer.android.com/)
* [Java](https://www.java.com/)
* [Firebase](https://console.firebase.google.com/)
<p align="right">(<a href="#top">back to top</a>)</p>

### :camera: Mockups

Los mockups se desarrollaron en la pagina Figma en total tenemos 7 donde mostramos las principales interfaces de nuestra aplicacion android. Primero tenemos nuestros dos mockups para poder iniciar sesión tambien para crear una cuenta. Los dos piden datos basicos como nombre, correo , contraseña entre otros datos. Luego tenemos la pagina principal la cual mostrara el mapa para ver nuestra ubicacion actual y tambien un pequeño resumen de las estadisticas al momento de caminar.

Tambien tenemos un mockup para la parte de las estadisticas de nuestras actividades, en esta se mostrara un pequeñoo grafico y un resumen de lo que realizo en los ultimos 7 dias.

[![mockup.png](https://i.postimg.cc/MTKKVGCy/mockup.png)](https://postimg.cc/jWmbrRd5)

Luego tenemos dos mockups especialmente diseñados para la tienda interna de la app donde se ofreceran varioa avaatares y walpapers para usar en la app lo cuales se van a canjear con puntos que se iran dando por cumplir objetivos.

[![mockup2.png](https://i.postimg.cc/YqgGpvM9/mockup2.png)](https://postimg.cc/VdfLgLSQ)

### :wave: Equipo

* [Joselyn](https://github.com/Joselyn7)
* [Yober](https://github.com/YoberM)
* [Gabriela](https://www.sqlite.org/)
* [Jean](https://github.com/JpChavez16)
* [Edwar](https://github.com/evargashe)
* [Fabian](https://www.sqlite.org/)

### :compass: Gestión del Proyecto

Esta metodologia ágil nos ayudará a gestionar la realización de las tareas necesarias para el desarrollo de la aplicación hasta que estas sean culminadas. 
Ya que esta metodología hace referencia a tarjetas visuales es que utilizaremos la herramienta Trello; ya que esta herramienta nos permite organizar las tarjetas en listas que nos permitirán llevar de una mejor manera  el flujo de las tareas. 
Creamos 4 listas: To do, In progress, Done y To maintenance
![image](https://user-images.githubusercontent.com/64268942/177435854-cbba0220-d0c3-4e8b-a27f-23b2a0ebe75e.png)

### :gear: Instalación

1. Clonar repositorio
   ```sh
   git clone https://github.com/eluqm/IS-3group5
   ```

<p align="right">(<a href="#top">back to top</a>)</p>

## :dart: Descripción general

La aplicación EcoWalkers será un producto diseñado para trabajar en entorno móvil, lo que permitirá su utilización de forma rápida y eficaz para lograr una mejor respuesta. 

### :dart: Caso de Uso

[![Whats-App-Image-2022-07-05-at-4-09-48-PM.jpg](https://i.postimg.cc/c4dhyBMT/Whats-App-Image-2022-07-05-at-4-09-48-PM.jpg)](https://postimg.cc/xqFMLHZb)

### :dart: Requisito Funcional

![image](https://user-images.githubusercontent.com/64268942/177435924-3de458d9-9d0f-4347-be59-166abcbcac8f.png)

### :dart: Requisitos No Funcionales

- Fiabilidad
- Usabilidad
- Eficiencia
- Mantenibilidad
- Seguridad

### :dart: Diagrama Entidad Relación

![Modelo Entidad Relacional](https://user-images.githubusercontent.com/49489730/177257605-62166fb8-b1d2-45dd-ae6c-f89dd8aae8ae.PNG)

### :dart: Modelo Relacional 

![Modelo Relacional](https://user-images.githubusercontent.com/49489730/177257613-d84f1bec-a59a-4505-b989-7481a9b5421c.PNG)

### :dart: Arquitectura

MVC (Model-View-Controller) es un patrón de diseño arquitectónico que fomenta una mejor organización de las aplicaciones a través de una separación interna. Divide una aplicación interactiva en tres componentes: Modelo / Vista y Controlador. Refuerza el aislamiento de los datos comerciales (modelos) de las interfaces de usuario (vistas), con un tercer componente (controladores) que tradicionalmente administra la lógica, la entrada del usuario y coordina tanto los modelos como las vistas. El objetivo de MVC es una aplicación en tres partes y por ello en este proyecto se utiliza esta arquitectura, a continuación se muestra la Vista de Proceso:

[![vista-proceso.png](https://i.postimg.cc/Vs46NWDs/vista-proceso.png)](https://postimg.cc/rz0cnWB7)

### :dart: Base de Datos

El diseño de los modelos de bases de datos se puede ver en este [Enlace](https://app.moqups.com/Q1vdJRphWudQZaOnlHNssINQ0HhTATt2/view/page/abbaf8365)

### :dart: Diagrama de clase
Este diagrama de clases se realizo con la ayuda de Moqups [Enlace](https://app.moqups.com/VYfSRKyOH5uF2UYDxh8jDyw4NtpaH07E/view/page/aa458c046)
![diagrama de clases is3](https://user-images.githubusercontent.com/49292220/178048447-7e706559-fbf7-4eaf-9db3-1fa680b726fa.JPG)

## :warning: Licencia

Distributed under the no License. See LICENSE.txt for more information.

## :handshake: Contacto

Grupo 5 - [@twitter_handle](https://twitter.com/twitter_handle) - email@email_client.com

Project Link: [EcoWalkers](https://github.com/eluqm/IS-3group5)





