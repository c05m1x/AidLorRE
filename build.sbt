name := "aidlore"

version := "0.3.3-alpha"

scalaVersion := "2.11.8"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

// http://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.11
libraryDependencies += "com.typesafe.akka" % "akka-actor_2.11" % "2.4.7"


jfxSettings

JFX.artifactBaseNameValue <<= name

JFX.mainClass := Some("com.unicorncoding.aidlore.app.AidLoreApp")


