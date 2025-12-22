package design_pattern_behavioral.strategy_pattern;

public class StrategyDemo {
    static void main() {
        CreditCard amexCard = new CreditCard(new AmexStrategy());

        amexCard.setNumber("379185883464283");
        amexCard.setDate("04/2020");
        amexCard.setCvv("123");

        System.out.println("Is Amex valid: " + amexCard.isValid());

        CreditCard amexCard2 = new CreditCard(new AmexStrategy());

        amexCard2.setNumber("379185883464282");
        amexCard2.setDate("04/2020");
        amexCard2.setCvv("123");

        System.out.println("Is Amex2 valid: " + amexCard2.isValid());

        CreditCard visaCard = new CreditCard(new VisaStrategy());

        visaCard.setNumber("4539589763663402");
        visaCard.setDate("04/2020");
        visaCard.setCvv("123");

        System.out.println("Is Visa valid: " + visaCard.isValid());
    }
}
