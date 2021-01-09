package com.kwpugh.gobber2.util;

import net.minecraft.entity.EntityPose;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;

public class HitResultUtil
{
	public static BlockHitResult getNearestPositionWithAir(World world, PlayerEntity player, int reach)
    {
        return getMovingObjectPosWithReachDistance(world, player, reach, false, false, true);
    }

    private static BlockHitResult getMovingObjectPosWithReachDistance(World world, PlayerEntity player, double distance, boolean p1, boolean p2, boolean p3)
    {
    	ServerWorld serverWorld = (ServerWorld) world;
    	ServerPlayerEntity serverPlayer = (ServerPlayerEntity) player;
    	EntityPose pose = serverPlayer.getPose();
    	
        float f = serverPlayer.pitch;
        float f1 = serverPlayer.yaw;
        double d0 = serverPlayer.getX();
        double d1 = serverPlayer.getY() + (double) serverPlayer.getEyeHeight(pose);
        double d2 = serverPlayer.getZ();
        Vec3d vec3 = new Vec3d(d0, d1, d2);
        float f2 = MathHelper.cos(-f1 * 0.017453292F - (float) Math.PI);
        float f3 = MathHelper.sin(-f1 * 0.017453292F - (float) Math.PI);
        float f4 = -MathHelper.cos(-f * 0.017453292F);
        float f5 = MathHelper.sin(-f * 0.017453292F);
        float f6 = f3 * f4;
        float f7 = f2 * f4;
        Vec3d vec31 = vec3.add((double) f6 * distance, (double) f5 * distance, (double) f7 * distance);

        return serverWorld.raycast(new RaycastContext(vec3, vec31, RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.ANY, serverPlayer));    		
    }
}