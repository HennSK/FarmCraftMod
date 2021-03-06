package cz.grossik.farmcraft2.item;

import cz.grossik.farmcraft2.Main;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Item_Knife extends Item
{

    public Item_Knife()
    {
    	this.setMaxStackSize(1);
        this.setCreativeTab(Main.FarmCraft2Tab);   
		this.setMaxDamage(99);
    } 
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack)
    {    	
      return false;
    }

    @Override
    public boolean getShareTag()
    {
        return true;
    }
    public boolean hasContainerItem(ItemStack itemStack)
    {
       return true;
    }
    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
        ItemStack stack = itemStack.copy();

        stack.setItemDamage(stack.getItemDamage() + 1);

        return stack;
    }
}