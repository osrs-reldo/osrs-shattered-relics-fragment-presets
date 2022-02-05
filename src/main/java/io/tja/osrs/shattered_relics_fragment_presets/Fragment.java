package io.tja.osrs.shattered_relics_fragment_presets;

import java.util.HashMap;
import lombok.Getter;

@Getter
public enum Fragment
{
	ALCHEMANIAC(36, "Alchemaniac"),
	ARCANE_CONDUIT(6, "Arcane Conduit"),
	ARMADYLEAN_DECREE(18, "Armadylean Decree"),
	BANDOSIAN_MIGHT(17, "Bandosian Might"),
	BARBARIAN_PEST_WARS(51, "Barbarian Pest Wars"),
	BOTTOMLESS_QUIVER(4, "Bottomless Quiver"),
	CATCH_OF_THE_DAY(22, "Catch Of The Day"),
	CERTIFIED_FARMER(41, "Certified Farmer"),
	CHEFS_CATCH(21, "Chef's Catch"),
	CHINCHONKERS(39, "Chinchonkers"),
	CLUED_IN(49, "Clued In"),
	DEEPER_POCKETS(24, "Deeper Pockets"),
	DINE__DASH(40, "Dine & Dash"),
	DIVINE_RESTORATION(9, "Divine Restoration"),
	DRAGON_ON_A_BIT(33, "Dragon On a Bit"),
	ENCHANTED_JEWELER(35, "Enchanted Jeweler"),
	GOLDEN_BRICK_ROAD(45, "Golden Brick Road"),
	GRAVE_ROBBER(46, "Grave Robber"),
	HOMEWRECKER(26, "Homewrecker"),
	HOT_ON_THE_TRAIL(27, "Hot on the Trail"),
	IMCANDOS_APPRENTICE(34, "Imcando's Apprentice"),
	JUST_DRUID(44, "Just Druid!"),
	LARGER_RECHARGER(11, "Larger Recharger"),
	LIVIN_ON_A_PRAYER(8, "Livin' On A Prayer"),
	MESSAGE_IN_A_BOTTLE(50, "Message In A Bottle"),
	MIXOLOGIST(43, "Mixologist"),
	MOLTEN_MINER(30, "Molten Miner"),
	MOTHERS_MAGIC_FOSSILS(53, "Mother's Magic Fossils"),
	PLANK_STRETCHER(28, "Plank Stretcher"),
	PRAYING_RESPECTS(10, "Praying Respects"),
	PRO_TIPS(38, "Pro Tips"),
	PROFLETCHIONAL(37, "Profletchional"),
	ROCK_SOLID(29, "Rock Solid"),
	ROGUES_CHOMPY_FARM(52, "Rogues' Chompy Farm"),
	ROOTY_TOOTY_2X_RUNEYS(47, "Rooty Tooty 2x Runeys"),
	RUMPLE_BOW_STRING(32, "Rumple-Bow-String"),
	RUNE_ESCAPE(48, "Rune Escape"),
	SARADOMINIST_DEFENCE(20, "Saradominist Defence"),
	SEEDY_BUSINESS(42, "Seedy Business"),
	SLASH__BURN(25, "Slash & Burn"),
	SLAY_N_PAY(16, "Slay 'n' Pay"),
	SLAY_ALL_DAY(14, "Slay All Day"),
	SMITHING_DOUBLE(31, "Smithing Double"),
	SMOOTH_CRIMINAL(23, "Smooth Criminal"),
	SPECIAL_DISCOUNT(12, "Special Discount"),
	SUPERIOR_TRACKING(15, "Superior Tracking"),
	TACTICAL_DUELIST(2, "Tactical Duelist"),
	THRALL_DAMAGE(7, "Thrall Damage"),
	UNHOLY_RANGER(3, "Unholy Ranger"),
	UNHOLY_WARRIOR(1, "Unholy Warrior"),
	UNHOLY_WIZARD(5, "Unholy Wizard"),
	VENOMASTER(13, "Venomaster"),
	ZAMORAKIAN_SIGHT(19, "Zamorakian Sight");

	private final int id;
	private final String name;

	Fragment(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

	private static final HashMap<Integer, String> idToNameMap = new HashMap<>();
	static {
		for (Fragment fragment : values())
		{
			idToNameMap.put(fragment.getId(), fragment.getName());
		}
	}

	public static String getFragmentNameFromId(int id)
	{
		return idToNameMap.get(id);
	}
}
