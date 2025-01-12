package com.example.viewbinding.databases

import com.example.viewbinding.R
import com.example.viewbinding.fragments.ChatFragment
import com.example.viewbinding.fragments.ProfileFragment
import com.example.viewbinding.fragments.SettingsFragment
import com.example.viewbinding.fragments.WidgetsFragment
import com.example.viewbinding.models.Widget

class WidgetsDataBase {
    companion object {
        val widgets = mutableListOf(
            Widget("Home", R.drawable.ic_home_24, SettingsFragment()),
            Widget("Chat", R.drawable.ic_chat_24, ChatFragment()),
            Widget("Profile", R.drawable.ic_person_24, ProfileFragment()),
            Widget("Widgets", R.drawable.ic_widgets_24, WidgetsFragment()),
            Widget("Settings", R.drawable.ic_settings_24, SettingsFragment()),
            Widget("Logout", R.drawable.ic_exit_24, null),
        )
    }
}