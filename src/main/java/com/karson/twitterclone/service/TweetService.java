package com.karson.twitterclone.service;

import com.karson.twitterclone.model.Tweet;
import com.karson.twitterclone.model.User;
import com.karson.twitterclone.repository.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TweetService {

  @Autowired
  private TweetRepository tweetRepository;

  public List<Tweet> findAll() {
    List<Tweet> tweets = tweetRepository.findAllByOrderByCreatedAtDesc();
    return tweets;
  }

  public List<Tweet> findAllByUser(User user) {
    List<Tweet> tweets = tweetRepository.findAllByUserOrderByCreatedAtDesc(user);
    return tweets;
  }

  public List<Tweet> findAllByUsers(List<User> users){
    List<Tweet> tweets = tweetRepository.findAllByUserInOrderByCreatedAtDesc(users);
    return tweets;
  }

  public void save(Tweet tweet) {
    tweetRepository.save(tweet);
  }
}
