package com.example.BeatDropServer.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.BeatDropServer.model.Artist;

public interface ArtistRepository extends CrudRepository<Artist, Integer> {

}
