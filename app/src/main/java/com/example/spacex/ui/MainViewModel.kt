package com.example.spacex.ui

import androidx.lifecycle.ViewModel
import com.example.spacex.repository.SpacexRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(val repository: SpacexRepository) : ViewModel(){

//    private val uiState = MutableStateFlow(SpacexRepository())
}