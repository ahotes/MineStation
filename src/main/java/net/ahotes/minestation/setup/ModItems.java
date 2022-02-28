package net.ahotes.minestation.setup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fmllegacy.RegistryObject;

public class ModItems
{
    //<editor-fold desc="Command Items">
    public static final RegistryObject<Item> CommunicationsConsole = Registration.ITEMS.register("communications_console", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> EmergencyShuttleControle = Registration.ITEMS.register("emergency_shuttle_control", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> IdentificationConsole = Registration.ITEMS.register("identification_console", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> TeleporterControlConsole = Registration.ITEMS.register("teleporter_control_console", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> AIUploadTerminal = Registration.ITEMS.register("ai_upload_terminal", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    //</editor-fold>

    //<editor-fold desc="Engineering Items">
    public static final RegistryObject<Item> SolarsControl = Registration.ITEMS.register("solars_control", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> PowerMonitoringConsole = Registration.ITEMS.register("power_monitoring_console", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> StationAlertConsole = Registration.ITEMS.register("station_alert_console", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> AtmosphericAlertConsole = Registration.ITEMS.register("atmospheric_alert_console", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> TankMonitor = Registration.ITEMS.register("tank_monitor", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> DistributionAndWasteMonitor = Registration.ITEMS.register("distribution_and_waste_monitor", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> TelecommunicationsMonitoringConsole = Registration.ITEMS.register("telecommunications_monitoring_console", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    //</editor-fold>

    //<editor-fold desc="Medical Items">
    public static final RegistryObject<Item> OperatingComputer = Registration.ITEMS.register("operating_computer", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> CrewMonitoringConsole = Registration.ITEMS.register("crew_monitoring_console", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> Pandemic2200 = Registration.ITEMS.register("pandemic_2200", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    //</editor-fold>

    //<editor-fold desc="Research Items">
    public static final RegistryObject<Item> SlimeManagementConsole = Registration.ITEMS.register("slime_management_console", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> SlimeProcessor = Registration.ITEMS.register("slime_processor", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> MonkeyRecycler = Registration.ITEMS.register("monkey_recycler", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> ExosuitFabricator = Registration.ITEMS.register("exosuit_fabricator", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> Protolathe = Registration.ITEMS.register("protolathe", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    //</editor-fold>

    //<editor-fold desc="Security Items">
    public static final RegistryObject<Item> SecurityRecordsConsole = Registration.ITEMS.register("security_records_console", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> SecurityCameras = Registration.ITEMS.register("security_cameras", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> PrisonerManagementConsole = Registration.ITEMS.register("prisoner_management_console", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    //</editor-fold>

    //<editor-fold desc="Supply Items">
    public static final RegistryObject<Item> SupplyConsole = Registration.ITEMS.register("supply_console", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> SupplyRequestConsole = Registration.ITEMS.register("supply_request_console", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> ExpressSupplyConsole = Registration.ITEMS.register("express_supply_console", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> OutpostCameras = Registration.ITEMS.register("outpost_cameras", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> MiningShuttleConsole = Registration.ITEMS.register("mining_shuttle_console", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    //</editor-fold>

    static void register(){}
}
