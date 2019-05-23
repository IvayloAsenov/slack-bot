package com.example.slackbot.repositories;

import com.example.slackbot.models.BadWord;
import org.springframework.data.repository.CrudRepository;

public interface BadwordRepository extends CrudRepository<BadWord, String> {
}
