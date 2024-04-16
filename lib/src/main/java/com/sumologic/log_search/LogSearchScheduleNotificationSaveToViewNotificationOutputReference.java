package com.sumologic.log_search;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.074Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.logSearch.LogSearchScheduleNotificationSaveToViewNotificationOutputReference")
public class LogSearchScheduleNotificationSaveToViewNotificationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected LogSearchScheduleNotificationSaveToViewNotificationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LogSearchScheduleNotificationSaveToViewNotificationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public LogSearchScheduleNotificationSaveToViewNotificationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getViewNameInput() {
        return software.amazon.jsii.Kernel.get(this, "viewNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getViewName() {
        return software.amazon.jsii.Kernel.get(this, "viewName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setViewName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "viewName", java.util.Objects.requireNonNull(value, "viewName is required"));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchScheduleNotificationSaveToViewNotification getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleNotificationSaveToViewNotification.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchScheduleNotificationSaveToViewNotification value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
