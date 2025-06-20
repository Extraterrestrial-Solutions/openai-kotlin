package com.aallam.openai.api.responses

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** Reference to a prompt template and its variables.
 *  [OpenAI API](https://platform.openai.com/docs/api-reference/responses/create#responses-create-prompt)
 **/
@Serializable
public data class Prompt(
    /**
     * The unique identifier of the prompt template to use.
     */
    @SerialName("id") val id: String,

    /**
     * Optional map of values to substitute in for variables in your prompt. The substitution values can either be strings, or other Response input types like images or files.
     */
    @SerialName("variables") val variables: Map<String, String>? = null,

    /**
     * Optional version of the prompt template.
     */
    @SerialName("version") val version: String? = null,
)
