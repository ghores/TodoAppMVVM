package com.example.todoapp.data.repository

import com.example.todoapp.data.database.NoteDao
import com.example.todoapp.data.model.NoteEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MainRepository @Inject constructor(private val dao: NoteDao) {
    fun getAllNotes(): Flow<MutableList<NoteEntity>> = dao.getAllNotes()
    fun searchNotes(search: String): Flow<MutableList<NoteEntity>> = dao.searchNote(search)
    fun filterNotes(filter: String): Flow<MutableList<NoteEntity>> = dao.filterNote(filter)
    suspend fun deleteNote(entity: NoteEntity): Unit = dao.deleteNote(entity)
}