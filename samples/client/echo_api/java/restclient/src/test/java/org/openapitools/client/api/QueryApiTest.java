/*
 * Echo Server API
 * Echo Server API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openapitools.client.model.DataQuery;
import org.openapitools.client.model.Pet;
import org.openapitools.client.model.StringEnumRef;
import org.openapitools.client.model.TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter;
import org.openapitools.client.model.TestQueryStyleFormExplodeTrueArrayStringQueryObjectParameter;

/** API tests for QueryApi */
public class QueryApiTest {

  private final QueryApi api = new QueryApi();

  /**
   * Test query parameter(s)
   *
   * <p>Test query parameter(s)
   */
  @Test
  public void testEnumRefStringTest() {
    // Given
    String enumNonrefStringQuery = "false";
    StringEnumRef enumRefStringQuery = StringEnumRef.SUCCESS;

    // When
    String response = api.testEnumRefString(enumNonrefStringQuery, enumRefStringQuery);

    // Then
    assertThat(
        response, containsString("?enum_nonref_string_query=false&enum_ref_string_query=success"));
  }

  /**
   * Test query parameter(s)
   *
   * <p>Test query parameter(s)
   */
  @Test
  public void testQueryDatetimeDateStringTest() {
    // Given
    Instant datetimeQuery = Instant.ofEpochMilli(1720361075);
    LocalDate dateQuery = LocalDate.of(2024, 7, 7);
    String stringQuery = "2024-07-07T16:05:59Z";

    // When
    String response = api.testQueryDatetimeDateString(datetimeQuery, dateQuery, stringQuery);

    // Then
    assertThat(
        response,
        containsString(
            "?datetime_query=1970-01-20T21%3A52%3A41.075Z&date_query=2024-07-07&string_query=2024-07-07T16%3A05%3A59Z"));
  }

  /**
   * Test query parameter(s)
   *
   * <p>Test query parameter(s)
   */
  @Test
  public void testQueryIntegerBooleanStringTest() {
    // Given
    Integer integerQuery = 42;
    Boolean booleanQuery = false;
    String stringQuery = "Hello World!";

    // When
    String response = api.testQueryIntegerBooleanString(integerQuery, booleanQuery, stringQuery);

    // Then
    assertThat(
        response,
        containsString("?integer_query=42&boolean_query=false&string_query=Hello%20World%21"));
  }

  /**
   * Test query parameter(s)
   *
   * <p>Test query parameter(s)
   */
  @Test
  @Disabled("The deep object style and the whole dynamic operations are currently not supported")
  public void testQueryStyleDeepObjectExplodeTrueObjectTest() {
    Pet queryObject = null;
    String response = api.testQueryStyleDeepObjectExplodeTrueObject(queryObject);

    // Like Spring WebClient and RestTemplate, the deep object style is currently not
  }

  /**
   * Test query parameter(s)
   *
   * <p>Test query parameter(s)
   */
  @Test
  @Disabled("The deep object style and the whole dynamic operations are currently not supported")
  public void testQueryStyleDeepObjectExplodeTrueObjectAllOfTest() {
    TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter queryObject = null;
    String response = api.testQueryStyleDeepObjectExplodeTrueObjectAllOf(queryObject);

    // Like Spring WebClient and RestTemplate, the deep object style and the whole dynamic
    // operations are currently not supported
  }

  /**
   * Test query parameter(s)
   *
   * <p>Test query parameter(s)
   */
  @Test
  public void testQueryStyleFormExplodeFalseArrayIntegerTest() {
    // Given
    List<Integer> queryObject = List.of(1, 6, 2, 5, 3, 4);

    // When
    String response = api.testQueryStyleFormExplodeFalseArrayInteger(queryObject);

    // Then
    assertThat(response, containsString("?query_object=1%2C6%2C2%2C5%2C3%2C4"));
  }

  /**
   * Test query parameter(s)
   *
   * <p>Test query parameter(s)
   */
  @Test
  public void testQueryStyleFormExplodeFalseArrayStringTest() {
    // Given
    List<String> queryObject = List.of("Hello", "World");

    // When
    String response = api.testQueryStyleFormExplodeFalseArrayString(queryObject);

    // Then
    assertThat(response, containsString("?query_object=Hello%2CWorld"));
  }

  /**
   * Test query parameter(s)
   *
   * <p>Test query parameter(s)
   */
  @Test
  @Disabled("The deep object style and the whole dynamic operations are currently not supported")
  public void testQueryStyleFormExplodeTrueArrayStringTest() {
    // Given
    TestQueryStyleFormExplodeTrueArrayStringQueryObjectParameter queryObject =
        new TestQueryStyleFormExplodeTrueArrayStringQueryObjectParameter()
            .addValuesItem("Hello")
            .addValuesItem("Hallo")
            .addValuesItem("Bonjour");

    // When
    String response = api.testQueryStyleFormExplodeTrueArrayString(queryObject);

    // Then
    // Like Spring WebClient and RestTemplate, the deep object style and the whole dynamic
    // operations are currently not supported
    assertThat(
        response, containsString("?query_object=Hello&query_object=Hallo&query_object=Bonjour"));
  }

  /**
   * Test query parameter(s)
   *
   * <p>Test query parameter(s)
   */
  @Test
  @Disabled("The deep object style and the whole dynamic operations are currently not supported")
  public void testQueryStyleFormExplodeTrueObjectTest() {
    Pet queryObject = null;
    String response = api.testQueryStyleFormExplodeTrueObject(queryObject);

    // TODO: test validations
    // Like Spring WebClient and RestTemplate, the deep object style and the whole dynamic
    // operations are currently not supported
  }

  /**
   * Test query parameter(s)
   *
   * <p>Test query parameter(s)
   */
  @Test
  @Disabled("The deep object style and the whole dynamic operations are currently not supported")
  public void testQueryStyleFormExplodeTrueObjectAllOfTest() {
    DataQuery queryObject = null;
    String response = api.testQueryStyleFormExplodeTrueObjectAllOf(queryObject);

    // TODO: test validations
    // Like Spring WebClient and RestTemplate, the deep object style and the whole dynamic
    // operations are currently not supported
  }
}
