package net.mhaks.dustydecorations.mixin;

import net.mhaks.dustydecorations.item.ModItems;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.UseOnContext;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Item.class)
public class InjectItem {
    @Inject(
            method = "useOn",
            at = @At("TAIL"),
            cancellable = true)
    private void useBowl(UseOnContext context, CallbackInfoReturnable<InteractionResult> interactionResultCIR) {
        if (context.getItemInHand().is(Items.BOWL)) {
            ModItems.DECORATIVE_BOWL.get().useOn(context);
            interactionResultCIR.setReturnValue(InteractionResult.SUCCESS);
        }
    }
}
