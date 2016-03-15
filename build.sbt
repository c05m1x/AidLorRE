name := "aidlore"

version := "0.3.3-alpha"

scalaVersion := "2.11.8"

jfxSettings

JFX.artifactBaseNameValue <<= name

JFX.mainClass := Some("com.unicorncoding.aidlore.app.AidLoreApp")
