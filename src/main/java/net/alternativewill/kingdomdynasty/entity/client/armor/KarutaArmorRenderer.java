package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class KarutaArmorRenderer extends GeoArmorRenderer<KarutaArmorItem> {
    public KarutaArmorRenderer() {
        super(new KarutaArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorRightLeg";
        this.leftLegBone = "armorLeftLeg";
        this.rightBootBone = "armorRightBoot";
        this.leftBootBone = "armorLeftBoot";
    }
}
