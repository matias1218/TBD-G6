Para compilar

  gradle jar
  
Para ejecutar

  java -cp build/libs/twitter-streaming-master-1.0.jar cl.citiaps.twitter.streaming.TwitterStreaming

Es necesario tener instalado MongoDB y Gradle.
MongoDB debe estar corriendo antes de ejecutar este programa.
  
 NO OLVIDAR modificar twitter4j.properties para agregar parámetros de autenticación

Para subir al git, usar git push (NO git push origin master)