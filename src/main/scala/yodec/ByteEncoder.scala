package yodec

trait ByteEncoder[A] extends GenEncoder[Option, A, Array[Byte]]

object ByteEncoder {

  def apply[A: ByteEncoder]: ByteEncoder[A] = implicitly[ByteEncoder[A]]

  def instance[A](f: A => Option[Array[Byte]]): ByteEncoder[A] = new ByteEncoder[A] {
    override def encode(a: A): Option[Array[Byte]] = f(a)
  }

  def always[A](f: A => Array[Byte]): ByteEncoder[A] = instance(a => Some(f(a)))
  def alwaysOne[A](f: A => Byte): ByteEncoder[A] = always(a => Array(f(a)))

  implicit val IntByteEncoder    : ByteEncoder[Int]     = alwaysOne(_.toByte)
  implicit val LongByteEncoder   : ByteEncoder[Long]    = alwaysOne(_.toByte)
  implicit val DoubleByteEncoder : ByteEncoder[Double]  = alwaysOne(_.toByte)
  implicit val BooleanByteEncoder: ByteEncoder[Boolean] = alwaysOne(if(_) 0 else 1)
  implicit val StringByteEncoder : ByteEncoder[String]  = always(_.getBytes)

}
