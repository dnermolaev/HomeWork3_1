import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calcNoFeeMaster() {

        val amount = 10_000
        val card = "Master"
        val previousTransferSum = 1_000
        val feeRateMasterMaestro = 0.006
        val feeRateMinMasterMaestro = 20
        val limitForNoFeeMasterMaestro = 75_000
        val monthlyLimit = 600_000
        val dailyLimit = 150_000
        val feeRateVisaMir = 0.0075
        val feeRateMinVisaMir = 35
        val dailyLimitVkpay = 15_000
        val monthlyLimitVkpay = 40_000

        val result = calcFee(
            transferAmount =amount,
            cardType = card,
            previousTransfersSumMonth = previousTransferSum
        )

        assertEquals(0, result)
    }

    @Test
    fun calcNoFeeMaestro() {

        val amount = 10_000
        val card = "Maestro"
        val previousTransferSum = 1_000
        val feeRateMasterMaestro = 0.006
        val feeRateMinMasterMaestro = 20
        val limitForNoFeeMasterMaestro = 75_000
        val monthlyLimit = 600_000
        val dailyLimit = 150_000
        val feeRateVisaMir = 0.0075
        val feeRateMinVisaMir = 35
        val dailyLimitVkpay = 15_000
        val monthlyLimitVkpay = 40_000

        val result = calcFee(
            transferAmount =amount,
            cardType = card,
            previousTransfersSumMonth = previousTransferSum
        )

        assertEquals(0, result)
    }

    @Test
    fun calcFeeMaster() {

        val amount = 10_000
        val card = "Master"
        val previousTransferSum = 70_000
        val feeRateMasterMaestro = 0.006
        val feeRateMinMasterMaestro = 20
        val limitForNoFeeMasterMaestro = 75_000
        val monthlyLimit = 600_000
        val dailyLimit = 150_000
        val feeRateVisaMir = 0.0075
        val feeRateMinVisaMir = 35
        val dailyLimitVkpay = 15_000
        val monthlyLimitVkpay = 40_000

        val result = calcFee(
            transferAmount =amount,
            cardType = card,
            previousTransfersSumMonth = previousTransferSum
        )

        assertEquals(80.0, result)
    }

    @Test
    fun calcFeeMaestro() {

        val amount = 15_000
        val card = "Maestro"
        val previousTransferSum = 70_000
        val feeRateMasterMaestro = 0.006
        val feeRateMinMasterMaestro = 20
        val limitForNoFeeMasterMaestro = 75_000
        val monthlyLimit = 600_000
        val dailyLimit = 150_000
        val feeRateVisaMir = 0.0075
        val feeRateMinVisaMir = 35
        val dailyLimitVkpay = 15_000
        val monthlyLimitVkpay = 40_000

        val result = calcFee(
            transferAmount =amount,
            cardType = card,
            previousTransfersSumMonth = previousTransferSum
        )

        assertEquals(110.0, result)
    }

    @Test
    fun calcMinFeeVisa() {

        val amount = 4_000
        val card = "Visa"
        val previousTransferSum = 1_000
        val feeRateMasterMaestro = 0.006
        val feeRateMinMasterMaestro = 20
        val limitForNoFeeMasterMaestro = 75_000
        val monthlyLimit = 600_000
        val dailyLimit = 150_000
        val feeRateVisaMir = 0.0075
        val feeRateMinVisaMir = 35
        val dailyLimitVkpay = 15_000
        val monthlyLimitVkpay = 40_000

        val result = calcFee(
            transferAmount =amount,
            cardType = card,
            previousTransfersSumMonth = previousTransferSum
        )

        assertEquals(35, result)
    }

    @Test
    fun calcFeeVisa() {

        val amount = 10_000
        val card = "Visa"
        val previousTransferSum = 1_000
        val feeRateMasterMaestro = 0.006
        val feeRateMinMasterMaestro = 20
        val limitForNoFeeMasterMaestro = 75_000
        val monthlyLimit = 600_000
        val dailyLimit = 150_000
        val feeRateVisaMir = 0.0075
        val feeRateMinVisaMir = 35
        val dailyLimitVkpay = 15_000
        val monthlyLimitVkpay = 40_000

        val result = calcFee(
            transferAmount =amount,
            cardType = card,
            previousTransfersSumMonth = previousTransferSum
        )

        assertEquals(75.0, result)
    }

    @Test
    fun calcMinFeeMir() {

        val amount = 2_000
        val card = "Mir"
        val previousTransferSum = 1_000
        val feeRateMasterMaestro = 0.006
        val feeRateMinMasterMaestro = 20
        val limitForNoFeeMasterMaestro = 75_000
        val monthlyLimit = 600_000
        val dailyLimit = 150_000
        val feeRateVisaMir = 0.0075
        val feeRateMinVisaMir = 35
        val dailyLimitVkpay = 15_000
        val monthlyLimitVkpay = 40_000

        val result = calcFee(
            transferAmount =amount,
            cardType = card,
            previousTransfersSumMonth = previousTransferSum
        )

        assertEquals(35, result)
    }

    @Test
    fun calcFeeMir() {

        val amount = 20_000
        val card = "Mir"
        val previousTransferSum = 1_000
        val feeRateMasterMaestro = 0.006
        val feeRateMinMasterMaestro = 20
        val limitForNoFeeMasterMaestro = 75_000
        val monthlyLimit = 600_000
        val dailyLimit = 150_000
        val feeRateVisaMir = 0.0075
        val feeRateMinVisaMir = 35
        val dailyLimitVkpay = 15_000
        val monthlyLimitVkpay = 40_000

        val result = calcFee(
            transferAmount =amount,
            cardType = card,
            previousTransfersSumMonth = previousTransferSum
        )

        assertEquals(150.0, result)
    }

    @Test
    fun calcFeeVkpay() {

        val amount = 10_000
        val card = "Vkpay"
        val previousTransferSum = 1_000
        val feeRateMasterMaestro = 0.006
        val feeRateMinMasterMaestro = 20
        val limitForNoFeeMasterMaestro = 75_000
        val monthlyLimit = 600_000
        val dailyLimit = 150_000
        val feeRateVisaMir = 0.0075
        val feeRateMinVisaMir = 35
        val dailyLimitVkpay = 15_000
        val monthlyLimitVkpay = 40_000

        val result = calcFee(
            transferAmount =amount,
            cardType = card,
            previousTransfersSumMonth = previousTransferSum
        )

        assertEquals(0, result)
    }

    @Test
    fun calcFeeMasterStopLimit() {

        val amount = 160_000
        val card = "Master"
        val previousTransferSum = 1_000
        val feeRateMasterMaestro = 0.006
        val feeRateMinMasterMaestro = 20
        val limitForNoFeeMasterMaestro = 75_000
        val monthlyLimit = 600_000
        val dailyLimit = 150_000
        val feeRateVisaMir = 0.0075
        val feeRateMinVisaMir = 35
        val dailyLimitVkpay = 15_000
        val monthlyLimitVkpay = 40_000

        val result = calcFee(
            transferAmount =amount,
            cardType = card,
            previousTransfersSumMonth = previousTransferSum
        )

        assertEquals(-1, result)
    }

    @Test
    fun calcFeeMaestroStopLimit() {

        val amount = 160_000
        val card = "Maestro"
        val previousTransferSum = 1_000
        val feeRateMasterMaestro = 0.006
        val feeRateMinMasterMaestro = 20
        val limitForNoFeeMasterMaestro = 75_000
        val monthlyLimit = 600_000
        val dailyLimit = 150_000
        val feeRateVisaMir = 0.0075
        val feeRateMinVisaMir = 35
        val dailyLimitVkpay = 15_000
        val monthlyLimitVkpay = 40_000

        val result = calcFee(
            transferAmount =amount,
            cardType = card,
            previousTransfersSumMonth = previousTransferSum
        )

        assertEquals(-1, result)
    }

    @Test
    fun calcFeeVisaStopLimit() {

        val amount = 10_000
        val card = "Visa"
        val previousTransferSum = 600_000
        val feeRateMasterMaestro = 0.006
        val feeRateMinMasterMaestro = 20
        val limitForNoFeeMasterMaestro = 75_000
        val monthlyLimit = 600_000
        val dailyLimit = 150_000
        val feeRateVisaMir = 0.0075
        val feeRateMinVisaMir = 35
        val dailyLimitVkpay = 15_000
        val monthlyLimitVkpay = 40_000

        val result = calcFee(
            transferAmount =amount,
            cardType = card,
            previousTransfersSumMonth = previousTransferSum
        )

        assertEquals(-1, result)
    }

    @Test
    fun calcFeeMirStopLimit() {

        val amount = 10_000
        val card = "Mir"
        val previousTransferSum = 600_000
        val feeRateMasterMaestro = 0.006
        val feeRateMinMasterMaestro = 20
        val limitForNoFeeMasterMaestro = 75_000
        val monthlyLimit = 600_000
        val dailyLimit = 150_000
        val feeRateVisaMir = 0.0075
        val feeRateMinVisaMir = 35
        val dailyLimitVkpay = 15_000
        val monthlyLimitVkpay = 40_000

        val result = calcFee(
            transferAmount =amount,
            cardType = card,
            previousTransfersSumMonth = previousTransferSum
        )

        assertEquals(-1, result)
    }

    @Test
    fun calcFeeVkpayStopLimit() {

        val amount = 10_000
        val card = "Vkpay"
        val previousTransferSum = 600_000
        val feeRateMasterMaestro = 0.006
        val feeRateMinMasterMaestro = 20
        val limitForNoFeeMasterMaestro = 75_000
        val monthlyLimit = 600_000
        val dailyLimit = 150_000
        val feeRateVisaMir = 0.0075
        val feeRateMinVisaMir = 35
        val dailyLimitVkpay = 15_000
        val monthlyLimitVkpay = 40_000

        val result = calcFee(
            transferAmount =amount,
            cardType = card,
            previousTransfersSumMonth = previousTransferSum
        )

        assertEquals(-1, result)
    }

    @Test
    fun calcFeeDeafult() {

        val amount = 10_000
        val feeRateMasterMaestro = 0.006
        val feeRateMinMasterMaestro = 20
        val limitForNoFeeMasterMaestro = 75_000
        val monthlyLimit = 600_000
        val dailyLimit = 150_000
        val feeRateVisaMir = 0.0075
        val feeRateMinVisaMir = 35
        val dailyLimitVkpay = 15_000
        val monthlyLimitVkpay = 40_000

        val result = calcFee(
            transferAmount =amount,
        )

        assertEquals(0, result)
    }

    @Test
    fun calcFeeDeafultCardType() {

        val amount = 10_000
        val previousTransferSum = 10_000
        val feeRateMasterMaestro = 0.006
        val feeRateMinMasterMaestro = 20
        val limitForNoFeeMasterMaestro = 75_000
        val monthlyLimit = 600_000
        val dailyLimit = 150_000
        val feeRateVisaMir = 0.0075
        val feeRateMinVisaMir = 35
        val dailyLimitVkpay = 15_000
        val monthlyLimitVkpay = 40_000

        val result = calcFee(
            transferAmount =amount,
            previousTransfersSumMonth = previousTransferSum,
        )

        assertEquals(0, result)
    }

    @Test
    fun calcFeeDeafultPreviousTransferDefault() {

        val amount = 10_000
        val card = "Vkpay"
        val feeRateMasterMaestro = 0.006
        val feeRateMinMasterMaestro = 20
        val limitForNoFeeMasterMaestro = 75_000
        val monthlyLimit = 600_000
        val dailyLimit = 150_000
        val feeRateVisaMir = 0.0075
        val feeRateMinVisaMir = 35
        val dailyLimitVkpay = 15_000
        val monthlyLimitVkpay = 40_000

        val result = calcFee(
            transferAmount =amount,
            cardType = card,
        )

        assertEquals(-1, result)
    }
}