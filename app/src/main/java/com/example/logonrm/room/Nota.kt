package com.example.logonrm.room

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by logonrm on 20/03/2018.
 */

@Entity(tableName = "nota")
data class Nota(
        @PrimaryKey (autoGenerate = true)
        var id: Int?,
        @ColumnInfo(name = "description")
        var descricao: String
) {
    constructor():this(null, "")
}