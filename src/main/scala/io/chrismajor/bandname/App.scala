package io.chrismajor.bandname

object App {
  def main(args: Array[String]) {
    println(HttpHelper.getMarkup("http://www.google.co.uk"))
  }
}
