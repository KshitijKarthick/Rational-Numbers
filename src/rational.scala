class RationalNumber(n: Int,d: Int){
	require(d!=0)
	private val g = gcd(n.abs, d.abs)
	val numerator : Int=n/g
	val denominator : Int=d/g
	override def toString=numerator+"/"+denominator
	def this(n: Int) = this(n, 1)
	def add(second: RationalNumber):RationalNumber=new RationalNumber(numerator*second.denominator+second.numerator*denominator,denominator*second.denominator)
	def subtract(second: RationalNumber):RationalNumber=new RationalNumber(numerator*second.denominator-second.numerator*denominator,denominator*second.denominator)
	def multiply(second: RationalNumber):RationalNumber=new RationalNumber(numerator*second.numerator,denominator*second.denominator)
	def divide(second: RationalNumber):RationalNumber=new RationalNumber(numerator*second.denominator,denominator*second.numerator)
	def lessThan(that: RationalNumber)=(this.numerator*that.denominator<that.numerator*this.denominator)
	def max(that: RationalNumber)=(if(this.lessThan(that))that else this)
	private def gcd(a: Int, b: Int): Int = (if(b==0) a else gcd(b,a%b))
}