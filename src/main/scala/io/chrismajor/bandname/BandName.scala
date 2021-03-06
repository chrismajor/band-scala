package io.chrismajor.bandname

/**
  * Class to represent a band name generated by random wikipedia page
  */
class BandName (
               var originalTitle: String,
               var filteredTitle: String,
               var pageUrl: String
               ) {

  def this(originalTitle: String) = {
    // TODO: fix this cludge so that the filterTitle method is called...
    this(originalTitle, originalTitle.split("\\(")(0), "")
//    this(originalTitle, filterTitle(originalTitle), "")
  }

  def isValid() : Boolean = {
    def words = filteredTitle.split(" ").length
    def length = filteredTitle.length()

    words < 5 && length < 35
  }

  private def filterTitle(title: String) : String = {
    // remove the bracket suffix (if exists)
    title.split("\\(")(0)
  }
}
