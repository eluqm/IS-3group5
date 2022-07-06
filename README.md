
<!-- PROJECT LOGO -->

[![logo.png](https://i.postimg.cc/3wGmDkFd/logo.png)](https://postimg.cc/8F1j2P3S)
<br />
<div align="center">
 

  <h3 align="center">EcoWalkers</h3>

  <p align="center">
    Aplicación móvil enfocado a la reducción del CO2
    <br />
    <a href="https://github.com/eluqm/IS-3group5"><strong>Documentación »</strong></a>
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

- [Acerca del Proyecto](#star2-about-the-project)
  * [Tecnologías Usadas](#space_invader-tech-stack)
  * [Mockup](#camera-screenshots)
  * [Equipo](#wave-contributing)
  * [Gestión del proyecto](#compass-roadmap)
  * [Instalación](#gear-installation)
- [Descripción General](#dart-features)
  * [Caso de Uso](#dart-features)
  * [Requisito Funcional](#dart-features)
  * [Diagrama Entidad Relación](#dart-features)
  * [Modelo Relacional](#dart-features)
  * [Diagrama de Clases](#dart-features)
  * [Arquitectura](#dart-features)
  * [Base de Datos](#dart-features)
- [Licencia](#warning-license)
- [Contacto](#handshake-contact)
- [Acknowledgements](#gem-acknowledgements)


## :star2: Acerca del Proyecto

EcoWalkers es una aplicacion que consiste en brindar información acerca de la cantidad de  CO2 producido por las actividades siguientes: caminar, montar bicicleta, usar algún tipo de transporte de servicio público y el uso de un automóvil personal. Toda la recopilación de los datos mencionados serán presentados al usuario de forma clara y estructurada dentro de la aplicación, por ello los detalles de esta y otras funcionalidades de la aplicación como: itinerario, tabla de posición y tienda de recompensas también son resueltos en este documento. 

### :space_invader: Tecnologías Usadas

* [Android](https://developer.android.com/)
* [Java](https://www.java.com/)
* [SQLite](https://www.sqlite.org/)
<p align="right">(<a href="#top">back to top</a>)</p>

### :camera: Mockups

Los mockups se desarrollaron en la pagina Figma en total tenemos 7 donde mostramos las principales interfaces de nuestra aplicacion android. Primero tenemos nuestros dos mockups para poder iniciar sesión tambien para crear una cuenta .Los dos piden datos basicos como nombre, correo , contraseña entre otros datos

![image](https://user-images.githubusercontent.com/49428509/177020746-eb731c43-766d-453f-8ba4-1f123807ed4a.png)
![image](https://user-images.githubusercontent.com/49428509/177020759-8c7bd0c3-548e-430b-8939-d836f9d16a00.png)


Luego tenemos la pagina principal la cual mostrara el mapa para ver nuestra ubicacion actual y tambien un pequeño resumen de las estadisticas al momento de caminar

![image](https://user-images.githubusercontent.com/49428509/177020835-8f87f8f6-4775-4c11-814d-36483d504a67.png)


Tambien tenemos un mockup para la parte de las estadisticas de nuestras actividades, en esta se mostrara un pequeñoo grafico y un resumen de lo que realizo en los ultimos 7 dias

![image](https://user-images.githubusercontent.com/49428509/177020858-693abef6-74df-47fc-9d70-d709faae29a3.png)


Luego tenemos dos mockups especialmente diseñados para la tienda interna de la app donde se ofreceran varioa avaatares y walpapers para usar en la app lo cuales se van a canjear con puntos que se iran dando por cumplir objetivos

![image](https://user-images.githubusercontent.com/49428509/177020883-6e96f7aa-3072-47bd-aba4-f9941f1d1c5b.png)
![image](https://user-images.githubusercontent.com/49428509/177020889-70bc1935-4a3c-4eab-93de-bf04809f64d3.png)


Para finalizar tenemos un mockup para el perfil de cada usuario donde podra ver sus datos y tambien tendra la opcion de cerrar su sesión

![image](https://user-images.githubusercontent.com/49428509/177020949-063fdb88-840d-4328-8666-ea0d810753c6.png)

### :wave: Equipo

* [Joselyn](https://github.com/Joselyn7)
* [Yober](https://github.com/YoberM)
* [Gabriela](https://www.sqlite.org/)
* [Jean](https://github.com/JpChavez16)
* [Edwar](https://github.com/evargashe)
* [Fabian](https://www.sqlite.org/)

### 🧭 Gestión del Proyecto

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

### :dart: Requisitos Funcionales
![image](https://user-images.githubusercontent.com/64268942/177435924-3de458d9-9d0f-4347-be59-166abcbcac8f.png)

### :dart: Diagrama Entidad Relación

![Modelo Entidad Relacional](https://user-images.githubusercontent.com/49489730/177257605-62166fb8-b1d2-45dd-ae6c-f89dd8aae8ae.PNG)


### Modelo Relacional 
![Modelo Relacional](https://user-images.githubusercontent.com/49489730/177257613-d84f1bec-a59a-4505-b989-7481a9b5421c.PNG)

### :dart: Base de Datos

El diseño de los modelos de bases de datos se puede ver en este [Enlace](https://app.moqups.com/Q1vdJRphWudQZaOnlHNssINQ0HhTATt2/view/page/abbaf8365)







