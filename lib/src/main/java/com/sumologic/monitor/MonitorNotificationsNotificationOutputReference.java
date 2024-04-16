package com.sumologic.monitor;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.116Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.monitor.MonitorNotificationsNotificationOutputReference")
public class MonitorNotificationsNotificationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected MonitorNotificationsNotificationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MonitorNotificationsNotificationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public MonitorNotificationsNotificationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetActionType() {
        software.amazon.jsii.Kernel.call(this, "resetActionType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetConnectionId() {
        software.amazon.jsii.Kernel.call(this, "resetConnectionId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetConnectionType() {
        software.amazon.jsii.Kernel.call(this, "resetConnectionType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMessageBody() {
        software.amazon.jsii.Kernel.call(this, "resetMessageBody", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPayloadOverride() {
        software.amazon.jsii.Kernel.call(this, "resetPayloadOverride", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRecipients() {
        software.amazon.jsii.Kernel.call(this, "resetRecipients", software.amazon.jsii.NativeType.VOID);
    }

    public void resetResolutionPayloadOverride() {
        software.amazon.jsii.Kernel.call(this, "resetResolutionPayloadOverride", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSubject() {
        software.amazon.jsii.Kernel.call(this, "resetSubject", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeZone() {
        software.amazon.jsii.Kernel.call(this, "resetTimeZone", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getActionTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "actionTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getConnectionIdInput() {
        return software.amazon.jsii.Kernel.get(this, "connectionIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getConnectionTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "connectionTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMessageBodyInput() {
        return software.amazon.jsii.Kernel.get(this, "messageBodyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPayloadOverrideInput() {
        return software.amazon.jsii.Kernel.get(this, "payloadOverrideInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getRecipientsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "recipientsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getResolutionPayloadOverrideInput() {
        return software.amazon.jsii.Kernel.get(this, "resolutionPayloadOverrideInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSubjectInput() {
        return software.amazon.jsii.Kernel.get(this, "subjectInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTimeZoneInput() {
        return software.amazon.jsii.Kernel.get(this, "timeZoneInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getActionType() {
        return software.amazon.jsii.Kernel.get(this, "actionType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setActionType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "actionType", java.util.Objects.requireNonNull(value, "actionType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getConnectionId() {
        return software.amazon.jsii.Kernel.get(this, "connectionId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setConnectionId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "connectionId", java.util.Objects.requireNonNull(value, "connectionId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getConnectionType() {
        return software.amazon.jsii.Kernel.get(this, "connectionType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setConnectionType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "connectionType", java.util.Objects.requireNonNull(value, "connectionType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMessageBody() {
        return software.amazon.jsii.Kernel.get(this, "messageBody", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMessageBody(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "messageBody", java.util.Objects.requireNonNull(value, "messageBody is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPayloadOverride() {
        return software.amazon.jsii.Kernel.get(this, "payloadOverride", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPayloadOverride(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "payloadOverride", java.util.Objects.requireNonNull(value, "payloadOverride is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getRecipients() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "recipients", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setRecipients(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "recipients", java.util.Objects.requireNonNull(value, "recipients is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getResolutionPayloadOverride() {
        return software.amazon.jsii.Kernel.get(this, "resolutionPayloadOverride", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setResolutionPayloadOverride(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "resolutionPayloadOverride", java.util.Objects.requireNonNull(value, "resolutionPayloadOverride is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSubject() {
        return software.amazon.jsii.Kernel.get(this, "subject", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSubject(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "subject", java.util.Objects.requireNonNull(value, "subject is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTimeZone() {
        return software.amazon.jsii.Kernel.get(this, "timeZone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTimeZone(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "timeZone", java.util.Objects.requireNonNull(value, "timeZone is required"));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorNotificationsNotification getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorNotificationsNotification.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorNotificationsNotification value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
