package anticope.rejects.gui.hud;

import java.util.Iterator;

import anticope.rejects.MeteorRejectsAddon;
import meteordevelopment.meteorclient.systems.hud.HudElementInfo;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import meteordevelopment.meteorclient.renderer.Renderer2D;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EntityTypeListSetting;
import meteordevelopment.meteorclient.settings.*;
import meteordevelopment.meteorclient.systems.hud.HudRenderer;
import meteordevelopment.meteorclient.systems.hud.HudElement;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.modules.render.ESP;
import meteordevelopment.meteorclient.systems.waypoints.Waypoint;
import meteordevelopment.meteorclient.systems.waypoints.Waypoints;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;

import static meteordevelopment.meteorclient.MeteorClient.mc;

public class RadarHud extends HudElement {
    public static final HudElementInfo<RadarHud> INFO = new HudElementInfo<>(MeteorRejectsAddon.HUD_GROUP, "radar", "Draws a Radar on your HUD telling you where entities are.", RadarHud::new);

    private final SettingGroup sgGeneral = settings.getDefaultGroup();

    private final Setting<SettingColor> backgroundColor = sgGeneral.add(new ColorSetting.Builder()
            .name("background-color")
            .description("背景的颜色")
            .defaultValue(new SettingColor(0, 0, 0, 64))
            .build()
    );


    private final Setting<Object2BooleanMap<EntityType<?>>> entities = sgGeneral.add(new EntityTypeListSetting.Builder()
            .name("entities")
            .description("选择特定的实体")
            .defaultValue(EntityType.PLAYER)
            .build()
    );

    private final Setting<Boolean> letters = sgGeneral.add(new BoolSetting.Builder()
            .name("letters")
            .description("使用实体的类型的第一个字母")
            .defaultValue(true)
            .build()
    );

    private final Setting<Boolean> showWaypoints = sgGeneral.add(new BoolSetting.Builder()
            .name("waypoints")
            .description("显示航点")
            .defaultValue(false)
            .build()
    );

    private final Setting<Double> scale = sgGeneral.add(new DoubleSetting.Builder()
            .name("scale")
            .description("规模")
            .defaultValue(1)
            .min(1)
            .sliderRange(0.01, 5)
            .onChanged(aDouble -> calculateSize())
        .build()
    );

    private final Setting<Double> zoom = sgGeneral.add(new DoubleSetting.Builder()
        .name("zoom")
        .description("雷达放大")
        .defaultValue(1)
        .min(0.01)
        .sliderRange(0.01, 3)
        .build()
    );

    public RadarHud() {
        super(INFO);
        calculateSize();
    }

    public void calculateSize() {
        setSize(200 * scale.get(), 200 * scale.get());
    }

    @Override
    public void render(HudRenderer renderer) {
        ESP esp = Modules.get().get(ESP.class);
        if (esp == null) return;
        renderer.post(() -> {
            if (mc.player == null) return;
            double width  = getWidth();
            double height = getHeight();
            Renderer2D.COLOR.begin();
            Renderer2D.COLOR.quad(x, y, width, height, backgroundColor.get());
            Renderer2D.COLOR.render(null);
            if (mc.world != null) {
                for (Entity entity : mc.world.getEntities()) {
                    if (!entities.get().getBoolean(entity.getType())) return;
                    double xPos = ((entity.getX() - mc.player.getX()) * scale.get() * zoom.get() + width/2);
                    double yPos = ((entity.getZ() - mc.player.getZ()) * scale.get() * zoom.get()  + height/2);
                    if (xPos < 0 || yPos < 0 || xPos > width - scale.get() || yPos > height - scale.get()) continue;
                    String icon = "*";
                    if (letters.get()) 
                        icon = entity.getType().getUntranslatedName().substring(0,1).toUpperCase();
                    renderer.text(icon, xPos + x, yPos + y, esp.getColor(entity), false);
                }
            }
            if (showWaypoints.get()) {
                Iterator<Waypoint> waypoints = Waypoints.get().iterator();
                while (waypoints.hasNext()) {
                    Waypoint waypoint = waypoints.next();
                    BlockPos blockPos = waypoint.getPos();
                    Vec3d coords = new Vec3d(blockPos.getX() + 0.5, blockPos.getY(), blockPos.getZ() + 0.5);
                    double xPos = ((coords.getX() - mc.player.getX()) * scale.get() * zoom.get() + width/2);
                    double yPos = ((coords.getZ() - mc.player.getZ()) * scale.get() * zoom.get()  + height/2);
                    if (xPos < 0 || yPos < 0 || xPos > width - scale.get() || yPos > height - scale.get()) continue;
                    String icon = "*";
                    if (letters.get() && waypoint.name.get().length() > 0)
                        icon = waypoint.name.get().substring(0, 1);
                    renderer.text(icon, xPos + x, yPos + y, waypoint.color.get(), false);
                }
            }
            Renderer2D.COLOR.render(null);
        });
        
    }
    
}
