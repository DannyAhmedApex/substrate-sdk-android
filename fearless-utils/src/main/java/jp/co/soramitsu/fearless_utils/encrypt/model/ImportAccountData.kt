package jp.co.soramitsu.fearless_utils.encrypt.model

import jp.co.soramitsu.fearless_utils.encrypt.EncryptionType
import jp.co.soramitsu.fearless_utils.ss58.AddressType

class ImportAccountData(
    val keypair: Keypair,
    val encryptionType: EncryptionType,
    val networkType: AddressType?,
    val username: String?,
    val address: String,
    val seed: ByteArray? = null
)

class ImportAccountMeta(
    val name: String?,
    val networkType: AddressType?,
    val encryptionType: EncryptionType
)