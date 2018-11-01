package ventum.zephyr.homm3soundboard

import android.media.AudioAttributes.*
import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.soundboardtemplate.model.SoundboardCategory
import ventum.zephyr.soundboardtemplate.ui.SoundboardActivity

class HomeActivity : SoundboardActivity() {
    override fun getSoundboardCategories() = ArrayList<SoundboardCategory>().apply {
        add(createSpellsCategory())
        add(createBattleCategory())
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
    })

   private fun createBattleCategory() = SoundboardCategory(getString(R.string.battle_category), SoundItems().apply {
       add(SoundItem(R.drawable.bad_morale,
               R.raw.bad_morale_sound,
               R.string.bad_morale,
               soundPool.load(this@HomeActivity, R.raw.bad_morale_sound, 1)))
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
        add(SoundItem(R.drawable.level_up,
                R.raw.lvl_up,
                R.string.lvl_up,
                soundPool.load(this@HomeActivity, R.raw.lvl_up, 1)))
        add(SoundItem(R.drawable.build_town,
                R.raw.build_town_sound,
                R.string.build_town,
                soundPool.load(this@HomeActivity, R.raw.build_town_sound, 1)))
        add(SoundItem(R.drawable.mill,
                R.raw.mill_sound,
                R.string.mill,
                soundPool.load(this@HomeActivity, R.raw.mill_sound, 1)))
    })

    override fun getSoundPoolUsage() = USAGE_MEDIA

    override fun getSoundPoolContentType() = CONTENT_TYPE_MUSIC
}
