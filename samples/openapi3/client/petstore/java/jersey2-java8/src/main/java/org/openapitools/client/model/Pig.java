/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.client.model.BasquePig;
import org.openapitools.client.model.DanishPig;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;

import com.fasterxml.jackson.core.type.TypeReference;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0-SNAPSHOT")
@JsonDeserialize(using = Pig.PigDeserializer.class)
@JsonSerialize(using = Pig.PigSerializer.class)
public class Pig extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(Pig.class.getName());

    public static class PigSerializer extends StdSerializer<Pig> {
        public PigSerializer(Class<Pig> t) {
            super(t);
        }

        public PigSerializer() {
            this(null);
        }

        @Override
        public void serialize(Pig value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class PigDeserializer extends StdDeserializer<Pig> {
        public PigDeserializer() {
            this(Pig.class);
        }

        public PigDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public Pig deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Pig newPig = new Pig();
            Map<String, Object> result2 = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<Map<String, Object>>() {});
            String discriminatorValue = (String)result2.get("className");
            switch (discriminatorValue) {
                case "BasquePig":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(BasquePig.class);
                    newPig.setActualInstance(deserialized);
                    return newPig;
                case "DanishPig":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(DanishPig.class);
                    newPig.setActualInstance(deserialized);
                    return newPig;
                default:
                    log.log(Level.WARNING, String.format("Failed to lookup discriminator value `%s` for Pig. Possible values: BasquePig DanishPig", discriminatorValue));
            }

            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize BasquePig
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(BasquePig.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'BasquePig'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'BasquePig'", e);
            }

            // deserialize DanishPig
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(DanishPig.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'DanishPig'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'DanishPig'", e);
            }

            if (match == 1) {
                Pig ret = new Pig();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for Pig: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public Pig getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "Pig cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType<?>> schemas = new HashMap<>();

    public Pig() {
        super("oneOf", Boolean.FALSE);
    }
  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  @JsonAnySetter
  public Pig putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

    /**
     * Return true if this Pig object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        return super.equals(o) && Objects.equals(this.additionalProperties, ((Pig)o).additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getActualInstance(), isNullable(), getSchemaType(), additionalProperties);
    }
    public Pig(BasquePig o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public Pig(DanishPig o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("BasquePig", new GenericType<BasquePig>() {
        });
        schemas.put("DanishPig", new GenericType<DanishPig>() {
        });
        JSON.registerDescendants(Pig.class, Collections.unmodifiableMap(schemas));
        // Initialize and register the discriminator mappings.
        Map<String, Class<?>> mappings = new HashMap<>();
        mappings.put("BasquePig", BasquePig.class);
        mappings.put("DanishPig", DanishPig.class);
        mappings.put("Pig", Pig.class);
        JSON.registerDiscriminator(Pig.class, "className", mappings);
    }

    @Override
    public Map<String, GenericType<?>> getSchemas() {
        return Pig.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * BasquePig, DanishPig
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(BasquePig.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(DanishPig.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be BasquePig, DanishPig");
    }

    /**
     * Get the actual instance, which can be the following:
     * BasquePig, DanishPig
     *
     * @return The actual instance (BasquePig, DanishPig)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `BasquePig`. If the actual instance is not `BasquePig`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BasquePig`
     * @throws ClassCastException if the instance is not `BasquePig`
     */
    public BasquePig getBasquePig() throws ClassCastException {
        return (BasquePig)super.getActualInstance();
    }

    /**
     * Get the actual instance of `DanishPig`. If the actual instance is not `DanishPig`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DanishPig`
     * @throws ClassCastException if the instance is not `DanishPig`
     */
    public DanishPig getDanishPig() throws ClassCastException {
        return (DanishPig)super.getActualInstance();
    }

}

