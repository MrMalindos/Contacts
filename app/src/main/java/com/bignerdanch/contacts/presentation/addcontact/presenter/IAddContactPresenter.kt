package com.bignerdanch.contacts.presentation.addcontact.presenter

import com.bignerdanch.contacts.data.Contact
import com.bignerdanch.contacts.presentation.addcontact.view.IAddContactFragment
import java.util.*

interface IAddContactPresenter{
    fun attachView(view: IAddContactFragment)

    fun addContact()

    fun updateContact(contact : Contact)

    fun loadContact(contactId: UUID)
}