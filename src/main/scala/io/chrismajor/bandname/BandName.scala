package io.chrismajor.bandname

/**
  * Created by Christo on 26/02/2017.
  */
class BandName (
               var originalTitle: String,
               var filteredTitle: String,
               var pageUrl: String
               ) {

  def this(originalTitle: String) = {
    this(originalTitle, filterTitle(originalTitle), "")
  }

  def isValid() : Boolean = {
    def words = filteredTitle.split(" ").length
    def length = filteredTitle.length()

    return words < 5 && length < 35    true
  }

  private def filterTitle(title: String) : String = {
    // remove the bracket suffix (if exists)
    title.split("\\(")(0)
  }
}
