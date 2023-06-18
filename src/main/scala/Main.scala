import io.odin.{Logger, consoleLogger}
import io.odin.zio._
import zio.{ZIO, ZIOApp}

object Main extends ZIOApp {

  // the below takes the Logger wrapper for the Effectual Type although it was originally purposed for Cats Effect IO
  val logger: Logger[ZIO[Unit]] = consoleLogger()

  def run: ZIO[Unit] = {
    logger.info("Hello world")
  }
}