name := """Multiplex_&_movies"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.1"

libraryDependencies += guice

libraryDependencies += jdbc
libraryDependencies += javaJdbc
libraryDependencies += javaJpa

// https://mvnrepository.com/artifact/com.typesafe.akka/akka-http-jackson
libraryDependencies += "com.typesafe.akka" %% "akka-http-jackson" % "10.1.11"

libraryDependencies += "com.h2database" % "h2" % "1.4.200"
libraryDependencies += "org.hibernate" % "hibernate-core" % "5.4.13.Final"
libraryDependencies += "mysql" % "mysql-connector-java" % "8.0.19"

PlayKeys.externalizeResourcesExcludes += baseDirectory.value / "conf" / "META-INF" / "persistence.xml"