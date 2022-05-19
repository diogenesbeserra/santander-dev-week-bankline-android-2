package me.dio.bankline.ui.statement

import androidx.lifecycle.ViewModel
import me.dio.bankline.data.BanklineRepository

class BankStatemantViewlModel : ViewModel() {

    fun findBankStatement(accountHolderId: Int) =
        BanklineRepository.findBankStatement((accountHolderId))
}