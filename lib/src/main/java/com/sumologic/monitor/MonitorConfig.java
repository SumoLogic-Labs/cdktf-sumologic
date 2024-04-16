package com.sumologic.monitor;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.114Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.monitor.MonitorConfig")
@software.amazon.jsii.Jsii.Proxy(MonitorConfig.Jsii$Proxy.class)
public interface MonitorConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#monitor_type Monitor#monitor_type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getMonitorType();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#name Monitor#name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#alert_name Monitor#alert_name}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAlertName() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#content_type Monitor#content_type}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getContentType() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#created_at Monitor#created_at}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCreatedAt() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#created_by Monitor#created_by}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCreatedBy() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#description Monitor#description}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#evaluation_delay Monitor#evaluation_delay}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getEvaluationDelay() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#group_notifications Monitor#group_notifications}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getGroupNotifications() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#id Monitor#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#is_disabled Monitor#is_disabled}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getIsDisabled() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#is_locked Monitor#is_locked}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getIsLocked() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#is_mutable Monitor#is_mutable}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getIsMutable() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#is_system Monitor#is_system}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getIsSystem() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#modified_at Monitor#modified_at}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getModifiedAt() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#modified_by Monitor#modified_by}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getModifiedBy() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#notification_group_fields Monitor#notification_group_fields}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getNotificationGroupFields() {
        return null;
    }

    /**
     * notifications block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#notifications Monitor#notifications}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getNotifications() {
        return null;
    }

    /**
     * obj_permission block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#obj_permission Monitor#obj_permission}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getObjPermission() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#parent_id Monitor#parent_id}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getParentId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#playbook Monitor#playbook}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPlaybook() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#post_request_map Monitor#post_request_map}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getPostRequestMap() {
        return null;
    }

    /**
     * queries block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#queries Monitor#queries}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getQueries() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#slo_id Monitor#slo_id}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSloId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#status Monitor#status}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getStatus() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#tags Monitor#tags}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#time_zone Monitor#time_zone}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTimeZone() {
        return null;
    }

    /**
     * trigger_conditions block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#trigger_conditions Monitor#trigger_conditions}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditions getTriggerConditions() {
        return null;
    }

    /**
     * triggers block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#triggers Monitor#triggers}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getTriggers() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#type Monitor#type}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#version Monitor#version}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getVersion() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MonitorConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MonitorConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MonitorConfig> {
        java.lang.String monitorType;
        java.lang.String name;
        java.lang.String alertName;
        java.lang.String contentType;
        java.lang.String createdAt;
        java.lang.String createdBy;
        java.lang.String description;
        java.lang.String evaluationDelay;
        java.lang.Object groupNotifications;
        java.lang.String id;
        java.lang.Object isDisabled;
        java.lang.Object isLocked;
        java.lang.Object isMutable;
        java.lang.Object isSystem;
        java.lang.String modifiedAt;
        java.lang.String modifiedBy;
        java.util.List<java.lang.String> notificationGroupFields;
        java.lang.Object notifications;
        java.lang.Object objPermission;
        java.lang.String parentId;
        java.lang.String playbook;
        java.util.Map<java.lang.String, java.lang.String> postRequestMap;
        java.lang.Object queries;
        java.lang.String sloId;
        java.util.List<java.lang.String> status;
        java.util.Map<java.lang.String, java.lang.String> tags;
        java.lang.String timeZone;
        com.sumologic.monitor.MonitorTriggerConditions triggerConditions;
        java.lang.Object triggers;
        java.lang.String type;
        java.lang.Number version;
        java.lang.Object connection;
        java.lang.Object count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link MonitorConfig#getMonitorType}
         * @param monitorType Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#monitor_type Monitor#monitor_type}. This parameter is required.
         * @return {@code this}
         */
        public Builder monitorType(java.lang.String monitorType) {
            this.monitorType = monitorType;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getName}
         * @param name Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#name Monitor#name}. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getAlertName}
         * @param alertName Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#alert_name Monitor#alert_name}.
         * @return {@code this}
         */
        public Builder alertName(java.lang.String alertName) {
            this.alertName = alertName;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getContentType}
         * @param contentType Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#content_type Monitor#content_type}.
         * @return {@code this}
         */
        public Builder contentType(java.lang.String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getCreatedAt}
         * @param createdAt Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#created_at Monitor#created_at}.
         * @return {@code this}
         */
        public Builder createdAt(java.lang.String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getCreatedBy}
         * @param createdBy Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#created_by Monitor#created_by}.
         * @return {@code this}
         */
        public Builder createdBy(java.lang.String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getDescription}
         * @param description Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#description Monitor#description}.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getEvaluationDelay}
         * @param evaluationDelay Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#evaluation_delay Monitor#evaluation_delay}.
         * @return {@code this}
         */
        public Builder evaluationDelay(java.lang.String evaluationDelay) {
            this.evaluationDelay = evaluationDelay;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getGroupNotifications}
         * @param groupNotifications Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#group_notifications Monitor#group_notifications}.
         * @return {@code this}
         */
        public Builder groupNotifications(java.lang.Boolean groupNotifications) {
            this.groupNotifications = groupNotifications;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getGroupNotifications}
         * @param groupNotifications Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#group_notifications Monitor#group_notifications}.
         * @return {@code this}
         */
        public Builder groupNotifications(com.hashicorp.cdktf.IResolvable groupNotifications) {
            this.groupNotifications = groupNotifications;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#id Monitor#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getIsDisabled}
         * @param isDisabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#is_disabled Monitor#is_disabled}.
         * @return {@code this}
         */
        public Builder isDisabled(java.lang.Boolean isDisabled) {
            this.isDisabled = isDisabled;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getIsDisabled}
         * @param isDisabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#is_disabled Monitor#is_disabled}.
         * @return {@code this}
         */
        public Builder isDisabled(com.hashicorp.cdktf.IResolvable isDisabled) {
            this.isDisabled = isDisabled;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getIsLocked}
         * @param isLocked Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#is_locked Monitor#is_locked}.
         * @return {@code this}
         */
        public Builder isLocked(java.lang.Boolean isLocked) {
            this.isLocked = isLocked;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getIsLocked}
         * @param isLocked Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#is_locked Monitor#is_locked}.
         * @return {@code this}
         */
        public Builder isLocked(com.hashicorp.cdktf.IResolvable isLocked) {
            this.isLocked = isLocked;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getIsMutable}
         * @param isMutable Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#is_mutable Monitor#is_mutable}.
         * @return {@code this}
         */
        public Builder isMutable(java.lang.Boolean isMutable) {
            this.isMutable = isMutable;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getIsMutable}
         * @param isMutable Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#is_mutable Monitor#is_mutable}.
         * @return {@code this}
         */
        public Builder isMutable(com.hashicorp.cdktf.IResolvable isMutable) {
            this.isMutable = isMutable;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getIsSystem}
         * @param isSystem Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#is_system Monitor#is_system}.
         * @return {@code this}
         */
        public Builder isSystem(java.lang.Boolean isSystem) {
            this.isSystem = isSystem;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getIsSystem}
         * @param isSystem Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#is_system Monitor#is_system}.
         * @return {@code this}
         */
        public Builder isSystem(com.hashicorp.cdktf.IResolvable isSystem) {
            this.isSystem = isSystem;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getModifiedAt}
         * @param modifiedAt Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#modified_at Monitor#modified_at}.
         * @return {@code this}
         */
        public Builder modifiedAt(java.lang.String modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getModifiedBy}
         * @param modifiedBy Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#modified_by Monitor#modified_by}.
         * @return {@code this}
         */
        public Builder modifiedBy(java.lang.String modifiedBy) {
            this.modifiedBy = modifiedBy;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getNotificationGroupFields}
         * @param notificationGroupFields Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#notification_group_fields Monitor#notification_group_fields}.
         * @return {@code this}
         */
        public Builder notificationGroupFields(java.util.List<java.lang.String> notificationGroupFields) {
            this.notificationGroupFields = notificationGroupFields;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getNotifications}
         * @param notifications notifications block.
         *                      Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#notifications Monitor#notifications}
         * @return {@code this}
         */
        public Builder notifications(com.hashicorp.cdktf.IResolvable notifications) {
            this.notifications = notifications;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getNotifications}
         * @param notifications notifications block.
         *                      Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#notifications Monitor#notifications}
         * @return {@code this}
         */
        public Builder notifications(java.util.List<? extends com.sumologic.monitor.MonitorNotifications> notifications) {
            this.notifications = notifications;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getObjPermission}
         * @param objPermission obj_permission block.
         *                      Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#obj_permission Monitor#obj_permission}
         * @return {@code this}
         */
        public Builder objPermission(com.hashicorp.cdktf.IResolvable objPermission) {
            this.objPermission = objPermission;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getObjPermission}
         * @param objPermission obj_permission block.
         *                      Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#obj_permission Monitor#obj_permission}
         * @return {@code this}
         */
        public Builder objPermission(java.util.List<? extends com.sumologic.monitor.MonitorObjPermission> objPermission) {
            this.objPermission = objPermission;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getParentId}
         * @param parentId Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#parent_id Monitor#parent_id}.
         * @return {@code this}
         */
        public Builder parentId(java.lang.String parentId) {
            this.parentId = parentId;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getPlaybook}
         * @param playbook Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#playbook Monitor#playbook}.
         * @return {@code this}
         */
        public Builder playbook(java.lang.String playbook) {
            this.playbook = playbook;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getPostRequestMap}
         * @param postRequestMap Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#post_request_map Monitor#post_request_map}.
         * @return {@code this}
         */
        public Builder postRequestMap(java.util.Map<java.lang.String, java.lang.String> postRequestMap) {
            this.postRequestMap = postRequestMap;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getQueries}
         * @param queries queries block.
         *                Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#queries Monitor#queries}
         * @return {@code this}
         */
        public Builder queries(com.hashicorp.cdktf.IResolvable queries) {
            this.queries = queries;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getQueries}
         * @param queries queries block.
         *                Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#queries Monitor#queries}
         * @return {@code this}
         */
        public Builder queries(java.util.List<? extends com.sumologic.monitor.MonitorQueries> queries) {
            this.queries = queries;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getSloId}
         * @param sloId Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#slo_id Monitor#slo_id}.
         * @return {@code this}
         */
        public Builder sloId(java.lang.String sloId) {
            this.sloId = sloId;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getStatus}
         * @param status Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#status Monitor#status}.
         * @return {@code this}
         */
        public Builder status(java.util.List<java.lang.String> status) {
            this.status = status;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getTags}
         * @param tags Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#tags Monitor#tags}.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getTimeZone}
         * @param timeZone Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#time_zone Monitor#time_zone}.
         * @return {@code this}
         */
        public Builder timeZone(java.lang.String timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getTriggerConditions}
         * @param triggerConditions trigger_conditions block.
         *                          Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#trigger_conditions Monitor#trigger_conditions}
         * @return {@code this}
         */
        public Builder triggerConditions(com.sumologic.monitor.MonitorTriggerConditions triggerConditions) {
            this.triggerConditions = triggerConditions;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getTriggers}
         * @param triggers triggers block.
         *                 Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#triggers Monitor#triggers}
         * @return {@code this}
         */
        public Builder triggers(com.hashicorp.cdktf.IResolvable triggers) {
            this.triggers = triggers;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getTriggers}
         * @param triggers triggers block.
         *                 Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#triggers Monitor#triggers}
         * @return {@code this}
         */
        public Builder triggers(java.util.List<? extends com.sumologic.monitor.MonitorTriggers> triggers) {
            this.triggers = triggers;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getType}
         * @param type Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#type Monitor#type}.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getVersion}
         * @param version Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#version Monitor#version}.
         * @return {@code this}
         */
        public Builder version(java.lang.Number version) {
            this.version = version;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(com.hashicorp.cdktf.TerraformCount count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link MonitorConfig#getProvisioners}
         * @param provisioners the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder provisioners(java.util.List<? extends java.lang.Object> provisioners) {
            this.provisioners = (java.util.List<java.lang.Object>)provisioners;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MonitorConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MonitorConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MonitorConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MonitorConfig {
        private final java.lang.String monitorType;
        private final java.lang.String name;
        private final java.lang.String alertName;
        private final java.lang.String contentType;
        private final java.lang.String createdAt;
        private final java.lang.String createdBy;
        private final java.lang.String description;
        private final java.lang.String evaluationDelay;
        private final java.lang.Object groupNotifications;
        private final java.lang.String id;
        private final java.lang.Object isDisabled;
        private final java.lang.Object isLocked;
        private final java.lang.Object isMutable;
        private final java.lang.Object isSystem;
        private final java.lang.String modifiedAt;
        private final java.lang.String modifiedBy;
        private final java.util.List<java.lang.String> notificationGroupFields;
        private final java.lang.Object notifications;
        private final java.lang.Object objPermission;
        private final java.lang.String parentId;
        private final java.lang.String playbook;
        private final java.util.Map<java.lang.String, java.lang.String> postRequestMap;
        private final java.lang.Object queries;
        private final java.lang.String sloId;
        private final java.util.List<java.lang.String> status;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.String timeZone;
        private final com.sumologic.monitor.MonitorTriggerConditions triggerConditions;
        private final java.lang.Object triggers;
        private final java.lang.String type;
        private final java.lang.Number version;
        private final java.lang.Object connection;
        private final java.lang.Object count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.ITerraformIterator forEach;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;
        private final java.util.List<java.lang.Object> provisioners;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.monitorType = software.amazon.jsii.Kernel.get(this, "monitorType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.alertName = software.amazon.jsii.Kernel.get(this, "alertName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.contentType = software.amazon.jsii.Kernel.get(this, "contentType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.createdAt = software.amazon.jsii.Kernel.get(this, "createdAt", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.createdBy = software.amazon.jsii.Kernel.get(this, "createdBy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.evaluationDelay = software.amazon.jsii.Kernel.get(this, "evaluationDelay", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.groupNotifications = software.amazon.jsii.Kernel.get(this, "groupNotifications", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.isDisabled = software.amazon.jsii.Kernel.get(this, "isDisabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.isLocked = software.amazon.jsii.Kernel.get(this, "isLocked", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.isMutable = software.amazon.jsii.Kernel.get(this, "isMutable", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.isSystem = software.amazon.jsii.Kernel.get(this, "isSystem", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.modifiedAt = software.amazon.jsii.Kernel.get(this, "modifiedAt", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.modifiedBy = software.amazon.jsii.Kernel.get(this, "modifiedBy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.notificationGroupFields = software.amazon.jsii.Kernel.get(this, "notificationGroupFields", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.notifications = software.amazon.jsii.Kernel.get(this, "notifications", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.objPermission = software.amazon.jsii.Kernel.get(this, "objPermission", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.parentId = software.amazon.jsii.Kernel.get(this, "parentId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.playbook = software.amazon.jsii.Kernel.get(this, "playbook", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.postRequestMap = software.amazon.jsii.Kernel.get(this, "postRequestMap", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.queries = software.amazon.jsii.Kernel.get(this, "queries", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.sloId = software.amazon.jsii.Kernel.get(this, "sloId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.status = software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeZone = software.amazon.jsii.Kernel.get(this, "timeZone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.triggerConditions = software.amazon.jsii.Kernel.get(this, "triggerConditions", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditions.class));
            this.triggers = software.amazon.jsii.Kernel.get(this, "triggers", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.version = software.amazon.jsii.Kernel.get(this, "version", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.connection = software.amazon.jsii.Kernel.get(this, "connection", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.forEach = software.amazon.jsii.Kernel.get(this, "forEach", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformIterator.class));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
            this.provisioners = software.amazon.jsii.Kernel.get(this, "provisioners", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.monitorType = java.util.Objects.requireNonNull(builder.monitorType, "monitorType is required");
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.alertName = builder.alertName;
            this.contentType = builder.contentType;
            this.createdAt = builder.createdAt;
            this.createdBy = builder.createdBy;
            this.description = builder.description;
            this.evaluationDelay = builder.evaluationDelay;
            this.groupNotifications = builder.groupNotifications;
            this.id = builder.id;
            this.isDisabled = builder.isDisabled;
            this.isLocked = builder.isLocked;
            this.isMutable = builder.isMutable;
            this.isSystem = builder.isSystem;
            this.modifiedAt = builder.modifiedAt;
            this.modifiedBy = builder.modifiedBy;
            this.notificationGroupFields = builder.notificationGroupFields;
            this.notifications = builder.notifications;
            this.objPermission = builder.objPermission;
            this.parentId = builder.parentId;
            this.playbook = builder.playbook;
            this.postRequestMap = builder.postRequestMap;
            this.queries = builder.queries;
            this.sloId = builder.sloId;
            this.status = builder.status;
            this.tags = builder.tags;
            this.timeZone = builder.timeZone;
            this.triggerConditions = builder.triggerConditions;
            this.triggers = builder.triggers;
            this.type = builder.type;
            this.version = builder.version;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.String getMonitorType() {
            return this.monitorType;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getAlertName() {
            return this.alertName;
        }

        @Override
        public final java.lang.String getContentType() {
            return this.contentType;
        }

        @Override
        public final java.lang.String getCreatedAt() {
            return this.createdAt;
        }

        @Override
        public final java.lang.String getCreatedBy() {
            return this.createdBy;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.lang.String getEvaluationDelay() {
            return this.evaluationDelay;
        }

        @Override
        public final java.lang.Object getGroupNotifications() {
            return this.groupNotifications;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.Object getIsDisabled() {
            return this.isDisabled;
        }

        @Override
        public final java.lang.Object getIsLocked() {
            return this.isLocked;
        }

        @Override
        public final java.lang.Object getIsMutable() {
            return this.isMutable;
        }

        @Override
        public final java.lang.Object getIsSystem() {
            return this.isSystem;
        }

        @Override
        public final java.lang.String getModifiedAt() {
            return this.modifiedAt;
        }

        @Override
        public final java.lang.String getModifiedBy() {
            return this.modifiedBy;
        }

        @Override
        public final java.util.List<java.lang.String> getNotificationGroupFields() {
            return this.notificationGroupFields;
        }

        @Override
        public final java.lang.Object getNotifications() {
            return this.notifications;
        }

        @Override
        public final java.lang.Object getObjPermission() {
            return this.objPermission;
        }

        @Override
        public final java.lang.String getParentId() {
            return this.parentId;
        }

        @Override
        public final java.lang.String getPlaybook() {
            return this.playbook;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getPostRequestMap() {
            return this.postRequestMap;
        }

        @Override
        public final java.lang.Object getQueries() {
            return this.queries;
        }

        @Override
        public final java.lang.String getSloId() {
            return this.sloId;
        }

        @Override
        public final java.util.List<java.lang.String> getStatus() {
            return this.status;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.String getTimeZone() {
            return this.timeZone;
        }

        @Override
        public final com.sumologic.monitor.MonitorTriggerConditions getTriggerConditions() {
            return this.triggerConditions;
        }

        @Override
        public final java.lang.Object getTriggers() {
            return this.triggers;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.Number getVersion() {
            return this.version;
        }

        @Override
        public final java.lang.Object getConnection() {
            return this.connection;
        }

        @Override
        public final java.lang.Object getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.ITerraformIterator getForEach() {
            return this.forEach;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        public final java.util.List<java.lang.Object> getProvisioners() {
            return this.provisioners;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("monitorType", om.valueToTree(this.getMonitorType()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getAlertName() != null) {
                data.set("alertName", om.valueToTree(this.getAlertName()));
            }
            if (this.getContentType() != null) {
                data.set("contentType", om.valueToTree(this.getContentType()));
            }
            if (this.getCreatedAt() != null) {
                data.set("createdAt", om.valueToTree(this.getCreatedAt()));
            }
            if (this.getCreatedBy() != null) {
                data.set("createdBy", om.valueToTree(this.getCreatedBy()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getEvaluationDelay() != null) {
                data.set("evaluationDelay", om.valueToTree(this.getEvaluationDelay()));
            }
            if (this.getGroupNotifications() != null) {
                data.set("groupNotifications", om.valueToTree(this.getGroupNotifications()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getIsDisabled() != null) {
                data.set("isDisabled", om.valueToTree(this.getIsDisabled()));
            }
            if (this.getIsLocked() != null) {
                data.set("isLocked", om.valueToTree(this.getIsLocked()));
            }
            if (this.getIsMutable() != null) {
                data.set("isMutable", om.valueToTree(this.getIsMutable()));
            }
            if (this.getIsSystem() != null) {
                data.set("isSystem", om.valueToTree(this.getIsSystem()));
            }
            if (this.getModifiedAt() != null) {
                data.set("modifiedAt", om.valueToTree(this.getModifiedAt()));
            }
            if (this.getModifiedBy() != null) {
                data.set("modifiedBy", om.valueToTree(this.getModifiedBy()));
            }
            if (this.getNotificationGroupFields() != null) {
                data.set("notificationGroupFields", om.valueToTree(this.getNotificationGroupFields()));
            }
            if (this.getNotifications() != null) {
                data.set("notifications", om.valueToTree(this.getNotifications()));
            }
            if (this.getObjPermission() != null) {
                data.set("objPermission", om.valueToTree(this.getObjPermission()));
            }
            if (this.getParentId() != null) {
                data.set("parentId", om.valueToTree(this.getParentId()));
            }
            if (this.getPlaybook() != null) {
                data.set("playbook", om.valueToTree(this.getPlaybook()));
            }
            if (this.getPostRequestMap() != null) {
                data.set("postRequestMap", om.valueToTree(this.getPostRequestMap()));
            }
            if (this.getQueries() != null) {
                data.set("queries", om.valueToTree(this.getQueries()));
            }
            if (this.getSloId() != null) {
                data.set("sloId", om.valueToTree(this.getSloId()));
            }
            if (this.getStatus() != null) {
                data.set("status", om.valueToTree(this.getStatus()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTimeZone() != null) {
                data.set("timeZone", om.valueToTree(this.getTimeZone()));
            }
            if (this.getTriggerConditions() != null) {
                data.set("triggerConditions", om.valueToTree(this.getTriggerConditions()));
            }
            if (this.getTriggers() != null) {
                data.set("triggers", om.valueToTree(this.getTriggers()));
            }
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }
            if (this.getVersion() != null) {
                data.set("version", om.valueToTree(this.getVersion()));
            }
            if (this.getConnection() != null) {
                data.set("connection", om.valueToTree(this.getConnection()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getForEach() != null) {
                data.set("forEach", om.valueToTree(this.getForEach()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }
            if (this.getProvisioners() != null) {
                data.set("provisioners", om.valueToTree(this.getProvisioners()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.monitor.MonitorConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MonitorConfig.Jsii$Proxy that = (MonitorConfig.Jsii$Proxy) o;

            if (!monitorType.equals(that.monitorType)) return false;
            if (!name.equals(that.name)) return false;
            if (this.alertName != null ? !this.alertName.equals(that.alertName) : that.alertName != null) return false;
            if (this.contentType != null ? !this.contentType.equals(that.contentType) : that.contentType != null) return false;
            if (this.createdAt != null ? !this.createdAt.equals(that.createdAt) : that.createdAt != null) return false;
            if (this.createdBy != null ? !this.createdBy.equals(that.createdBy) : that.createdBy != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.evaluationDelay != null ? !this.evaluationDelay.equals(that.evaluationDelay) : that.evaluationDelay != null) return false;
            if (this.groupNotifications != null ? !this.groupNotifications.equals(that.groupNotifications) : that.groupNotifications != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.isDisabled != null ? !this.isDisabled.equals(that.isDisabled) : that.isDisabled != null) return false;
            if (this.isLocked != null ? !this.isLocked.equals(that.isLocked) : that.isLocked != null) return false;
            if (this.isMutable != null ? !this.isMutable.equals(that.isMutable) : that.isMutable != null) return false;
            if (this.isSystem != null ? !this.isSystem.equals(that.isSystem) : that.isSystem != null) return false;
            if (this.modifiedAt != null ? !this.modifiedAt.equals(that.modifiedAt) : that.modifiedAt != null) return false;
            if (this.modifiedBy != null ? !this.modifiedBy.equals(that.modifiedBy) : that.modifiedBy != null) return false;
            if (this.notificationGroupFields != null ? !this.notificationGroupFields.equals(that.notificationGroupFields) : that.notificationGroupFields != null) return false;
            if (this.notifications != null ? !this.notifications.equals(that.notifications) : that.notifications != null) return false;
            if (this.objPermission != null ? !this.objPermission.equals(that.objPermission) : that.objPermission != null) return false;
            if (this.parentId != null ? !this.parentId.equals(that.parentId) : that.parentId != null) return false;
            if (this.playbook != null ? !this.playbook.equals(that.playbook) : that.playbook != null) return false;
            if (this.postRequestMap != null ? !this.postRequestMap.equals(that.postRequestMap) : that.postRequestMap != null) return false;
            if (this.queries != null ? !this.queries.equals(that.queries) : that.queries != null) return false;
            if (this.sloId != null ? !this.sloId.equals(that.sloId) : that.sloId != null) return false;
            if (this.status != null ? !this.status.equals(that.status) : that.status != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.timeZone != null ? !this.timeZone.equals(that.timeZone) : that.timeZone != null) return false;
            if (this.triggerConditions != null ? !this.triggerConditions.equals(that.triggerConditions) : that.triggerConditions != null) return false;
            if (this.triggers != null ? !this.triggers.equals(that.triggers) : that.triggers != null) return false;
            if (this.type != null ? !this.type.equals(that.type) : that.type != null) return false;
            if (this.version != null ? !this.version.equals(that.version) : that.version != null) return false;
            if (this.connection != null ? !this.connection.equals(that.connection) : that.connection != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.forEach != null ? !this.forEach.equals(that.forEach) : that.forEach != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            if (this.provider != null ? !this.provider.equals(that.provider) : that.provider != null) return false;
            return this.provisioners != null ? this.provisioners.equals(that.provisioners) : that.provisioners == null;
        }

        @Override
        public final int hashCode() {
            int result = this.monitorType.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.alertName != null ? this.alertName.hashCode() : 0);
            result = 31 * result + (this.contentType != null ? this.contentType.hashCode() : 0);
            result = 31 * result + (this.createdAt != null ? this.createdAt.hashCode() : 0);
            result = 31 * result + (this.createdBy != null ? this.createdBy.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.evaluationDelay != null ? this.evaluationDelay.hashCode() : 0);
            result = 31 * result + (this.groupNotifications != null ? this.groupNotifications.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.isDisabled != null ? this.isDisabled.hashCode() : 0);
            result = 31 * result + (this.isLocked != null ? this.isLocked.hashCode() : 0);
            result = 31 * result + (this.isMutable != null ? this.isMutable.hashCode() : 0);
            result = 31 * result + (this.isSystem != null ? this.isSystem.hashCode() : 0);
            result = 31 * result + (this.modifiedAt != null ? this.modifiedAt.hashCode() : 0);
            result = 31 * result + (this.modifiedBy != null ? this.modifiedBy.hashCode() : 0);
            result = 31 * result + (this.notificationGroupFields != null ? this.notificationGroupFields.hashCode() : 0);
            result = 31 * result + (this.notifications != null ? this.notifications.hashCode() : 0);
            result = 31 * result + (this.objPermission != null ? this.objPermission.hashCode() : 0);
            result = 31 * result + (this.parentId != null ? this.parentId.hashCode() : 0);
            result = 31 * result + (this.playbook != null ? this.playbook.hashCode() : 0);
            result = 31 * result + (this.postRequestMap != null ? this.postRequestMap.hashCode() : 0);
            result = 31 * result + (this.queries != null ? this.queries.hashCode() : 0);
            result = 31 * result + (this.sloId != null ? this.sloId.hashCode() : 0);
            result = 31 * result + (this.status != null ? this.status.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.timeZone != null ? this.timeZone.hashCode() : 0);
            result = 31 * result + (this.triggerConditions != null ? this.triggerConditions.hashCode() : 0);
            result = 31 * result + (this.triggers != null ? this.triggers.hashCode() : 0);
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            result = 31 * result + (this.version != null ? this.version.hashCode() : 0);
            result = 31 * result + (this.connection != null ? this.connection.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.forEach != null ? this.forEach.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            result = 31 * result + (this.provisioners != null ? this.provisioners.hashCode() : 0);
            return result;
        }
    }
}
