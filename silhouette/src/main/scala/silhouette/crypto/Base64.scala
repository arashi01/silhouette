/**
 * Licensed to the Minutemen Group under one or more contributor license
 * agreements. See the COPYRIGHT file distributed with this work for
 * additional information regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package silhouette.crypto

/**
 * Base64 helper.
 */
object Base64 {

  /**
   * Decodes a Base64 string.
   *
   * @param str The string to decode.
   * @return The decoded string.
   */
  def decode(str: String): String = new String(java.util.Base64.getDecoder.decode(str), "UTF-8")

  /**
   * Encodes a byte array as Base64.
   *
   * @param bytes The byte array to encode.
   * @return The encodes string.
   */
  def encode(bytes: Array[Byte]): String = java.util.Base64.getEncoder.encodeToString(bytes)

  /**
   * Encodes a string as Base64.
   *
   * @param str The string to encode.
   * @return The encodes string.
   */
  def encode(str: String): String = encode(str.getBytes("UTF-8"))
}
