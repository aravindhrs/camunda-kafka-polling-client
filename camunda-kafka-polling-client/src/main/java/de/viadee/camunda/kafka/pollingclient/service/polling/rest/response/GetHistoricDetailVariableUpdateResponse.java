// Generated by delombok at Fri Jan 04 11:18:40 CET 2019
package de.viadee.camunda.kafka.pollingclient.service.polling.rest.response;

import java.util.Date;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.lang3.StringUtils;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Response structure of Camunda REST API <code>GET /history/detail for type=variableUpdate</code>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetHistoricDetailVariableUpdateResponse {
    private String id;
    private String type;
    private String processDefinitionKey;
    private String processDefinitionId;
    private String processInstanceId;
    private String activityInstanceId;
    private String executionId;
    private String caseDefinitionKey;
    private String caseDefinitionId;
    private String caseInstanceId;
    private String caseExecutionId;
    private String taskId;
    private String tenantId;
    private Date time;
    private String variableName;
    private String variableInstanceId;
    private String variableType;
    private Object value;
    private Object valueInfo;
    private Long revision;
    private String errorMessage;

    /**
     * If {@link #valueInfo} is available as Map-Data, retrieve value of given key as String.
     */
    public String getValueInfoEntry(String key) {
        return valueInfo instanceof Map ? StringUtils.trimToNull(Objects.toString(((Map) valueInfo).get(key), null)) : null;
    }

    @java.lang.SuppressWarnings("all")
    public String getId() {
        return this.id;
    }

    @java.lang.SuppressWarnings("all")
    public String getType() {
        return this.type;
    }

    @java.lang.SuppressWarnings("all")
    public String getProcessDefinitionKey() {
        return this.processDefinitionKey;
    }

    @java.lang.SuppressWarnings("all")
    public String getProcessDefinitionId() {
        return this.processDefinitionId;
    }

    @java.lang.SuppressWarnings("all")
    public String getProcessInstanceId() {
        return this.processInstanceId;
    }

    @java.lang.SuppressWarnings("all")
    public String getActivityInstanceId() {
        return this.activityInstanceId;
    }

    @java.lang.SuppressWarnings("all")
    public String getExecutionId() {
        return this.executionId;
    }

    @java.lang.SuppressWarnings("all")
    public String getCaseDefinitionKey() {
        return this.caseDefinitionKey;
    }

    @java.lang.SuppressWarnings("all")
    public String getCaseDefinitionId() {
        return this.caseDefinitionId;
    }

    @java.lang.SuppressWarnings("all")
    public String getCaseInstanceId() {
        return this.caseInstanceId;
    }

    @java.lang.SuppressWarnings("all")
    public String getCaseExecutionId() {
        return this.caseExecutionId;
    }

    @java.lang.SuppressWarnings("all")
    public String getTaskId() {
        return this.taskId;
    }

    @java.lang.SuppressWarnings("all")
    public String getTenantId() {
        return this.tenantId;
    }

    @java.lang.SuppressWarnings("all")
    public Date getTime() {
        return this.time;
    }

    @java.lang.SuppressWarnings("all")
    public String getVariableName() {
        return this.variableName;
    }

    @java.lang.SuppressWarnings("all")
    public String getVariableInstanceId() {
        return this.variableInstanceId;
    }

    @java.lang.SuppressWarnings("all")
    public String getVariableType() {
        return this.variableType;
    }

    @java.lang.SuppressWarnings("all")
    public Object getValue() {
        return this.value;
    }

    @java.lang.SuppressWarnings("all")
    public Object getValueInfo() {
        return this.valueInfo;
    }

    @java.lang.SuppressWarnings("all")
    public Long getRevision() {
        return this.revision;
    }

    @java.lang.SuppressWarnings("all")
    public String getErrorMessage() {
        return this.errorMessage;
    }

    @java.lang.SuppressWarnings("all")
    public void setId(final String id) {
        this.id = id;
    }

    @java.lang.SuppressWarnings("all")
    public void setType(final String type) {
        this.type = type;
    }

    @java.lang.SuppressWarnings("all")
    public void setProcessDefinitionKey(final String processDefinitionKey) {
        this.processDefinitionKey = processDefinitionKey;
    }

    @java.lang.SuppressWarnings("all")
    public void setProcessDefinitionId(final String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
    }

    @java.lang.SuppressWarnings("all")
    public void setProcessInstanceId(final String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    @java.lang.SuppressWarnings("all")
    public void setActivityInstanceId(final String activityInstanceId) {
        this.activityInstanceId = activityInstanceId;
    }

    @java.lang.SuppressWarnings("all")
    public void setExecutionId(final String executionId) {
        this.executionId = executionId;
    }

    @java.lang.SuppressWarnings("all")
    public void setCaseDefinitionKey(final String caseDefinitionKey) {
        this.caseDefinitionKey = caseDefinitionKey;
    }

    @java.lang.SuppressWarnings("all")
    public void setCaseDefinitionId(final String caseDefinitionId) {
        this.caseDefinitionId = caseDefinitionId;
    }

    @java.lang.SuppressWarnings("all")
    public void setCaseInstanceId(final String caseInstanceId) {
        this.caseInstanceId = caseInstanceId;
    }

    @java.lang.SuppressWarnings("all")
    public void setCaseExecutionId(final String caseExecutionId) {
        this.caseExecutionId = caseExecutionId;
    }

    @java.lang.SuppressWarnings("all")
    public void setTaskId(final String taskId) {
        this.taskId = taskId;
    }

    @java.lang.SuppressWarnings("all")
    public void setTenantId(final String tenantId) {
        this.tenantId = tenantId;
    }

    @java.lang.SuppressWarnings("all")
    public void setTime(final Date time) {
        this.time = time;
    }

    @java.lang.SuppressWarnings("all")
    public void setVariableName(final String variableName) {
        this.variableName = variableName;
    }

    @java.lang.SuppressWarnings("all")
    public void setVariableInstanceId(final String variableInstanceId) {
        this.variableInstanceId = variableInstanceId;
    }

    @java.lang.SuppressWarnings("all")
    public void setVariableType(final String variableType) {
        this.variableType = variableType;
    }

    @java.lang.SuppressWarnings("all")
    public void setValue(final Object value) {
        this.value = value;
    }

    @java.lang.SuppressWarnings("all")
    public void setValueInfo(final Object valueInfo) {
        this.valueInfo = valueInfo;
    }

    @java.lang.SuppressWarnings("all")
    public void setRevision(final Long revision) {
        this.revision = revision;
    }

    @java.lang.SuppressWarnings("all")
    public void setErrorMessage(final String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
