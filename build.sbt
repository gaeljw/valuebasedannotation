
scalaVersion := "2.13.17"

scalacOptions += "-release:17"

lazy val root = (project in file("."))
  .settings(
    name := "my-project",
    libraryDependencies ++= Seq(
      "com.softwaremill.sttp.tapir" %% "tapir-enumeratum" % "1.11.48"
    )
  )
