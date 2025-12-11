package design_pattern_creational.abstract_factory_pattern;

public class AmexPlatinumValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
         if (creditCard.getCardType().equals(CardType.PLATINUM)) {
             return true;
         }

         return false;
    }
}
