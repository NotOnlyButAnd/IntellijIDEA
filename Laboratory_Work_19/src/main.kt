fun addElement(arr: Array<Product>, element: Product): Array<Product> {
    val mutableArray = arr.toMutableList()
    mutableArray.add(element)
    return mutableArray.toTypedArray()
}

fun main() {

    val pathToJSONProducts : String = "F:\\Кирилл\\IntellijIDEA projects\\Laboratory_Work_19\\src\\product.json"
    val pathToJSONEmployees : String = "F:\\Кирилл\\IntellijIDEA projects\\Laboratory_Work_19\\src\\employee.json"
    val pathToJSONRealizations : String = "F:\\Кирилл\\IntellijIDEA projects\\Laboratory_Work_19\\src\\realization.json"
    val pathToJSONShops : String = "F:\\Кирилл\\IntellijIDEA projects\\Laboratory_Work_19\\src\\shop.json"

    var prodsFromJSON : Array<Product> = Product.readfromJSON(pathToJSONProducts)
    println("------------------\nProducts\n------------------")
    prodsFromJSON.forEach {
        it.printInfo()
    }


    // Добавление продукта в массив продуктов
    /*
    val product1 : Product = Product(3, "Popa", 100, 1, 0, "Left ass-half; Right ass-half", "2030-01-01")
    prodsFromJSON = addElement(prodsFromJSON, product1)
    */

    var employeesFromJSON : Array<Employee> = Employee.readfromJSON(pathToJSONEmployees)
    println("-----------------\nEmployees\n------------------")
    employeesFromJSON.forEach {
        it.printInfo()
    }


    var realizationsFromJSON : Array<Realization> = Realization.readfromJSON(pathToJSONRealizations)
    println("----------------\nRealizations\n----------------")
    realizationsFromJSON.forEach {
        it.printInfo()
    }


    var shopsFromJSON : Array<Shop> = Shop.readfromJSON(pathToJSONShops)
    println("-------------------\nShops\n-------------------")
    shopsFromJSON.forEach {
        it.printInfo()
    }

    // Запись продуктов в JSON
    //Product.writeToJSON(pathToJSONProducts, prodsFromJSON)

    //var prodList : Products = Products()

    /*
    prodList.readfromJSON(pathToJSONProducts)
    prodList.productList.forEach{
        it.printInfo()
    }
    */


    /*
    val product1 : Product = Product(1, "Popa", 100, 1, 0, "Left ass-half; Right ass-half", "2030-01-01")
    product1.printInfo()

    product1.cost = 200

    product1.printInfo()

    val product2 : Product = Product(2, "Siski", 300, 3, 1, "Left boob; Right boob", "2030-01-01")
    product2.printInfo()

    val employee1 : Employee = Employee(1, "Продавец", 10000, "Минин", "Кирилл", "Сергеевич")
    employee1.printInfo()



    val shop1 : Shop = Shop(1, "ул. Российская, д. 71/1")
    shop1.products.add(product1)
    shop1.products.add(product2)
    shop1.printProductsInfo()

    val realization1:Realization = Realization(1,product1,1, shop1)
    realization1.printInfo()
     */

    //val product1 : Product = Product(1, "Popa", 100, 1, 0, "Left ass-half; Right ass-half", "2030-01-01")


    // Простой пример чтения из многострочной строки в объект класса Products
    /*
    val jsonStr = """
    {
        "id": 1,
        "name": "Яблоко",
        "cost": 35,
        "count": 1000,
        "countSold": 0,
        "structure": "Undefinded",
        "expirationDate": "2022-01-01"
    }
    """.trimIndent()

    val product2: Product = Gson().fromJson<Product>(jsonStr, Product::class.java)
    product2.printInfo()
     */

}