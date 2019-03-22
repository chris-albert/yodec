import sbt._

object Dependencies {
  lazy val scalaTest  = "org.scalatest" %% "scalatest"   % "3.0.5"
  lazy val scalaCheck = "org.scalacheck" %% "scalacheck" % "1.14.0"

  lazy val cats       = "org.typelevel" %% "cats-core"   % "1.5.0"
  lazy val catsEffect = "org.typelevel" %% "cats-effect" % "1.1.0"

  lazy val fs2        = "co.fs2" %% "fs2-core" % "1.0.1"
  lazy val fs2IO      = "co.fs2" %% "fs2-io"   % "1.0.1"

  lazy val atto = "org.tpolecat" %% "atto-core"    % "0.6.4"
  
  lazy val shapeless = "com.chuusai" %% "shapeless" % "2.3.3"
}
