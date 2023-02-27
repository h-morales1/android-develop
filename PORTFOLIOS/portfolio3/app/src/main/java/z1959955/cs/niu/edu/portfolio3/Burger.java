package z1959955.cs.niu.edu.portfolio3;

public class Burger {
    private int totalCalories;
    private int burgerPattyCalories;
    private int cheeseCalories;
    private int baconCalories;
    private int specialSauceCalories;
    private final int BEEF_PATTY_CALORIES = 247;
    private final int TURKEY_PATTY_CALORIES = 193;
    private final int VEGGIE_PATTY_CALORIES = 177;
    private final int BACON_CALORIES = 541;
    private final int CHEDDAR_CALORIES = 402;
    private final int MOZZARELLA_CALORIES = 280;

    public Burger() {
        setBurgerPattyCalories(0);
        setCheeseCalories(0);
        setBaconCalories(0);
        setSpecialSauceCalories(0);
        calculateTotalCalories();
    }

    private void setBurgerPattyCalories(int pattyCal) {
        burgerPattyCalories = pattyCal;
    }

    public void setBPattyBeef() {
        setBurgerPattyCalories(BEEF_PATTY_CALORIES);
    }

    public void setBPattyVeggie() {
        setBurgerPattyCalories(VEGGIE_PATTY_CALORIES);
    }

    public void setBPattyTurkey() {
        setBurgerPattyCalories(TURKEY_PATTY_CALORIES);
    }

    public void setCheeseCalories(int cheeseCal) {
        cheeseCalories = cheeseCal;
    }

    public void setBaconCalories(int baconCal) {
        baconCalories = baconCal;
    }

    public void setSpecialSauceCalories(int sauceCal) {
        specialSauceCalories = sauceCal;
    }

    public void calculateTotalCalories() {
        totalCalories = burgerPattyCalories + cheeseCalories + baconCalories + specialSauceCalories;
    }

    public int getTotalCalories() {
        return totalCalories;
    }

}
