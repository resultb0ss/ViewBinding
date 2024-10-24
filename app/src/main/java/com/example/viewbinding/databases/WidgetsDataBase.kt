package com.example.viewbinding.databases

import com.example.viewbinding.R
import com.example.viewbinding.SettingsFragment
import com.example.viewbinding.models.Widget

class WidgetsDataBase {
    companion object {
        val widgets = mutableListOf(
            Widget("Home", R.drawable.ic_home_24, SettingsFragment()),
            Widget("Chat", R.drawable.ic_chat_24,SettingsFragment()),
            Widget("Profile", R.drawable.ic_person_24,SettingsFragment()),
            Widget("Widgets", R.drawable.ic_widgets_24,SettingsFragment()),
            Widget("Settings", R.drawable.ic_settings_24,SettingsFragment()),
            Widget("Logout", R.drawable.ic_exit_24,SettingsFragment()),
        )
    }
}