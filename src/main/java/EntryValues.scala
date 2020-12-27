import java.time.{LocalDate, LocalDateTime}

object EntryValues {
  val starts:Int =2015
  val ends:Int =2030
  val startData = LocalDate.of(starts,1,13)
  val endData = LocalDate.of(ends,1,14)
  def dayStream(start: LocalDate, end: LocalDate) = Stream.iterate(start)(_ plusMonths  1) takeWhile (_ isBefore end)


}
