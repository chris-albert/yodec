package yodec.protobuf


object Protobuf {

  def isMSBSet(byte: Byte): Boolean = ???

  def dropMSB(byte: Byte): Byte = ???

  def getWireType(byte: Byte): Option[WireType] =
    byte match {
      case 0x00 => Some(WireType.Varint)
      case 0x01 => Some(WireType.SixtyFourBit)
      case 0x02 => Some(WireType.LengthDelimited)
      case 0x03 => Some(WireType.StartGroup)
      case 0x04 => Some(WireType.EndGroup)
      case 0x05 => Some(WireType.ThirtyTwoBit)
      case _    => None
    }

  def getFieldNumber(byte: Byte): Option[Int] = ???

  sealed trait WireType

  object WireType {
    case object Varint extends WireType
    case object SixtyFourBit extends WireType
    case object LengthDelimited extends WireType
    case object StartGroup extends WireType
    case object EndGroup extends WireType
    case object ThirtyTwoBit extends WireType
  }
}


