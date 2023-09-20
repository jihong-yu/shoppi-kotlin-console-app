package data

//싱글톤 객체로 지정하여 어디서든 접근할 수 있도록 처리
object CartItems {
    private val mutableProducts = mutableMapOf<Product, Int>()
    val products: Map<Product, Int> = mutableProducts //외부에서 readOnly만 가능하도록 Inmutable형식으로 설정

    fun addProduct(product: Product) {
        mutableProducts[product]?.let {
            mutableProducts[product] = it + 1
        } ?: kotlin.run {
            mutableProducts[product] = 1
        }
    }

}
