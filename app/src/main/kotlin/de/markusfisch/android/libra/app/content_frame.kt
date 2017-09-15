package de.markusfisch.android.libra.app

import de.markusfisch.android.libra.R

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction

fun setFragment(fm: FragmentManager?, fragment: Fragment) {
	fm?.let { getTransaction(fm, fragment).commit() }
}

fun addFragment(fm: FragmentManager?, fragment: Fragment) {
	fm?.let { getTransaction(fm, fragment).addToBackStack(null).commit() }
}

private fun getTransaction(
		fm: FragmentManager,
		fragment: Fragment): FragmentTransaction {
	return fm.beginTransaction().replace(R.id.content_frame, fragment)
}
