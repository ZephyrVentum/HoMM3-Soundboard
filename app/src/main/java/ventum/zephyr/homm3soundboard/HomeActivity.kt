package ventum.zephyr.homm3soundboard

import android.media.AudioAttributes.CONTENT_TYPE_SONIFICATION
import android.media.AudioAttributes.USAGE_GAME
import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.soundboardtemplate.model.SoundboardCategory
import ventum.zephyr.soundboardtemplate.ui.SoundboardActivity
import java.util.*

class HomeActivity : SoundboardActivity() {
    override fun getSoundboardCategories() = ArrayList<SoundboardCategory>().apply {
        add(createSpellsCategory())
        add(createBattleCategory())
        add(createMapCategory())
        add(createGameCategory())
    }

    private fun createSpellsCategory() = SoundboardCategory(getString(R.string.spell_category), SoundItems().apply {
        add(SoundItem(R.drawable.antimagic, R.raw.antimagic_sound, R.string.antimagic_spell))
        add(SoundItem(R.drawable.bloodlust, R.raw.bloodlust_sound, R.string.bloodlust_speel))
        add(SoundItem(R.drawable.blind, R.raw.blind_sound, R.string.blind_spell))
        add(SoundItem(R.drawable.curse, R.raw.curse_sound, R.string.curse_spell))
        add(SoundItem(R.drawable.dimension_door, R.raw.dimension_door_sound, R.string.dimension_door_spell))
        add(SoundItem(R.drawable.dispel, R.raw.dispel, R.string.dispel))
        add(SoundItem(R.drawable.disrupting_ray, R.raw.disrupting_ray, R.string.disrupting_ray))
        add(SoundItem(R.drawable.fortune, R.raw.fortune, R.string.fortune))
        add(SoundItem(R.drawable.resurrection, R.raw.resurrection, R.string.resurrection))
        add(SoundItem(R.drawable.bless, R.raw.bless, R.string.bless))
        add(SoundItem(R.drawable.fly, R.raw.fly_spell, R.string.fly))
        add(SoundItem(R.drawable.cure, R.raw.cure, R.string.cure))
        add(SoundItem(R.drawable.frost_ring, R.raw.frost_ring, R.string.frost_ring))
        add(SoundItem(R.drawable.implosion, R.raw.implosion, R.string.implosion))
        add(SoundItem(R.drawable.meteor, R.raw.meteor, R.string.meteor))
        add(SoundItem(R.drawable.shield, R.raw.shield, R.string.shield))
        add(SoundItem(R.drawable.slow, R.raw.slow, R.string.slow))
        add(SoundItem(R.drawable.stone_skin, R.raw.stone_skin, R.string.stone_skin))
        add(SoundItem(R.drawable.air_shield, R.raw.air_shield, R.string.air_shield))
        add(SoundItem(R.drawable.anim_undead, R.raw.anim_undead, R.string.anim_undead))
        add(SoundItem(R.drawable.armageddon, R.raw.armagedon, R.string.armagedon))
        add(SoundItem(R.drawable.magic_mirror, R.raw.backlash, R.string.magic_mirror))
        add(SoundItem(R.drawable.clone, R.raw.clone, R.string.clone))
        add(SoundItem(R.drawable.firewall, R.raw.firewall, R.string.firewall))
        add(SoundItem(R.drawable.forget, R.raw.forget, R.string.forget))
        add(SoundItem(R.drawable.frenzy, R.raw.frenzy, R.string.frenzy))
        add(SoundItem(R.drawable.hypnoze, R.raw.hypnotiz, R.string.hypnotiz))
        add(SoundItem(R.drawable.ice_bolt, R.raw.iceray, R.string.iceray))
        add(SoundItem(R.drawable.mirth, R.raw.mirth, R.string.mirth))
        add(SoundItem(R.drawable.prayer, R.raw.prayer, R.string.prayer))
        add(SoundItem(R.drawable.precision, R.raw.precison, R.string.precison))
        add(SoundItem(R.drawable.light_bolt, R.raw.lightblt, R.string.lightblt))
        add(SoundItem(R.drawable.magic_bolt, R.raw.magicblt, R.string.magicblt))
        add(SoundItem(R.drawable.earth_protection, R.raw.protect_earth, R.string.earth_protection))
        add(SoundItem(R.drawable.slayer, R.raw.slayer, R.string.slayer))
        add(SoundItem(R.drawable.sorrow, R.raw.sorrow, R.string.sorrow))
        add(SoundItem(R.drawable.summon_boat, R.raw.summboat, R.string.summboat))
        add(SoundItem(R.drawable.summon_elem, R.raw.sumnelm, R.string.sumnelm))
        add(SoundItem(R.drawable.landmine_spell, R.raw.landmine, R.string.landmine))
    })

