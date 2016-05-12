package org.cloudfoundry.samples.music.repositories.mongodb;

import org.cloudfoundry.samples.music.domain.Album;
import org.cloudfoundry.samples.music.domain.AlbumRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
@Profile("mongo")
public interface MongoAlbumRepository extends MongoRepository<Album, String>, AlbumRepository {
}