package yodec.protobuf

import org.scalatest.{Matchers, WordSpec}

class ProtobufSpec extends WordSpec with Matchers {

  "isMSBSet" should {
    "be true if MSB is set" in {
      Protobuf.isMSBSet(0xFF.toByte) shouldBe true
    }
    "be false if MSB is not set" in {
      Protobuf.isMSBSet(0x0F.toByte) shouldBe false
    }
  }
}
