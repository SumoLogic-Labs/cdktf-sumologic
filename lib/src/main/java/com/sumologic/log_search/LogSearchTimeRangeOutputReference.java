package com.sumologic.log_search;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.094Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.logSearch.LogSearchTimeRangeOutputReference")
public class LogSearchTimeRangeOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected LogSearchTimeRangeOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LogSearchTimeRangeOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public LogSearchTimeRangeOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putBeginBoundedTimeRange(final @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRange value) {
        software.amazon.jsii.Kernel.call(this, "putBeginBoundedTimeRange", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCompleteLiteralTimeRange(final @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchTimeRangeCompleteLiteralTimeRange value) {
        software.amazon.jsii.Kernel.call(this, "putCompleteLiteralTimeRange", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetBeginBoundedTimeRange() {
        software.amazon.jsii.Kernel.call(this, "resetBeginBoundedTimeRange", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCompleteLiteralTimeRange() {
        software.amazon.jsii.Kernel.call(this, "resetCompleteLiteralTimeRange", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeOutputReference getBeginBoundedTimeRange() {
        return software.amazon.jsii.Kernel.get(this, "beginBoundedTimeRange", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchTimeRangeCompleteLiteralTimeRangeOutputReference getCompleteLiteralTimeRange() {
        return software.amazon.jsii.Kernel.get(this, "completeLiteralTimeRange", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchTimeRangeCompleteLiteralTimeRangeOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRange getBeginBoundedTimeRangeInput() {
        return software.amazon.jsii.Kernel.get(this, "beginBoundedTimeRangeInput", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRange.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchTimeRangeCompleteLiteralTimeRange getCompleteLiteralTimeRangeInput() {
        return software.amazon.jsii.Kernel.get(this, "completeLiteralTimeRangeInput", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchTimeRangeCompleteLiteralTimeRange.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchTimeRange getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchTimeRange.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchTimeRange value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
