/* ScalablyTyped configuration */
enablePlugins(ScalablyTypedConverterPlugin)

scalaVersion := "2.13.9"
name := "oltest"
version := "0.1"

/* javascript / typescript deps */
Compile / npmDependencies ++= Seq(
  "ol" -> "7.1.0",
)

/* disabled because it somehow triggers many warnings */
scalaJSLinkerConfig ~= (_.withSourceMap(false))

// because npm is slow
useYarn := true
