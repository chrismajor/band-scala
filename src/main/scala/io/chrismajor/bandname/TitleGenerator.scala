package io.chrismajor.bandname

/**
  * Business logic for title generation
  */
object TitleGenerator {
  def generateNewTitle() : String = {
    var validBandname = false

    do {
      val bandname = generateTitle()
      validBandname = bandname.isValid()

      if (validBandname) {
        bandname.filteredTitle
      }
    }
    while (validBandname)
  }

  private def generateTitle(): BandName = {
    val title = HttpHelper.getMarkup("https://en.wikipedia.org/wiki/Special:Random")

    // TODO: parse XML and retrieve the page title

    new BandName(title)
  }
}
