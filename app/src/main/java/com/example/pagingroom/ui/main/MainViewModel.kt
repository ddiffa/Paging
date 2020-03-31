package com.example.pagingroom.ui.main

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.example.pagingroom.data.Note
import com.example.pagingroom.data.source.NoteRepository

class MainViewModel(application: Application) : ViewModel() {

    private val mNoteRepository: NoteRepository =
        NoteRepository(application)

    fun getAllNotes(): LiveData<PagedList<Note>> =
        LivePagedListBuilder(mNoteRepository.getAllNotes(), 10).build()
}