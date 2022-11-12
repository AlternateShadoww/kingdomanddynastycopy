package net.alternativewill.kingdomdynasty.event;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.entity.client.armor.*;
import net.alternativewill.kingdomdynasty.item.custom.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = KingdomDynasty.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.DEDICATED_SERVER)
public class ModEventClientBusEvents {
    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(KarutaArmorItem.class, new KarutaArmorRenderer());
    }
}