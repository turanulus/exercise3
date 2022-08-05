package com.turanulus.exercise3.service;

import com.turanulus.exercise3.model.RedisMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RedisPublisherService {
  private final RedisTemplate<String, RedisMessage> redisTemplate;

  public void publishMessage(RedisMessage message) {}
}
