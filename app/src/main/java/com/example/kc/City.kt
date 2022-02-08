package com.example.kc

import java.io.Serializable

class City(val image: Int, val cityId: Int, val name: String, val script: String, val subtitle: String, val youtube: String): Serializable {
    override fun toString() = "City(cityId=$cityId, name='$name')"
}