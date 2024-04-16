package com.sumologic.log_search;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.085Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.logSearch.LogSearchScheduleNotificationWebhookSearchNotificationOutputReference")
public class LogSearchScheduleNotificationWebhookSearchNotificationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected LogSearchScheduleNotificationWebhookSearchNotificationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LogSearchScheduleNotificationWebhookSearchNotificationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public LogSearchScheduleNotificationWebhookSearchNotificationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetItemizeAlerts() {
        software.amazon.jsii.Kernel.call(this, "resetItemizeAlerts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMaxItemizedAlerts() {
        software.amazon.jsii.Kernel.call(this, "resetMaxItemizedAlerts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPayload() {
        software.amazon.jsii.Kernel.call(this, "resetPayload", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getItemizeAlertsInput() {
        return software.amazon.jsii.Kernel.get(this, "itemizeAlertsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaxItemizedAlertsInput() {
        return software.amazon.jsii.Kernel.get(this, "maxItemizedAlertsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPayloadInput() {
        return software.amazon.jsii.Kernel.get(this, "payloadInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getWebhookIdInput() {
        return software.amazon.jsii.Kernel.get(this, "webhookIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getItemizeAlerts() {
        return software.amazon.jsii.Kernel.get(this, "itemizeAlerts", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setItemizeAlerts(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "itemizeAlerts", java.util.Objects.requireNonNull(value, "itemizeAlerts is required"));
    }

    public void setItemizeAlerts(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "itemizeAlerts", java.util.Objects.requireNonNull(value, "itemizeAlerts is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaxItemizedAlerts() {
        return software.amazon.jsii.Kernel.get(this, "maxItemizedAlerts", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaxItemizedAlerts(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maxItemizedAlerts", java.util.Objects.requireNonNull(value, "maxItemizedAlerts is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPayload() {
        return software.amazon.jsii.Kernel.get(this, "payload", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPayload(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "payload", java.util.Objects.requireNonNull(value, "payload is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getWebhookId() {
        return software.amazon.jsii.Kernel.get(this, "webhookId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setWebhookId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "webhookId", java.util.Objects.requireNonNull(value, "webhookId is required"));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchScheduleNotificationWebhookSearchNotification getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleNotificationWebhookSearchNotification.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchScheduleNotificationWebhookSearchNotification value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
