package rs.readahead.washington.mobile.data.entity.uwazi

data class Entity(
    val __v: Int,
    val _id: String,
    val creationDate: Long,
    val documents: List<Any>,
    val editDate: Long,
    val language: String,
    val published: Boolean,
    val sharedId: String,
    val template: String,
    val title: String,
    val user: String
)