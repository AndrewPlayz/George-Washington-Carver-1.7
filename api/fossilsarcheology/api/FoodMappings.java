package fossilsarcheology.api;

import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;

import java.util.Map;

public enum FoodMappings {
    INSTANCE;

    private Map<Item, Integer> carnivoreItemDiet;
    private Map<Item, Integer> herbivoreItemDiet;
    private Map<Item, Integer> omnivoreItemDiet;
    private Map<Item, Integer> piscivoreItemDiet;
    private Map<Item, Integer> carnivoreEggItemDiet;
    private Map<Item, Integer> insectivoreItemDiet;
    private Map<Item, Integer> pisccarnivoreItemDiet;
    private Map<Item, Integer> carnivoreBlockDiet;
    private Map<Item, Integer> herbivoreBlockDiet;
    private Map<Item, Integer> omnivoreBlockDiet;
    private Map<Item, Integer> piscivoreBlockDiet;
    private Map<Item, Integer> carnivoreEggBlockDiet;
    private Map<Item, Integer> insectivoreBlockDiet;
    private Map<Item, Integer> pisccarnivoreBlockDiet;
    private Map<Class<? extends Entity>, Integer> carnivoreEntityDiet;
    private Map<Class<? extends Entity>, Integer> herbivoreEntityDiet;
    private Map<Class<? extends Entity>, Integer> omnivoreEntityDiet;
    private Map<Class<? extends Entity>, Integer> piscivoreEntityDiet;
    private Map<Class<? extends Entity>, Integer> carnivore_eggEntityDiet;
    private Map<Class<? extends Entity>, Integer> insectivoreEntityDiet;
    private Map<Class<? extends Entity>, Integer> pisccarnivoreEntityDiet;

    /**
     * Add an item to a specific diet.
     *
     * @param item The item to be added as Food.
     * @param food The amount of food points for the item.
     * @param diet The specific diet to add the item to.
     */
    public void addToItemMappings(Item item, int food, EnumDiet diet) {
        if (item != null) {
            switch (diet) {
                case CARNIVORE:
                    if (carnivoreItemDiet == null) {
                        carnivoreItemDiet = Maps.newHashMap();
                    }
                    if (!carnivoreItemDiet.containsKey(item)) {
                        carnivoreItemDiet.put(item, food);
                    }
                    break;
                case HERBIVORE:
                    if (herbivoreItemDiet == null) {
                        herbivoreItemDiet = Maps.newHashMap();
                    }
                    if (!herbivoreItemDiet.containsKey(item)) {
                        herbivoreItemDiet.put(item, food);
                    }
                    break;
                case OMNIVORE:
                    if (omnivoreItemDiet == null) {
                        omnivoreItemDiet = Maps.newHashMap();
                    }
                    if (!omnivoreItemDiet.containsKey(item)) {
                        omnivoreItemDiet.put(item, food);
                    }
                    break;
                case PISCIVORE:
                    if (piscivoreItemDiet == null) {
                        piscivoreItemDiet = Maps.newHashMap();
                    }
                    if (!piscivoreItemDiet.containsKey(item)) {
                        piscivoreItemDiet.put(item, food);
                    }
                    break;
                case CARNIVORE_EGG:
                    if (carnivoreEggItemDiet == null) {
                        carnivoreEggItemDiet = Maps.newHashMap();
                    }
                    if (!carnivoreEggItemDiet.containsKey(item)) {
                        carnivoreEggItemDiet.put(item, food);
                    }
                    break;
                case INSECTIVORE:
                    if (insectivoreItemDiet == null) {
                        insectivoreItemDiet = Maps.newHashMap();
                    }
                    if (!insectivoreItemDiet.containsKey(item)) {
                        insectivoreItemDiet.put(item, food);
                    }
                    break;
                case PISCCARNIVORE:
                    if (pisccarnivoreItemDiet == null) {
                        pisccarnivoreItemDiet = Maps.newHashMap();
                    }
                    if (!pisccarnivoreItemDiet.containsKey(item)) {
                        pisccarnivoreItemDiet.put(item, food);
                    }
                    break;
                default:
                    break;
            }
        }
    }

