package dotty.tools






object runEws {

  def main(args: IArray[String] ): Unit
  = {

    val wm = new dotc.util.WeakHashSet[String]() {
      override
      def hash(key: String) = key.hashCode
    }

    println(s"'wm.toString()': ${wm.toString }")

  }

}






