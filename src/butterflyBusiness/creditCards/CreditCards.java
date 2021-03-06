package butterflyBusiness.creditCards;

import java.util.Arrays;
import java.util.List;

public class CreditCards {

    private static List<CreditCard> creditCards = Arrays.asList(
            new MasterCard(), new Visa(), new VisaElectron(), new Checker(), new Maestro(), new InstaPayment(), new AmericanExpress()
    );

    public static String getCreditCard(String cardNumber) {
        for (CreditCard creditCard : creditCards) {
            if(creditCard.isValid(cardNumber)){
                return creditCard.getName();
            }
        }
        return null;
    }
}