    /**
     * Get the amount of food points from an item in the mapping.
     *
     * @param item The item to find.
     * @param diet The specific diet to find the item from.
     */
    public int getItemFoodAmount(Item item, EnumDiet diet) {
        switch (diet) {
            case CARNIVORE:
                if (carnivoreItemDiet != null && carnivoreItemDiet.containsKey(item)) {
                    return carnivoreItemDiet.get(item);
                }
                break;
            case HERBIVORE:
                if (herbivoreItemDiet != null && herbivoreItemDiet.containsKey(item)) {
                    return herbivoreItemDiet.get(item);
                }
                break;
            case OMNIVORE:
                if (omnivoreItemDiet != null && omnivoreItemDiet.containsKey(item)) {
                    return omnivoreItemDiet.get(item);
                }
                break;
            case PISCIVORE:
                if (piscivoreItemDiet != null && piscivoreItemDiet.containsKey(item)) {
                    return piscivoreItemDiet.get(item);
                }
                break;
            case CARNIVORE_EGG:
                if (carnivoreEggItemDiet != null && carnivoreEggItemDiet.containsKey(item)) {
                    return carnivoreEggItemDiet.get(item);
                }
                break;
            case INSECTIVORE:
                if (insectivoreItemDiet != null && insectivoreItemDiet.containsKey(item)) {
                    return insectivoreItemDiet.get(item);
                }
                break;
            case PISCCARNIVORE:
                if (pisccarnivoreItemDiet != null && pisccarnivoreItemDiet.containsKey(item)) {
                    return pisccarnivoreItemDiet.get(item);
                }
                break;
            default:
                return 0;
        }
        return 0;
    }

    /**
     * Add an block to a specific diet. Usually only for herbivores and omnivores.
     *
     * @param block        The block to be added as Food.
     * @param food         The amount of food points for the block.
     * @param diet         The specific diet to add the block to.
     * @param registerItem Register the block's item as food or not. Usually true, but false for technical blocks like wheat.
     */
    public void addToBlockMappings(Block block, int food, EnumDiet diet, boolean registerItem) {
        switch (diet) {
            case CARNIVORE:
                if (carnivoreBlockDiet == null) {
                    carnivoreBlockDiet = Maps.newHashMap();
                }
                if (!carnivoreBlockDiet.containsKey(Item.getItemFromBlock(block))) {
                    carnivoreBlockDiet.put(Item.getItemFromBlock(block), food);
                }
                break;
            case HERBIVORE:
                if (herbivoreBlockDiet == null) {
                    herbivoreBlockDiet = Maps.newHashMap();
                }
                if (!herbivoreBlockDiet.containsKey(Item.getItemFromBlock(block))) {
                    herbivoreBlockDiet.put(Item.getItemFromBlock(block), food);
                }
                break;
            case OMNIVORE:
                if (omnivoreBlockDiet == null) {
                    omnivoreBlockDiet = Maps.newHashMap();
                }
                if (!omnivoreBlockDiet.containsKey(Item.getItemFromBlock(block))) {
                    omnivoreBlockDiet.put(Item.getItemFromBlock(block), food);
                }
                break;
            case PISCIVORE:
                if (piscivoreBlockDiet == null) {
                    piscivoreBlockDiet = Maps.newHashMap();
                }
                if (!piscivoreBlockDiet.containsKey(Item.getItemFromBlock(block))) {
                    piscivoreBlockDiet.put(Item.getItemFromBlock(block), food);
                }
                break;
            case CARNIVORE_EGG:
                if (carnivoreEggBlockDiet == null) {
                    carnivoreEggBlockDiet = Maps.newHashMap();
                }
                if (!carnivoreEggBlockDiet.containsKey(Item.getItemFromBlock(block))) {
                    carnivoreEggBlockDiet.put(Item.getItemFromBlock(block), food);
                }
                break;
            case INSECTIVORE:
                if (insectivoreBlockDiet == null) {
                    insectivoreBlockDiet = Maps.newHashMap();
                }
                if (!insectivoreBlockDiet.containsKey(Item.getItemFromBlock(block))) {
                    insectivoreBlockDiet.put(Item.getItemFromBlock(block), food);
                }
                break;
            case PISCCARNIVORE:
                if (pisccarnivoreBlockDiet == null) {
                    pisccarnivoreBlockDiet = Maps.newHashMap();
                }
                if (!pisccarnivoreBlockDiet.containsKey(Item.getItemFromBlock(block))) {
                    pisccarnivoreBlockDiet.put(Item.getItemFromBlock(block), food);
                }
                break;
            default:
                break;
        }
        if (registerItem) {
            addToItemMappings(Item.getItemFromBlock(block), food, diet);
        }
    }

