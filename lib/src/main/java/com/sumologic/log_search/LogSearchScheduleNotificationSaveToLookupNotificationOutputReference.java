package com.sumologic.log_search;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.074Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.logSearch.LogSearchScheduleNotificationSaveToLookupNotificationOutputReference")
public class LogSearchScheduleNotificationSaveToLookupNotificationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected LogSearchScheduleNotificationSaveToLookupNotificationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LogSearchScheduleNotificationSaveToLookupNotificationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public LogSearchScheduleNotificationSaveToLookupNotificationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getIsLookupMergeOperationInput() {
        return software.amazon.jsii.Kernel.get(this, "isLookupMergeOperationInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLookupFilePathInput() {
        return software.amazon.jsii.Kernel.get(this, "lookupFilePathInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getIsLookupMergeOperation() {
        return software.amazon.jsii.Kernel.get(this, "isLookupMergeOperation", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setIsLookupMergeOperation(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "isLookupMergeOperation", java.util.Objects.requireNonNull(value, "isLookupMergeOperation is required"));
    }

    public void setIsLookupMergeOperation(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "isLookupMergeOperation", java.util.Objects.requireNonNull(value, "isLookupMergeOperation is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLookupFilePath() {
        return software.amazon.jsii.Kernel.get(this, "lookupFilePath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLookupFilePath(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "lookupFilePath", java.util.Objects.requireNonNull(value, "lookupFilePath is required"));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchScheduleNotificationSaveToLookupNotification getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleNotificationSaveToLookupNotification.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchScheduleNotificationSaveToLookupNotification value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
