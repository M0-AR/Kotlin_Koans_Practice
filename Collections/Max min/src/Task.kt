// Return a customer who has placed the maximum amount of orders
fun Shop.getCustomerWithMaxOrders(): Customer? {
        val maxLengthOfOrder = customers.map{ it.orders.size }.max()
        return customers.first { it.orders.size == maxLengthOfOrder }
}

// Return the most expensive product that has been ordered by the given customer
fun getMostExpensiveProductBy(customer: Customer): Product? {
        val mostExpensiveProduct = customer.orders.map{ it.products.map{ it.price }.max() }
        val item = customer.orders.map { it.products.maxBy { it.price } }
        val maxProductPrice = item.map { it!!.price }.max()
        val product = item.filter { it!!.price == maxProductPrice }
        return product.first()
}

