package com.skill_factory.unit9.model

import androidx.annotation.DrawableRes
import com.skill_factory.unit9.model.Item

class Product(val id: Int, @DrawableRes val idIcon: Int, val name: String, val desc: String) : Item