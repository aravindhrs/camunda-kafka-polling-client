// Generated by delombok at Wed Jan 09 13:24:24 CET 2019
package de.viadee.camunda.kafka.event;

/**
 * <p>
 * ActivityInstanceEvent class.
 * </p>
 *
 * 
 * 
 * @author viadee
 * 
 * @version $Id: $Id
 */
public class ActivityInstanceEvent extends ScopeInstanceEvent {

    private String activityId;
    private String activityName;
    private String activityType;
    private String activityInstanceId;
    private int activityInstanceState;
    private String parentActivityInstanceId;
    private String calledProcessInstanceId;
    private String calledCaseInstanceId;
    private String taskId;
    private String taskAssignee;
    private String tenantId;

    @java.lang.SuppressWarnings("all")
    public String getActivityId() {
        return this.activityId;
    }

    @java.lang.SuppressWarnings("all")
    public String getActivityName() {
        return this.activityName;
    }

    @java.lang.SuppressWarnings("all")
    public String getActivityType() {
        return this.activityType;
    }

    @java.lang.SuppressWarnings("all")
    public String getActivityInstanceId() {
        return this.activityInstanceId;
    }

    @java.lang.SuppressWarnings("all")
    public int getActivityInstanceState() {
        return this.activityInstanceState;
    }

    @java.lang.SuppressWarnings("all")
    public String getParentActivityInstanceId() {
        return this.parentActivityInstanceId;
    }

    @java.lang.SuppressWarnings("all")
    public String getCalledProcessInstanceId() {
        return this.calledProcessInstanceId;
    }

    @java.lang.SuppressWarnings("all")
    public String getCalledCaseInstanceId() {
        return this.calledCaseInstanceId;
    }

    @java.lang.SuppressWarnings("all")
    public String getTaskId() {
        return this.taskId;
    }

    @java.lang.SuppressWarnings("all")
    public String getTaskAssignee() {
        return this.taskAssignee;
    }

    @java.lang.SuppressWarnings("all")
    public String getTenantId() {
        return this.tenantId;
    }

    @java.lang.SuppressWarnings("all")
    public void setActivityId(final String activityId) {
        this.activityId = activityId;
    }

    @java.lang.SuppressWarnings("all")
    public void setActivityName(final String activityName) {
        this.activityName = activityName;
    }

    @java.lang.SuppressWarnings("all")
    public void setActivityType(final String activityType) {
        this.activityType = activityType;
    }

    @java.lang.SuppressWarnings("all")
    public void setActivityInstanceId(final String activityInstanceId) {
        this.activityInstanceId = activityInstanceId;
    }

    @java.lang.SuppressWarnings("all")
    public void setActivityInstanceState(final int activityInstanceState) {
        this.activityInstanceState = activityInstanceState;
    }

    @java.lang.SuppressWarnings("all")
    public void setParentActivityInstanceId(final String parentActivityInstanceId) {
        this.parentActivityInstanceId = parentActivityInstanceId;
    }

    @java.lang.SuppressWarnings("all")
    public void setCalledProcessInstanceId(final String calledProcessInstanceId) {
        this.calledProcessInstanceId = calledProcessInstanceId;
    }

    @java.lang.SuppressWarnings("all")
    public void setCalledCaseInstanceId(final String calledCaseInstanceId) {
        this.calledCaseInstanceId = calledCaseInstanceId;
    }

    @java.lang.SuppressWarnings("all")
    public void setTaskId(final String taskId) {
        this.taskId = taskId;
    }

    @java.lang.SuppressWarnings("all")
    public void setTaskAssignee(final String taskAssignee) {
        this.taskAssignee = taskAssignee;
    }

    @java.lang.SuppressWarnings("all")
    public void setTenantId(final String tenantId) {
        this.tenantId = tenantId;
    }
}
