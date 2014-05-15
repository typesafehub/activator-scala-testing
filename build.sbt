name := """scala-test-samples"""

version := "1.0"

scalaVersion := "2.11.0"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.1.6" % "test",
  "org.specs2" %% "specs2" % "2.3.12" % "test",
  "org.scalacheck" %% "scalacheck" % "1.11.4" % "test",
  "junit" % "junit" % "4.11" % "test",
  "com.novocode" % "junit-interface" % "0.9" % "test",
  "org.hamcrest" % "hamcrest-core" % "1.3",
  "org.mockito" % "mockito-core" % "1.9.5" % "test",
  "org.testng" % "testng" % "6.8.8" % "test"
)

