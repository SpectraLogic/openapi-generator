/*
 * rust test
 *
 * rust name mapping test
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */


use reqwest;
use serde::{Deserialize, Serialize};
use crate::{apis::ResponseContent, models};
use super::{Error, configuration};


/// struct for typed errors of method [`get_parameter_name_mapping`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum GetParameterNameMappingError {
    UnknownValue(serde_json::Value),
}


pub fn get_parameter_name_mapping(configuration: &configuration::Configuration, underscore_type: i64, r#type: &str, type_with_underscore: &str, dash_type: &str, http_debug_option: &str) -> Result<(), Error<GetParameterNameMappingError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/fake/parameter-name-mapping", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    local_var_req_builder = local_var_req_builder.query(&[("type", &r#type.to_string())]);
    local_var_req_builder = local_var_req_builder.query(&[("http_debug_option", &http_debug_option.to_string())]);
    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    local_var_req_builder = local_var_req_builder.header("_type", underscore_type.to_string());
    local_var_req_builder = local_var_req_builder.header("type_", type_with_underscore.to_string());
    local_var_req_builder = local_var_req_builder.header("-type", dash_type.to_string());

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req)?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text()?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        Ok(())
    } else {
        let local_var_entity: Option<GetParameterNameMappingError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

