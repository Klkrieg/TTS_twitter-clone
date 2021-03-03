package com.karson.twitterclone.repository;

import com.karson.twitterclone.model.Tag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TagRepository extends CrudRepository<Tag, Long>  {

  Tag findByPhrase(String phrase);

}
