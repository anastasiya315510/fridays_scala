import EntryValues.{dayStream, endData, startData, starts}

import java.time.{DayOfWeek, LocalDate, Month}
/*
find all fridays 13 and sort by descending order
 */

object Main extends App{

  val start = EntryValues.startData
   val end = EntryValues.endData
   dayStream( start, end)
     .filter(locale=>locale.getDayOfWeek==DayOfWeek.FRIDAY)
     .map(year=> (year.getYear, 1 ))
     .groupBy(_._1)
     .mapValues(_.size)
     .toSeq
     .sortWith(_._2>_._2)
     .foreach(println)






}
