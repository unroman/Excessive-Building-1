package net.yirmiri.excessive_building.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.entity.decoration.painting.PaintingEntity;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtElement;
import net.minecraft.nbt.NbtOps;
import net.minecraft.registry.*;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.util.EBTags;

import java.util.Comparator;
import java.util.function.Predicate;

public class EBItemGroups {
    public static ItemGroup EXCESSIVE_BUILDING = Registry.register(Registries.ITEM_GROUP, Identifier.of(ExcessiveBuilding.MOD_ID, "excessive_building"),
            FabricItemGroup.builder().icon(() -> new ItemStack(EBBlocks.LOGO_BLOCK)).displayName(Text.translatable("itemgroup.excessive_building")).entries((ctx, entries) -> {
                entries.add(EBBlocks.OAK_MOSAIC);
                entries.add(EBBlocks.OAK_MOSAIC_STAIRS);
                entries.add(EBBlocks.OAK_MOSAIC_VERTICAL_STAIRS);
                entries.add(EBBlocks.OAK_MOSAIC_SLAB);
                entries.add(EBBlocks.CHISELED_OAK_PLANKS);
                entries.add(Blocks.BOOKSHELF);
                entries.add(EBBlocks.OAK_DECORATIVE_SHELF);
                entries.add(Blocks.CRAFTING_TABLE);
                entries.add(Blocks.CHEST);
                entries.add(Blocks.TRAPPED_CHEST);
                entries.add(Blocks.LADDER);

                entries.add(EBBlocks.SPRUCE_MOSAIC);
                entries.add(EBBlocks.SPRUCE_MOSAIC_STAIRS);
                entries.add(EBBlocks.SPRUCE_MOSAIC_VERTICAL_STAIRS);
                entries.add(EBBlocks.SPRUCE_MOSAIC_SLAB);
                entries.add(EBBlocks.CHISELED_SPRUCE_PLANKS);
                entries.add(EBBlocks.SPRUCE_BOOKSHELF);
                entries.add(EBBlocks.SPRUCE_DECORATIVE_SHELF);
                entries.add(EBBlocks.SPRUCE_CRAFTING_TABLE);
                //entries.add(EBBlocks.SPRUCE_CHEST);
                //entries.add(EBBlocks.TRAPPED_SPRUCE_CHEST);
                entries.add(EBBlocks.SPRUCE_LADDER);

                entries.add(EBBlocks.BIRCH_MOSAIC);
                entries.add(EBBlocks.BIRCH_MOSAIC_STAIRS);
                entries.add(EBBlocks.BIRCH_MOSAIC_VERTICAL_STAIRS);
                entries.add(EBBlocks.BIRCH_MOSAIC_SLAB);
                entries.add(EBBlocks.CHISELED_BIRCH_PLANKS);
                entries.add(EBBlocks.BIRCH_BOOKSHELF);
                entries.add(EBBlocks.BIRCH_DECORATIVE_SHELF);
                entries.add(EBBlocks.BIRCH_CRAFTING_TABLE);
                //entries.add(EBBlocks.BIRCH_CHEST);
                //entries.add(EBBlocks.TRAPPED_BIRCH_CHEST);
                entries.add(EBBlocks.BIRCH_LADDER);

                entries.add(EBBlocks.JUNGLE_MOSAIC);
                entries.add(EBBlocks.JUNGLE_MOSAIC_STAIRS);
                entries.add(EBBlocks.JUNGLE_MOSAIC_VERTICAL_STAIRS);
                entries.add(EBBlocks.JUNGLE_MOSAIC_SLAB);
                entries.add(EBBlocks.CHISELED_JUNGLE_PLANKS);
                entries.add(EBBlocks.JUNGLE_BOOKSHELF);
                entries.add(EBBlocks.JUNGLE_DECORATIVE_SHELF);
                entries.add(EBBlocks.JUNGLE_CRAFTING_TABLE);
                //entries.add(EBBlocks.JUNGLE_CHEST);
                //entries.add(EBBlocks.TRAPPED_JUNGLE_CHEST);
                entries.add(EBBlocks.JUNGLE_LADDER);

                entries.add(EBBlocks.ACACIA_MOSAIC);
                entries.add(EBBlocks.ACACIA_MOSAIC_STAIRS);
                entries.add(EBBlocks.ACACIA_MOSAIC_VERTICAL_STAIRS);
                entries.add(EBBlocks.ACACIA_MOSAIC_SLAB);
                entries.add(EBBlocks.CHISELED_ACACIA_PLANKS);
                entries.add(EBBlocks.ACACIA_BOOKSHELF);
                entries.add(EBBlocks.ACACIA_DECORATIVE_SHELF);
                entries.add(EBBlocks.ACACIA_CRAFTING_TABLE);
                //entries.add(EBBlocks.ACACIA_CHEST);
                //entries.add(EBBlocks.TRAPPED_ACACIA_CHEST);
                entries.add(EBBlocks.ACACIA_LADDER);

                entries.add(EBBlocks.DARK_OAK_MOSAIC);
                entries.add(EBBlocks.DARK_OAK_MOSAIC_STAIRS);
                entries.add(EBBlocks.DARK_OAK_MOSAIC_VERTICAL_STAIRS);
                entries.add(EBBlocks.DARK_OAK_MOSAIC_SLAB);
                entries.add(EBBlocks.CHISELED_DARK_OAK_PLANKS);
                entries.add(EBBlocks.DARK_OAK_BOOKSHELF);
                entries.add(EBBlocks.DARK_OAK_DECORATIVE_SHELF);
                entries.add(EBBlocks.DARK_OAK_CRAFTING_TABLE);
                //entries.add(EBBlocks.DARK_OAK_CHEST);
                //entries.add(EBBlocks.TRAPPED_DARK_OAK_CHEST);
                entries.add(EBBlocks.DARK_OAK_LADDER);

                entries.add(EBBlocks.MANGROVE_MOSAIC);
                entries.add(EBBlocks.MANGROVE_MOSAIC_STAIRS);
                entries.add(EBBlocks.MANGROVE_MOSAIC_VERTICAL_STAIRS);
                entries.add(EBBlocks.MANGROVE_MOSAIC_SLAB);
                entries.add(EBBlocks.CHISELED_MANGROVE_PLANKS);
                entries.add(EBBlocks.MANGROVE_BOOKSHELF);
                entries.add(EBBlocks.MANGROVE_DECORATIVE_SHELF);
                entries.add(EBBlocks.MANGROVE_CRAFTING_TABLE);
                //entries.add(EBBlocks.MANGROVE_CHEST);
                //entries.add(EBBlocks.TRAPPED_MANGROVE_CHEST);
                entries.add(EBBlocks.MANGROVE_LADDER);

                entries.add(EBBlocks.CHERRY_MOSAIC);
                entries.add(EBBlocks.CHERRY_MOSAIC_STAIRS);
                entries.add(EBBlocks.CHERRY_MOSAIC_VERTICAL_STAIRS);
                entries.add(EBBlocks.CHERRY_MOSAIC_SLAB);
                entries.add(EBBlocks.CHISELED_CHERRY_PLANKS);
                entries.add(EBBlocks.CHERRY_BOOKSHELF);
                entries.add(EBBlocks.CHERRY_DECORATIVE_SHELF);
                entries.add(EBBlocks.CHERRY_CRAFTING_TABLE);
                //entries.add(EBBlocks.CHERRY_CHEST);
                //entries.add(EBBlocks.TRAPPED_CHERRY_CHEST);
                entries.add(EBBlocks.CHERRY_LADDER);

                entries.add(EBBlocks.ANCIENT_LOG);
                entries.add(EBBlocks.STRIPPED_ANCIENT_LOG);
                entries.add(EBBlocks.ANCIENT_WOOD);
                entries.add(EBBlocks.STRIPPED_ANCIENT_WOOD);
                entries.add(EBBlocks.ANCIENT_PLANKS);
                entries.add(EBBlocks.ANCIENT_MOSAIC);
                entries.add(EBBlocks.ANCIENT_STAIRS);
                entries.add(EBBlocks.ANCIENT_MOSAIC_STAIRS);
                entries.add(EBBlocks.ANCIENT_VERTICAL_STAIRS);
                entries.add(EBBlocks.ANCIENT_MOSAIC_VERTICAL_STAIRS);
                entries.add(EBBlocks.ANCIENT_SLAB);
                entries.add(EBBlocks.ANCIENT_MOSAIC_SLAB);
                entries.add(EBBlocks.CHISELED_ANCIENT_PLANKS);
                entries.add(EBBlocks.ANCIENT_FENCE);
                entries.add(EBBlocks.ANCIENT_FENCE_GATE);
                entries.add(EBBlocks.ANCIENT_DOOR);
                entries.add(EBBlocks.ANCIENT_TRAPDOOR);
                entries.add(EBBlocks.ANCIENT_PRESSURE_PLATE);
                entries.add(EBBlocks.ANCIENT_BUTTON);
                entries.add(EBBlocks.ANCIENT_BOOKSHELF);
                entries.add(EBBlocks.ANCIENT_DECORATIVE_SHELF);
                entries.add(EBBlocks.ANCIENT_CRAFTING_TABLE);
                //entries.add(EBBlocks.ANCIENT_CHEST);
                //entries.add(EBBlocks.TRAPPED_ANCIENT_CHEST);
                entries.add(EBBlocks.ANCIENT_LADDER);

                entries.add(EBBlocks.GLOOM_LOG);
                entries.add(EBBlocks.STRIPPED_GLOOM_LOG);
                entries.add(EBBlocks.GLOOM_WOOD);
                entries.add(EBBlocks.STRIPPED_GLOOM_WOOD);
                entries.add(EBBlocks.GLOOM_PLANKS);
                entries.add(EBBlocks.GLOOM_MOSAIC);
                entries.add(EBBlocks.GLOOM_STAIRS);
                entries.add(EBBlocks.GLOOM_MOSAIC_STAIRS);
                entries.add(EBBlocks.GLOOM_VERTICAL_STAIRS);
                entries.add(EBBlocks.GLOOM_MOSAIC_VERTICAL_STAIRS);
                entries.add(EBBlocks.GLOOM_SLAB);
                entries.add(EBBlocks.GLOOM_MOSAIC_SLAB);
                entries.add(EBBlocks.CHISELED_GLOOM_PLANKS);
                entries.add(EBBlocks.GLOOM_FENCE);
                entries.add(EBBlocks.GLOOM_FENCE_GATE);
                entries.add(EBBlocks.GLOOM_DOOR);
                entries.add(EBBlocks.GLOOM_TRAPDOOR);
                entries.add(EBBlocks.GLOOM_PRESSURE_PLATE);
                entries.add(EBBlocks.GLOOM_BUTTON);
                entries.add(EBBlocks.GLOOM_BOOKSHELF);
                entries.add(EBBlocks.GLOOM_DECORATIVE_SHELF);
                entries.add(EBBlocks.GLOOM_CRAFTING_TABLE);
                //entries.add(EBBlocks.GLOOM_CHEST);
                //entries.add(EBBlocks.TRAPPED_GLOOM_CHEST);
                entries.add(EBBlocks.GLOOM_LADDER);

                entries.add(EBBlocks.BAMBOO_MOSAIC_VERTICAL_STAIRS);
                entries.add(EBBlocks.CHISELED_BAMBOO_PLANKS);
                entries.add(EBBlocks.BAMBOO_BOOKSHELF);
                entries.add(EBBlocks.BAMBOO_DECORATIVE_SHELF);
                entries.add(EBBlocks.BAMBOO_CRAFTING_TABLE);
                //entries.add(EBBlocks.BAMBOO_CHEST);
                //entries.add(EBBlocks.TRAPPED_BAMBOO_CHEST);
                entries.add(EBBlocks.BAMBOO_LADDER);

                entries.add(EBBlocks.CRIMSON_MOSAIC);
                entries.add(EBBlocks.CRIMSON_MOSAIC_STAIRS);
                entries.add(EBBlocks.CRIMSON_MOSAIC_VERTICAL_STAIRS);
                entries.add(EBBlocks.CRIMSON_MOSAIC_SLAB);
                entries.add(EBBlocks.CHISELED_CRIMSON_PLANKS);
                entries.add(EBBlocks.CRIMSON_BOOKSHELF);
                entries.add(EBBlocks.CRIMSON_DECORATIVE_SHELF);
                entries.add(EBBlocks.CRIMSON_CRAFTING_TABLE);
                //entries.add(EBBlocks.CRIMSON_CHEST);
                //entries.add(EBBlocks.TRAPPED_CRIMSON_CHEST);
                entries.add(EBBlocks.CRIMSON_LADDER);

                entries.add(EBBlocks.WARPED_MOSAIC);
                entries.add(EBBlocks.WARPED_MOSAIC_STAIRS);
                entries.add(EBBlocks.WARPED_MOSAIC_VERTICAL_STAIRS);
                entries.add(EBBlocks.WARPED_MOSAIC_SLAB);
                entries.add(EBBlocks.CHISELED_WARPED_PLANKS);
                entries.add(EBBlocks.WARPED_BOOKSHELF);
                entries.add(EBBlocks.WARPED_DECORATIVE_SHELF);
                entries.add(EBBlocks.WARPED_CRAFTING_TABLE);
                //entries.add(EBBlocks.WARPED_CHEST);
                //entries.add(EBBlocks.TRAPPED_WARPED_CHEST);
                entries.add(EBBlocks.WARPED_LADDER);

                entries.add(EBBlocks.PAPER_BLOCK);
                entries.add(EBBlocks.THIN_PAPER_BLOCK);
                entries.add(EBBlocks.THIN_DIAGONAL_PAPER_BLOCK);
                entries.add(EBBlocks.THIN_DIVIDED_PAPER_BLOCK);
                entries.add(EBBlocks.THIN_PAPER_STAIRS);
                entries.add(EBBlocks.THIN_PAPER_VERTICAL_STAIRS);
                entries.add(EBBlocks.THIN_PAPER_SLAB);
                entries.add(EBBlocks.THICK_PAPER_BLOCK);
                entries.add(EBBlocks.THICK_DIAGONAL_PAPER_BLOCK);
                entries.add(EBBlocks.THICK_DIVIDED_PAPER_BLOCK);
                entries.add(EBBlocks.THICK_PAPER_STAIRS);
                entries.add(EBBlocks.THICK_PAPER_VERTICAL_STAIRS);
                entries.add(EBBlocks.THICK_PAPER_SLAB);

                entries.add(EBBlocks.POLISHED_STONE);
                entries.add(EBBlocks.POLISHED_STONE_STAIRS);
                entries.add(EBBlocks.POLISHED_STONE_VERTICAL_STAIRS);
                entries.add(EBBlocks.POLISHED_STONE_SLAB);

                entries.add(EBBlocks.COBBLESTONE_BRICKS);
                entries.add(EBBlocks.CRACKED_COBBLESTONE_BRICKS);
                entries.add(EBBlocks.COBBLESTONE_BRICK_STAIRS);
                entries.add(EBBlocks.COBBLESTONE_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.COBBLESTONE_BRICK_SLAB);
                entries.add(EBBlocks.COBBLESTONE_BRICK_WALL);

                entries.add(EBBlocks.MOSSY_COBBLESTONE_BRICKS);
                entries.add(EBBlocks.MOSSY_COBBLESTONE_BRICK_STAIRS);
                entries.add(EBBlocks.MOSSY_COBBLESTONE_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.MOSSY_COBBLESTONE_BRICK_SLAB);
                entries.add(EBBlocks.MOSSY_COBBLESTONE_BRICK_WALL);

                entries.add(EBBlocks.SMOOTH_STONE_BRICKS);
                entries.add(EBBlocks.CRACKED_SMOOTH_STONE_BRICKS);
                entries.add(EBBlocks.SMOOTH_STONE_BRICK_STAIRS);
                entries.add(EBBlocks.SMOOTH_STONE_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.SMOOTH_STONE_BRICK_SLAB);
                entries.add(EBBlocks.SMOOTH_STONE_PILLAR);

                entries.add(EBBlocks.GRANITE_BRICKS);
                entries.add(EBBlocks.CRACKED_GRANITE_BRICKS);
                entries.add(EBBlocks.GRANITE_BRICK_STAIRS);
                entries.add(EBBlocks.GRANITE_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.GRANITE_BRICK_SLAB);
                entries.add(EBBlocks.GRANITE_BRICK_WALL);

                entries.add(EBBlocks.DIORITE_BRICKS);
                entries.add(EBBlocks.CRACKED_DIORITE_BRICKS);
                entries.add(EBBlocks.DIORITE_BRICK_STAIRS);
                entries.add(EBBlocks.DIORITE_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.DIORITE_BRICK_SLAB);
                entries.add(EBBlocks.DIORITE_BRICK_WALL);

                entries.add(EBBlocks.ANDESITE_BRICKS);
                entries.add(EBBlocks.CRACKED_ANDESITE_BRICKS);
                entries.add(EBBlocks.ANDESITE_BRICK_STAIRS);
                entries.add(EBBlocks.ANDESITE_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.ANDESITE_BRICK_SLAB);
                entries.add(EBBlocks.ANDESITE_BRICK_WALL);

                entries.add(EBBlocks.COBBLED_DEEPSLATE_BRICKS);
                entries.add(EBBlocks.CRACKED_COBBLED_DEEPSLATE_BRICKS);
                entries.add(EBBlocks.COBBLED_DEEPSLATE_BRICK_STAIRS);
                entries.add(EBBlocks.COBBLED_DEEPSLATE_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.COBBLED_DEEPSLATE_BRICK_SLAB);
                entries.add(EBBlocks.COBBLED_DEEPSLATE_BRICK_WALL);

                entries.add(EBBlocks.CRACKED_BRICKS);
                entries.add(EBBlocks.HERRINGBONE_BRICKS);
                entries.add(EBBlocks.SMOOTH_BRICKS);
                entries.add(EBBlocks.CRACKED_SMOOTH_BRICKS);
                entries.add(EBBlocks.SMOOTH_BRICK_STAIRS);
                entries.add(EBBlocks.SMOOTH_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.SMOOTH_BRICK_SLAB);
                entries.add(EBBlocks.SMOOTH_BRICK_WALL);
                entries.add(EBBlocks.SMOOTH_HERRINGBONE_BRICKS);

                entries.add(EBBlocks.BLACKSTONE_BRICKS);
                entries.add(EBBlocks.CRACKED_BLACKSTONE_BRICKS);
                entries.add(EBBlocks.BLACKSTONE_BRICK_STAIRS);
                entries.add(EBBlocks.BLACKSTONE_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.BLACKSTONE_BRICK_SLAB);
                entries.add(EBBlocks.BLACKSTONE_BRICK_WALL);

                entries.add(EBBlocks.BRIMSTONE);
                entries.add(EBBlocks.BRIMSTONE_STAIRS);
                entries.add(EBBlocks.BRIMSTONE_VERTICAL_STAIRS);
                entries.add(EBBlocks.BRIMSTONE_SLAB);
                entries.add(EBBlocks.BRIMSTONE_WALL);

                entries.add(EBBlocks.POLISHED_BRIMSTONE);
                entries.add(EBBlocks.POLISHED_BRIMSTONE_STAIRS);
                entries.add(EBBlocks.POLISHED_BRIMSTONE_VERTICAL_STAIRS);
                entries.add(EBBlocks.POLISHED_BRIMSTONE_SLAB);

                entries.add(EBBlocks.BRIMSTONE_BRICKS);
                entries.add(EBBlocks.CRACKED_BRIMSTONE_BRICKS);
                entries.add(EBBlocks.BRIMSTONE_BRICK_STAIRS);
                entries.add(EBBlocks.BRIMSTONE_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.BRIMSTONE_BRICK_SLAB);

                entries.add(EBBlocks.BRIMSTONE_TILES);
                entries.add(EBBlocks.BRIMSTONE_TILE_STAIRS);
                entries.add(EBBlocks.BRIMSTONE_TILE_VERTICAL_STAIRS);
                entries.add(EBBlocks.BRIMSTONE_TILE_SLAB);

                entries.add(EBBlocks.BRIMSTONE_PILLAR);
                entries.add(EBBlocks.BRIMSTONE_LAMP);
                entries.add(EBBlocks.BRIMSTONE_WINDOW);

                entries.add(EBBlocks.TUFF_TILES);
                entries.add(EBBlocks.TUFF_TILE_STAIRS);
                entries.add(EBBlocks.TUFF_TILE_VERTICAL_STAIRS);
                entries.add(EBBlocks.TUFF_TILE_SLAB);
                entries.add(EBBlocks.TUFF_TILE_WALL);

                entries.add(EBBlocks.ASPHALT);
                entries.add(EBBlocks.ASPHALT_STAIRS);
                entries.add(EBBlocks.ASPHALT_VERTICAL_STAIRS);
                entries.add(EBBlocks.ASPHALT_SLAB);

                entries.add(EBItems.ANCIENT_SIGN);
                entries.add(EBItems.ANCIENT_HANGING_SIGN);
                entries.add(EBItems.GLOOM_SIGN);
                entries.add(EBItems.GLOOM_HANGING_SIGN);

                entries.add(EBBlocks.ANCIENT_LEAVES);
                entries.add(EBBlocks.GLOOM_LEAVES);

                entries.add(EBBlocks.ANCIENT_SAPLING);
                entries.add(EBBlocks.GLOOM_SAPLING);
                entries.add(EBBlocks.GLOOM_SEEDS);

                entries.add(EBItems.ANCIENT_FRUIT);

                entries.add(EBBlocks.SEA_GLASS);
                entries.add(EBBlocks.SCARLET_SEA_GLASS);
                entries.add(EBBlocks.VERDANT_SEA_GLASS);
                entries.add(EBBlocks.AQUA_SEA_GLASS);
                entries.add(EBBlocks.FUCHSIA_SEA_GLASS);
                entries.add(EBBlocks.ROSE_SEA_GLASS);

                entries.add(EBBlocks.SEA_GLASS_PANE);
                entries.add(EBBlocks.SCARLET_SEA_GLASS_PANE);
                entries.add(EBBlocks.VERDANT_SEA_GLASS_PANE);
                entries.add(EBBlocks.AQUA_SEA_GLASS_PANE);
                entries.add(EBBlocks.FUCHSIA_SEA_GLASS_PANE);
                entries.add(EBBlocks.ROSE_SEA_GLASS_PANE);

                entries.add(EBBlocks.getDyedKnittedWools(DyeColor.WHITE.getId()));
                entries.add(EBBlocks.getDyedKnittedWools(DyeColor.LIGHT_GRAY.getId()));
                entries.add(EBBlocks.getDyedKnittedWools(DyeColor.GRAY.getId()));
                entries.add(EBBlocks.getDyedKnittedWools(DyeColor.BLACK.getId()));
                entries.add(EBBlocks.getDyedKnittedWools(DyeColor.BROWN.getId()));
                entries.add(EBBlocks.getDyedKnittedWools(DyeColor.RED.getId()));
                entries.add(EBBlocks.getDyedKnittedWools(DyeColor.ORANGE.getId()));
                entries.add(EBBlocks.getDyedKnittedWools(DyeColor.YELLOW.getId()));
                entries.add(EBBlocks.getDyedKnittedWools(DyeColor.LIME.getId()));
                entries.add(EBBlocks.getDyedKnittedWools(DyeColor.GREEN.getId()));
                entries.add(EBBlocks.getDyedKnittedWools(DyeColor.CYAN.getId()));
                entries.add(EBBlocks.getDyedKnittedWools(DyeColor.LIGHT_BLUE.getId()));
                entries.add(EBBlocks.getDyedKnittedWools(DyeColor.BLUE.getId()));
                entries.add(EBBlocks.getDyedKnittedWools(DyeColor.PURPLE.getId()));
                entries.add(EBBlocks.getDyedKnittedWools(DyeColor.MAGENTA.getId()));
                entries.add(EBBlocks.getDyedKnittedWools(DyeColor.PINK.getId()));

                entries.add(EBBlocks.getDyedKnittedCarpets(DyeColor.WHITE.getId()));
                entries.add(EBBlocks.getDyedKnittedCarpets(DyeColor.LIGHT_GRAY.getId()));
                entries.add(EBBlocks.getDyedKnittedCarpets(DyeColor.GRAY.getId()));
                entries.add(EBBlocks.getDyedKnittedCarpets(DyeColor.BLACK.getId()));
                entries.add(EBBlocks.getDyedKnittedCarpets(DyeColor.BROWN.getId()));
                entries.add(EBBlocks.getDyedKnittedCarpets(DyeColor.RED.getId()));
                entries.add(EBBlocks.getDyedKnittedCarpets(DyeColor.ORANGE.getId()));
                entries.add(EBBlocks.getDyedKnittedCarpets(DyeColor.YELLOW.getId()));
                entries.add(EBBlocks.getDyedKnittedCarpets(DyeColor.LIME.getId()));
                entries.add(EBBlocks.getDyedKnittedCarpets(DyeColor.GREEN.getId()));
                entries.add(EBBlocks.getDyedKnittedCarpets(DyeColor.CYAN.getId()));
                entries.add(EBBlocks.getDyedKnittedCarpets(DyeColor.LIGHT_BLUE.getId()));
                entries.add(EBBlocks.getDyedKnittedCarpets(DyeColor.BLUE.getId()));
                entries.add(EBBlocks.getDyedKnittedCarpets(DyeColor.PURPLE.getId()));
                entries.add(EBBlocks.getDyedKnittedCarpets(DyeColor.MAGENTA.getId()));
                entries.add(EBBlocks.getDyedKnittedCarpets(DyeColor.PINK.getId()));

                entries.add(EBBlocks.TERRACOTTA_TILES);
                entries.add(EBBlocks.TERRACOTTA_TILE_STAIRS);
                entries.add(EBBlocks.TERRACOTTA_TILE_VERTICAL_STAIRS);
                entries.add(EBBlocks.TERRACOTTA_TILE_SLAB);

                entries.add(EBBlocks.getDyedTerracottaTiles(DyeColor.WHITE.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileStairs(DyeColor.WHITE.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileVerticalStairs(DyeColor.WHITE.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileSlab(DyeColor.WHITE.getId()));

                entries.add(EBBlocks.getDyedTerracottaTiles(DyeColor.LIGHT_GRAY.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileStairs(DyeColor.LIGHT_GRAY.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileVerticalStairs(DyeColor.LIGHT_GRAY.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileSlab(DyeColor.LIGHT_GRAY.getId()));

                entries.add(EBBlocks.getDyedTerracottaTiles(DyeColor.GRAY.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileStairs(DyeColor.GRAY.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileVerticalStairs(DyeColor.GRAY.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileSlab(DyeColor.GRAY.getId()));

                entries.add(EBBlocks.getDyedTerracottaTiles(DyeColor.BLACK.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileStairs(DyeColor.BLACK.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileVerticalStairs(DyeColor.BLACK.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileSlab(DyeColor.BLACK.getId()));

                entries.add(EBBlocks.getDyedTerracottaTiles(DyeColor.BROWN.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileStairs(DyeColor.BROWN.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileVerticalStairs(DyeColor.BROWN.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileSlab(DyeColor.BROWN.getId()));

                entries.add(EBBlocks.getDyedTerracottaTiles(DyeColor.RED.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileStairs(DyeColor.RED.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileVerticalStairs(DyeColor.RED.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileSlab(DyeColor.RED.getId()));

                entries.add(EBBlocks.getDyedTerracottaTiles(DyeColor.ORANGE.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileStairs(DyeColor.ORANGE.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileVerticalStairs(DyeColor.ORANGE.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileSlab(DyeColor.ORANGE.getId()));

                entries.add(EBBlocks.getDyedTerracottaTiles(DyeColor.YELLOW.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileStairs(DyeColor.YELLOW.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileVerticalStairs(DyeColor.YELLOW.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileSlab(DyeColor.YELLOW.getId()));

                entries.add(EBBlocks.getDyedTerracottaTiles(DyeColor.LIME.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileStairs(DyeColor.LIME.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileVerticalStairs(DyeColor.LIME.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileSlab(DyeColor.LIME.getId()));

                entries.add(EBBlocks.getDyedTerracottaTiles(DyeColor.GREEN.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileStairs(DyeColor.GREEN.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileVerticalStairs(DyeColor.GREEN.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileSlab(DyeColor.GREEN.getId()));

                entries.add(EBBlocks.getDyedTerracottaTiles(DyeColor.CYAN.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileStairs(DyeColor.CYAN.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileVerticalStairs(DyeColor.CYAN.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileSlab(DyeColor.CYAN.getId()));

                entries.add(EBBlocks.getDyedTerracottaTiles(DyeColor.LIGHT_BLUE.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileStairs(DyeColor.LIGHT_BLUE.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileVerticalStairs(DyeColor.LIGHT_BLUE.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileSlab(DyeColor.LIGHT_BLUE.getId()));

                entries.add(EBBlocks.getDyedTerracottaTiles(DyeColor.BLUE.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileStairs(DyeColor.BLUE.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileVerticalStairs(DyeColor.BLUE.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileSlab(DyeColor.BLUE.getId()));

                entries.add(EBBlocks.getDyedTerracottaTiles(DyeColor.PURPLE.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileStairs(DyeColor.PURPLE.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileVerticalStairs(DyeColor.PURPLE.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileSlab(DyeColor.PURPLE.getId()));

                entries.add(EBBlocks.getDyedTerracottaTiles(DyeColor.MAGENTA.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileStairs(DyeColor.MAGENTA.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileVerticalStairs(DyeColor.MAGENTA.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileSlab(DyeColor.MAGENTA.getId()));

                entries.add(EBBlocks.getDyedTerracottaTiles(DyeColor.PINK.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileStairs(DyeColor.PINK.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileVerticalStairs(DyeColor.PINK.getId()));
                entries.add(EBBlocks.getDyedTerracottaTileSlab(DyeColor.PINK.getId()));

                entries.add(EBBlocks.ALMENTRA);
                entries.add(EBBlocks.ALMENTRA_STAIRS);
                entries.add(EBBlocks.ALMENTRA_VERTICAL_STAIRS);
                entries.add(EBBlocks.ALMENTRA_SLAB);

                entries.add(EBBlocks.getDyedAlmentra(DyeColor.WHITE.getId()));
                entries.add(EBBlocks.getDyedAlmentraStairs(DyeColor.WHITE.getId()));
                entries.add(EBBlocks.getDyedAlmentraVerticalStairs(DyeColor.WHITE.getId()));
                entries.add(EBBlocks.getDyedAlmentraSlab(DyeColor.WHITE.getId()));

                entries.add(EBBlocks.getDyedAlmentra(DyeColor.LIGHT_GRAY.getId()));
                entries.add(EBBlocks.getDyedAlmentraStairs(DyeColor.LIGHT_GRAY.getId()));
                entries.add(EBBlocks.getDyedAlmentraVerticalStairs(DyeColor.LIGHT_GRAY.getId()));
                entries.add(EBBlocks.getDyedAlmentraSlab(DyeColor.LIGHT_GRAY.getId()));

                entries.add(EBBlocks.getDyedAlmentra(DyeColor.GRAY.getId()));
                entries.add(EBBlocks.getDyedAlmentraStairs(DyeColor.GRAY.getId()));
                entries.add(EBBlocks.getDyedAlmentraVerticalStairs(DyeColor.GRAY.getId()));
                entries.add(EBBlocks.getDyedAlmentraSlab(DyeColor.GRAY.getId()));

                entries.add(EBBlocks.getDyedAlmentra(DyeColor.BLACK.getId()));
                entries.add(EBBlocks.getDyedAlmentraStairs(DyeColor.BLACK.getId()));
                entries.add(EBBlocks.getDyedAlmentraVerticalStairs(DyeColor.BLACK.getId()));
                entries.add(EBBlocks.getDyedAlmentraSlab(DyeColor.BLACK.getId()));

                entries.add(EBBlocks.getDyedAlmentra(DyeColor.BROWN.getId()));
                entries.add(EBBlocks.getDyedAlmentraStairs(DyeColor.BROWN.getId()));
                entries.add(EBBlocks.getDyedAlmentraVerticalStairs(DyeColor.BROWN.getId()));
                entries.add(EBBlocks.getDyedAlmentraSlab(DyeColor.BROWN.getId()));

                entries.add(EBBlocks.getDyedAlmentra(DyeColor.RED.getId()));
                entries.add(EBBlocks.getDyedAlmentraStairs(DyeColor.RED.getId()));
                entries.add(EBBlocks.getDyedAlmentraVerticalStairs(DyeColor.RED.getId()));
                entries.add(EBBlocks.getDyedAlmentraSlab(DyeColor.RED.getId()));

                entries.add(EBBlocks.getDyedAlmentra(DyeColor.ORANGE.getId()));
                entries.add(EBBlocks.getDyedAlmentraStairs(DyeColor.ORANGE.getId()));
                entries.add(EBBlocks.getDyedAlmentraVerticalStairs(DyeColor.ORANGE.getId()));
                entries.add(EBBlocks.getDyedAlmentraSlab(DyeColor.ORANGE.getId()));

                entries.add(EBBlocks.getDyedAlmentra(DyeColor.YELLOW.getId()));
                entries.add(EBBlocks.getDyedAlmentraStairs(DyeColor.YELLOW.getId()));
                entries.add(EBBlocks.getDyedAlmentraVerticalStairs(DyeColor.YELLOW.getId()));
                entries.add(EBBlocks.getDyedAlmentraSlab(DyeColor.YELLOW.getId()));

                entries.add(EBBlocks.getDyedAlmentra(DyeColor.LIME.getId()));
                entries.add(EBBlocks.getDyedAlmentraStairs(DyeColor.LIME.getId()));
                entries.add(EBBlocks.getDyedAlmentraVerticalStairs(DyeColor.LIME.getId()));
                entries.add(EBBlocks.getDyedAlmentraSlab(DyeColor.LIME.getId()));

                entries.add(EBBlocks.getDyedAlmentra(DyeColor.GREEN.getId()));
                entries.add(EBBlocks.getDyedAlmentraStairs(DyeColor.GREEN.getId()));
                entries.add(EBBlocks.getDyedAlmentraVerticalStairs(DyeColor.GREEN.getId()));
                entries.add(EBBlocks.getDyedAlmentraSlab(DyeColor.GREEN.getId()));

                entries.add(EBBlocks.getDyedAlmentra(DyeColor.CYAN.getId()));
                entries.add(EBBlocks.getDyedAlmentraStairs(DyeColor.CYAN.getId()));
                entries.add(EBBlocks.getDyedAlmentraVerticalStairs(DyeColor.CYAN.getId()));
                entries.add(EBBlocks.getDyedAlmentraSlab(DyeColor.CYAN.getId()));

                entries.add(EBBlocks.getDyedAlmentra(DyeColor.LIGHT_BLUE.getId()));
                entries.add(EBBlocks.getDyedAlmentraStairs(DyeColor.LIGHT_BLUE.getId()));
                entries.add(EBBlocks.getDyedAlmentraVerticalStairs(DyeColor.LIGHT_BLUE.getId()));
                entries.add(EBBlocks.getDyedAlmentraSlab(DyeColor.LIGHT_BLUE.getId()));

                entries.add(EBBlocks.getDyedAlmentra(DyeColor.BLUE.getId()));
                entries.add(EBBlocks.getDyedAlmentraStairs(DyeColor.BLUE.getId()));
                entries.add(EBBlocks.getDyedAlmentraVerticalStairs(DyeColor.BLUE.getId()));
                entries.add(EBBlocks.getDyedAlmentraSlab(DyeColor.BLUE.getId()));

                entries.add(EBBlocks.getDyedAlmentra(DyeColor.PURPLE.getId()));
                entries.add(EBBlocks.getDyedAlmentraStairs(DyeColor.PURPLE.getId()));
                entries.add(EBBlocks.getDyedAlmentraVerticalStairs(DyeColor.PURPLE.getId()));
                entries.add(EBBlocks.getDyedAlmentraSlab(DyeColor.PURPLE.getId()));

                entries.add(EBBlocks.getDyedAlmentra(DyeColor.MAGENTA.getId()));
                entries.add(EBBlocks.getDyedAlmentraStairs(DyeColor.MAGENTA.getId()));
                entries.add(EBBlocks.getDyedAlmentraVerticalStairs(DyeColor.MAGENTA.getId()));
                entries.add(EBBlocks.getDyedAlmentraSlab(DyeColor.MAGENTA.getId()));

                entries.add(EBBlocks.getDyedAlmentra(DyeColor.PINK.getId()));
                entries.add(EBBlocks.getDyedAlmentraStairs(DyeColor.PINK.getId()));
                entries.add(EBBlocks.getDyedAlmentraVerticalStairs(DyeColor.PINK.getId()));
                entries.add(EBBlocks.getDyedAlmentraSlab(DyeColor.PINK.getId()));

                entries.add(EBBlocks.POLISHED_ALMENTRA);
                entries.add(EBBlocks.POLISHED_ALMENTRA_STAIRS);
                entries.add(EBBlocks.POLISHED_ALMENTRA_VERTICAL_STAIRS);
                entries.add(EBBlocks.POLISHED_ALMENTRA_SLAB);

                entries.add(EBBlocks.getDyedPolishedAlmentra(DyeColor.WHITE.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraStairs(DyeColor.WHITE.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraVerticalStairs(DyeColor.WHITE.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraSlab(DyeColor.WHITE.getId()));

                entries.add(EBBlocks.getDyedPolishedAlmentra(DyeColor.LIGHT_GRAY.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraStairs(DyeColor.LIGHT_GRAY.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraVerticalStairs(DyeColor.LIGHT_GRAY.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraSlab(DyeColor.LIGHT_GRAY.getId()));

                entries.add(EBBlocks.getDyedPolishedAlmentra(DyeColor.GRAY.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraStairs(DyeColor.GRAY.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraVerticalStairs(DyeColor.GRAY.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraSlab(DyeColor.GRAY.getId()));

                entries.add(EBBlocks.getDyedPolishedAlmentra(DyeColor.BLACK.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraStairs(DyeColor.BLACK.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraVerticalStairs(DyeColor.BLACK.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraSlab(DyeColor.BLACK.getId()));

                entries.add(EBBlocks.getDyedPolishedAlmentra(DyeColor.BROWN.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraStairs(DyeColor.BROWN.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraVerticalStairs(DyeColor.BROWN.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraSlab(DyeColor.BROWN.getId()));

                entries.add(EBBlocks.getDyedPolishedAlmentra(DyeColor.RED.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraStairs(DyeColor.RED.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraVerticalStairs(DyeColor.RED.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraSlab(DyeColor.RED.getId()));

                entries.add(EBBlocks.getDyedPolishedAlmentra(DyeColor.ORANGE.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraStairs(DyeColor.ORANGE.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraVerticalStairs(DyeColor.ORANGE.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraSlab(DyeColor.ORANGE.getId()));

                entries.add(EBBlocks.getDyedPolishedAlmentra(DyeColor.YELLOW.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraStairs(DyeColor.YELLOW.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraVerticalStairs(DyeColor.YELLOW.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraSlab(DyeColor.YELLOW.getId()));

                entries.add(EBBlocks.getDyedPolishedAlmentra(DyeColor.LIME.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraStairs(DyeColor.LIME.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraVerticalStairs(DyeColor.LIME.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraSlab(DyeColor.LIME.getId()));

                entries.add(EBBlocks.getDyedPolishedAlmentra(DyeColor.GREEN.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraStairs(DyeColor.GREEN.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraVerticalStairs(DyeColor.GREEN.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraSlab(DyeColor.GREEN.getId()));

                entries.add(EBBlocks.getDyedPolishedAlmentra(DyeColor.CYAN.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraStairs(DyeColor.CYAN.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraVerticalStairs(DyeColor.CYAN.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraSlab(DyeColor.CYAN.getId()));

                entries.add(EBBlocks.getDyedPolishedAlmentra(DyeColor.LIGHT_BLUE.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraStairs(DyeColor.LIGHT_BLUE.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraVerticalStairs(DyeColor.LIGHT_BLUE.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraSlab(DyeColor.LIGHT_BLUE.getId()));

                entries.add(EBBlocks.getDyedPolishedAlmentra(DyeColor.BLUE.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraStairs(DyeColor.BLUE.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraVerticalStairs(DyeColor.BLUE.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraSlab(DyeColor.BLUE.getId()));

                entries.add(EBBlocks.getDyedPolishedAlmentra(DyeColor.PURPLE.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraStairs(DyeColor.PURPLE.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraVerticalStairs(DyeColor.PURPLE.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraSlab(DyeColor.PURPLE.getId()));

                entries.add(EBBlocks.getDyedPolishedAlmentra(DyeColor.MAGENTA.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraStairs(DyeColor.MAGENTA.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraVerticalStairs(DyeColor.MAGENTA.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraSlab(DyeColor.MAGENTA.getId()));

                entries.add(EBBlocks.getDyedPolishedAlmentra(DyeColor.PINK.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraStairs(DyeColor.PINK.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraVerticalStairs(DyeColor.PINK.getId()));
                entries.add(EBBlocks.getDyedPolishedAlmentraSlab(DyeColor.PINK.getId()));

                entries.add(EBBlocks.ALMENTRA_BRICKS);
                entries.add(EBBlocks.ALMENTRA_BRICK_STAIRS);
                entries.add(EBBlocks.ALMENTRA_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.ALMENTRA_BRICK_SLAB);

                entries.add(EBBlocks.getDyedAlmentraBricks(DyeColor.WHITE.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickStairs(DyeColor.WHITE.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickVerticalStairs(DyeColor.WHITE.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickSlab(DyeColor.WHITE.getId()));

                entries.add(EBBlocks.getDyedAlmentraBricks(DyeColor.LIGHT_GRAY.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickStairs(DyeColor.LIGHT_GRAY.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickVerticalStairs(DyeColor.LIGHT_GRAY.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickSlab(DyeColor.LIGHT_GRAY.getId()));

                entries.add(EBBlocks.getDyedAlmentraBricks(DyeColor.GRAY.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickStairs(DyeColor.GRAY.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickVerticalStairs(DyeColor.GRAY.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickSlab(DyeColor.GRAY.getId()));

                entries.add(EBBlocks.getDyedAlmentraBricks(DyeColor.BLACK.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickStairs(DyeColor.BLACK.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickVerticalStairs(DyeColor.BLACK.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickSlab(DyeColor.BLACK.getId()));

                entries.add(EBBlocks.getDyedAlmentraBricks(DyeColor.BROWN.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickStairs(DyeColor.BROWN.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickVerticalStairs(DyeColor.BROWN.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickSlab(DyeColor.BROWN.getId()));

                entries.add(EBBlocks.getDyedAlmentraBricks(DyeColor.RED.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickStairs(DyeColor.RED.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickVerticalStairs(DyeColor.RED.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickSlab(DyeColor.RED.getId()));

                entries.add(EBBlocks.getDyedAlmentraBricks(DyeColor.ORANGE.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickStairs(DyeColor.ORANGE.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickVerticalStairs(DyeColor.ORANGE.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickSlab(DyeColor.ORANGE.getId()));

                entries.add(EBBlocks.getDyedAlmentraBricks(DyeColor.YELLOW.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickStairs(DyeColor.YELLOW.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickVerticalStairs(DyeColor.YELLOW.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickSlab(DyeColor.YELLOW.getId()));

                entries.add(EBBlocks.getDyedAlmentraBricks(DyeColor.LIME.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickStairs(DyeColor.LIME.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickVerticalStairs(DyeColor.LIME.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickSlab(DyeColor.LIME.getId()));

                entries.add(EBBlocks.getDyedAlmentraBricks(DyeColor.GREEN.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickStairs(DyeColor.GREEN.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickVerticalStairs(DyeColor.GREEN.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickSlab(DyeColor.GREEN.getId()));

                entries.add(EBBlocks.getDyedAlmentraBricks(DyeColor.CYAN.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickStairs(DyeColor.CYAN.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickVerticalStairs(DyeColor.CYAN.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickSlab(DyeColor.CYAN.getId()));

                entries.add(EBBlocks.getDyedAlmentraBricks(DyeColor.LIGHT_BLUE.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickStairs(DyeColor.LIGHT_BLUE.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickVerticalStairs(DyeColor.LIGHT_BLUE.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickSlab(DyeColor.LIGHT_BLUE.getId()));

                entries.add(EBBlocks.getDyedAlmentraBricks(DyeColor.BLUE.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickStairs(DyeColor.BLUE.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickVerticalStairs(DyeColor.BLUE.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickSlab(DyeColor.BLUE.getId()));

                entries.add(EBBlocks.getDyedAlmentraBricks(DyeColor.PURPLE.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickStairs(DyeColor.PURPLE.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickVerticalStairs(DyeColor.PURPLE.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickSlab(DyeColor.PURPLE.getId()));

                entries.add(EBBlocks.getDyedAlmentraBricks(DyeColor.MAGENTA.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickStairs(DyeColor.MAGENTA.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickVerticalStairs(DyeColor.MAGENTA.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickSlab(DyeColor.MAGENTA.getId()));

                entries.add(EBBlocks.getDyedAlmentraBricks(DyeColor.PINK.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickStairs(DyeColor.PINK.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickVerticalStairs(DyeColor.PINK.getId()));
                entries.add(EBBlocks.getDyedAlmentraBrickSlab(DyeColor.PINK.getId()));
                
                entries.add(EBBlocks.ALMENTRA_STATUE);
                entries.add(EBBlocks.getDyedAlmentraStatues(DyeColor.WHITE.getId()));
                entries.add(EBBlocks.getDyedAlmentraStatues(DyeColor.LIGHT_GRAY.getId()));
                entries.add(EBBlocks.getDyedAlmentraStatues(DyeColor.GRAY.getId()));
                entries.add(EBBlocks.getDyedAlmentraStatues(DyeColor.BLACK.getId()));
                entries.add(EBBlocks.getDyedAlmentraStatues(DyeColor.BROWN.getId()));
                entries.add(EBBlocks.getDyedAlmentraStatues(DyeColor.RED.getId()));
                entries.add(EBBlocks.getDyedAlmentraStatues(DyeColor.ORANGE.getId()));
                entries.add(EBBlocks.getDyedAlmentraStatues(DyeColor.YELLOW.getId()));
                entries.add(EBBlocks.getDyedAlmentraStatues(DyeColor.LIME.getId()));
                entries.add(EBBlocks.getDyedAlmentraStatues(DyeColor.GREEN.getId()));
                entries.add(EBBlocks.getDyedAlmentraStatues(DyeColor.CYAN.getId()));
                entries.add(EBBlocks.getDyedAlmentraStatues(DyeColor.LIGHT_BLUE.getId()));
                entries.add(EBBlocks.getDyedAlmentraStatues(DyeColor.BLUE.getId()));
                entries.add(EBBlocks.getDyedAlmentraStatues(DyeColor.PURPLE.getId()));
                entries.add(EBBlocks.getDyedAlmentraStatues(DyeColor.MAGENTA.getId()));
                entries.add(EBBlocks.getDyedAlmentraStatues(DyeColor.PINK.getId()));

                entries.add(EBBlocks.POLISHED_SANDSTONE);
                entries.add(EBBlocks.POLISHED_SANDSTONE_STAIRS);
                entries.add(EBBlocks.POLISHED_SANDSTONE_VERTICAL_STAIRS);
                entries.add(EBBlocks.POLISHED_SANDSTONE_SLAB);
                entries.add(EBBlocks.POLISHED_SANDSTONE_WALL);
                entries.add(EBBlocks.SANDSTONE_BRICKS);
                entries.add(EBBlocks.SANDSTONE_BRICK_STAIRS);
                entries.add(EBBlocks.SANDSTONE_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.SANDSTONE_BRICK_SLAB);
                entries.add(EBBlocks.SANDSTONE_BRICK_WALL);
                entries.add(EBBlocks.SANDSTONE_TILES);
                entries.add(EBBlocks.SANDSTONE_TILE_STAIRS);
                entries.add(EBBlocks.SANDSTONE_TILE_VERTICAL_STAIRS);
                entries.add(EBBlocks.SANDSTONE_TILE_SLAB);
                entries.add(EBBlocks.SANDSTONE_TILE_WALL);
                entries.add(EBBlocks.CHISELED_SANDSTONE_BRICKS);
                entries.add(EBBlocks.DECORATED_SANDSTONE_BRICKS);
                entries.add(EBBlocks.ENGRAVED_SANDSTONE_BRICKS);
                entries.add(EBBlocks.SANDSTONE_PILLAR);

                entries.add(EBBlocks.POLISHED_RED_SANDSTONE);
                entries.add(EBBlocks.POLISHED_RED_SANDSTONE_STAIRS);
                entries.add(EBBlocks.POLISHED_RED_SANDSTONE_VERTICAL_STAIRS);
                entries.add(EBBlocks.POLISHED_RED_SANDSTONE_SLAB);
                entries.add(EBBlocks.POLISHED_RED_SANDSTONE_WALL);
                entries.add(EBBlocks.RED_SANDSTONE_BRICKS);
                entries.add(EBBlocks.RED_SANDSTONE_BRICK_STAIRS);
                entries.add(EBBlocks.RED_SANDSTONE_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.RED_SANDSTONE_BRICK_SLAB);
                entries.add(EBBlocks.RED_SANDSTONE_BRICK_WALL);
                entries.add(EBBlocks.RED_SANDSTONE_TILES);
                entries.add(EBBlocks.RED_SANDSTONE_TILE_STAIRS);
                entries.add(EBBlocks.RED_SANDSTONE_TILE_VERTICAL_STAIRS);
                entries.add(EBBlocks.RED_SANDSTONE_TILE_SLAB);
                entries.add(EBBlocks.RED_SANDSTONE_TILE_WALL);
                entries.add(EBBlocks.CHISELED_RED_SANDSTONE_BRICKS);
                entries.add(EBBlocks.DECORATED_RED_SANDSTONE_BRICKS);
                entries.add(EBBlocks.ENGRAVED_RED_SANDSTONE_BRICKS);
                entries.add(EBBlocks.RED_SANDSTONE_PILLAR);

                entries.add(EBBlocks.SOUL_SANDSTONE);
                entries.add(EBBlocks.SOUL_SANDSTONE_STAIRS);
                entries.add(EBBlocks.SOUL_SANDSTONE_VERTICAL_STAIRS);
                entries.add(EBBlocks.SOUL_SANDSTONE_SLAB);
                entries.add(EBBlocks.SOUL_SANDSTONE_WALL);
                entries.add(EBBlocks.CHISELED_SOUL_SANDSTONE);
                entries.add(EBBlocks.SMOOTH_SOUL_SANDSTONE);
                entries.add(EBBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS);
                entries.add(EBBlocks.SMOOTH_SOUL_SANDSTONE_VERTICAL_STAIRS);
                entries.add(EBBlocks.SMOOTH_SOUL_SANDSTONE_SLAB);
                entries.add(EBBlocks.CUT_SOUL_SANDSTONE);
                entries.add(EBBlocks.CUT_SOUL_SANDSTONE_SLAB);

                entries.add(EBBlocks.POLISHED_SOUL_SANDSTONE);
                entries.add(EBBlocks.POLISHED_SOUL_SANDSTONE_STAIRS);
                entries.add(EBBlocks.POLISHED_SOUL_SANDSTONE_VERTICAL_STAIRS);
                entries.add(EBBlocks.POLISHED_SOUL_SANDSTONE_SLAB);
                entries.add(EBBlocks.POLISHED_SOUL_SANDSTONE_WALL);
                entries.add(EBBlocks.SOUL_SANDSTONE_BRICKS);
                entries.add(EBBlocks.SOUL_SANDSTONE_BRICK_STAIRS);
                entries.add(EBBlocks.SOUL_SANDSTONE_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.SOUL_SANDSTONE_BRICK_SLAB);
                entries.add(EBBlocks.SOUL_SANDSTONE_BRICK_WALL);
                entries.add(EBBlocks.SOUL_SANDSTONE_TILES);
                entries.add(EBBlocks.SOUL_SANDSTONE_TILE_STAIRS);
                entries.add(EBBlocks.SOUL_SANDSTONE_TILE_VERTICAL_STAIRS);
                entries.add(EBBlocks.SOUL_SANDSTONE_TILE_SLAB);
                entries.add(EBBlocks.SOUL_SANDSTONE_TILE_WALL);
                entries.add(EBBlocks.CHISELED_SOUL_SANDSTONE_BRICKS);
                entries.add(EBBlocks.DECORATED_SOUL_SANDSTONE_BRICKS);
                entries.add(EBBlocks.ENGRAVED_SOUL_SANDSTONE_BRICKS);
                entries.add(EBBlocks.SOUL_SANDSTONE_PILLAR);
                
                entries.add(EBBlocks.SOUL_MAGMA_BLOCK);

                entries.add(EBBlocks.CRACKED_MUD_BRICKS);

                entries.add(EBBlocks.BONE_BRICKS);
                entries.add(EBBlocks.BONE_BRICK_STAIRS);
                entries.add(EBBlocks.BONE_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.BONE_BRICK_SLAB);
                entries.add(EBBlocks.BONE_BRICK_WALL);

                entries.add(Blocks.QUARTZ_BRICKS);
                entries.add(EBBlocks.QUARTZ_BRICK_STAIRS);
                entries.add(EBBlocks.QUARTZ_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.QUARTZ_BRICK_SLAB);
                entries.add(EBBlocks.QUARTZ_BRICK_WALL);
                
                entries.add(EBBlocks.IRON_BRICKS);
                entries.add(EBBlocks.IRON_BRICK_STAIRS);
                entries.add(EBBlocks.IRON_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.IRON_BRICK_SLAB);

                entries.add(EBBlocks.IRON_GRATE);

                entries.add(EBBlocks.GOLD_BRICKS);
                entries.add(EBBlocks.GOLD_BRICK_STAIRS);
                entries.add(EBBlocks.GOLD_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.GOLD_BRICK_SLAB);

                entries.add(EBBlocks.GOLD_GRATE);

                entries.add(EBBlocks.REDSTONE_BRICKS);
                entries.add(EBBlocks.REDSTONE_BRICK_STAIRS);
                entries.add(EBBlocks.REDSTONE_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.REDSTONE_BRICK_SLAB);

                entries.add(EBBlocks.EMERALD_BRICKS);
                entries.add(EBBlocks.EMERALD_BRICK_STAIRS);
                entries.add(EBBlocks.EMERALD_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.EMERALD_BRICK_SLAB);

                entries.add(EBBlocks.LAPIS_BRICKS);
                entries.add(EBBlocks.LAPIS_BRICK_STAIRS);
                entries.add(EBBlocks.LAPIS_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.LAPIS_BRICK_SLAB);

                entries.add(EBBlocks.DIAMOND_BRICKS);
                entries.add(EBBlocks.DIAMOND_BRICK_STAIRS);
                entries.add(EBBlocks.DIAMOND_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.DIAMOND_BRICK_SLAB);

                entries.add(EBItems.NETHERITE_BRICKS);
                entries.add(EBItems.NETHERITE_BRICK_STAIRS);
                entries.add(EBItems.NETHERITE_BRICK_VERTICAL_STAIRS);
                entries.add(EBItems.NETHERITE_BRICK_SLAB);

                entries.add(EBBlocks.COPPER_BRICKS);
                entries.add(EBBlocks.COPPER_BRICK_STAIRS);
                entries.add(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.COPPER_BRICK_SLAB);
                entries.add(EBBlocks.COPPER_PRESSURE_PLATE);
                entries.add(EBBlocks.COPPER_BUTTON);

                entries.add(EBBlocks.EXPOSED_COPPER_BRICKS);
                entries.add(EBBlocks.EXPOSED_COPPER_BRICK_STAIRS);
                entries.add(EBBlocks.EXPOSED_COPPER_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.EXPOSED_COPPER_BRICK_SLAB);
                entries.add(EBBlocks.EXPOSED_COPPER_PRESSURE_PLATE);
                entries.add(EBBlocks.EXPOSED_COPPER_BUTTON);

                entries.add(EBBlocks.WEATHERED_COPPER_BRICKS);
                entries.add(EBBlocks.WEATHERED_COPPER_BRICK_STAIRS);
                entries.add(EBBlocks.WEATHERED_COPPER_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.WEATHERED_COPPER_BRICK_SLAB);
                entries.add(EBBlocks.WEATHERED_COPPER_PRESSURE_PLATE);
                entries.add(EBBlocks.WEATHERED_COPPER_BUTTON);

                entries.add(EBBlocks.OXIDIZED_COPPER_BRICKS);
                entries.add(EBBlocks.OXIDIZED_COPPER_BRICK_STAIRS);
                entries.add(EBBlocks.OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.OXIDIZED_COPPER_BRICK_SLAB);
                entries.add(EBBlocks.OXIDIZED_COPPER_PRESSURE_PLATE);
                entries.add(EBBlocks.OXIDIZED_COPPER_BUTTON);

                entries.add(EBBlocks.WAXED_COPPER_BRICKS);
                entries.add(EBBlocks.WAXED_COPPER_BRICK_STAIRS);
                entries.add(EBBlocks.WAXED_COPPER_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.WAXED_COPPER_BRICK_SLAB);
                entries.add(EBBlocks.WAXED_COPPER_PRESSURE_PLATE);
                entries.add(EBBlocks.WAXED_COPPER_BUTTON);

                entries.add(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS);
                entries.add(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_STAIRS);
                entries.add(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB);
                entries.add(EBBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE);
                entries.add(EBBlocks.WAXED_EXPOSED_COPPER_BUTTON);

                entries.add(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS);
                entries.add(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_STAIRS);
                entries.add(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_SLAB);
                entries.add(EBBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE);
                entries.add(EBBlocks.WAXED_WEATHERED_COPPER_BUTTON);

                entries.add(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS);
                entries.add(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_STAIRS);
                entries.add(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_SLAB);
                entries.add(EBBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE);
                entries.add(EBBlocks.WAXED_OXIDIZED_COPPER_BUTTON);

                entries.add(EBBlocks.ROSE);
                entries.add(EBBlocks.CYAN_ROSE);
                entries.add(EBBlocks.WHITE_ROSE);
                entries.add(EBBlocks.MOSS_PASTE);

                entries.add(EBBlocks.AMETHYST_LAMP);
                entries.add(EBBlocks.REACHING_LANTERN);
                entries.add(EBBlocks.WEEPING_CANDLE);
                entries.add(EBBlocks.TWISTING_CANDLE);

                entries.add(EBBlocks.WOODEN_MUG);
                entries.add(EBBlocks.GLASS_JAR);
                entries.add(EBBlocks.GLASS_JAR_OF_FIRE);
                entries.add(EBBlocks.GLASS_JAR_OF_SOUL_FIRE);

                entries.add(EBItems.ANCIENT_POTTERY_SHERD);
                entries.add(EBItems.BITTER_POTTERY_SHERD);
                entries.add(EBItems.BOIN_POTTERY_SHERD);
                entries.add(EBItems.BUSTLING_POTTERY_SHERD);
                entries.add(EBItems.CHECKERED_POTTERY_SHERD);
                entries.add(EBItems.DECAY_POTTERY_SHERD);
                entries.add(EBItems.DESTRUCTION_POTTERY_SHERD);
                entries.add(EBItems.FORWARDS_POTTERY_SHERD);
                entries.add(EBItems.HEXXED_POTTERY_SHERD);
                entries.add(EBItems.IS_THAT_POTTERY_SHERD);
                entries.add(EBItems.KITTEH_POTTERY_SHERD);
                entries.add(EBItems.KOKOS_BUG_POTTERY_SHERD);
                entries.add(EBItems.LIFE_POTTERY_SHERD);
                entries.add(EBItems.MESMERIZE_POTTERY_SHERD);
                entries.add(EBItems.PORTAL_POTTERY_SHERD);
                entries.add(EBItems.POTTERY_POTTERY_SHERD);
                entries.add(EBItems.RING_POTTERY_SHERD);
                entries.add(EBItems.ROYALTY_POTTERY_SHERD);
                entries.add(EBItems.SNOUT_POTTERY_SHERD);
                entries.add(EBItems.SPRITE_POTTERY_SHERD);
                entries.add(EBItems.THIEF_POTTERY_SHERD);
                entries.add(EBItems.TWINS_POTTERY_SHERD);
                entries.add(EBItems.WRATHFUL_POTTERY_SHERD);

                entries.add(EBBlocks.OAK_VERTICAL_STAIRS);
                entries.add(EBBlocks.SPRUCE_VERTICAL_STAIRS);
                entries.add(EBBlocks.BIRCH_VERTICAL_STAIRS);
                entries.add(EBBlocks.JUNGLE_VERTICAL_STAIRS);
                entries.add(EBBlocks.ACACIA_VERTICAL_STAIRS);
                entries.add(EBBlocks.DARK_OAK_VERTICAL_STAIRS);
                entries.add(EBBlocks.MANGROVE_VERTICAL_STAIRS);
                entries.add(EBBlocks.CHERRY_VERTICAL_STAIRS);
                entries.add(EBBlocks.BAMBOO_VERTICAL_STAIRS);
                entries.add(EBBlocks.CRIMSON_VERTICAL_STAIRS);
                entries.add(EBBlocks.WARPED_VERTICAL_STAIRS);
                entries.add(EBBlocks.STONE_VERTICAL_STAIRS);
                entries.add(EBBlocks.COBBLESTONE_VERTICAL_STAIRS);
                entries.add(EBBlocks.MOSSY_COBBLESTONE_VERTICAL_STAIRS);
                entries.add(EBBlocks.STONE_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.MOSSY_STONE_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.GRANITE_VERTICAL_STAIRS);
                entries.add(EBBlocks.POLISHED_GRANITE_VERTICAL_STAIRS);
                entries.add(EBBlocks.DIORITE_VERTICAL_STAIRS);
                entries.add(EBBlocks.POLISHED_DIORITE_VERTICAL_STAIRS);
                entries.add(EBBlocks.ANDESITE_VERTICAL_STAIRS);
                entries.add(EBBlocks.POLISHED_ANDESITE_VERTICAL_STAIRS);
                entries.add(EBBlocks.COBBLED_DEEPSLATE_VERTICAL_STAIRS);
                entries.add(EBBlocks.POLISHED_DEEPSLATE_VERTICAL_STAIRS);
                entries.add(EBBlocks.DEEPSLATE_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.DEEPSLATE_TILE_VERTICAL_STAIRS);
                entries.add(EBBlocks.TUFF_VERTICAL_STAIRS);
                entries.add(EBBlocks.POLISHED_TUFF_VERTICAL_STAIRS);
                entries.add(EBBlocks.TUFF_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.SANDSTONE_VERTICAL_STAIRS);
                entries.add(EBBlocks.SMOOTH_SANDSTONE_VERTICAL_STAIRS);
                entries.add(EBBlocks.RED_SANDSTONE_VERTICAL_STAIRS);
                entries.add(EBBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_STAIRS);
                entries.add(EBBlocks.PRISMARINE_VERTICAL_STAIRS);
                entries.add(EBBlocks.PRISMARINE_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.DARK_PRISMARINE_VERTICAL_STAIRS);
                entries.add(EBBlocks.NETHER_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.RED_NETHER_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.BLACKSTONE_VERTICAL_STAIRS);
                entries.add(EBBlocks.POLISHED_BLACKSTONE_VERTICAL_STAIRS);
                entries.add(EBBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.END_STONE_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.PURPUR_VERTICAL_STAIRS);
                entries.add(EBBlocks.QUARTZ_VERTICAL_STAIRS);
                entries.add(EBBlocks.SMOOTH_QUARTZ_VERTICAL_STAIRS);
                entries.add(EBBlocks.CUT_COPPER_VERTICAL_STAIRS);
                entries.add(EBBlocks.EXPOSED_CUT_COPPER_VERTICAL_STAIRS);
                entries.add(EBBlocks.WEATHERED_CUT_COPPER_VERTICAL_STAIRS);
                entries.add(EBBlocks.OXIDIZED_CUT_COPPER_VERTICAL_STAIRS);
                entries.add(EBBlocks.WAXED_CUT_COPPER_VERTICAL_STAIRS);
                entries.add(EBBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_STAIRS);
                entries.add(EBBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_STAIRS);
                entries.add(EBBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_STAIRS);

                entries.add(Items.PAINTING);
                ctx.lookup().getOptionalWrapper(RegistryKeys.PAINTING_VARIANT).ifPresent(registryWrapper -> addPaintings(entries, ctx.lookup(), registryWrapper,
                        registryEntry -> registryEntry.isIn(EBTags.PaintingVariants.EB_PAINTINGS), ItemGroup.StackVisibility.PARENT_AND_SEARCH_TABS));
            }).build());

    private static final Comparator<RegistryEntry<PaintingVariant>> PAINTING_VARIANT_COMPARATOR = Comparator.comparing(
            RegistryEntry::value, Comparator.comparingInt(PaintingVariant::getArea).thenComparing(PaintingVariant::width)
    );

    private static void addPaintings(ItemGroup.Entries entries, RegistryWrapper.WrapperLookup registryLookup, RegistryWrapper.Impl<PaintingVariant> registryWrapper, Predicate<RegistryEntry<PaintingVariant>> filter, ItemGroup.StackVisibility stackVisibility) {
        RegistryOps<NbtElement> registryOps = registryLookup.getOps(NbtOps.INSTANCE);
        registryWrapper.streamEntries().filter(filter).sorted(PAINTING_VARIANT_COMPARATOR).forEach(paintingVariantEntry -> {
                    NbtComponent nbtComponent = NbtComponent.DEFAULT.with(registryOps, PaintingEntity.VARIANT_MAP_CODEC, paintingVariantEntry).getOrThrow().apply(nbt -> nbt.putString("id", "minecraft:painting"));
                    ItemStack itemStack = new ItemStack(Items.PAINTING);
                    itemStack.set(DataComponentTypes.ENTITY_DATA, nbtComponent);
                    entries.add(itemStack, stackVisibility);
                });
        }

    public static void loadItemGroups() {
    }
}
