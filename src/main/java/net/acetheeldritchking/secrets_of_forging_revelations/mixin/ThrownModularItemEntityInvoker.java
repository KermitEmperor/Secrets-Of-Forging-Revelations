package net.acetheeldritchking.secrets_of_forging_revelations.mixin;

import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;
import se.mickelus.tetra.items.modular.ThrownModularItemEntity;

@Mixin(ThrownModularItemEntity.class)
public interface ThrownModularItemEntityInvoker {
    @Invoker(value = "getPickupItem")
    ItemStack invokeGetPickupItem();
}
