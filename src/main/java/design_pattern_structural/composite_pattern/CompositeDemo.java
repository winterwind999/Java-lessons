package design_pattern_structural.composite_pattern;

public class CompositeDemo {
    static void main() {
        Menu mainMenu = new Menu("Main", "/main");

        MenuItem safetyMenuItem = new MenuItem("Safety","/safety");

        mainMenu.add(safetyMenuItem);

        Menu claimsMenu = new Menu("Claims", "/claims");

        mainMenu.add(claimsMenu);

        MenuItem personalClaimsMenu = new MenuItem("Personal Claim","/personalClaims");

        claimsMenu.add(personalClaimsMenu);

        System.out.println(mainMenu.toString());
    }
}
