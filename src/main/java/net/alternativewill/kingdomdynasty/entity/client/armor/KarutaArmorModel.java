package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KarutaArmorModel extends AnimatedGeoModel<KarutaArmorItem> {
    @Override
    public ResourceLocation getModelLocation(KarutaArmorItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/karuta_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(KarutaArmorItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/karuta/karuta_armor_texture.png") {

        };
    }

    @Override
    public ResourceLocation getAnimationFileLocation(KarutaArmorItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/karuta_armor_animation.json");
    }
}
