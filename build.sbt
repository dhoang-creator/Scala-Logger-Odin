ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.0"

lazy val root = (project in file("."))
  .settings(
    name := "ZIOTemplate"
  )

lazy val zioVersion = "2.0.13"

testFrameworks += new TestFramework("weaver.framework.ZIO")

libraryDependencies ++= Seq(

  // ZIO Core & Streams
  "dev.zio"               %% "zio"              % zioVersion,
  "dev.zio"               %% "zio-streams"      % zioVersion,

  // ZIO Cache
  "dev.zio"               %% "zio-cache"        % "0.2.2",

  // ZIO JSON
  "dev.zio"               %% "zio-json"         % "0.4.2",

  // ZIO Logging
  "dev.zio"               %% "zio-logging"      % "2.1.11",

  // ZIO Kafka
  "dev.zio"               %% "zio-kafka"        % "2.1.3",

  // Scala Test
  "org.scalactic"         %% "scalactic"        % "3.2.15",
  "org.scalatest"         %% "scalatest"        % "3.2.15"      % Test,

  // ZIO Test
  "dev.zio"               %% "zio-test"         % zioVersion    % Test,
  "dev.zio"               %% "zio-test-sbt"     % zioVersion    % Test,

  // Weaver Test
  "com.disneystreaming"   %% "weaver-zio"       % "0.6.15"      % Test
)