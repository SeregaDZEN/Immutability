import org.junit.Test
import kotlin.test.assertEquals

class CommissionTest {
    @Test
    fun test (){

        val type = "MasterCard"
        val amount= 500
        val previousForMonth = 0

        val result = commission(typeCard = type,  amount = amount, previousForMonth = previousForMonth)
        assertEquals(0,result)
    }


}