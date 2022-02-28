package net.ahotes.minestation.setup;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fmllegacy.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks
{
    //<editor-fold desc="Command Blocks">
    public static final RegistryObject<Block> CommunicationsConsole = register("communications_console", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)));
    public static final RegistryObject<Block> EmergencyShuttleControle = register("emergency_shuttle_control", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)));
    public static final RegistryObject<Block> IdentificationConsole = register("identification_console", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)));
    public static final RegistryObject<Block> TeleporterControlConsole = register("teleporter_control_console", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)));
    public static final RegistryObject<Block> AIUploadTerminal = register("ai_upload_terminal", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)));
    //</editor-fold>

    //<editor-fold desc="Engineering Blocks">
    public static final RegistryObject<Block> SolarsControl = register("solars_control", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)));
    public static final RegistryObject<Block> PowerMonitoringConsole = register("power_monitoring_console", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)));
    public static final RegistryObject<Block> StationAlertConsole = register("station_alert_console", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)));
    public static final RegistryObject<Block> AtmosphericAlertConsole = register("atmospheric_alert_console", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)));
    public static final RegistryObject<Block> TankMonitor = register("tank_monitor", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)));
    public static final RegistryObject<Block> DistributionAndWasteMonitor = register("distribution_and_waste_monitor", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)));
    public static final RegistryObject<Block> TelecommunicationsMonitoringConsole = register("telecommunications_monitoring_console", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)));
    //</editor-fold>

    //<editor-fold desc="Medical Blocks">
    public static final RegistryObject<Block> OperatingComputer = register("operating_computer", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)));
    public static final RegistryObject<Block> CrewMonitoringConsole = register("crew_monitoring_console", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)));
    public static final RegistryObject<Block> Pandemic2200 = register("pandemic_2200", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)));
    //</editor-fold>

    //<editor-fold desc="Research Blocks">
    public static final RegistryObject<Block> SlimeManagementConsole = register("slime_management_console", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)));
    public static final RegistryObject<Block> SlimeProcessor = register("slime_processor", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)));
    public static final RegistryObject<Block> MonkeyRecycler = register("monkey_recycler", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)));
    public static final RegistryObject<Block> ExosuitFabricator = register("exosuit_fabricator", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)));
    public static final RegistryObject<Block> Protolathe = register("protolathe", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)));
    //</editor-fold>

    //<editor-fold desc="Security Blocks">
    public static final RegistryObject<Block> SecurityRecordsConsole = register("security_records_console", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)));
    public static final RegistryObject<Block> SecurityCameras = register("security_cameras", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)));
    public static final RegistryObject<Block> PrisonerManagementConsole = register("prisoner_management_console", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)));
    //</editor-fold>

    //<editor-fold desc="Supply Blocks">
    public static final RegistryObject<Block> SupplyConsole = register("supply_console", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)));
    public static final RegistryObject<Block> SupplyRequestConsole = register("supply_request_console", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)));
    public static final RegistryObject<Block> ExpressSupplyConsole = register("express_supply_console", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)));
    public static final RegistryObject<Block> OutpostCameras = register("outpost_cameras", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)));
    public static final RegistryObject<Block> MiningShuttleConsole = register("mining_shuttle_console", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)));
    //</editor-fold>

    static void register(){}

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block){
        return Registration.BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block){
        RegistryObject<T> ret = registerNoItem(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        return ret;
    }
}
