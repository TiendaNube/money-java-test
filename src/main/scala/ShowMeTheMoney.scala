object ShowMeTheMoney {

  class Money(var amount: Double, var currency: String) {

    def plus(amount: Double): Unit = this.amount = this.amount + amount

    override def equals(obj: Any): Boolean = {
      if (!obj.isInstanceOf[Money]) false
      val money2 = obj.asInstanceOf[Money]
      money2.amount.equals(this.amount) && money2.currency.equals(this.currency)
    }
  }

  def main(args: Array[String]): Unit = {
    val ars25 = new Money(25.00, "ARS")
    val ars10 = new Money(10.00, "ARS")

    ars25.plus(10)
    ars10.plus(25)

    assert(ars10 equals ars25)

  }

}
