/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.8.0-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * _foo_get_default_response.h
 *
 * 
 */

#ifndef _foo_get_default_response_H_
#define _foo_get_default_response_H_



#include "Foo.h"
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  _foo_get_default_response 
{
public:
    _foo_get_default_response() = default;
    explicit _foo_get_default_response(boost::property_tree::ptree const& pt);
    virtual ~_foo_get_default_response() = default;

    _foo_get_default_response(const _foo_get_default_response& other) = default; // copy constructor
    _foo_get_default_response(_foo_get_default_response&& other) noexcept = default; // move constructor

    _foo_get_default_response& operator=(const _foo_get_default_response& other) = default; // copy assignment
    _foo_get_default_response& operator=(_foo_get_default_response&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// _foo_get_default_response members

    /// <summary>
    /// 
    /// </summary>
    Foo getString() const;
    void setString(Foo value);

protected:
    Foo m_string;
};

std::vector<_foo_get_default_response> create_foo_get_default_responseVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<_foo_get_default_response>(const _foo_get_default_response& val) {
    return val.toPropertyTree();
}

template<>
inline _foo_get_default_response fromPt<_foo_get_default_response>(const boost::property_tree::ptree& pt) {
    _foo_get_default_response ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* _foo_get_default_response_H_ */
