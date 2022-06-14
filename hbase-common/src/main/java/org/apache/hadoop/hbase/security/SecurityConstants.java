/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hbase.security;

import org.apache.hadoop.hbase.HBaseInterfaceAudience;
import org.apache.yetus.audience.InterfaceAudience;

/**
 * SecurityConstants holds a bunch of kerberos-related constants
 */
@InterfaceAudience.Private
public final class SecurityConstants {

  /**
   * Configuration keys for programmatic JAAS configuration for secured master and regionserver
   * interaction
   */
  public static final String MASTER_KRB_PRINCIPAL = "hbase.master.kerberos.principal";
  public static final String MASTER_KRB_KEYTAB_FILE = "hbase.master.keytab.file";
  public static final String REGIONSERVER_KRB_PRINCIPAL = "hbase.regionserver.kerberos.principal";
  public static final String REGIONSERVER_KRB_KEYTAB_FILE = "hbase.regionserver.keytab.file";

  /**
   * This config is for experts: don't set its value unless you really know what you are doing. When
   * set to true, HBase client using SASL Kerberos will skip reverse DNS lookup and use provided
   * hostname of the destination for the principal instead. See
   * https://issues.apache.org/jira/browse/HBASE-25665 for more details.
   */
  @InterfaceAudience.LimitedPrivate(HBaseInterfaceAudience.CONFIG)
  public static final String UNSAFE_HBASE_CLIENT_KERBEROS_HOSTNAME_DISABLE_REVERSEDNS =
    "hbase.unsafe.client.kerberos.hostname.disable.reversedns";
  public static final boolean DEFAULT_UNSAFE_HBASE_CLIENT_KERBEROS_HOSTNAME_DISABLE_REVERSEDNS =
    false;

  private SecurityConstants() {
    // Can't be instantiated with this ctor.
  }
}
