package com.sumologic.monitor;

/**
 * Represents a {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor sumologic_monitor}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.112Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.monitor.Monitor")
public class Monitor extends com.hashicorp.cdktf.TerraformResource {

    protected Monitor(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Monitor(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(com.sumologic.monitor.Monitor.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor sumologic_monitor} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public Monitor(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    /**
     * Generates CDKTF code for importing a Monitor resource upon running "cdktf plan <stack-name>".
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param importToId The construct id used in the generated config for the Monitor to import. This parameter is required.
     * @param importFromId The id of the existing Monitor that should be imported. This parameter is required.
     * @param provider ? Optional instance of the provider where the Monitor to import is found.
     */
    public static @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.ImportableResource generateConfigForImport(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String importToId, final @org.jetbrains.annotations.NotNull java.lang.String importFromId, final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.TerraformProvider provider) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(com.sumologic.monitor.Monitor.class, "generateConfigForImport", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ImportableResource.class), new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(importToId, "importToId is required"), java.util.Objects.requireNonNull(importFromId, "importFromId is required"), provider });
    }

    /**
     * Generates CDKTF code for importing a Monitor resource upon running "cdktf plan <stack-name>".
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param importToId The construct id used in the generated config for the Monitor to import. This parameter is required.
     * @param importFromId The id of the existing Monitor that should be imported. This parameter is required.
     */
    public static @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.ImportableResource generateConfigForImport(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String importToId, final @org.jetbrains.annotations.NotNull java.lang.String importFromId) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(com.sumologic.monitor.Monitor.class, "generateConfigForImport", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ImportableResource.class), new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(importToId, "importToId is required"), java.util.Objects.requireNonNull(importFromId, "importFromId is required") });
    }

    public void putNotifications(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        if (software.amazon.jsii.Configuration.getRuntimeTypeChecking()) {
            if (
                 !(value instanceof com.hashicorp.cdktf.IResolvable)
                && !(value instanceof java.util.List)
                && !(value.getClass().equals(software.amazon.jsii.JsiiObject.class))
            ) {
                throw new IllegalArgumentException(
                    new java.lang.StringBuilder("Expected ")
                        .append("value")
                        .append(" to be one of: com.hashicorp.cdktf.IResolvable, java.util.List<com.sumologic.monitor.MonitorNotifications>; received ")
                        .append(value.getClass()).toString());
            }
            if (value instanceof java.util.List) {
                @SuppressWarnings("unchecked")
                final java.util.List<com.sumologic.monitor.MonitorNotifications> __cast_cd4240 = (java.util.List<com.sumologic.monitor.MonitorNotifications>)value;
                for (int __idx_ac66f0 = 0; __idx_ac66f0 < __cast_cd4240.size(); __idx_ac66f0++) {
                    final com.sumologic.monitor.MonitorNotifications __val_ac66f0 = __cast_cd4240.get(__idx_ac66f0);
                }
            }
        }
        software.amazon.jsii.Kernel.call(this, "putNotifications", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putObjPermission(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        if (software.amazon.jsii.Configuration.getRuntimeTypeChecking()) {
            if (
                 !(value instanceof com.hashicorp.cdktf.IResolvable)
                && !(value instanceof java.util.List)
                && !(value.getClass().equals(software.amazon.jsii.JsiiObject.class))
            ) {
                throw new IllegalArgumentException(
                    new java.lang.StringBuilder("Expected ")
                        .append("value")
                        .append(" to be one of: com.hashicorp.cdktf.IResolvable, java.util.List<com.sumologic.monitor.MonitorObjPermission>; received ")
                        .append(value.getClass()).toString());
            }
            if (value instanceof java.util.List) {
                @SuppressWarnings("unchecked")
                final java.util.List<com.sumologic.monitor.MonitorObjPermission> __cast_cd4240 = (java.util.List<com.sumologic.monitor.MonitorObjPermission>)value;
                for (int __idx_ac66f0 = 0; __idx_ac66f0 < __cast_cd4240.size(); __idx_ac66f0++) {
                    final com.sumologic.monitor.MonitorObjPermission __val_ac66f0 = __cast_cd4240.get(__idx_ac66f0);
                }
            }
        }
        software.amazon.jsii.Kernel.call(this, "putObjPermission", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putQueries(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        if (software.amazon.jsii.Configuration.getRuntimeTypeChecking()) {
            if (
                 !(value instanceof com.hashicorp.cdktf.IResolvable)
                && !(value instanceof java.util.List)
                && !(value.getClass().equals(software.amazon.jsii.JsiiObject.class))
            ) {
                throw new IllegalArgumentException(
                    new java.lang.StringBuilder("Expected ")
                        .append("value")
                        .append(" to be one of: com.hashicorp.cdktf.IResolvable, java.util.List<com.sumologic.monitor.MonitorQueries>; received ")
                        .append(value.getClass()).toString());
            }
            if (value instanceof java.util.List) {
                @SuppressWarnings("unchecked")
                final java.util.List<com.sumologic.monitor.MonitorQueries> __cast_cd4240 = (java.util.List<com.sumologic.monitor.MonitorQueries>)value;
                for (int __idx_ac66f0 = 0; __idx_ac66f0 < __cast_cd4240.size(); __idx_ac66f0++) {
                    final com.sumologic.monitor.MonitorQueries __val_ac66f0 = __cast_cd4240.get(__idx_ac66f0);
                }
            }
        }
        software.amazon.jsii.Kernel.call(this, "putQueries", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTriggerConditions(final @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditions value) {
        software.amazon.jsii.Kernel.call(this, "putTriggerConditions", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTriggers(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        if (software.amazon.jsii.Configuration.getRuntimeTypeChecking()) {
            if (
                 !(value instanceof com.hashicorp.cdktf.IResolvable)
                && !(value instanceof java.util.List)
                && !(value.getClass().equals(software.amazon.jsii.JsiiObject.class))
            ) {
                throw new IllegalArgumentException(
                    new java.lang.StringBuilder("Expected ")
                        .append("value")
                        .append(" to be one of: com.hashicorp.cdktf.IResolvable, java.util.List<com.sumologic.monitor.MonitorTriggers>; received ")
                        .append(value.getClass()).toString());
            }
            if (value instanceof java.util.List) {
                @SuppressWarnings("unchecked")
                final java.util.List<com.sumologic.monitor.MonitorTriggers> __cast_cd4240 = (java.util.List<com.sumologic.monitor.MonitorTriggers>)value;
                for (int __idx_ac66f0 = 0; __idx_ac66f0 < __cast_cd4240.size(); __idx_ac66f0++) {
                    final com.sumologic.monitor.MonitorTriggers __val_ac66f0 = __cast_cd4240.get(__idx_ac66f0);
                }
            }
        }
        software.amazon.jsii.Kernel.call(this, "putTriggers", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAlertName() {
        software.amazon.jsii.Kernel.call(this, "resetAlertName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetContentType() {
        software.amazon.jsii.Kernel.call(this, "resetContentType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCreatedAt() {
        software.amazon.jsii.Kernel.call(this, "resetCreatedAt", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCreatedBy() {
        software.amazon.jsii.Kernel.call(this, "resetCreatedBy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEvaluationDelay() {
        software.amazon.jsii.Kernel.call(this, "resetEvaluationDelay", software.amazon.jsii.NativeType.VOID);
    }

    public void resetGroupNotifications() {
        software.amazon.jsii.Kernel.call(this, "resetGroupNotifications", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIsDisabled() {
        software.amazon.jsii.Kernel.call(this, "resetIsDisabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIsLocked() {
        software.amazon.jsii.Kernel.call(this, "resetIsLocked", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIsMutable() {
        software.amazon.jsii.Kernel.call(this, "resetIsMutable", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIsSystem() {
        software.amazon.jsii.Kernel.call(this, "resetIsSystem", software.amazon.jsii.NativeType.VOID);
    }

    public void resetModifiedAt() {
        software.amazon.jsii.Kernel.call(this, "resetModifiedAt", software.amazon.jsii.NativeType.VOID);
    }

    public void resetModifiedBy() {
        software.amazon.jsii.Kernel.call(this, "resetModifiedBy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNotificationGroupFields() {
        software.amazon.jsii.Kernel.call(this, "resetNotificationGroupFields", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNotifications() {
        software.amazon.jsii.Kernel.call(this, "resetNotifications", software.amazon.jsii.NativeType.VOID);
    }

    public void resetObjPermission() {
        software.amazon.jsii.Kernel.call(this, "resetObjPermission", software.amazon.jsii.NativeType.VOID);
    }

    public void resetParentId() {
        software.amazon.jsii.Kernel.call(this, "resetParentId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPlaybook() {
        software.amazon.jsii.Kernel.call(this, "resetPlaybook", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPostRequestMap() {
        software.amazon.jsii.Kernel.call(this, "resetPostRequestMap", software.amazon.jsii.NativeType.VOID);
    }

    public void resetQueries() {
        software.amazon.jsii.Kernel.call(this, "resetQueries", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSloId() {
        software.amazon.jsii.Kernel.call(this, "resetSloId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStatus() {
        software.amazon.jsii.Kernel.call(this, "resetStatus", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeZone() {
        software.amazon.jsii.Kernel.call(this, "resetTimeZone", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTriggerConditions() {
        software.amazon.jsii.Kernel.call(this, "resetTriggerConditions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTriggers() {
        software.amazon.jsii.Kernel.call(this, "resetTriggers", software.amazon.jsii.NativeType.VOID);
    }

    public void resetType() {
        software.amazon.jsii.Kernel.call(this, "resetType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVersion() {
        software.amazon.jsii.Kernel.call(this, "resetVersion", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeHclAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeHclAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorNotificationsList getNotifications() {
        return software.amazon.jsii.Kernel.get(this, "notifications", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorNotificationsList.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorObjPermissionList getObjPermission() {
        return software.amazon.jsii.Kernel.get(this, "objPermission", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorObjPermissionList.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorQueriesList getQueries() {
        return software.amazon.jsii.Kernel.get(this, "queries", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorQueriesList.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditionsOutputReference getTriggerConditions() {
        return software.amazon.jsii.Kernel.get(this, "triggerConditions", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggersList getTriggers() {
        return software.amazon.jsii.Kernel.get(this, "triggers", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggersList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAlertNameInput() {
        return software.amazon.jsii.Kernel.get(this, "alertNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getContentTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "contentTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCreatedAtInput() {
        return software.amazon.jsii.Kernel.get(this, "createdAtInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCreatedByInput() {
        return software.amazon.jsii.Kernel.get(this, "createdByInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEvaluationDelayInput() {
        return software.amazon.jsii.Kernel.get(this, "evaluationDelayInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getGroupNotificationsInput() {
        return software.amazon.jsii.Kernel.get(this, "groupNotificationsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getIsDisabledInput() {
        return software.amazon.jsii.Kernel.get(this, "isDisabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getIsLockedInput() {
        return software.amazon.jsii.Kernel.get(this, "isLockedInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getIsMutableInput() {
        return software.amazon.jsii.Kernel.get(this, "isMutableInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getIsSystemInput() {
        return software.amazon.jsii.Kernel.get(this, "isSystemInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getModifiedAtInput() {
        return software.amazon.jsii.Kernel.get(this, "modifiedAtInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getModifiedByInput() {
        return software.amazon.jsii.Kernel.get(this, "modifiedByInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMonitorTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "monitorTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getNotificationGroupFieldsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "notificationGroupFieldsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getNotificationsInput() {
        return software.amazon.jsii.Kernel.get(this, "notificationsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getObjPermissionInput() {
        return software.amazon.jsii.Kernel.get(this, "objPermissionInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getParentIdInput() {
        return software.amazon.jsii.Kernel.get(this, "parentIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPlaybookInput() {
        return software.amazon.jsii.Kernel.get(this, "playbookInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getPostRequestMapInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "postRequestMapInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getQueriesInput() {
        return software.amazon.jsii.Kernel.get(this, "queriesInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSloIdInput() {
        return software.amazon.jsii.Kernel.get(this, "sloIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getStatusInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "statusInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTimeZoneInput() {
        return software.amazon.jsii.Kernel.get(this, "timeZoneInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditions getTriggerConditionsInput() {
        return software.amazon.jsii.Kernel.get(this, "triggerConditionsInput", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditions.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTriggersInput() {
        return software.amazon.jsii.Kernel.get(this, "triggersInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "typeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "versionInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAlertName() {
        return software.amazon.jsii.Kernel.get(this, "alertName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAlertName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "alertName", java.util.Objects.requireNonNull(value, "alertName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getContentType() {
        return software.amazon.jsii.Kernel.get(this, "contentType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setContentType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "contentType", java.util.Objects.requireNonNull(value, "contentType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCreatedAt() {
        return software.amazon.jsii.Kernel.get(this, "createdAt", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCreatedAt(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "createdAt", java.util.Objects.requireNonNull(value, "createdAt is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCreatedBy() {
        return software.amazon.jsii.Kernel.get(this, "createdBy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCreatedBy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "createdBy", java.util.Objects.requireNonNull(value, "createdBy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEvaluationDelay() {
        return software.amazon.jsii.Kernel.get(this, "evaluationDelay", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEvaluationDelay(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "evaluationDelay", java.util.Objects.requireNonNull(value, "evaluationDelay is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getGroupNotifications() {
        return software.amazon.jsii.Kernel.get(this, "groupNotifications", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setGroupNotifications(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "groupNotifications", java.util.Objects.requireNonNull(value, "groupNotifications is required"));
    }

    public void setGroupNotifications(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "groupNotifications", java.util.Objects.requireNonNull(value, "groupNotifications is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getIsDisabled() {
        return software.amazon.jsii.Kernel.get(this, "isDisabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setIsDisabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "isDisabled", java.util.Objects.requireNonNull(value, "isDisabled is required"));
    }

    public void setIsDisabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "isDisabled", java.util.Objects.requireNonNull(value, "isDisabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getIsLocked() {
        return software.amazon.jsii.Kernel.get(this, "isLocked", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setIsLocked(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "isLocked", java.util.Objects.requireNonNull(value, "isLocked is required"));
    }

    public void setIsLocked(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "isLocked", java.util.Objects.requireNonNull(value, "isLocked is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getIsMutable() {
        return software.amazon.jsii.Kernel.get(this, "isMutable", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setIsMutable(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "isMutable", java.util.Objects.requireNonNull(value, "isMutable is required"));
    }

    public void setIsMutable(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "isMutable", java.util.Objects.requireNonNull(value, "isMutable is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getIsSystem() {
        return software.amazon.jsii.Kernel.get(this, "isSystem", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setIsSystem(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "isSystem", java.util.Objects.requireNonNull(value, "isSystem is required"));
    }

    public void setIsSystem(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "isSystem", java.util.Objects.requireNonNull(value, "isSystem is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getModifiedAt() {
        return software.amazon.jsii.Kernel.get(this, "modifiedAt", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setModifiedAt(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "modifiedAt", java.util.Objects.requireNonNull(value, "modifiedAt is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getModifiedBy() {
        return software.amazon.jsii.Kernel.get(this, "modifiedBy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setModifiedBy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "modifiedBy", java.util.Objects.requireNonNull(value, "modifiedBy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMonitorType() {
        return software.amazon.jsii.Kernel.get(this, "monitorType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMonitorType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "monitorType", java.util.Objects.requireNonNull(value, "monitorType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getNotificationGroupFields() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "notificationGroupFields", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setNotificationGroupFields(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "notificationGroupFields", java.util.Objects.requireNonNull(value, "notificationGroupFields is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getParentId() {
        return software.amazon.jsii.Kernel.get(this, "parentId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setParentId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "parentId", java.util.Objects.requireNonNull(value, "parentId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPlaybook() {
        return software.amazon.jsii.Kernel.get(this, "playbook", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPlaybook(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "playbook", java.util.Objects.requireNonNull(value, "playbook is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getPostRequestMap() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "postRequestMap", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setPostRequestMap(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "postRequestMap", java.util.Objects.requireNonNull(value, "postRequestMap is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSloId() {
        return software.amazon.jsii.Kernel.get(this, "sloId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSloId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "sloId", java.util.Objects.requireNonNull(value, "sloId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getStatus() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setStatus(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "status", java.util.Objects.requireNonNull(value, "status is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTimeZone() {
        return software.amazon.jsii.Kernel.get(this, "timeZone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTimeZone(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "timeZone", java.util.Objects.requireNonNull(value, "timeZone is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getType() {
        return software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "type", java.util.Objects.requireNonNull(value, "type is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getVersion() {
        return software.amazon.jsii.Kernel.get(this, "version", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setVersion(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "version", java.util.Objects.requireNonNull(value, "version is required"));
    }

    /**
     * A fluent builder for {@link com.sumologic.monitor.Monitor}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<com.sumologic.monitor.Monitor> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope The scope in which to define this construct. This parameter is required.
         * @param id The scoped construct ID. This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private final com.sumologic.monitor.MonitorConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new com.sumologic.monitor.MonitorConfig.Builder();
        }

        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.config.connection(connection);
            return this;
        }
        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.config.connection(connection);
            return this;
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config.count(count);
            return this;
        }
        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final com.hashicorp.cdktf.TerraformCount count) {
            this.config.count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config.dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param forEach This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(final com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.config.forEach(forEach);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config.lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config.provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param provisioners This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provisioners(final java.util.List<? extends java.lang.Object> provisioners) {
            this.config.provisioners(provisioners);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#monitor_type Monitor#monitor_type}.
         * <p>
         * @return {@code this}
         * @param monitorType Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#monitor_type Monitor#monitor_type}. This parameter is required.
         */
        public Builder monitorType(final java.lang.String monitorType) {
            this.config.monitorType(monitorType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#name Monitor#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#name Monitor#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#alert_name Monitor#alert_name}.
         * <p>
         * @return {@code this}
         * @param alertName Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#alert_name Monitor#alert_name}. This parameter is required.
         */
        public Builder alertName(final java.lang.String alertName) {
            this.config.alertName(alertName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#content_type Monitor#content_type}.
         * <p>
         * @return {@code this}
         * @param contentType Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#content_type Monitor#content_type}. This parameter is required.
         */
        public Builder contentType(final java.lang.String contentType) {
            this.config.contentType(contentType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#created_at Monitor#created_at}.
         * <p>
         * @return {@code this}
         * @param createdAt Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#created_at Monitor#created_at}. This parameter is required.
         */
        public Builder createdAt(final java.lang.String createdAt) {
            this.config.createdAt(createdAt);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#created_by Monitor#created_by}.
         * <p>
         * @return {@code this}
         * @param createdBy Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#created_by Monitor#created_by}. This parameter is required.
         */
        public Builder createdBy(final java.lang.String createdBy) {
            this.config.createdBy(createdBy);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#description Monitor#description}.
         * <p>
         * @return {@code this}
         * @param description Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#description Monitor#description}. This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config.description(description);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#evaluation_delay Monitor#evaluation_delay}.
         * <p>
         * @return {@code this}
         * @param evaluationDelay Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#evaluation_delay Monitor#evaluation_delay}. This parameter is required.
         */
        public Builder evaluationDelay(final java.lang.String evaluationDelay) {
            this.config.evaluationDelay(evaluationDelay);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#group_notifications Monitor#group_notifications}.
         * <p>
         * @return {@code this}
         * @param groupNotifications Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#group_notifications Monitor#group_notifications}. This parameter is required.
         */
        public Builder groupNotifications(final java.lang.Boolean groupNotifications) {
            this.config.groupNotifications(groupNotifications);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#group_notifications Monitor#group_notifications}.
         * <p>
         * @return {@code this}
         * @param groupNotifications Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#group_notifications Monitor#group_notifications}. This parameter is required.
         */
        public Builder groupNotifications(final com.hashicorp.cdktf.IResolvable groupNotifications) {
            this.config.groupNotifications(groupNotifications);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#id Monitor#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#id Monitor#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#is_disabled Monitor#is_disabled}.
         * <p>
         * @return {@code this}
         * @param isDisabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#is_disabled Monitor#is_disabled}. This parameter is required.
         */
        public Builder isDisabled(final java.lang.Boolean isDisabled) {
            this.config.isDisabled(isDisabled);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#is_disabled Monitor#is_disabled}.
         * <p>
         * @return {@code this}
         * @param isDisabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#is_disabled Monitor#is_disabled}. This parameter is required.
         */
        public Builder isDisabled(final com.hashicorp.cdktf.IResolvable isDisabled) {
            this.config.isDisabled(isDisabled);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#is_locked Monitor#is_locked}.
         * <p>
         * @return {@code this}
         * @param isLocked Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#is_locked Monitor#is_locked}. This parameter is required.
         */
        public Builder isLocked(final java.lang.Boolean isLocked) {
            this.config.isLocked(isLocked);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#is_locked Monitor#is_locked}.
         * <p>
         * @return {@code this}
         * @param isLocked Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#is_locked Monitor#is_locked}. This parameter is required.
         */
        public Builder isLocked(final com.hashicorp.cdktf.IResolvable isLocked) {
            this.config.isLocked(isLocked);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#is_mutable Monitor#is_mutable}.
         * <p>
         * @return {@code this}
         * @param isMutable Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#is_mutable Monitor#is_mutable}. This parameter is required.
         */
        public Builder isMutable(final java.lang.Boolean isMutable) {
            this.config.isMutable(isMutable);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#is_mutable Monitor#is_mutable}.
         * <p>
         * @return {@code this}
         * @param isMutable Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#is_mutable Monitor#is_mutable}. This parameter is required.
         */
        public Builder isMutable(final com.hashicorp.cdktf.IResolvable isMutable) {
            this.config.isMutable(isMutable);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#is_system Monitor#is_system}.
         * <p>
         * @return {@code this}
         * @param isSystem Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#is_system Monitor#is_system}. This parameter is required.
         */
        public Builder isSystem(final java.lang.Boolean isSystem) {
            this.config.isSystem(isSystem);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#is_system Monitor#is_system}.
         * <p>
         * @return {@code this}
         * @param isSystem Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#is_system Monitor#is_system}. This parameter is required.
         */
        public Builder isSystem(final com.hashicorp.cdktf.IResolvable isSystem) {
            this.config.isSystem(isSystem);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#modified_at Monitor#modified_at}.
         * <p>
         * @return {@code this}
         * @param modifiedAt Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#modified_at Monitor#modified_at}. This parameter is required.
         */
        public Builder modifiedAt(final java.lang.String modifiedAt) {
            this.config.modifiedAt(modifiedAt);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#modified_by Monitor#modified_by}.
         * <p>
         * @return {@code this}
         * @param modifiedBy Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#modified_by Monitor#modified_by}. This parameter is required.
         */
        public Builder modifiedBy(final java.lang.String modifiedBy) {
            this.config.modifiedBy(modifiedBy);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#notification_group_fields Monitor#notification_group_fields}.
         * <p>
         * @return {@code this}
         * @param notificationGroupFields Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#notification_group_fields Monitor#notification_group_fields}. This parameter is required.
         */
        public Builder notificationGroupFields(final java.util.List<java.lang.String> notificationGroupFields) {
            this.config.notificationGroupFields(notificationGroupFields);
            return this;
        }

        /**
         * notifications block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#notifications Monitor#notifications}
         * <p>
         * @return {@code this}
         * @param notifications notifications block. This parameter is required.
         */
        public Builder notifications(final com.hashicorp.cdktf.IResolvable notifications) {
            this.config.notifications(notifications);
            return this;
        }
        /**
         * notifications block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#notifications Monitor#notifications}
         * <p>
         * @return {@code this}
         * @param notifications notifications block. This parameter is required.
         */
        public Builder notifications(final java.util.List<? extends com.sumologic.monitor.MonitorNotifications> notifications) {
            this.config.notifications(notifications);
            return this;
        }

        /**
         * obj_permission block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#obj_permission Monitor#obj_permission}
         * <p>
         * @return {@code this}
         * @param objPermission obj_permission block. This parameter is required.
         */
        public Builder objPermission(final com.hashicorp.cdktf.IResolvable objPermission) {
            this.config.objPermission(objPermission);
            return this;
        }
        /**
         * obj_permission block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#obj_permission Monitor#obj_permission}
         * <p>
         * @return {@code this}
         * @param objPermission obj_permission block. This parameter is required.
         */
        public Builder objPermission(final java.util.List<? extends com.sumologic.monitor.MonitorObjPermission> objPermission) {
            this.config.objPermission(objPermission);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#parent_id Monitor#parent_id}.
         * <p>
         * @return {@code this}
         * @param parentId Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#parent_id Monitor#parent_id}. This parameter is required.
         */
        public Builder parentId(final java.lang.String parentId) {
            this.config.parentId(parentId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#playbook Monitor#playbook}.
         * <p>
         * @return {@code this}
         * @param playbook Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#playbook Monitor#playbook}. This parameter is required.
         */
        public Builder playbook(final java.lang.String playbook) {
            this.config.playbook(playbook);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#post_request_map Monitor#post_request_map}.
         * <p>
         * @return {@code this}
         * @param postRequestMap Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#post_request_map Monitor#post_request_map}. This parameter is required.
         */
        public Builder postRequestMap(final java.util.Map<java.lang.String, java.lang.String> postRequestMap) {
            this.config.postRequestMap(postRequestMap);
            return this;
        }

        /**
         * queries block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#queries Monitor#queries}
         * <p>
         * @return {@code this}
         * @param queries queries block. This parameter is required.
         */
        public Builder queries(final com.hashicorp.cdktf.IResolvable queries) {
            this.config.queries(queries);
            return this;
        }
        /**
         * queries block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#queries Monitor#queries}
         * <p>
         * @return {@code this}
         * @param queries queries block. This parameter is required.
         */
        public Builder queries(final java.util.List<? extends com.sumologic.monitor.MonitorQueries> queries) {
            this.config.queries(queries);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#slo_id Monitor#slo_id}.
         * <p>
         * @return {@code this}
         * @param sloId Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#slo_id Monitor#slo_id}. This parameter is required.
         */
        public Builder sloId(final java.lang.String sloId) {
            this.config.sloId(sloId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#status Monitor#status}.
         * <p>
         * @return {@code this}
         * @param status Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#status Monitor#status}. This parameter is required.
         */
        public Builder status(final java.util.List<java.lang.String> status) {
            this.config.status(status);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#tags Monitor#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#tags Monitor#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#time_zone Monitor#time_zone}.
         * <p>
         * @return {@code this}
         * @param timeZone Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#time_zone Monitor#time_zone}. This parameter is required.
         */
        public Builder timeZone(final java.lang.String timeZone) {
            this.config.timeZone(timeZone);
            return this;
        }

        /**
         * trigger_conditions block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#trigger_conditions Monitor#trigger_conditions}
         * <p>
         * @return {@code this}
         * @param triggerConditions trigger_conditions block. This parameter is required.
         */
        public Builder triggerConditions(final com.sumologic.monitor.MonitorTriggerConditions triggerConditions) {
            this.config.triggerConditions(triggerConditions);
            return this;
        }

        /**
         * triggers block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#triggers Monitor#triggers}
         * <p>
         * @return {@code this}
         * @param triggers triggers block. This parameter is required.
         */
        public Builder triggers(final com.hashicorp.cdktf.IResolvable triggers) {
            this.config.triggers(triggers);
            return this;
        }
        /**
         * triggers block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#triggers Monitor#triggers}
         * <p>
         * @return {@code this}
         * @param triggers triggers block. This parameter is required.
         */
        public Builder triggers(final java.util.List<? extends com.sumologic.monitor.MonitorTriggers> triggers) {
            this.config.triggers(triggers);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#type Monitor#type}.
         * <p>
         * @return {@code this}
         * @param type Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#type Monitor#type}. This parameter is required.
         */
        public Builder type(final java.lang.String type) {
            this.config.type(type);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#version Monitor#version}.
         * <p>
         * @return {@code this}
         * @param version Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#version Monitor#version}. This parameter is required.
         */
        public Builder version(final java.lang.Number version) {
            this.config.version(version);
            return this;
        }

        /**
         * @return a newly built instance of {@link com.sumologic.monitor.Monitor}.
         */
        @Override
        public com.sumologic.monitor.Monitor build() {
            return new com.sumologic.monitor.Monitor(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