    /**
     * Get the amount of food points from a block in the mapping.
     *
     * @param block The block to find.
     * @param diet  The specific diet to find the block from.
     */
    public int getBlockFoodAmount(Block block, EnumDiet diet) {
        switch (diet) {
            case CARNIVORE:
                if (carnivoreBlockDiet != null && carnivoreBlockDiet.containsKey(Item.getItemFromBlock(block))) {
                    return carnivoreBlockDiet.get(Item.getItemFromBlock(block));
                }
                break;
            case HERBIVORE:
                if (herbivoreBlockDiet != null && herbivoreBlockDiet.containsKey(Item.getItemFromBlock(block))) {
                    return herbivoreBlockDiet.get(Item.getItemFromBlock(block));
                }
                break;
            case OMNIVORE:
                if (omnivoreBlockDiet != null && omnivoreBlockDiet.containsKey(Item.getItemFromBlock(block))) {
                    return omnivoreBlockDiet.get(Item.getItemFromBlock(block));
                }
                break;
            case PISCIVORE:
                if (piscivoreBlockDiet != null && piscivoreBlockDiet.containsKey(Item.getItemFromBlock(block))) {
                    return piscivoreBlockDiet.get(Item.getItemFromBlock(block));
                }
                break;
            case CARNIVORE_EGG:
                if (carnivoreEggBlockDiet != null && carnivoreEggBlockDiet.containsKey(Item.getItemFromBlock(block))) {
                    return carnivoreEggBlockDiet.get(Item.getItemFromBlock(block));
                }
                break;
            case INSECTIVORE:
                if (insectivoreBlockDiet != null && insectivoreBlockDiet.containsKey(Item.getItemFromBlock(block))) {
                    return insectivoreBlockDiet.get(Item.getItemFromBlock(block));
                }
                break;
            case PISCCARNIVORE:
                if (pisccarnivoreBlockDiet != null && pisccarnivoreBlockDiet.containsKey(Item.getItemFromBlock(block))) {
                    return pisccarnivoreBlockDiet.get(Item.getItemFromBlock(block));
                }
                break;
            default:
                return 0;
        }
        return 0;
    }


    public void addToEntityMappings(Class<? extends Entity> entity, int food, EnumDiet diet) {
        switch (diet) {
            case CARNIVORE:
                if (carnivoreEntityDiet == null) {
                    carnivoreEntityDiet = Maps.newHashMap();
                }
                if (!carnivoreEntityDiet.containsKey(entity)) {
                    carnivoreEntityDiet.put(entity, food);
                }
                break;
            case HERBIVORE:
                if (herbivoreEntityDiet == null) {
                    herbivoreEntityDiet = Maps.newHashMap();
                }
                if (!herbivoreEntityDiet.containsKey(entity)) {
                    herbivoreEntityDiet.put(entity, food);
                }
                break;
            case OMNIVORE:
                if (omnivoreEntityDiet == null) {
                    omnivoreEntityDiet = Maps.newHashMap();
                }
                if (!omnivoreEntityDiet.containsKey(entity)) {
                    omnivoreEntityDiet.put(entity, food);
                }
                break;
            case PISCIVORE:
                if (piscivoreEntityDiet == null) {
                    piscivoreEntityDiet = Maps.newHashMap();
                }
                if (!piscivoreEntityDiet.containsKey(entity)) {
                    piscivoreEntityDiet.put(entity, food);
                }
                break;
            case CARNIVORE_EGG:
                if (carnivore_eggEntityDiet == null) {
                    carnivore_eggEntityDiet = Maps.newHashMap();
                }
                if (!carnivore_eggEntityDiet.containsKey(entity)) {
                    carnivore_eggEntityDiet.put(entity, food);
                }
                break;
            case INSECTIVORE:
                if (insectivoreEntityDiet == null) {
                    insectivoreEntityDiet = Maps.newHashMap();
                }
                if (!insectivoreEntityDiet.containsKey(entity)) {
                    insectivoreEntityDiet.put(entity, food);
                }
                break;
            case PISCCARNIVORE:
                if (pisccarnivoreEntityDiet == null) {
                    pisccarnivoreEntityDiet = Maps.newHashMap();
                }
                if (!pisccarnivoreEntityDiet.containsKey(entity)) {
                    pisccarnivoreEntityDiet.put(entity, food);
                }
                break;
            default:
                break;
        }
    }

