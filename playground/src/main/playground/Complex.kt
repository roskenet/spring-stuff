data class Complex(val real: Double, val imaginary: Double) {
    operator fun plus(c: Complex) =
        Complex(real + c.real, imaginary + c.imaginary)
    operator fun minus(c: Complex) =
        Complex(real - c.real, imaginary - c.imaginary)
    operator fun times(c: Complex) =
        Complex(real * c.real - imaginary * c.imaginary, real * c.imaginary + imaginary * c.real)
    operator fun div(c: Complex): Complex {
        val denominator = c.real * c.real + c.imaginary * c.imaginary
        return Complex(
            (real * c.real + imaginary * c.imaginary) / denominator,
            (imaginary * c.real - real * c.imaginary) / denominator
        )
    }

    override fun toString() = "$real + ${imaginary}i"
}

fun main() {
    val c1 = Complex(1.0, 2.0)
    val c2 = Complex(3.0, 4.0)

    println(c1 + c2)
    println(c1 - c2)
    println(c1 * c2)
    println(c1 / c2)
}