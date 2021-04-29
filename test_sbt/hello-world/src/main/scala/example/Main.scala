package example
import yahoofinance.YahooFinance._
import yahoofinance.{Stock, YahooFinance}
import yahoofinance.quotes.fx.FxSymbols
import java.math.BigDecimal
object Main extends App {

  println("hello")
  def cube(x: Int) = {
    x * x * x
  }



  val stock: Stock = YahooFinance.get("AAPL")
  val stockPriceAPI: Double = stock.getQuote.getPrice.doubleValue()
  println(stockPriceAPI)
}

class StockSymbol private (val raw: String) extends AnyVal {
  override def toString: String = raw
}

object StockSymbol {

  def apply(raw: String) = new StockSymbol(raw)


}


//179.17 at 4 pm