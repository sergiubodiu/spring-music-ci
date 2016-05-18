package org.cloudfoundry.samples.music.domain.repositories.jpa;

import org.cloudfoundry.samples.music.domain.Album;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

@Profile({"in-memory", "mysql", "postgres", "oracle"})
public interface JpaAlbumRepository extends JpaRepository<Album, String> {
}