    private fun createBattleCategory() = SoundboardCategory(getString(R.string.battle_category), SoundItems().apply {
        add(SoundItem(R.drawable.bad_morale, R.raw.bad_morale_sound, R.string.bad_morale))
        add(SoundItem(R.drawable.good_morale, R.raw.good_morale, R.string.good_morale))
        add(SoundItem(R.drawable.luck, R.raw.good_luck, R.string.good_luck))
        add(SoundItem(R.drawable.death_cloud, R.raw.death_cloud, R.string.death_cloud))
        add(SoundItem(R.drawable.fear, R.raw.fear, R.string.fear))
        add(SoundItem(R.drawable.double_damage, R.raw.double_damage, R.string.double_damage))
        add(SoundItem(R.drawable.dendroid, R.raw.dendroid, R.string.dendroid))
        add(SoundItem(R.drawable.ghost_dragon, R.raw.ghost_dragon, R.string.ghost_dragon))
        add(SoundItem(R.drawable.frost_elem, R.raw.ice_elem, R.string.ice_elem))
        add(SoundItem(R.drawable.rust_dragon, R.raw.rust_dragon, R.string.rust_dragon))
        add(SoundItem(R.drawable.first_aid_tent, R.raw.firstaidtent, R.string.first_aid))
        add(SoundItem(R.drawable.death_stare, R.raw.deathstr, R.string.deathstr))
        add(SoundItem(R.drawable.drain_life, R.raw.drainlif, R.string.drainlif))
        add(SoundItem(R.drawable.fire_shiels, R.raw.fireshld, R.string.fireshld))
        add(SoundItem(R.drawable.landmine_expl, R.raw.landkill, R.string.landkill))
        add(SoundItem(R.drawable.magic_resistance, R.raw.magicres, R.string.magicres))
        add(SoundItem(R.drawable.paralyze, R.raw.paralyze, R.string.paralyze))
        add(SoundItem(R.drawable.poison, R.raw.poison, R.string.poison))
        add(SoundItem(R.drawable.battle, R.raw.battle_one, R.string.battle_one))
        add(SoundItem(R.drawable.battle, R.raw.battle_two, R.string.battle_two))
        add(SoundItem(R.drawable.battle, R.raw.battle_three, R.string.battle_three))
        add(SoundItem(R.drawable.battle, R.raw.battle_four, R.string.battle_four))
        add(SoundItem(R.drawable.battle, R.raw.battle_five, R.string.battle_five))
        add(SoundItem(R.drawable.battle, R.raw.battle_six, R.string.battle_six))
        add(SoundItem(R.drawable.battle, R.raw.battle_seven, R.string.battle_seven))
        add(SoundItem(R.drawable.battle, R.raw.battle_eight, R.string.battle_eigth))
    })

