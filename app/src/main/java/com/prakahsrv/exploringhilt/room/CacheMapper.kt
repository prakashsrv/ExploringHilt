package com.prakahsrv.exploringhilt.room

import com.prakahsrv.exploringhilt.model.Blog
import com.prakahsrv.exploringhilt.retrofit.BlogNetworkEntity
import com.prakahsrv.exploringhilt.util.EntityMapper
import javax.inject.Inject

class CacheMapper @Inject constructor(): EntityMapper<BlogCacheEntity,Blog> {
    override fun mapFromEntity(entity: BlogCacheEntity): Blog {
        return Blog(
            id=entity.id,
            title = entity.title,
            body = entity.body,
            category = entity.category,
            image = entity.image
        )
    }

    override fun mapToEntity(domainModel: Blog): BlogCacheEntity {
        return BlogCacheEntity(
            id=domainModel.id,
            title = domainModel.title,
            body = domainModel.body,
            image = domainModel.image,
            category = domainModel.category

        )
    }

    fun mapFromEntityList(entity: List<BlogCacheEntity>):List<Blog>{
        return entity.map { mapFromEntity(it) }
    }

}