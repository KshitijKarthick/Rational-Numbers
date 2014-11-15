class RationalNumber(n: Int,d: Int){
	require(d!=0)
	private val g = gcd(n.abs, d.abs)
	val numerator : Int=n/g
	val denominator : Int=d/g
	override def toString=numerator+"/"+denominator
	def this(n: Int) = this(n, 1)
	def +(secondary: RationalNumber):RationalNumber=(add(secondary))
	def +(secondary: Int):RationalNumber=(add(secondary))
	def *(secondary: RationalNumber):RationalNumber=(multiply(secondary))
	def *(secondary: Int):RationalNumber=(multiply(secondary))
	def -(secondary: RationalNumber):RationalNumber=(subtract(secondary))
	def -(secondary: Int):RationalNumber=(subtract(secondary))
	def /(secondary: RationalNumber):RationalNumber=(divide(secondary))
	def /(secondary: Int):RationalNumber=(divide(secondary))
	def <(secondary: RationalNumber):Boolean=(lessThan(secondary))
	def >(secondary: RationalNumber):Boolean=(!lessThan(secondary))
	def add(secondary: RationalNumber):RationalNumber=new RationalNumber(numerator*secondary.denominator+secondary.numerator*denominator,denominator*secondary.denominator)
	def add(secondary: Int):RationalNumber=new RationalNumber(numerator+secondary*denominator,denominator)
	def subtract(secondary: RationalNumber):RationalNumber=new RationalNumber(numerator*secondary.denominator-secondary.numerator*denominator,denominator*secondary.denominator)
	def subtract(secondary: Int):RationalNumber=new RationalNumber(numerator-secondary*denominator,denominator)
	def multiply(secondary: RationalNumber):RationalNumber=new RationalNumber(numerator*secondary.numerator,denominator*secondary.denominator)
	def multiply(secondary: Int):RationalNumber=new RationalNumber(numerator*secondary,denominator)
	def divide(secondary: RationalNumber):RationalNumber=new RationalNumber(numerator*secondary.denominator,denominator*secondary.numerator)
	def divide(secondary: Int):RationalNumber=new RationalNumber(numerator,denominator*secondary)
	def lessThan(secondary: RationalNumber):Boolean={if(this.numerator*secondary.denominator<secondary.numerator*this.denominator)return true else false}
	def isEqual(secondary: RationalNumber):Boolean={if(secondary.numerator==numerator && secondary.denominator==denominator)true else false}
	def ==(secondary: RationalNumber):Boolean=(isEqual(secondary))
	def max(secondary: RationalNumber)=(if(this.lessThan(secondary))secondary else this)
	def min(secondary: RationalNumber)=(if(this.lessThan(secondary))this else secondary)
	def pow(secondary: Int):RationalNumber={
		if(secondary>0) 
			new RationalNumber(math.pow(numerator,secondary).toInt,math.pow(denominator,secondary).toInt) 
		else 
			new RationalNumber(math.pow(denominator,math.abs(secondary)).toInt,math.pow(numerator,math.abs(secondary)).toInt)
	}
	def multiplicativeInverse(secondary: Int):RationalNumber=(pow(secondary* -1))
	def additiveInverse():RationalNumber=new RationalNumber(numerator* -1,denominator)
	def ^(secondary: Int):RationalNumber=(pow(secondary))
	private def gcd(a: Int, b: Int): Int = (if(b==0) a else gcd(b,a%b))
}