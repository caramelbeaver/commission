import org.junit.Test

import org.junit.Assert.*

class CommissionKtTest {

    @Test
    fun payment_visa() {
        val amount = 12500
        val sumAmount= 0
        val card = "VISA"
        val result = payment (12500, sumAmount, card)
        assertEquals(93.75,result)
    }
    @Test
    fun payment_visa_min() {
        val amount = 2500
        val sumAmount= 0
        val card = "VISA"
        val result = payment (2500, sumAmount, card)
        assertEquals(35.00,result)
    }
    @Test
    fun payment_mir() {
        val amount = 12500
        val sumAmount= 0
        val card = "MIR"
        val result = payment (12500, sumAmount, card)
        assertEquals(93.75,result)
    }

    @Test
    fun payment_vk() {
        val amount = 12500
        val sumAmount= 0

        val result = payment (12500, sumAmount)
        assertEquals(0,result)
    }
    @Test
    fun payment_maestro() {
        val amount = 12500
        val sumAmount= 80000
        val card = "Maestro"
        val result = payment (12500, sumAmount, card)
        assertEquals(55.0,result)
    }
    @Test
    fun payment_maestro_min() {
        val amount = 2500
        val sumAmount= 0
        val card = "Maestro"
        val result = payment (2500, sumAmount, card)
        assertEquals(0,result)
    }

    @Test
    fun payment_default() {
        val result = payment (7)
        assertEquals( 0,result)
    }


    @Test
    fun payment_default_special() {
        val result = payment (7)
        assertEquals( 0,result)
    }
}