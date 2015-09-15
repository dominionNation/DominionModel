package com.jwdl.models.cards

/**
 * @author jwillis
 */
trait Action {
  def plusBuys: Int
  def plusCards: Int
  def plusTreasures: Int
  def plusActions: Int
}