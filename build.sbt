course := "progfun1"
assignment := "forcomp"

scalaVersion := "3.3.0"

scalacOptions ++= Seq("-language:implicitConversions", "-deprecation")

libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
