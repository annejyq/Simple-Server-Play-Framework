name := """Max2App"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.4"

crossScalaVersions := Seq("2.11.12", "2.12.4")

libraryDependencies += jdbc
libraryDependencies += guice
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.41"


