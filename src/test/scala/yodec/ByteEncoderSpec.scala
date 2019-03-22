package yodec

import org.scalatest.{Matchers, WordSpec}

class ByteEncoderSpec extends WordSpec with Matchers {

  implicit val Test1Encoder: ByteEncoder[Test1] = ???

  case class Test1(a: Int)

  "Test1" should {
    "encode" in {//08 96 01
      ByteEncoder[Test1].encode(Test1(150)) shouldBe Some(Array(0x08,0x96,0x01))
    }
  }
}