    private fun createMapCategory() = SoundboardCategory(getString(R.string.map_category), SoundItems().apply {
        add(SoundItem(R.drawable.mill, R.raw.mill_sound, R.string.mill))
        add(SoundItem(R.drawable.whirlpool, R.raw.whirlpool_sound, R.string.whirlpool))
        add(SoundItem(R.drawable.dragon_utopia, R.raw.dragon_utopia, R.string.dragon_utopia))
        add(SoundItem(R.drawable.faerie_ring, R.raw.faerie_ring, R.string.faerie_ring))
        add(SoundItem(R.drawable.magic_well, R.raw.magic_well, R.string.magic_well))
        add(SoundItem(R.drawable.mine, R.raw.flag_mine, R.string.flag_mine))
        add(SoundItem(R.drawable.learning_stone, R.raw.learning_stone, R.string.learning_stone))
        add(SoundItem(R.drawable.lighthouse, R.raw.lighthouse, R.string.lighthouse))
        add(SoundItem(R.drawable.lepricon, R.raw.lepricon, R.string.lepricon))
        add(SoundItem(R.drawable.idol_of_fortune, R.raw.idol_of_fortune, R.string.idol_of_fortune))
        add(SoundItem(R.drawable.temple, R.raw.temple, R.string.temple))
        add(SoundItem(R.drawable.refugee_camp, R.raw.refugee_camp, R.string.refugee_camp))
        add(SoundItem(R.drawable.crypt, R.raw.crypt, R.string.crypt))
        add(SoundItem(R.drawable.fountain_of_youth, R.raw.fountain_of_youth, R.string.fountain_of_youth))
        add(SoundItem(R.drawable.mercenary_camp, R.raw.mercenary_camp, R.string.mercenary_camp))
        add(SoundItem(R.drawable.obelisk, R.raw.obelisk, R.string.obelisk))
        add(SoundItem(R.drawable.quest, R.raw.quest, R.string.quest))
        add(SoundItem(R.drawable.guarded, R.raw.guarded, R.string.guarded))
        add(SoundItem(R.drawable.cavehead, R.raw.cavehead, R.string.cavehead))
        add(SoundItem(R.drawable.store, R.raw.store, R.string.store))
        add(SoundItem(R.drawable.thief_guild, R.raw.mystery, R.string.mystery))
        add(SoundItem(R.drawable.artifact, R.raw.artifact, R.string.artifact))
        add(SoundItem(R.drawable.chest, R.raw.chest, R.string.chest))
        add(SoundItem(R.drawable.resources, R.raw.resources1, R.string.resources))
        add(SoundItem(R.drawable.resources, R.raw.resources2, R.string.resources))
        add(SoundItem(R.drawable.resources, R.raw.resources3, R.string.resources))
        add(SoundItem(R.drawable.resources, R.raw.resources4, R.string.resources))
        add(SoundItem(R.drawable.resources, R.raw.resources5, R.string.resources))
        add(SoundItem(R.drawable.resources, R.raw.resources6, R.string.resources))
        add(SoundItem(R.drawable.resources, R.raw.resources7, R.string.resources))
    })

    private fun createGameCategory() = SoundboardCategory(getString(R.string.game_category), SoundItems().apply {
        add(SoundItem(R.drawable.img_defend, R.raw.defend_sound, R.string.defend_town))
        add(SoundItem(R.drawable.img_victory, R.raw.victory_sound, R.string.victory_battle))
        add(SoundItem(R.drawable.lose_battle, R.raw.lose_battle, R.string.lose_battle))
        add(SoundItem(R.drawable.retreat_battle, R.raw.retreat_battle, R.string.retreat_battle))
        add(SoundItem(R.drawable.new_day, R.raw.new_day, R.string.new_day))
        add(SoundItem(R.drawable.new_week, R.raw.new_week, R.string.new_week))
        add(SoundItem(R.drawable.new_week, R.raw.new_month, R.string.new_month))
        add(SoundItem(R.drawable.build_town, R.raw.build_town_sound, R.string.build_town))
        add(SoundItem(R.drawable.level_up, R.raw.lvl_up, R.string.lvl_up))
        add(SoundItem(R.drawable.grail, R.raw.grail, R.string.grail))
        add(SoundItem(R.drawable.chat, R.raw.chat_sound, R.string.chat))
        add(SoundItem(R.drawable.system, R.raw.system, R.string.system))
        add(SoundItem(R.drawable.landing, R.raw.landing, R.string.landing))
        add(SoundItem(R.drawable.click_btn, R.raw.button, R.string.button))
        add(SoundItem(R.drawable.dig, R.raw.digsound, R.string.digsound))
    })

    override fun getSoundPoolUsage() = USAGE_GAME

    override fun getSoundPoolContentType() = CONTENT_TYPE_SONIFICATION

    override fun getBlurRadius() = 5

    override fun getClickToAdsCount() = Random().nextInt(5) + 9
}
