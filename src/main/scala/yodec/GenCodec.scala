package yodec


trait ByteDecoder[A] extends GenDecoder[Option, Array[Byte], A]

trait GenEncoder[F[_], A, B] {
  def encode(a: A): F[B]
}

trait GenDecoder[F[_], A, B] {
  def decode(b: B): F[A]
}

trait GenCodec[F[_], A, B] {
  def encoder: GenEncoder[F, A, B]
  def decoder: GenDecoder[F, A, B]
}
