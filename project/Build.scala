import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "crowdsource"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    jdbc,
    anorm,
    "org.reactivemongo" %% "play2-reactivemongo" % "0.9",
    "securesocial" %% "securesocial" % "2.1.1"
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
    resolvers += Resolver.url("sbt-plugin-snapshots", url("http://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns)
  )

}
