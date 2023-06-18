import io.odin.meta.{Position, Render, ToThrowable}

trait Logger[F[_]] {

  def trace[M](msg: => M)(implicit render: Render[M], position: Position): F[Unit]

  def trace[M, E](msg: => M, t: E)(implicit render: Render[M], tt: ToThrowable[E], position: Position): F[Unit]

  def trace[M](msg: => M, ctx: Map[String, String])(implicit render: Render[M], position: Position): F[Unit]

  def trace[M, E](msg: => M, ctx: Map[String, String], t: E)(implicit render: Render[M], tt: Throwable[E], position: Position): F[Unit]
}
