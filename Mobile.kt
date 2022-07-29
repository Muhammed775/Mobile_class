class Mobile {
    var Brand:String?=""
    var Model:String?=""
    var MRP:Int=0
    var Discount:Int=0

  //جعلتتها برايفت لاني لا احتاج للوصول لها من الكلاس الرئيسي
   private fun getActualPrice():Int{
      //اضفنا متغير ثالث ليسهل العملية الحسابية فقط لا اكثر
        var s = 100- Discount

        return (s*MRP)/100
    }
    fun printDetails(){
        println("Brand Is : $Brand \n Model Is : $Model \n MPR Is : $MRP \$ \n Discount Is : $Discount % ")
        println("The Price After Discount : ${getActualPrice()}  \$ \n")

    }
}