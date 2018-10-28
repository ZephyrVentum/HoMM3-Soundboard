package ventum.zephyr.homm3soundboard

import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.soundboardtemplate.model.SoundboardCategory
import ventum.zephyr.soundboardtemplate.ui.SoundboardActivity

class HomeActivity : SoundboardActivity() {
    override fun getSoundboardCategories() = ArrayList<SoundboardCategory>().apply {
        add(createSpellsCategory())
        add(createGameCategory())
    }

    private fun createSpellsCategory() = SoundboardCategory(getString(R.string.spell_category), SoundItems().apply {
        add(SoundItem(R.drawable.blind,
                R.raw.blind_sound,
                R.string.blind_spell,
                soundPool.load(this@HomeActivity, R.raw.blind_sound, 1)))
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
    })
}
