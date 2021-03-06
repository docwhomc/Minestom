package net.minestom.server.instance.block.states;
import net.minestom.server.instance.block.BlockAlternative;
import static net.minestom.server.instance.block.Block.*;
/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */
@Deprecated(forRemoval = false, since = "forever")
public class CutSandstoneSlab {
	public static void initStates() {
		CUT_SANDSTONE_SLAB.addBlockAlternative(new BlockAlternative((short) 8354, "type=top", "waterlogged=true"));
		CUT_SANDSTONE_SLAB.addBlockAlternative(new BlockAlternative((short) 8355, "type=top", "waterlogged=false"));
		CUT_SANDSTONE_SLAB.addBlockAlternative(new BlockAlternative((short) 8356, "type=bottom", "waterlogged=true"));
		CUT_SANDSTONE_SLAB.addBlockAlternative(new BlockAlternative((short) 8357, "type=bottom", "waterlogged=false"));
		CUT_SANDSTONE_SLAB.addBlockAlternative(new BlockAlternative((short) 8358, "type=double", "waterlogged=true"));
		CUT_SANDSTONE_SLAB.addBlockAlternative(new BlockAlternative((short) 8359, "type=double", "waterlogged=false"));
	}
}
