package net.minestom.server.instance.block.states;
import net.minestom.server.instance.block.BlockAlternative;
import static net.minestom.server.instance.block.Block.*;
/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */
@Deprecated(forRemoval = false, since = "forever")
public class DeadBrainCoralFan {
	public static void initStates() {
		DEAD_BRAIN_CORAL_FAN.addBlockAlternative(new BlockAlternative((short) 9542, "waterlogged=true"));
		DEAD_BRAIN_CORAL_FAN.addBlockAlternative(new BlockAlternative((short) 9543, "waterlogged=false"));
	}
}
