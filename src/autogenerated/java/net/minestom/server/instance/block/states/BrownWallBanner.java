package net.minestom.server.instance.block.states;
import net.minestom.server.instance.block.BlockAlternative;
import static net.minestom.server.instance.block.Block.*;
/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */
@Deprecated(forRemoval = false, since = "forever")
public class BrownWallBanner {
	public static void initStates() {
		BROWN_WALL_BANNER.addBlockAlternative(new BlockAlternative((short) 8201, "facing=north"));
		BROWN_WALL_BANNER.addBlockAlternative(new BlockAlternative((short) 8202, "facing=south"));
		BROWN_WALL_BANNER.addBlockAlternative(new BlockAlternative((short) 8203, "facing=west"));
		BROWN_WALL_BANNER.addBlockAlternative(new BlockAlternative((short) 8204, "facing=east"));
	}
}
