import io.odin.meta.Render

/*
  Render is one of the data types found within the Logger Trait and should be inspected in the below:
    - Since Logger methods are polymorphic for messages hence the reason to Render[M]
    - Here, we are wrapping the log and then converting it to a String val whilst maintaining it's current val
 */

case class Log(s: String, i: Int)

object Log {
  implicit val render: Render[Log] = Render.fromToString
}
