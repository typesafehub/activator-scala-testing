name := """scala-testing"""

version := "0.1.0"

scalaVersion := "2.11.7"

// ScalaTest
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.2" % "test"

// Specs2
libraryDependencies += "org.specs2" %% "specs2" % "2.4.1" % "test"

// ScalaCheck
libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.11.6" % "test"

// JUnit (and add-ons)
libraryDependencies ++= Seq(
  "junit" % "junit" % "4.11" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "org.hamcrest" % "hamcrest-core" % "1.3" % "test",
  "org.mockito" % "mockito-core" % "1.10.8" % "test"
)

// TestNG
libraryDependencies += "org.testng" % "testng" % "6.8.8" % "test"
