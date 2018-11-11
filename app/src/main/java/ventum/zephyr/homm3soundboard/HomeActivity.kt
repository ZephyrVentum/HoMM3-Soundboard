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
        add(SoundItem(R.drawable.antimagic,
                R.raw.antimagic_sound,
                R.string.antimagic_spell,
                soundPool.load(this@HomeActivity, R.raw.antimagic_sound, 1)))
        add(SoundItem(R.drawable.bloodlust,
                R.raw.bloodlust_sound,
                R.string.bloodlust_speel,
                soundPool.load(this@HomeActivity, R.raw.bloodlust_sound, 1)))
        add(SoundItem(R.drawable.blind,
                R.raw.blind_sound,
                R.string.blind_spell,
                soundPool.load(this@HomeActivity, R.raw.blind_sound, 1)))
        add(SoundItem(R.drawable.curse,
                R.raw.curse_sound,
                R.string.curse_spell,
                soundPool.load(this@HomeActivity, R.raw.curse_sound, 1)))
        add(SoundItem(R.drawable.dimension_door,
                R.raw.dimension_door_sound,
                R.string.dimension_door_spell,
                soundPool.load(this@HomeActivity, R.raw.dimension_door_sound, 1)))
        add(SoundItem(R.drawable.dispel,
                R.raw.dispel,
                R.string.dispel,
                soundPool.load(this@HomeActivity, R.raw.dispel, 1)))
        add(SoundItem(R.drawable.disrupting_ray,
                R.raw.disrupting_ray,
                R.string.disrupting_ray,
                soundPool.load(this@HomeActivity, R.raw.disrupting_ray, 1)))
        add(SoundItem(R.drawable.fortune,
                R.raw.fortune,
                R.string.fortune,
                soundPool.load(this@HomeActivity, R.raw.fortune, 1)))
        add(SoundItem(R.drawable.resurrection,
                R.raw.resurrection,
                R.string.resurrection,
                soundPool.load(this@HomeActivity, R.raw.resurrection, 1)))
        add(SoundItem(R.drawable.bless,
                R.raw.bless,
                R.string.bless,
                soundPool.load(this@HomeActivity, R.raw.bless, 1)))
        add(SoundItem(R.drawable.fly,
                R.raw.fly_spell,
                R.string.fly,
                soundPool.load(this@HomeActivity, R.raw.fly_spell, 1)))
        add(SoundItem(R.drawable.cure,
                R.raw.cure,
                R.string.cure,
                soundPool.load(this@HomeActivity, R.raw.cure, 1)))
        add(SoundItem(R.drawable.frost_ring,
                R.raw.frost_ring,
                R.string.frost_ring,
                soundPool.load(this@HomeActivity, R.raw.frost_ring, 1)))
        add(SoundItem(R.drawable.implosion,
                R.raw.implosion,
                R.string.implosion,
                soundPool.load(this@HomeActivity, R.raw.implosion, 1)))
    })

    private fun createBattleCategory() = SoundboardCategory(getString(R.string.battle_category), SoundItems().apply {
        add(SoundItem(R.drawable.bad_morale,
                R.raw.bad_morale_sound,
                R.string.bad_morale,
                soundPool.load(this@HomeActivity, R.raw.bad_morale_sound, 1)))
        add(SoundItem(R.drawable.good_morale,
                R.raw.good_morale,
                R.string.good_morale,
                soundPool.load(this@HomeActivity, R.raw.good_morale, 1)))
        add(SoundItem(R.drawable.luck,
                R.raw.good_luck,
                R.string.good_luck,
                soundPool.load(this@HomeActivity, R.raw.good_luck, 1)))
        add(SoundItem(R.drawable.death_cloud,
                R.raw.death_cloud,
                R.string.death_cloud,
                soundPool.load(this@HomeActivity, R.raw.death_cloud, 1)))
        add(SoundItem(R.drawable.fear,
                R.raw.fear,
                R.string.fear,
                soundPool.load(this@HomeActivity, R.raw.fear, 1)))
        add(SoundItem(R.drawable.double_damage,
                R.raw.double_damage,
                R.string.double_damage,
                soundPool.load(this@HomeActivity, R.raw.double_damage, 1)))
        add(SoundItem(R.drawable.dendroid,
                R.raw.dendroid,
                R.string.dendroid,
                soundPool.load(this@HomeActivity, R.raw.dendroid, 1)))
        add(SoundItem(R.drawable.ghost_dragon,
                R.raw.ghost_dragon,
                R.string.ghost_dragon,
                soundPool.load(this@HomeActivity, R.raw.ghost_dragon, 1)))
        add(SoundItem(R.drawable.frost_elem,
                R.raw.ice_elem,
                R.string.ice_elem,
                soundPool.load(this@HomeActivity, R.raw.ice_elem, 1)))
        add(SoundItem(R.drawable.rust_dragon,
                R.raw.rust_dragon,
                R.string.rust_dragon,
                soundPool.load(this@HomeActivity, R.raw.rust_dragon, 1)))
        add(SoundItem(R.drawable.battle,
                R.raw.battle_one,
                R.string.battle_one,
                soundPool.load(this@HomeActivity, R.raw.battle_one, 1)))
        add(SoundItem(R.drawable.battle,
                R.raw.battle_two,
                R.string.battle_two,
                soundPool.load(this@HomeActivity, R.raw.battle_two, 1)))
        add(SoundItem(R.drawable.battle,
                R.raw.battle_three,
                R.string.battle_three,
                soundPool.load(this@HomeActivity, R.raw.battle_three, 1)))
        add(SoundItem(R.drawable.battle,
                R.raw.battle_four,
                R.string.battle_four,
                soundPool.load(this@HomeActivity, R.raw.battle_four, 1)))
        add(SoundItem(R.drawable.battle,
                R.raw.battle_five,
                R.string.battle_five,
                soundPool.load(this@HomeActivity, R.raw.battle_five, 1)))
        add(SoundItem(R.drawable.battle,
                R.raw.battle_six,
                R.string.battle_six,
                soundPool.load(this@HomeActivity, R.raw.battle_six, 1)))
        add(SoundItem(R.drawable.battle,
                R.raw.battle_seven,
                R.string.battle_seven,
                soundPool.load(this@HomeActivity, R.raw.battle_seven, 1)))
        add(SoundItem(R.drawable.battle,
                R.raw.battle_eight,
                R.string.battle_eigth,
                soundPool.load(this@HomeActivity, R.raw.battle_eight, 1)))
    })

    private fun createGameCategory() = SoundboardCategory(getString(R.string.game_category), SoundItems().apply {
        add(SoundItem(R.drawable.img_defend,
                R.raw.defend_sound,
                R.string.defend_town,
                soundPool.load(this@HomeActivity, R.raw.defend_sound, 1)))
        add(SoundItem(R.drawable.img_victory,
                R.raw.victory_sound,
                R.string.victory_battle,
                soundPool.load(this@HomeActivity, R.raw.victory_sound, 1)))
        add(SoundItem(R.drawable.new_day,
                R.raw.new_day,
                R.string.new_day,
                soundPool.load(this@HomeActivity, R.raw.new_day, 1)))
        add(SoundItem(R.drawable.new_week,
                R.raw.new_week,
                R.string.new_week,
                soundPool.load(this@HomeActivity, R.raw.new_week, 1)))
        add(SoundItem(R.drawable.new_week,
                R.raw.new_month,
                R.string.new_month,
                soundPool.load(this@HomeActivity, R.raw.new_month, 1)))
        add(SoundItem(R.drawable.build_town,
                R.raw.build_town_sound,
                R.string.build_town,
                soundPool.load(this@HomeActivity, R.raw.build_town_sound, 1)))
        add(SoundItem(R.drawable.level_up,
                R.raw.lvl_up,
                R.string.lvl_up,
                soundPool.load(this@HomeActivity, R.raw.lvl_up, 1)))
        add(SoundItem(R.drawable.grail,
                R.raw.grail,
                R.string.grail,
                soundPool.load(this@HomeActivity, R.raw.grail, 1)))
        add(SoundItem(R.drawable.chat,
                R.raw.chat_sound,
                R.string.chat,
                soundPool.load(this@HomeActivity, R.raw.chat_sound, 1)))
        add(SoundItem(R.drawable.system,
                R.raw.system,
                R.string.system,
                soundPool.load(this@HomeActivity, R.raw.system, 1)))
    })

    private fun createMapCategory() = SoundboardCategory(getString(R.string.map_category), SoundItems().apply {
        add(SoundItem(R.drawable.mill,
                R.raw.mill_sound,
                R.string.mill,
                soundPool.load(this@HomeActivity, R.raw.mill_sound, 1)))
        add(SoundItem(R.drawable.whirlpool,
                R.raw.whirlpool_sound,
                R.string.whirlpool,
                soundPool.load(this@HomeActivity, R.raw.whirlpool_sound, 1)))
        add(SoundItem(R.drawable.dragon_utopia,
                R.raw.dragon_utopia,
                R.string.dragon_utopia,
                soundPool.load(this@HomeActivity, R.raw.dragon_utopia, 1)))
        add(SoundItem(R.drawable.faerie_ring,
                R.raw.faerie_ring,
                R.string.faerie_ring,
                soundPool.load(this@HomeActivity, R.raw.faerie_ring, 1)))
        add(SoundItem(R.drawable.magic_well,
                R.raw.magic_well,
                R.string.magic_well,
                soundPool.load(this@HomeActivity, R.raw.magic_well, 1)))
        add(SoundItem(R.drawable.mine,
                R.raw.flag_mine,
                R.string.flag_mine,
                soundPool.load(this@HomeActivity, R.raw.flag_mine, 1)))
        add(SoundItem(R.drawable.learning_stone,
                R.raw.learning_stone,
                R.string.learning_stone,
                soundPool.load(this@HomeActivity, R.raw.learning_stone, 1)))
        add(SoundItem(R.drawable.lighthouse,
                R.raw.lighthouse,
                R.string.lighthouse,
                soundPool.load(this@HomeActivity, R.raw.lighthouse, 1)))
        add(SoundItem(R.drawable.lepricon,
                R.raw.lepricon,
                R.string.lepricon,
                soundPool.load(this@HomeActivity, R.raw.lepricon, 1)))
        add(SoundItem(R.drawable.idol_of_fortune,
                R.raw.idol_of_fortune,
                R.string.idol_of_fortune,
                soundPool.load(this@HomeActivity, R.raw.idol_of_fortune, 1)))
        add(SoundItem(R.drawable.temple,
                R.raw.temple,
                R.string.temple,
                soundPool.load(this@HomeActivity, R.raw.temple, 1)))
        add(SoundItem(R.drawable.refugee_camp,
                R.raw.refugee_camp,
                R.string.refugee_camp,
                soundPool.load(this@HomeActivity, R.raw.refugee_camp, 1)))
        add(SoundItem(R.drawable.crypt,
                R.raw.crypt,
                R.string.crypt,
                soundPool.load(this@HomeActivity, R.raw.crypt, 1)))
        add(SoundItem(R.drawable.fountain_of_youth,
                R.raw.fountain_of_youth,
                R.string.fountain_of_youth,
                soundPool.load(this@HomeActivity, R.raw.fountain_of_youth, 1)))
        add(SoundItem(R.drawable.mercenary_camp,
                R.raw.mercenary_camp,
                R.string.mercenary_camp,
                soundPool.load(this@HomeActivity, R.raw.mercenary_camp, 1)))
        add(SoundItem(R.drawable.obelisk,
                R.raw.obelisk,
                R.string.obelisk,
                soundPool.load(this@HomeActivity, R.raw.obelisk, 1)))
        add(SoundItem(R.drawable.quest,
                R.raw.quest,
                R.string.quest,
                soundPool.load(this@HomeActivity, R.raw.quest, 1)))
        add(SoundItem(R.drawable.guarded,
                R.raw.guarded,
                R.string.guarded,
                soundPool.load(this@HomeActivity, R.raw.guarded, 1)))
        add(SoundItem(R.drawable.artifact,
                R.raw.artifact,
                R.string.artifact,
                soundPool.load(this@HomeActivity, R.raw.artifact, 1)))
        add(SoundItem(R.drawable.chest,
                R.raw.chest,
                R.string.chest,
                soundPool.load(this@HomeActivity, R.raw.chest, 1)))
        add(SoundItem(R.drawable.resources,
                R.raw.resources1,
                R.string.resources,
                soundPool.load(this@HomeActivity, R.raw.resources1, 1)))
        add(SoundItem(R.drawable.resources,
                R.raw.resources2,
                R.string.resources,
                soundPool.load(this@HomeActivity, R.raw.resources2, 1)))
        add(SoundItem(R.drawable.resources,
                R.raw.resources3,
                R.string.resources,
                soundPool.load(this@HomeActivity, R.raw.resources3, 1)))
        add(SoundItem(R.drawable.resources,
                R.raw.resources4,
                R.string.resources,
                soundPool.load(this@HomeActivity, R.raw.resources4, 1)))
        add(SoundItem(R.drawable.resources,
                R.raw.resources5,
                R.string.resources,
                soundPool.load(this@HomeActivity, R.raw.resources5, 1)))
        add(SoundItem(R.drawable.resources,
                R.raw.resources6,
                R.string.resources,
                soundPool.load(this@HomeActivity, R.raw.resources6, 1)))
        add(SoundItem(R.drawable.resources,
                R.raw.resources7,
                R.string.resources,
                soundPool.load(this@HomeActivity, R.raw.resources7, 1)))
    })

    override fun getSoundPoolUsage() = USAGE_GAME

    override fun getSoundPoolContentType() = CONTENT_TYPE_SONIFICATION

    override fun getBlurRadius() = 5

    override fun getClickToAdsCount() = Random().nextInt(5) + 9
}
