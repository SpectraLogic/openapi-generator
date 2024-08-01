/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.8.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
*/
package org.openapitools.api

import org.openapitools.model.ModelApiResponse
import org.openapitools.model.Pet
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
interface PetApi {


    @RequestMapping(
            method = [RequestMethod.POST],
            value = ["/pet"],
            produces = ["application/xml", "application/json"],
            consumes = ["application/json", "application/xml"]
    )
    fun addPet( @Valid @RequestBody pet: Pet): ResponseEntity<Pet> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            method = [RequestMethod.DELETE],
            value = ["/pet/{petId}"]
    )
    fun deletePet( @PathVariable("petId") petId: kotlin.Long, @RequestHeader(value = "api_key", required = false) apiKey: kotlin.String?): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            method = [RequestMethod.GET],
            value = ["/pet/findByStatus"],
            produces = ["application/xml", "application/json"]
    )
    fun findPetsByStatus(@NotNull  @Valid @RequestParam(value = "status", required = true) status: kotlin.collections.List<kotlin.String>): ResponseEntity<List<Pet>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            method = [RequestMethod.GET],
            value = ["/pet/findByTags"],
            produces = ["application/xml", "application/json"]
    )
    fun findPetsByTags(@NotNull  @Valid @RequestParam(value = "tags", required = true) tags: kotlin.collections.List<kotlin.String>): ResponseEntity<List<Pet>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            method = [RequestMethod.GET],
            value = ["/pet/{petId}"],
            produces = ["application/xml", "application/json"]
    )
    fun getPetById( @PathVariable("petId") petId: kotlin.Long): ResponseEntity<Pet> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            method = [RequestMethod.PUT],
            value = ["/pet"],
            produces = ["application/xml", "application/json"],
            consumes = ["application/json", "application/xml"]
    )
    fun updatePet( @Valid @RequestBody pet: Pet): ResponseEntity<Pet> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            method = [RequestMethod.POST],
            value = ["/pet/{petId}"],
            consumes = ["application/x-www-form-urlencoded"]
    )
    fun updatePetWithForm( @PathVariable("petId") petId: kotlin.Long, @RequestParam(value = "name", required = false) name: kotlin.String? , @RequestParam(value = "status", required = false) status: kotlin.String? ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            method = [RequestMethod.POST],
            value = ["/pet/{petId}/uploadImage"],
            produces = ["application/json"],
            consumes = ["multipart/form-data"]
    )
    fun uploadFile( @PathVariable("petId") petId: kotlin.Long, @RequestParam(value = "additionalMetadata", required = false) additionalMetadata: kotlin.String? , @Valid @RequestPart("file", required = false) file: org.springframework.core.io.Resource?): ResponseEntity<ModelApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
