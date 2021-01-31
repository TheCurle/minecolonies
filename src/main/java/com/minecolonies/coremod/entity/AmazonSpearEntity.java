package com.minecolonies.coremod.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.network.IPacket;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

/**
 * A custom entity for the thrown Amazon Spear.
 * It glides through the air leaving a trail alike a critical arrow.
 * Once hit an entity, it follows through and either buries itself in an entity behind, or the block behind.
 * @author Curle
 */
public class AmazonSpearEntity extends ProjectileEntity {

    public AmazonSpearEntity(EntityType<? extends ProjectileEntity> entity, World world) {
        super(entity, world);
    }

    /**
     * This function is required to be present from the abstract ProjectileEntity inheritance, but..
     * we have no data to register. So it's blank.
     */
    @Override
    protected void registerData() {}

    @Override
    public IPacket<?> createSpawnPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }
}
