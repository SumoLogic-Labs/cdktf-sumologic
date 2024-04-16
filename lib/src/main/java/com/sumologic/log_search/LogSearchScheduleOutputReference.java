package com.sumologic.log_search;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.086Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.logSearch.LogSearchScheduleOutputReference")
public class LogSearchScheduleOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected LogSearchScheduleOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LogSearchScheduleOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public LogSearchScheduleOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putNotification(final @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchScheduleNotification value) {
        software.amazon.jsii.Kernel.call(this, "putNotification", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putParameter(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        if (software.amazon.jsii.Configuration.getRuntimeTypeChecking()) {
            if (
                 !(value instanceof com.hashicorp.cdktf.IResolvable)
                && !(value instanceof java.util.List)
                && !(value.getClass().equals(software.amazon.jsii.JsiiObject.class))
            ) {
                throw new IllegalArgumentException(
                    new java.lang.StringBuilder("Expected ")
                        .append("value")
                        .append(" to be one of: com.hashicorp.cdktf.IResolvable, java.util.List<com.sumologic.log_search.LogSearchScheduleParameter>; received ")
                        .append(value.getClass()).toString());
            }
            if (value instanceof java.util.List) {
                @SuppressWarnings("unchecked")
                final java.util.List<com.sumologic.log_search.LogSearchScheduleParameter> __cast_cd4240 = (java.util.List<com.sumologic.log_search.LogSearchScheduleParameter>)value;
                for (int __idx_ac66f0 = 0; __idx_ac66f0 < __cast_cd4240.size(); __idx_ac66f0++) {
                    final com.sumologic.log_search.LogSearchScheduleParameter __val_ac66f0 = __cast_cd4240.get(__idx_ac66f0);
                }
            }
        }
        software.amazon.jsii.Kernel.call(this, "putParameter", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putParseableTimeRange(final @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchScheduleParseableTimeRange value) {
        software.amazon.jsii.Kernel.call(this, "putParseableTimeRange", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putThreshold(final @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchScheduleThreshold value) {
        software.amazon.jsii.Kernel.call(this, "putThreshold", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCronExpression() {
        software.amazon.jsii.Kernel.call(this, "resetCronExpression", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMuteErrorEmails() {
        software.amazon.jsii.Kernel.call(this, "resetMuteErrorEmails", software.amazon.jsii.NativeType.VOID);
    }

    public void resetParameter() {
        software.amazon.jsii.Kernel.call(this, "resetParameter", software.amazon.jsii.NativeType.VOID);
    }

    public void resetThreshold() {
        software.amazon.jsii.Kernel.call(this, "resetThreshold", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchScheduleNotificationOutputReference getNotification() {
        return software.amazon.jsii.Kernel.get(this, "notification", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleNotificationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchScheduleParameterList getParameter() {
        return software.amazon.jsii.Kernel.get(this, "parameter", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleParameterList.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchScheduleParseableTimeRangeOutputReference getParseableTimeRange() {
        return software.amazon.jsii.Kernel.get(this, "parseableTimeRange", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleParseableTimeRangeOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchScheduleThresholdOutputReference getThreshold() {
        return software.amazon.jsii.Kernel.get(this, "threshold", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleThresholdOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCronExpressionInput() {
        return software.amazon.jsii.Kernel.get(this, "cronExpressionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getMuteErrorEmailsInput() {
        return software.amazon.jsii.Kernel.get(this, "muteErrorEmailsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchScheduleNotification getNotificationInput() {
        return software.amazon.jsii.Kernel.get(this, "notificationInput", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleNotification.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getParameterInput() {
        return software.amazon.jsii.Kernel.get(this, "parameterInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchScheduleParseableTimeRange getParseableTimeRangeInput() {
        return software.amazon.jsii.Kernel.get(this, "parseableTimeRangeInput", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleParseableTimeRange.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getScheduleTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "scheduleTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchScheduleThreshold getThresholdInput() {
        return software.amazon.jsii.Kernel.get(this, "thresholdInput", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleThreshold.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTimeZoneInput() {
        return software.amazon.jsii.Kernel.get(this, "timeZoneInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCronExpression() {
        return software.amazon.jsii.Kernel.get(this, "cronExpression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCronExpression(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "cronExpression", java.util.Objects.requireNonNull(value, "cronExpression is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getMuteErrorEmails() {
        return software.amazon.jsii.Kernel.get(this, "muteErrorEmails", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setMuteErrorEmails(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "muteErrorEmails", java.util.Objects.requireNonNull(value, "muteErrorEmails is required"));
    }

    public void setMuteErrorEmails(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "muteErrorEmails", java.util.Objects.requireNonNull(value, "muteErrorEmails is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getScheduleType() {
        return software.amazon.jsii.Kernel.get(this, "scheduleType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setScheduleType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "scheduleType", java.util.Objects.requireNonNull(value, "scheduleType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTimeZone() {
        return software.amazon.jsii.Kernel.get(this, "timeZone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTimeZone(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "timeZone", java.util.Objects.requireNonNull(value, "timeZone is required"));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchSchedule getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchSchedule.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchSchedule value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
