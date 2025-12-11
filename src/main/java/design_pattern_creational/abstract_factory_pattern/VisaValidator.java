package design_pattern_creational.abstract_factory_pattern;

public class VisaValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        if (creditCard.getCardType().equals(CardType.GOLD)) {
            return true;
        }

        if (creditCard.getCardType().equals(CardType.PLATINUM)) {
            return true;
        }

        return false;
    }
}
