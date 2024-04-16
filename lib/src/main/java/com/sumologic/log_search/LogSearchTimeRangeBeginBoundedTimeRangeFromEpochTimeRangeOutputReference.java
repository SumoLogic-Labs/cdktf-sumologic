package com.sumologic.log_search;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.091Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.logSearch.LogSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRangeOutputReference")
public class LogSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRangeOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected LogSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRangeOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LogSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRangeOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public LogSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRangeOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getEpochMillisInput() {
        return software.amazon.jsii.Kernel.get(this, "epochMillisInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getEpochMillis() {
        return software.amazon.jsii.Kernel.get(this, "epochMillis", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setEpochMillis(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "epochMillis", java.util.Objects.requireNonNull(value, "epochMillis is required"));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRange getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRange.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRange value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
