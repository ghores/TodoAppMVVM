package com.example.todoapp.data.repository

import com.example.todoapp.data.database.NoteDao
import com.example.todoapp.data.model.NoteEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class NoteRepository @Inject constructor(private val dao: NoteDao) {
    suspend fun saveNote(entity: NoteEntity): Unit = dao.saveNote(entity)
    suspend fun updateNote(entity: NoteEntity): Unit = dao.updateNote(entity)
    fun getNote(id: Int): Flow<NoteEntity> = dao.getNote(id)
}