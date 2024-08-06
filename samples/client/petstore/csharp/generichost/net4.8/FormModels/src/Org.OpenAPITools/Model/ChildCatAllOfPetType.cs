// <auto-generated>
/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Text.Json;
using System.Text.Json.Serialization;
using System.ComponentModel.DataAnnotations;
using OpenAPIClientUtils = Org.OpenAPITools.Client.ClientUtils;
using Org.OpenAPITools.Client;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Defines ChildCat_allOf_pet_type
    /// </summary>
    public enum ChildCatAllOfPetType
    {
        /// <summary>
        /// Enum ChildCat for value: ChildCat
        /// </summary>
        ChildCat = 1
    }

    /// <summary>
    /// Converts <see cref="ChildCatAllOfPetType"/> to and from the JSON value
    /// </summary>
    public static class ChildCatAllOfPetTypeValueConverter
    {
        /// <summary>
        /// Parses a given value to <see cref="ChildCatAllOfPetType"/>
        /// </summary>
        /// <param name="value"></param>
        /// <returns></returns>
        public static ChildCatAllOfPetType FromString(string value)
        {
            if (value.Equals("ChildCat"))
                return ChildCatAllOfPetType.ChildCat;

            throw new NotImplementedException($"Could not convert value to type ChildCatAllOfPetType: '{value}'");
        }

        /// <summary>
        /// Parses a given value to <see cref="ChildCatAllOfPetType"/>
        /// </summary>
        /// <param name="value"></param>
        /// <returns></returns>
        public static ChildCatAllOfPetType? FromStringOrDefault(string value)
        {
            if (value.Equals("ChildCat"))
                return ChildCatAllOfPetType.ChildCat;

            return null;
        }

        /// <summary>
        /// Converts the <see cref="ChildCatAllOfPetType"/> to the json value
        /// </summary>
        /// <param name="value"></param>
        /// <returns></returns>
        /// <exception cref="NotImplementedException"></exception>
        public static string ToJsonValue(ChildCatAllOfPetType value)
        {
            if (value == ChildCatAllOfPetType.ChildCat)
                return "ChildCat";

            throw new NotImplementedException($"Value could not be handled: '{value}'");
        }
    }

    /// <summary>
    /// A Json converter for type <see cref="ChildCatAllOfPetType"/>
    /// </summary>
    /// <exception cref="NotImplementedException"></exception>
    public class ChildCatAllOfPetTypeJsonConverter : JsonConverter<ChildCatAllOfPetType>
    {
        /// <summary>
        /// Returns a  from the Json object
        /// </summary>
        /// <param name="reader"></param>
        /// <param name="typeToConvert"></param>
        /// <param name="options"></param>
        /// <returns></returns>
        public override ChildCatAllOfPetType Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            string rawValue = reader.GetString();

            ChildCatAllOfPetType? result = rawValue == null
                ? null
                : ChildCatAllOfPetTypeValueConverter.FromStringOrDefault(rawValue);

            if (result != null)
                return result.Value;

            throw new JsonException();
        }

        /// <summary>
        /// Writes the ChildCatAllOfPetType to the json writer
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="childCatAllOfPetType"></param>
        /// <param name="options"></param>
        public override void Write(Utf8JsonWriter writer, ChildCatAllOfPetType childCatAllOfPetType, JsonSerializerOptions options)
        {
            writer.WriteStringValue(childCatAllOfPetType.ToString());
        }
    }

    /// <summary>
    /// A Json converter for type <see cref="ChildCatAllOfPetType"/>
    /// </summary>
    public class ChildCatAllOfPetTypeNullableJsonConverter : JsonConverter<ChildCatAllOfPetType?>
    {
        /// <summary>
        /// Returns a ChildCatAllOfPetType from the Json object
        /// </summary>
        /// <param name="reader"></param>
        /// <param name="typeToConvert"></param>
        /// <param name="options"></param>
        /// <returns></returns>
        public override ChildCatAllOfPetType? Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            string rawValue = reader.GetString();

            ChildCatAllOfPetType? result = rawValue == null
                ? null
                : ChildCatAllOfPetTypeValueConverter.FromStringOrDefault(rawValue);

            if (result != null)
                return result.Value;

            throw new JsonException();
        }

        /// <summary>
        /// Writes the DateTime to the json writer
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="childCatAllOfPetType"></param>
        /// <param name="options"></param>
        public override void Write(Utf8JsonWriter writer, ChildCatAllOfPetType? childCatAllOfPetType, JsonSerializerOptions options)
        {
            writer.WriteStringValue(childCatAllOfPetType?.ToString() ?? "null");
        }
    }
}
