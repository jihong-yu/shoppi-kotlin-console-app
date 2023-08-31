package screen

class ShoppingCategory {

    fun showCategories() {
        val categories = arrayOf("패션", "전자기기", "반려동물용품")

        for (category in categories) {
            println(category)
        }

        println("=> 장바구니로 이동하시려면 #을 입력해주세요")

        var selectedCategory = readLine()
        while (selectedCategory.isNullOrBlank()) {
            println("값을 입력해주세요")
            selectedCategory = readLine()

        }


        if (selectedCategory == "#") {
            // TODO 1. 장바구니 이동

        } else {

            if (categories.contains(selectedCategory.trim())) {
                // 카테고리 상품 목록 보여주기
                val shoppingProductList = ShoppingProductList()
                shoppingProductList.showProducts(selectedCategory.trim())
            } else {
                // 카테고리 목록에 없는 값을 입력하는 경우
                println("선택 하신 카테고리 [$selectedCategory] 는 목록에 존재하지 않습니다. 다시 선택해주세요")
                showCategories()
            }

        }
    }

}