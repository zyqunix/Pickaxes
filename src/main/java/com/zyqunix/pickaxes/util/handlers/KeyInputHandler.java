package com.zyqunix.pickaxes.util.handlers;

import com.zyqunix.pickaxes.items.armor.MiningHelmet;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import org.lwjgl.input.Keyboard;

@Mod.EventBusSubscriber
public class KeyInputHandler {
    public static final KeyBinding TOGGLE_ECHO = new KeyBinding("key.toggle_echo", Keyboard.KEY_X, "key.categories.gameplay");

    public static void registerKeys() {
        ClientRegistry.registerKeyBinding(TOGGLE_ECHO);
    }

    @SubscribeEvent
    public static void onKeyInput(InputEvent.KeyInputEvent event) {
        if (TOGGLE_ECHO.isPressed() && Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)) {
            EntityPlayer player = Minecraft.getMinecraft().player;
            if (player != null && player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof MiningHelmet) {
                ((MiningHelmet) player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem()).toggleEcho(player);
            }
        }
    }

    public static void init() {

    }
}
