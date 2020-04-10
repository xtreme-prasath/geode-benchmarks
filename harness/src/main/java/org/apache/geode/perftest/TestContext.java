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

package org.apache.geode.perftest;

import java.io.File;
import java.io.Serializable;
import java.net.InetAddress;
import java.util.List;

public interface TestContext extends Serializable {
  List<InetAddress> getHostsForRole(String role);

  List<Integer> getHostsIDsForRole(String role);

  File getOutputDir();

  /**
   * Returns the JVM ID
   *
   * @return JVM ID
   */
  int getJvmID();

  String getHostName();

  /**
   * Sets the value of the attribute
   *
   * @param attribute attribute name
   * @param value attribute value
   */
  void setAttribute(String attribute, Object value);

  /**
   * Gets the value of an attribute when searched by the passed key
   *
   * @param key lookup key
   * @return the attribute value
   */
  Object getAttribute(String key);



}
