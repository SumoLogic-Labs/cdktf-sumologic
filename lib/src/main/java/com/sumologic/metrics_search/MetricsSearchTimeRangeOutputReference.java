package com.sumologic.metrics_search;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.111Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.metricsSearch.MetricsSearchTimeRangeOutputReference")
public class MetricsSearchTimeRangeOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected MetricsSearchTimeRangeOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MetricsSearchTimeRangeOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public MetricsSearchTimeRangeOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putBeginBoundedTimeRange(final @org.jetbrains.annotations.NotNull com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRange value) {
        software.amazon.jsii.Kernel.call(this, "putBeginBoundedTimeRange", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCompleteLiteralTimeRange(final @org.jetbrains.annotations.NotNull com.sumologic.metrics_search.MetricsSearchTimeRangeCompleteLiteralTimeRange value) {
        software.amazon.jsii.Kernel.call(this, "putCompleteLiteralTimeRange", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetBeginBoundedTimeRange() {
        software.amazon.jsii.Kernel.call(this, "resetBeginBoundedTimeRange", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCompleteLiteralTimeRange() {
        software.amazon.jsii.Kernel.call(this, "resetCompleteLiteralTimeRange", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeOutputReference getBeginBoundedTimeRange() {
        return software.amazon.jsii.Kernel.get(this, "beginBoundedTimeRange", software.amazon.jsii.NativeType.forClass(com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.metrics_search.MetricsSearchTimeRangeCompleteLiteralTimeRangeOutputReference getCompleteLiteralTimeRange() {
        return software.amazon.jsii.Kernel.get(this, "completeLiteralTimeRange", software.amazon.jsii.NativeType.forClass(com.sumologic.metrics_search.MetricsSearchTimeRangeCompleteLiteralTimeRangeOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRange getBeginBoundedTimeRangeInput() {
        return software.amazon.jsii.Kernel.get(this, "beginBoundedTimeRangeInput", software.amazon.jsii.NativeType.forClass(com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRange.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.metrics_search.MetricsSearchTimeRangeCompleteLiteralTimeRange getCompleteLiteralTimeRangeInput() {
        return software.amazon.jsii.Kernel.get(this, "completeLiteralTimeRangeInput", software.amazon.jsii.NativeType.forClass(com.sumologic.metrics_search.MetricsSearchTimeRangeCompleteLiteralTimeRange.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.metrics_search.MetricsSearchTimeRange getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.metrics_search.MetricsSearchTimeRange.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.metrics_search.MetricsSearchTimeRange value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
