package tdd_unit_tests.airport;

import org.junit.jupiter.api.*;
import tdd.airport.*;

public class AirportTest {
    @Nested
    @DisplayName("Given there is an economy flight")
    class EconomyFlightTest {
        private Flight economyFlight;
        private Passenger mike;
        private Passenger john;

        @BeforeEach
        void setup() {
            economyFlight = new EconomyFlight(1);
            mike = new Passenger("Mike", false);
            john = new Passenger("John", true);
        }

        @Nested
        @DisplayName("When we have a usual passenger")
        class UsualPassenger {
            @Test
            @DisplayName("Then you can add and remove from an economy flight")
            public void testEconomyFlightUsualPassenger() {
                Assertions.assertEquals(1, economyFlight.getId());
                Assertions.assertTrue(economyFlight.addPassenger(mike));
                Assertions.assertEquals(1, economyFlight.getPassengers().size());
                Assertions.assertTrue(economyFlight.getPassengers().contains(mike));
                Assertions.assertTrue(economyFlight.removePassenger(mike));
                Assertions.assertEquals(0, economyFlight.getPassengers().size());
            }

            @RepeatedTest(5)
            @DisplayName("Then you cannot add him to an economy flight more than once")
            public void testEconomyFlightUsualPassengerAddedOnlyOnce(RepetitionInfo repetitionInfo) {
                for (int i = 0; i < repetitionInfo.getCurrentRepetition(); i++) {
                    economyFlight.addPassenger(mike);
                }
                Assertions.assertEquals(1, economyFlight.getPassengers().size());
                Assertions.assertTrue(economyFlight.getPassengers().contains(mike));
            }
        }

        @Nested
        @DisplayName("When we have a VIP passenger")
        class VipPassenger {
            @Test
            @DisplayName("Then you can add him but cannot remove him from an economy flight")
            public void testEconomyFlightVipPassenger() {
                Assertions.assertEquals(1, economyFlight.getId());
                Assertions.assertTrue(economyFlight.addPassenger(john));
                Assertions.assertEquals(1, economyFlight.getPassengers().size());
                Assertions.assertTrue(economyFlight.getPassengers().contains(john));
                Assertions.assertFalse(economyFlight.removePassenger(john));
                Assertions.assertEquals(1, economyFlight.getPassengers().size());

            }
        }

    }

    @Nested
    @DisplayName("Given there is an business flight")
    class BusinessFlightTest {
        private Flight businessFlight;
        private Passenger mike;
        private Passenger john;

        @BeforeEach
        void setup() {
            businessFlight = new BusinessFlight(2);
            mike = new Passenger("Mike", false);
            john = new Passenger("John", true);
        }

        @Nested
        @DisplayName("When we have a usual passenger")
        class UsualPassenger {
            @Test
            @DisplayName("Then you cannot add or remove him from a business flight")
            public void testBusinessFlightUsualPassenger() {
                Assertions.assertEquals(2, businessFlight.getId());
                Assertions.assertFalse(businessFlight.addPassenger(mike));
                Assertions.assertEquals(0, businessFlight.getPassengers().size());
                Assertions.assertFalse(businessFlight.getPassengers().contains(mike));
                Assertions.assertFalse(businessFlight.removePassenger(mike));
                Assertions.assertEquals(0, businessFlight.getPassengers().size());
            }
        }

        @Nested
        @DisplayName("When we have a VIP passenger")
        class VipPassenger {
            @Test
            @DisplayName("Then you can add him but cannot remove him from a business flight")
            public void testBusinessFlightVipPassenger() {
                Assertions.assertEquals(2, businessFlight.getId());
                Assertions.assertTrue(businessFlight.addPassenger(john));
                Assertions.assertEquals(1, businessFlight.getPassengers().size());
                Assertions.assertTrue(businessFlight.getPassengers().contains(john));
                Assertions.assertFalse(businessFlight.removePassenger(john));
                Assertions.assertEquals(1, businessFlight.getPassengers().size());
            }
        }
    }
    @Nested
    @DisplayName("Given there is a premium flight")
    class PremiumFlightTest {
        private Flight premiumFlight;
        private Passenger mike;
        private Passenger john;

        @BeforeEach
        void setup() {
            premiumFlight = new PremiumFlight(3);
            mike = new Passenger("Mike", false);
            john = new Passenger("John", true);
        }

        @Nested
        @DisplayName("When we have a usual passenger")
        class UsualPassenger {
            @Test
            @DisplayName("Then you cannot add or remove him from a premium flight")
            public void testPremiumFlightUsualPassenger() {
                Assertions.assertEquals(3, premiumFlight.getId());
                Assertions.assertFalse(premiumFlight.addPassenger(mike));
                Assertions.assertEquals(0, premiumFlight.getPassengers().size());
                Assertions.assertFalse(premiumFlight.getPassengers().contains(mike));
                Assertions.assertFalse(premiumFlight.removePassenger(mike));
                Assertions.assertEquals(0, premiumFlight.getPassengers().size());
            }
        }

        @Nested
        @DisplayName("When we have a VIP passenger")
        class VipPassenger {
            @Test
            @DisplayName("Then you can add or remove him from a premium flight")
            public void testPremiumFlightVipPassenger() {
                Assertions.assertEquals(3, premiumFlight.getId());
                Assertions.assertTrue(premiumFlight.addPassenger(john));
                Assertions.assertEquals(1, premiumFlight.getPassengers().size());
                Assertions.assertTrue(premiumFlight.getPassengers().contains(john));
                Assertions.assertTrue(premiumFlight.removePassenger(john));
                Assertions.assertEquals(0, premiumFlight.getPassengers().size());
            }
        }
    }
}
