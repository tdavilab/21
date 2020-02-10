# 21
Aplicación de herramientas de automatización para pruebas de comportamiento a partir de cucumber

Gestión Tecnológica - 2019-3
Integrantes: 
<ol>
<li>Thomas Daniel Avila Blenkey  -  20151020012</li> 
<li>Jonathan Steven Capera Quintana - 20151020001</li> 
<li>Daniel David Leal Lara - 20151020057</li>
</ol>

Es necesario tener instalado docker, por lo tanto si no lo tiene instalado dentro de su maquina y usa ubuntu, es recomendable seguir las siguientes instrucciones: </br>
https://docs.docker.com/install/linux/docker-ce/ubuntu/ </br>

</br>
</br>
Para ejecutar la aplicación dockerizada es necesario seguir los siguientes pasos dentro de la terminal:
<ol>
  <li> Si tiene el proyecto en su maquina, acceda a la ubicacion del mismo por medio del comando CD, de lo contrario clonelo usando <b> sudo git clone https://github.com/lealdaniel00/21 </b> </li>
  <li> Acceda al la ubicacion del proyecto clonado por medio de <b>cd </b>  (cd 21)</li>
  <li> Compilar el proyecto mediante maven a partir del comando (Opcional) <b>sudo mvn clean package</b> </li>
  <li> Construir el contenedor en docker a partir del comando <b>sudo docker build -t 21-container/test .</b> </li>
  <li> Ejecutar el contenedor de la prueba a partir del comando <b>sudo docker run 21-container/test </b> </li>  
</ol>
