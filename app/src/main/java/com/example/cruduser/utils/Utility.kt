package com.example.cruduser.utils

import com.google.gson.Gson

class Utility {
    fun jsonToPojo(jsonString: String?, pojoClass: Class<*>?): Any? {
        return Gson().fromJson(jsonString, pojoClass)
    }

    fun pojoToJson(pojoObject: Any?): String? {
        return if (pojoObject != null) {
            Gson().toJson(pojoObject)
        } else {
            null
        }
    }
}