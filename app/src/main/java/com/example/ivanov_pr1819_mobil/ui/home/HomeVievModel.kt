package com.example.ivanov_pr1819_mobil.ui.home

import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.media.Image
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ivanov_pr1819_mobil.R

class HomeVievModel: ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "        В данной статье я расскажу об основных компонентах типичного домашнего (стационарного) компьютера для того, чтобы вы имели представление как он устроен, как выглядит тот или иной компонент, какие имеет характеристики и за что отвечает. Вся эта информация может пригодиться простым начинающим пользователям при выборе и покупке компьютера… Под «Основными» я имел ввиду те компоненты (комплектующие), которые вынимаются и подлежат простой замене. Проще говоря, я не буду заходить слишком далеко и рассказывать в детальных подробностях, как работает компьютер, объясняя каждый элемент на платах и внутреннее устройство каждого компонента. Данный блог читает очень много новичков, и я считаю, что сразу говорить обо всех сложных процессах и терминах – это не есть хорошо и просто вызовет кашу в голове."
    }
    val text: LiveData<String> = _text

    /*private  val _image = MutableLiveData<Image>().apply {
        value = R.id.

    }*/

    /*private var _wallpaper = MutableLiveData<Drawable>()
    val wallpaper: LiveData<Drawable>
        get() = _wallpaper

    fun updateWallPaper() {
        val file = appCtx.getWallpaperFile()
        if(file.exists()) {
            _wallpaper.value = BitmapDrawable(R.drawable.campic, BitmapFactory.decodeFile(file.absolutePath))
        }
    }*/

}