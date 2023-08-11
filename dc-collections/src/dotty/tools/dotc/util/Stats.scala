package dotty.tools
package dotc
package util

import scala.annotation.internal.sharable

// import core.Contexts._
import collection.mutable

@sharable object Stats
extends
AnyRef
with StatsOps
{

  //

  inline val enabled = false

  // def maybeMonitored[T](op: => T)(using Context): T =
  //   if ctx.settings.YdetailedStats.value then
  //     monitored = true
  //     try op
  //     finally
  //       if hits.nonEmpty then
  //         aggregate()
  //         println()
  //         println(hits.toList.sortBy(_._2).map{ case (x, y) => s"$x -> $y" } mkString "\n")
  //         hits.clear()
  //   else op

} // Stats$

type StatsOps
= dotty.conception.StatsOps
