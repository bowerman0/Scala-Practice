import com.github.play2war.plugin._

organization  := "com.example"

name          := "hello"
version       := "0.1"

scalaVersion  := "2.11.6"

Play2WarKeys.servletVersion := "3.1"
Play2WarKeys.targetName := Some("xxxx")
Play2WarPlugin.play2WarSettings

Revolver.settings

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val akkaV = "2.3.9"
  val sprayV = "1.3.3"
  Seq(
    "io.spray"            %%  "spray-can"     % sprayV,
    "io.spray"            %%  "spray-routing" % sprayV,
    "io.spray"            %%  "spray-testkit" % sprayV  % "test",
    "com.typesafe.akka"   %%  "akka-actor"    % akkaV,
    "com.typesafe.akka"   %%  "akka-testkit"  % akkaV   % "test",
    "org.specs2"          %%  "specs2-core"   % "2.3.11" % "test",
    "com.github.play2war.ext" %% "redirect-playlogger" % "1.0.1"//,
  )
}

//enablePlugins(JavaAppPackaging)


fork in run := true
