package com.ProHacker1337.testmod.Items;

import com.ProHacker1337.testmod.Main;
import com.ProHacker1337.testmod.init.ModItems;
import com.ProHacker1337.testmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registeredModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
