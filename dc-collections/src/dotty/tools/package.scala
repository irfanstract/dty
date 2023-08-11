package dotty

package object tools {

  export dotty.conception.ListOfNil

  /** Throws an `UnsupportedOperationException` with the given method name. */
  export dotty.conception.unsupported

  /** Forward-ported from the explicit-nulls branch. */
  export dotty.conception.{
    uncheckedNN ,
    toOption ,
    eqn ,
    nen ,
  }

  export dotty.conception.{
    resultWrapper ,
    WrappedResult ,
    result ,
  }

  export dotty.conception.{
    unreachable ,
    assertShort ,
  }

  // // Ensure this object is already classloaded, since it's only actually used
  // // when handling stack overflows and every operation (including class loading)
  // // risks failing.
  // dotty.tools.dotc.core.handleRecursive
 }