    /**
     * Add an entity to a specific diet. Usually only for carnivores and omnivores.
     *
     * @param entity The entity class to be added as Food.
     * @param diet   The specific diet to add the entity to.
     */
    public int getEntityFoodAmount(Class<? extends Entity> entity, EnumDiet diet) {
        switch (diet) {
            case CARNIVORE:
                if (carnivoreEntityDiet != null && carnivoreEntityDiet.containsKey(entity)) {
                    return carnivoreEntityDiet.get(entity);
                }
                break;
            case HERBIVORE:
                if (herbivoreEntityDiet != null && herbivoreEntityDiet.containsKey(entity)) {
                    return herbivoreEntityDiet.get(entity);
                }
                break;
            case OMNIVORE:
                if (omnivoreEntityDiet != null && omnivoreEntityDiet.containsKey(entity)) {
                    return omnivoreEntityDiet.get(entity);
                }
                break;
            case PISCIVORE:
                if (piscivoreEntityDiet != null && piscivoreEntityDiet.containsKey(entity)) {
                    return piscivoreEntityDiet.get(entity);
                }
                break;
            case CARNIVORE_EGG:
                if (carnivore_eggEntityDiet != null && carnivore_eggEntityDiet.containsKey(entity)) {
                    return carnivore_eggEntityDiet.get(entity);
                }
                break;
            case INSECTIVORE:
                if (insectivoreEntityDiet != null && insectivoreEntityDiet.containsKey(entity)) {
                    return insectivoreEntityDiet.get(entity);
                }
                break;
            case PISCCARNIVORE:
                if (pisccarnivoreEntityDiet != null && pisccarnivoreEntityDiet.containsKey(entity)) {
                    return pisccarnivoreEntityDiet.get(entity);
                }
                break;
            default:
                return 0;
        }
        return 0;
    }

    /**
     * Gives out a list of all of the food items for a diet. Used in dinopedia.
     *
     * @param diet The specific diet to show.
     */
    public Map<Item, Integer> getFoodRenderList(EnumDiet diet) {
        switch (diet) {
            case CARNIVORE:
                if (carnivoreItemDiet == null) {
                    carnivoreItemDiet = Maps.newHashMap();
                }
                return carnivoreItemDiet;
            case HERBIVORE:
                if (herbivoreItemDiet == null) {
                    herbivoreItemDiet = Maps.newHashMap();
                }
                return herbivoreItemDiet;
            case OMNIVORE:
                if (omnivoreItemDiet == null) {
                    omnivoreItemDiet = Maps.newHashMap();
                }
                return omnivoreItemDiet;
            case PISCIVORE:
                if (piscivoreItemDiet == null) {
                    piscivoreItemDiet = Maps.newHashMap();
                }
                return piscivoreItemDiet;
            case CARNIVORE_EGG:
                if (carnivoreEggItemDiet == null) {
                    carnivoreEggItemDiet = Maps.newHashMap();
                }
                return carnivoreEggItemDiet;
            case INSECTIVORE:
                if (insectivoreItemDiet == null) {
                    insectivoreItemDiet = Maps.newHashMap();
                }
                return insectivoreItemDiet;
            case PISCCARNIVORE:
                if (pisccarnivoreItemDiet == null) {
                    pisccarnivoreItemDiet = Maps.newHashMap();
                }
                return pisccarnivoreItemDiet;
            default:
                return carnivoreItemDiet;
        }
    }

    /**
     * Removes an item from the mapping.
     *
     * @param diet The specific diet to show.
     */
    public void removeItemMapping(Item item, EnumDiet diet) {
        this.getFoodRenderList(diet).remove(item);
    }

    /**
     * Adds a item, block, or entity class to all the carnivore mappings.
     *
     * @param entity The entity class being registered.
     * @param food   The amount of food points for the object.
     */
    public void addMeat(Class<? extends Entity> entity, int food) {
        this.addToEntityMappings(entity, food, EnumDiet.CARNIVORE);
        this.addToEntityMappings(entity, food, EnumDiet.CARNIVORE_EGG);
        this.addToEntityMappings(entity, food, EnumDiet.OMNIVORE);
        this.addToEntityMappings(entity, food, EnumDiet.PISCCARNIVORE);

    }

