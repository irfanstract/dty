package dotty.conception.eutil




class FatalErrorException(val msg: String) extends Exception(msg)

object FatalErrorException
{

   //

   def unapply(e: FatalErrorException )
   = Some(e.msg)

}





val _ = {}
