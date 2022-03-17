package rs.readahead.washington.mobile.data.entity.uwazi

data class PrimaryDocumentResponse(
    val _id: String,
    val creationDate: Long,
    val entity: String,
    val filename: String,
    val mimetype: String,
    val originalname: String,
    val size: Int,
    val type: String
)