    /**
     * Adds a item, block, or entity class to all the carnivore mappings.
     *
     * @param block The block being registered.
     * @param food  The amount of food points for the object.
     */
    public void addMeat(Block block, int food) {
        this.addToBlockMappings(block, food, EnumDiet.CARNIVORE, true);
        this.addToBlockMappings(block, food, EnumDiet.CARNIVORE_EGG, true);
        this.addToBlockMappings(block, food, EnumDiet.OMNIVORE, true);
        this.addToBlockMappings(block, food, EnumDiet.PISCCARNIVORE, true);
    }

    /**
     * Adds a item, block, or entity class to all the carnivore mappings.
     *
     * @param item The item being registered.
     * @param food The amount of food points for the object.
     */
    public void addMeat(Item item, int food) {
        this.addToItemMappings(item, food, EnumDiet.CARNIVORE);
        this.addToItemMappings(item, food, EnumDiet.CARNIVORE_EGG);
        this.addToItemMappings(item, food, EnumDiet.OMNIVORE);
        this.addToItemMappings(item, food, EnumDiet.PISCCARNIVORE);
    }

    /**
     * Adds a item, block, or entity class to all the herbivore mappings.
     *
     * @param entity The entity class being registered.
     * @param food   The amount of food points for the object.
     */
    public void addPlant(Class<? extends Entity> entity, int food) {
        this.addToEntityMappings(entity, food, EnumDiet.HERBIVORE);
        this.addToEntityMappings(entity, food, EnumDiet.OMNIVORE);
    }

    /**
     * Adds a item, block, or entity class to all the herbivore mappings.
     *
     * @param block The block being registered.
     * @param food  The amount of food points for the object.
     */
    public void addPlant(Block block, int food) {
        this.addToBlockMappings(block, food, EnumDiet.HERBIVORE, true);
        this.addToBlockMappings(block, food, EnumDiet.OMNIVORE, true);
    }

    /**
     * Adds a item, block, or entity class to all the herbivore mappings.
     *
     * @param item The item being registered.
     * @param food The amount of food points for the object.
     */
    public void addPlant(Item item, int food) {
        this.addToItemMappings(item, food, EnumDiet.HERBIVORE);
        this.addToItemMappings(item, food, EnumDiet.OMNIVORE);
    }

    /**
     * Adds a item, block, or entity class to all the piscivore mappings.
     *
     * @param entity The entity class being registered.
     * @param food   The amount of food points for the object.
     */
    public void addFish(Class<? extends Entity> entity, int food) {
        this.addToEntityMappings(entity, food, EnumDiet.PISCCARNIVORE);
        this.addToEntityMappings(entity, food, EnumDiet.PISCIVORE);
    }

    /**
     * Adds a item, block, or entity class to all the piscivore mappings.
     *
     * @param block The block being registered.
     * @param food  The amount of food points for the object.
     */
    public void addFish(Block block, int food) {
        this.addToBlockMappings(block, food, EnumDiet.PISCCARNIVORE, true);
        this.addToBlockMappings(block, food, EnumDiet.PISCIVORE, true);
    }

    /**
     * Adds a item, block, or entity class to all the piscivore mappings.
     *
     * @param item The item being registered.
     * @param food The amount of food points for the object.
     */
    public void addFish(Item item, int food) {
        this.addToItemMappings(item, food, EnumDiet.PISCCARNIVORE);
        this.addToItemMappings(item, food, EnumDiet.PISCIVORE);
    }

    /**
     * Adds a item, block, or entity class to all the egg eating mappings.
     *
     * @param entity The entity class being registered.
     * @param food   The amount of food points for the object.
     */
    public void addEgg(Class<? extends Entity> entity, int food) {
        this.addToEntityMappings(entity, food, EnumDiet.CARNIVORE_EGG);
        this.addToEntityMappings(entity, food, EnumDiet.OMNIVORE);
    }

    /**
     * Adds a item, block, or entity class to all the egg eating mappings.
     *
     * @param block The block being registered.
     * @param food  The amount of food points for the object.
     */
    public void addEgg(Block block, int food) {
        this.addToBlockMappings(block, food, EnumDiet.CARNIVORE_EGG, true);
        this.addToBlockMappings(block, food, EnumDiet.OMNIVORE, true);
    }

    /**
     * Adds a item, block, or entity class to all the egg eating mappings.
     *
     * @param item The item being registered.
     * @param food The amount of food points for the object.
     */
    public void addEgg(Item item, int food) {
        this.addToItemMappings(item, food, EnumDiet.CARNIVORE_EGG);
        this.addToItemMappings(item, food, EnumDiet.OMNIVORE);
    }
}
