package com.minecolonies.coremod.items;

import com.minecolonies.api.creativetab.ModCreativeTabs;
import com.minecolonies.api.entity.ModEntities;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * The item form of the Amazon Spear. Dropped by those holding it, and allows the user to throw it.
 * It is thrown with left click, and it passes through the first mob it encounters.
 * It acts like a critical arrow in that it leaves the same trail and glides quickly.
 *
 * It always deals a much higher damage, though.
 *
 * @author Curle
 */
public class ItemAmazonSpear extends Item {

    public ItemAmazonSpear(Item.Properties properties) {
        super(properties.group(ModCreativeTabs.MINECOLONIES));
        setRegistryName("amazonSpear");
    }

    @Override
    public boolean onEntitySwing(ItemStack stack, LivingEntity entity) {
        ProjectileEntity spear = ModEntities.AMAZONSPEAR.create(entity.world);
        spear.setShooter(entity);
        spear.func_234612_a_(entity, entity.rotationPitch, entity.rotationYaw, 0F, 3F, 1F);
        return false;
    }
}
