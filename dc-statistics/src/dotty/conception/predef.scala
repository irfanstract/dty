package dotty.conception










val ListOfNil
: List[Nil.type]
= Nil :: Nil




/**
 *
 * Throws an `UnsupportedOperationException` with the given method name.
 *
 */
def unsupported(methodName: String): Nothing =
  throw new UnsupportedOperationException(methodName)




/* Forward-ported from the explicit-nulls branch. */

extension [T](x: T | Null)

  /**
   * Should be used when we know from the context that `x` is not null.
   * Flow-typing under explicit nulls will automatically insert many necessary
   * occurrences of uncheckedNN.
   */
  transparent inline
  def uncheckedNN: T
  = x.asInstanceOf[T]

  inline def
  toOption: Option[T]
  =
    if x == null then None
    else Some(x.asInstanceOf[T])

end extension

/* Nullable eq and ne. */
extension [T <: AnyRef](x: T | Null)
{

  inline def eqn (y: T | Null)
  =
    x.asInstanceOf[AnyRef] eq y.asInstanceOf[AnyRef]

  inline def nen(y: T | Null)
  : Boolean
  = !eqn(y)

}




object resultWrapper {
  opaque type WrappedResult[T] = T
  private[dotty] def unwrap[T](x: WrappedResult[T]): T = x
  private[dotty] def wrap[T](x: T): WrappedResult[T] = x
}
type WrappedResult[T] = resultWrapper.WrappedResult[T]
def WrappedResult[T](x: T) = resultWrapper.wrap(x)
def result[T](using x: WrappedResult[T]): T = resultWrapper.unwrap(x)




/**
 *
 * [flow-control]
 * meant to be called to signify unreachability.
 *
 */
def unreachable(x: Any = "<< this case was declared unreachable >>")
: Nothing
=
  throw new MatchError(x)

transparent inline
def assertShort(inline assertion: Boolean, inline message: Any = null)
: Unit
=
  if !assertion then
    val msg = message
    val e = if msg == null then AssertionError() else AssertionError("assertion failed: " + msg)
    e.setStackTrace(Array())
    throw e









