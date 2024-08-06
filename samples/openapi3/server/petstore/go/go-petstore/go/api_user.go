// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * OpenAPI Petstore
 *
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * API version: 1.0.0
 */

package petstoreserver

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/go-chi/chi/v5"
)

// UserAPIController binds http requests to an api service and writes the service results to the http response
type UserAPIController struct {
	service UserAPIServicer
	errorHandler ErrorHandler
}

// UserAPIOption for how the controller is set up.
type UserAPIOption func(*UserAPIController)

// WithUserAPIErrorHandler inject ErrorHandler into controller
func WithUserAPIErrorHandler(h ErrorHandler) UserAPIOption {
	return func(c *UserAPIController) {
		c.errorHandler = h
	}
}

// NewUserAPIController creates a default api controller
func NewUserAPIController(s UserAPIServicer, opts ...UserAPIOption) *UserAPIController {
	controller := &UserAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the UserAPIController
func (c *UserAPIController) Routes() Routes {
	return Routes{
		"CreateUser": Route{
			strings.ToUpper("Post"),
			"/v2/user",
			c.CreateUser,
		},
		"CreateUsersWithArrayInput": Route{
			strings.ToUpper("Post"),
			"/v2/user/createWithArray",
			c.CreateUsersWithArrayInput,
		},
		"CreateUsersWithListInput": Route{
			strings.ToUpper("Post"),
			"/v2/user/createWithList",
			c.CreateUsersWithListInput,
		},
		"DeleteUser": Route{
			strings.ToUpper("Delete"),
			"/v2/user/{username}",
			c.DeleteUser,
		},
		"GetUserByName": Route{
			strings.ToUpper("Get"),
			"/v2/user/{username}",
			c.GetUserByName,
		},
		"LoginUser": Route{
			strings.ToUpper("Get"),
			"/v2/user/login",
			c.LoginUser,
		},
		"LogoutUser": Route{
			strings.ToUpper("Get"),
			"/v2/user/logout",
			c.LogoutUser,
		},
		"UpdateUser": Route{
			strings.ToUpper("Put"),
			"/v2/user/{username}",
			c.UpdateUser,
		},
	}
}

// CreateUser - Create user
func (c *UserAPIController) CreateUser(w http.ResponseWriter, r *http.Request) {
	userParam := &User{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(userParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertUserRequired(*userParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertUserConstraints(*userParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.CreateUser(r.Context(), *userParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, result.Headers, w)
}

// CreateUsersWithArrayInput - Creates list of users with given input array
func (c *UserAPIController) CreateUsersWithArrayInput(w http.ResponseWriter, r *http.Request) {
	userParam := []User{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(userParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	for _, el := range userParam {
		if err := AssertUserRequired(el); err != nil {
			c.errorHandler(w, r, err, nil)
			return
		}
	}
	result, err := c.service.CreateUsersWithArrayInput(r.Context(), userParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, result.Headers, w)
}

// CreateUsersWithListInput - Creates list of users with given input array
func (c *UserAPIController) CreateUsersWithListInput(w http.ResponseWriter, r *http.Request) {
	userParam := []User{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(userParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	for _, el := range userParam {
		if err := AssertUserRequired(el); err != nil {
			c.errorHandler(w, r, err, nil)
			return
		}
	}
	result, err := c.service.CreateUsersWithListInput(r.Context(), userParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, result.Headers, w)
}

// DeleteUser - Delete user
func (c *UserAPIController) DeleteUser(w http.ResponseWriter, r *http.Request) {
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	usernameParam := getPointerOrNilIfEmpty(chi.URLParam(r, "username"))
	if usernameParam == nil {
		c.errorHandler(w, r, &RequiredError{"username"}, nil)
		return
	}
	booleanTestParam, err := parseBoolParameter(
		query.Get("boolean_test"),
		WithParse[bool](parseBool),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Param: "boolean_test", Err: err}, nil)
		return
	}
	result, err := c.service.DeleteUser(r.Context(), *usernameParam, booleanTestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, result.Headers, w)
}

// GetUserByName - Get user by user name
func (c *UserAPIController) GetUserByName(w http.ResponseWriter, r *http.Request) {
	usernameParam := getPointerOrNilIfEmpty(chi.URLParam(r, "username"))
	if usernameParam == nil {
		c.errorHandler(w, r, &RequiredError{"username"}, nil)
		return
	}
	result, err := c.service.GetUserByName(r.Context(), *usernameParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, result.Headers, w)
}

// LoginUser - Logs user into the system
func (c *UserAPIController) LoginUser(w http.ResponseWriter, r *http.Request) {
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if !query.Has("username"){
		c.errorHandler(w, r, &RequiredError{"username"}, nil)
		return
	}
	usernameParam := query.Get("username")
	if !query.Has("password"){
		c.errorHandler(w, r, &RequiredError{"password"}, nil)
		return
	}
	passwordParam := query.Get("password")
	int32TestParam, err := parseNumericParameter[int32](
		query.Get("int32_test"),
		WithParse[int32](parseInt32),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Param: "int32_test", Err: err}, nil)
		return
	}
	int64TestParam, err := parseNumericParameter[int64](
		query.Get("int64_test"),
		WithParse[int64](parseInt64),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Param: "int64_test", Err: err}, nil)
		return
	}
	float32TestParam, err := parseNumericParameter[float32](
		query.Get("float32_test"),
		WithParse[float32](parseFloat32),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Param: "float32_test", Err: err}, nil)
		return
	}
	float64TestParam, err := parseNumericParameter[float64](
		query.Get("float64_test"),
		WithParse[float64](parseFloat64),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Param: "float64_test", Err: err}, nil)
		return
	}
	booleanTestParam, err := parseBoolParameter(
		query.Get("boolean_test"),
		WithParse[bool](parseBool),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Param: "boolean_test", Err: err}, nil)
		return
	}
	result, err := c.service.LoginUser(r.Context(), *usernameParam, *passwordParam, int32TestParam, int64TestParam, float32TestParam, float64TestParam, booleanTestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, result.Headers, w)
}

// LogoutUser - Logs out current logged in user session
func (c *UserAPIController) LogoutUser(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.LogoutUser(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, result.Headers, w)
}

// UpdateUser - Updated user
func (c *UserAPIController) UpdateUser(w http.ResponseWriter, r *http.Request) {
	usernameParam := getPointerOrNilIfEmpty(chi.URLParam(r, "username"))
	if usernameParam == nil {
		c.errorHandler(w, r, &RequiredError{"username"}, nil)
		return
	}
	userParam := &User{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(userParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertUserRequired(*userParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertUserConstraints(*userParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.UpdateUser(r.Context(), *usernameParam, *userParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, result.Headers, w)
}
