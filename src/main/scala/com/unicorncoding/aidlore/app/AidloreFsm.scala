package com.unicorncoding.aidlore.app

import java.io.File
import akka.actor.FSM

/**
  * Created by kog on 9. 06. 2016.
  */
object AidloreFsm {
  sealed trait AidloreState
  case object InitialState extends AidloreState
  case object CleanState extends AidloreState
  case object DirtyState extends AidloreState

  sealed trait AidloreStateData
  case object NoData extends AidloreStateData
}

object AidloreFsmProtocol {
  sealed trait AidloreStateMessage
  case class LoadFiles(files: List[File]) extends AidloreStateMessage
}

class AidloreFsm extends FSM[AidloreFsm.AidloreState, AidloreFsm.AidloreStateData] {

  initialize()
}
