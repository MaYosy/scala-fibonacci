import mill._, scalalib._

trait MyScalaModule extends ScalaModule {
  def scalaVersion = "3.3.0"
}


object fib extends RootModule with MyScalaModule {
  def fib(n: String, fib: String) = T.command {
    runMain(s"xyz.mayosy.fibonacci.$fib.main", n)
  }

  object test extends ScalaTests {
    def testFramework = "org.scalatest.tools.Framework"
    def ivyDeps = Agg(
      ivy"org.scalactic::scalactic:3.2.16",
      ivy"org.scalatest::scalatest:3.2.16"
    )
  }
}
