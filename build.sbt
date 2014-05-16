name := """scala-test-samples"""

version := "1.0"

scalaVersion := "2.11.0"

// ScalaTest
libraryDependencies += "org.scalatest" %% "scalatest" % "2.1.6" % "test"

// Specs2
libraryDependencies += "org.specs2" %% "specs2" % "2.3.12" % "test"

// ScalaCheck
libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.11.4" % "test"

// JUnit (and add-ons)
libraryDependencies ++= Seq(
  "junit" % "junit" % "4.11" % "test",
  "com.novocode" % "junit-interface" % "0.9" % "test",
  "org.hamcrest" % "hamcrest-core" % "1.3" % "test",
  "org.mockito" % "mockito-core" % "1.9.5" % "test"
)

// TestNG
libraryDependencies += "org.testng" % "testng" % "6.8.8" % "test"



