package org.cloudfoundry.samples.music.web.controllers;

import org.cloudfoundry.samples.music.domain.Album;
import org.cloudfoundry.samples.music.domain.AlbumRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/albums")
public class AlbumController {
    private static final Logger logger = LoggerFactory.getLogger(AlbumController.class);
    private AlbumRepository repository;

    @Autowired
    public AlbumController(AlbumRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Album> albums() {
        return repository.findAll();
    }

    @PutMapping
    public Album add(@RequestBody @Valid Album album) {
        logger.info("Adding album " + album.getId());
        return repository.save(album);
    }

    @PostMapping
    public Album update(@RequestBody @Valid Album album) {
        logger.info("Updating album " + album.getId());
        return repository.save(album);
    }

    @GetMapping("/{id}")
    public Album getById(@PathVariable String id) {
        logger.info("Getting album " + id);
        return repository.findOne(id);
    }

    @ResponseBody
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id) {
        logger.info("Deleting album " + id);
        repository.delete(id);
    }
}