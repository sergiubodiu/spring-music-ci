package org.cloudfoundry.samples.music.domain;

import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Album, String> {
}
