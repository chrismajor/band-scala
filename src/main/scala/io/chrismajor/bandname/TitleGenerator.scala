package io.chrismajor.bandname

/**
  * Business logic for title generation
  */
object TitleGenerator {
  def generateNewTitle():String = {
    var validBandname = false
    var bandname : BandName = null

    while (!validBandname) {
      bandname = generateTitle()
      validBandname = bandname.isValid()
    }

    bandname.filteredTitle
  }

  private def generateTitle(): BandName = {
    val title = HttpHelper.getMarkup("https://en.wikipedia.org/wiki/Special:Random")

    // TODO: parse XML and retrieve the page title

    new BandName(title)
  }
}
