package net.acomputerdog.BlazeLoader.api.tick;

import net.acomputerdog.BlazeLoader.api.general.ApiGeneral;
import net.acomputerdog.BlazeLoader.main.BlazeLoader;

/**
 * Api for function related to the world tick.
 */
public class ApiTick {

    /**
     * Gets the game's tick rate.  Uses reflection only on first run.
     *
     * @return Returns the game's current tick rate.
     */
    public static float getTPS() {
        return ApiGeneral.theMinecraft.timer.ticksPerSecond;
    }

    /**
     * Sets the game tick rate.
     *
     * @param tps The new tick rate.
     */
    public static void setTPS(float tps) {
        ApiGeneral.theMinecraft.timer.ticksPerSecond = tps;
    }

    /**
     * Returns true if the game is currently in the middle of a tick.
     *
     * @return Returns true if the game is in a tick, false if not.
     */
    public static boolean isGameInTick() {
        return BlazeLoader.isInTick;
    }

    /**
     * Gets the total number of ticks that the game has run for.
     *
     * @return Return a long representing the number of ticks that the game has run for.
     */
    public static long getTotalTicksInGame() {
        return BlazeLoader.numTicks;
    }
}
