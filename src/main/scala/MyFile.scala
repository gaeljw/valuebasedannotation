package com.myproject

import sttp.tapir.Schema
import sttp.tapir.codec.enumeratum.TapirCodecEnumeratum

import java.time.LocalDateTime

case class MyCaseClass(dateTime: LocalDateTime)

object MyFile extends TapirCodecEnumeratum {

  implicit val schemaForMyCustomType: Schema[MyCaseClass] = Schema.derived

}
