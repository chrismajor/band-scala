// val derby = "org.apache.derby" % "derby" % "10.4.1.3"

lazy val commonSettings = Seq(
  organization := "io.chrismajor",
  version := "0.0.1-SNAPSHOT",
  scalaVersion := "2.12.1"
)

lazy val root = (project in file("."))
  .settings(
    commonSettings,
    name := "Bandname",
    libraryDependencies +=  "org.scala-lang" % "scala-library-all" % "2.12.1",
    libraryDependencies +=  "org.scalaj" % "scalaj-http_2.12" % "2.3.0"
  )