package net.minestom.server.instance.block.states;
import net.minestom.server.instance.block.BlockAlternative;
import static net.minestom.server.instance.block.Block.*;
/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */
@Deprecated(forRemoval = false, since = "forever")
public class BirchSlab {
	public static void initStates() {
		BIRCH_SLAB.addBlockAlternative(new BlockAlternative((short) 8312, "type=top", "waterlogged=true"));
		BIRCH_SLAB.addBlockAlternative(new BlockAlternative((short) 8313, "type=top", "waterlogged=false"));
		BIRCH_SLAB.addBlockAlternative(new BlockAlternative((short) 8314, "type=bottom", "waterlogged=true"));
		BIRCH_SLAB.addBlockAlternative(new BlockAlternative((short) 8315, "type=bottom", "waterlogged=false"));
		BIRCH_SLAB.addBlockAlternative(new BlockAlternative((short) 8316, "type=double", "waterlogged=true"));
		BIRCH_SLAB.addBlockAlternative(new BlockAlternative((short) 8317, "type=double", "waterlogged=false"));
	}
}
