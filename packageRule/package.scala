package object packageRule {
    val PI = 3.14159
    val THETA = 2.0
    val SIGMA = 1.9
}

class Computation{
    def computeArea(r:Double) = packageRule.PI * r *r
}
