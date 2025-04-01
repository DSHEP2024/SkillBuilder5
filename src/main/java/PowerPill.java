
/**
 * This class defines how power pills behave in
 * a game.  The purpose of a power pill is to simply
 * provide a character with power.
 *
 * @author (You)
 * @version (0.1)
 */
public class PowerPill {

    // Static integer field for the default power value
    public static final int DEFAULT_POWER = 10;

    // Instance variables for power and name
    private int power;
    private String name;

    /**
     * Initializes this power pill to a default power value
     * and sets the name of the pill to name.
     * @param name the name of this power pill.
     */
    public PowerPill(String name) {
        this.name = name;
        this.power = DEFAULT_POWER;  // Default power value
    }

    /**
     * Initializes this power pill to the value of power
     * and sets the name of the pill to name.
     * @param name the name of this power pill
     * @param power the power level of this power pill.
     */
    public PowerPill(String name, int power) {
        this.name = name;
        this.power = power;
    }

    // Getter for the name
    /**
     * Gets the name of the power pill.
     * @return the name of this power pill.
     */
    public String getName() {
        return name;
    }

    // Getter for the power
    /**
     * Gets the power level of the power pill.
     * @return the power level of this power pill.
     */
    public int getPower() {
        return power;
    }

    // Setter for the name
    /**
     * Sets the name of this power pill.
     * @param name the new name of this power pill.
     */
    public void setName(String name) {
        this.name = name;
    }

    // Setter for the power
    /**
     * Sets the power level of this power pill.
     * @param power the new power level of this power pill.
     */
    public void setPower(int power) {
        this.power = power;
    }

    // toString method
    /**
     * Returns a string representation of the power pill in the format:
     * PowerPill <name> = <power>
     * @return a string representation of the power pill.
     */
    @Override
    public String toString() {
        return "PowerPill " + name + " = " + power;
    }
}
