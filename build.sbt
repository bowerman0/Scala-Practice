import com.github.play2war.plugin._

organization  := "com.example"

version       := "0.1"

Play2WarKeys.servletVersion := "3.1"
Play2WarPlugin.play2WarSettings

Revolver.settings

scalaVersion  := "2.11.6"

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
    "org.specs2"          %%  "specs2-core"   % "2.3.11" % "test"//,
    //"com.microsoft.azure" %% "azure-serviceruntime" % "0.6.0"
  )
}

enablePlugins(JavaAppPackaging)


fork in run := true
