package net.minestom.server.instance.block.states;
import net.minestom.server.instance.block.BlockAlternative;
import static net.minestom.server.instance.block.Block.*;
/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */
@Deprecated(forRemoval = false, since = "forever")
public class LightBlueGlazedTerracotta {
	public static void initStates() {
		LIGHT_BLUE_GLAZED_TERRACOTTA.addBlockAlternative(new BlockAlternative((short) 9386, "facing=north"));
		LIGHT_BLUE_GLAZED_TERRACOTTA.addBlockAlternative(new BlockAlternative((short) 9387, "facing=south"));
		LIGHT_BLUE_GLAZED_TERRACOTTA.addBlockAlternative(new BlockAlternative((short) 9388, "facing=west"));
		LIGHT_BLUE_GLAZED_TERRACOTTA.addBlockAlternative(new BlockAlternative((short) 9389, "facing=east"));
	}
}
