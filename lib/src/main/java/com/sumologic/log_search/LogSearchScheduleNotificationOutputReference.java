package com.sumologic.log_search;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.073Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.logSearch.LogSearchScheduleNotificationOutputReference")
public class LogSearchScheduleNotificationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected LogSearchScheduleNotificationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LogSearchScheduleNotificationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public LogSearchScheduleNotificationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putAlertSearchNotification(final @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchScheduleNotificationAlertSearchNotification value) {
        software.amazon.jsii.Kernel.call(this, "putAlertSearchNotification", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCseSignalNotification(final @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchScheduleNotificationCseSignalNotification value) {
        software.amazon.jsii.Kernel.call(this, "putCseSignalNotification", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putEmailSearchNotification(final @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchScheduleNotificationEmailSearchNotification value) {
        software.amazon.jsii.Kernel.call(this, "putEmailSearchNotification", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSaveToLookupNotification(final @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchScheduleNotificationSaveToLookupNotification value) {
        software.amazon.jsii.Kernel.call(this, "putSaveToLookupNotification", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSaveToViewNotification(final @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchScheduleNotificationSaveToViewNotification value) {
        software.amazon.jsii.Kernel.call(this, "putSaveToViewNotification", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putServiceNowSearchNotification(final @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchScheduleNotificationServiceNowSearchNotification value) {
        software.amazon.jsii.Kernel.call(this, "putServiceNowSearchNotification", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putWebhookSearchNotification(final @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchScheduleNotificationWebhookSearchNotification value) {
        software.amazon.jsii.Kernel.call(this, "putWebhookSearchNotification", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAlertSearchNotification() {
        software.amazon.jsii.Kernel.call(this, "resetAlertSearchNotification", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCseSignalNotification() {
        software.amazon.jsii.Kernel.call(this, "resetCseSignalNotification", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEmailSearchNotification() {
        software.amazon.jsii.Kernel.call(this, "resetEmailSearchNotification", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSaveToLookupNotification() {
        software.amazon.jsii.Kernel.call(this, "resetSaveToLookupNotification", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSaveToViewNotification() {
        software.amazon.jsii.Kernel.call(this, "resetSaveToViewNotification", software.amazon.jsii.NativeType.VOID);
    }

    public void resetServiceNowSearchNotification() {
        software.amazon.jsii.Kernel.call(this, "resetServiceNowSearchNotification", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWebhookSearchNotification() {
        software.amazon.jsii.Kernel.call(this, "resetWebhookSearchNotification", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchScheduleNotificationAlertSearchNotificationOutputReference getAlertSearchNotification() {
        return software.amazon.jsii.Kernel.get(this, "alertSearchNotification", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleNotificationAlertSearchNotificationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchScheduleNotificationCseSignalNotificationOutputReference getCseSignalNotification() {
        return software.amazon.jsii.Kernel.get(this, "cseSignalNotification", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleNotificationCseSignalNotificationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchScheduleNotificationEmailSearchNotificationOutputReference getEmailSearchNotification() {
        return software.amazon.jsii.Kernel.get(this, "emailSearchNotification", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleNotificationEmailSearchNotificationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchScheduleNotificationSaveToLookupNotificationOutputReference getSaveToLookupNotification() {
        return software.amazon.jsii.Kernel.get(this, "saveToLookupNotification", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleNotificationSaveToLookupNotificationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchScheduleNotificationSaveToViewNotificationOutputReference getSaveToViewNotification() {
        return software.amazon.jsii.Kernel.get(this, "saveToViewNotification", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleNotificationSaveToViewNotificationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchScheduleNotificationServiceNowSearchNotificationOutputReference getServiceNowSearchNotification() {
        return software.amazon.jsii.Kernel.get(this, "serviceNowSearchNotification", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleNotificationServiceNowSearchNotificationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchScheduleNotificationWebhookSearchNotificationOutputReference getWebhookSearchNotification() {
        return software.amazon.jsii.Kernel.get(this, "webhookSearchNotification", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleNotificationWebhookSearchNotificationOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchScheduleNotificationAlertSearchNotification getAlertSearchNotificationInput() {
        return software.amazon.jsii.Kernel.get(this, "alertSearchNotificationInput", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleNotificationAlertSearchNotification.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchScheduleNotificationCseSignalNotification getCseSignalNotificationInput() {
        return software.amazon.jsii.Kernel.get(this, "cseSignalNotificationInput", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleNotificationCseSignalNotification.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchScheduleNotificationEmailSearchNotification getEmailSearchNotificationInput() {
        return software.amazon.jsii.Kernel.get(this, "emailSearchNotificationInput", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleNotificationEmailSearchNotification.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchScheduleNotificationSaveToLookupNotification getSaveToLookupNotificationInput() {
        return software.amazon.jsii.Kernel.get(this, "saveToLookupNotificationInput", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleNotificationSaveToLookupNotification.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchScheduleNotificationSaveToViewNotification getSaveToViewNotificationInput() {
        return software.amazon.jsii.Kernel.get(this, "saveToViewNotificationInput", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleNotificationSaveToViewNotification.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchScheduleNotificationServiceNowSearchNotification getServiceNowSearchNotificationInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceNowSearchNotificationInput", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleNotificationServiceNowSearchNotification.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchScheduleNotificationWebhookSearchNotification getWebhookSearchNotificationInput() {
        return software.amazon.jsii.Kernel.get(this, "webhookSearchNotificationInput", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleNotificationWebhookSearchNotification.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchScheduleNotification getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleNotification.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchScheduleNotification value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
