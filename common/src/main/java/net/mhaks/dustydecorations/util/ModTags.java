package net.mhaks.dustydecorations.util;

import net.mhaks.dustydecorations.ModConstants;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Blocks {
//        public static final TagKey<Block> TAG = createTag("")

        public static final TagKey<Block> BANISTERS = createTag("banisters");
        public static final TagKey<Block> LARGE_SHELVES = createTag("large_shelves");
        public static final TagKey<Block> BARRELS = createTag("barrels");
        public static final TagKey<Block> WOOL_AWNINGS = createTag("wool_awnings");
        public static final TagKey<Block> PAPER_LANTERNS = createTag("paper_lanterns");
        public static final TagKey<Block> SEAGLASS_LAMPS = createTag("seaglass_lamps");
        public static final TagKey<Block> WICKER_BASKETS = createTag("wicker_baskets");
        public static final TagKey<Block> SCARECROWS = createTag("scarecrows");
        public static final TagKey<Block> CUSHIONS = createTag("cushions");
        public static final TagKey<Block> QUOINS = createTag("quoins");
        public static final TagKey<Block> MURALS = createTag("murals");

        private static TagKey<Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK, ModConstants.identifierOf(name));
        }
        private static TagKey<Block> createCommonTag(String name) {
            return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("c", name));
        }
    }

    public static class Items {
        public static final TagKey<Item> CORALS = bindCommonTag("corals");

//        public static final TagKey<Item> BANISTERS = bindTag("banisters");
//        public static final TagKey<Item> LARGE_SHELVES = bindTag("large_shelves");
//        public static final TagKey<Item> BARRELS = bindTag("BARRELS");

        public static final TagKey<Item> NAUTILUS_SHELLS = bindTag("nautilus_shells");
        public static final TagKey<Item> COLD_SEAGLASS_FRAGMENTS = bindTag("cold_seaglass_fragments");


        private static TagKey<Item> bindTag(String name) {
            return TagKey.create(Registries.ITEM, ModConstants.identifierOf(name));
        }
        private static TagKey<Item> createTag(final ResourceLocation name) {
            return TagKey.create(Registries.ITEM, name);
        }
        private static TagKey<Item> bindCommonTag(String name) {
            return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", name));
        }
        private static TagKey<Item> createCommonTag(final ResourceLocation name) {
            return TagKey.create(Registries.ITEM, name);
        }
    }


}
