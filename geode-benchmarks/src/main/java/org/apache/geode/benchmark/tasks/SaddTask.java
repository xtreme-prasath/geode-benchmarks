/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.geode.benchmark.tasks;

import java.io.Serializable;
import java.util.Map;
import java.util.Random;

import org.yardstickframework.BenchmarkConfiguration;
import org.yardstickframework.BenchmarkDriverAdapter;
import redis.clients.jedis.Jedis;

public class SaddTask extends BenchmarkDriverAdapter implements Serializable {

  private final int numSets;
  private final int numElementsPerSet;
  private Jedis jedis;

  public SaddTask(int numSets, int numElementsPerSet) {

    this.numSets = numSets;
    this.numElementsPerSet = numElementsPerSet;
  }

  @Override
  public void setUp(BenchmarkConfiguration cfg) throws Exception {
    super.setUp(cfg);
    String property = System.getProperty("geode-servers");
    String[] servers = property.split(",");
    String randomServer = servers[new Random().nextInt(servers.length)];
//    jedis = new Jedis(randomServer, 6378 + Integer.valueOf(System.getProperty("JVM_ID")));
  }

  @Override
  public boolean test(Map<Object, Object> ctx) {
//    jedis.sadd("setName_" + new Random().nextInt(numSets),
//        "element_" + new Random().nextInt(numElementsPerSet));
    return true;
  }
}
