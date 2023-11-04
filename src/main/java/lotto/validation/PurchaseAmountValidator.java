package lotto.validation;

import lotto.constant.ExceptionMessage;
import lotto.constant.GameConfig;

public class PurchaseAmountValidator {

    private static void validateUnitAmount(int amount) {
        GameConfig lottoPrice = GameConfig.LOTTO_PRICE;

        if (amount % lottoPrice.getValue() != 0) {
            ExceptionMessage message = ExceptionMessage.NON_THOUSAND_UNIT_AMOUNT_EXCEPTION;
            throw new IllegalArgumentException(message.getMessage());
        }
    }
}
