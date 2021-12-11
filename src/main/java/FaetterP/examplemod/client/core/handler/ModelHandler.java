package FaetterP.examplemod.client.core.handler;

import FaetterP.examplemod.client.render.IModelRegister;
import FaetterP.examplemod.common.lib.LibMisc;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(value = Side.CLIENT, modid = LibMisc.MOD_ID)
public class ModelHandler {
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent evt) {

        for(Item item : Item.REGISTRY) {
            if(item instanceof IModelRegister)
                ((IModelRegister) item).registerModels();
        }
    }
}
