import io.odin._
import cats.effect.IO
import cats.effect.unsafe.IORuntime

object Console {

  implicit val ioRuntime: IORuntime = IORuntime.global

  val logger: Logger[IO] = consoleLogger[IO]()

}
