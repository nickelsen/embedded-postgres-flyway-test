
ThisBuild / scalaVersion     := "2.13.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "embedded-postgres-flyway-test",
    libraryDependencies ++= Seq(
      "io.zonky.test" % "embedded-postgres" % "2.0.1",
      "io.zonky.test.postgres" % "embedded-postgres-binaries-darwin-amd64" % "12.5.0-1" % Runtime,
      "org.flywaydb" % "flyway-core" % "9.0.3",
    )
  )
