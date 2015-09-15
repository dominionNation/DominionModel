// Name of project
name := "Dominion Logic"

// Project Version
version := "0.0.1"

// Version of Scala
scalaVersion := "2.11.7"

// Dependencies
libraryDependencies ++= Seq(
	"org.scalafx" %% "scalafx" % "8.0.40-R8",
	"com.typesafe.slick" %% "slick" % "3.0.2",
	"org.slf4j" % "slf4j-nop" % "1.6.4",
	"com.zaxxer" % "HikariCP" % "2.4.1",
	"com.typesafe" % "config" % "1.3.0"
)

// Fork a new JVM for 'run' and 'test:run'
fork :=true