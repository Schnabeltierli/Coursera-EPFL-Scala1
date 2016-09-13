val w = "Hello"
w.groupBy(_.toChar).map(p => (p._1.toLower, p._2.length)).toList
val s = List("Hello","again","world")
s.mkString(" ")
