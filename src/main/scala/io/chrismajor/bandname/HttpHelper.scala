package io.chrismajor.bandname

import scalaj.http.Http
import scalaj.http.HttpResponse

/**
  * Utility class for calling HTTP endpoints
  */
object HttpHelper {
  def getMarkup(url: String) :String = {
    val response: HttpResponse[String] = Http(url).asString
    response.body
  }
}
