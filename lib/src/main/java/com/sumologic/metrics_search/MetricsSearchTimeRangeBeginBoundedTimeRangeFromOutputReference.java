package com.sumologic.metrics_search;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.103Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.metricsSearch.MetricsSearchTimeRangeBeginBoundedTimeRangeFromOutputReference")
public class MetricsSearchTimeRangeBeginBoundedTimeRangeFromOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected MetricsSearchTimeRangeBeginBoundedTimeRangeFromOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MetricsSearchTimeRangeBeginBoundedTimeRangeFromOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public MetricsSearchTimeRangeBeginBoundedTimeRangeFromOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putEpochTimeRange(final @org.jetbrains.annotations.NotNull com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRange value) {
        software.amazon.jsii.Kernel.call(this, "putEpochTimeRange", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putIso8601TimeRange(final @org.jetbrains.annotations.NotNull com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange value) {
        software.amazon.jsii.Kernel.call(this, "putIso8601TimeRange", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putLiteralTimeRange(final @org.jetbrains.annotations.NotNull com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeFromLiteralTimeRange value) {
        software.amazon.jsii.Kernel.call(this, "putLiteralTimeRange", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRelativeTimeRange(final @org.jetbrains.annotations.NotNull com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange value) {
        software.amazon.jsii.Kernel.call(this, "putRelativeTimeRange", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetEpochTimeRange() {
        software.amazon.jsii.Kernel.call(this, "resetEpochTimeRange", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIso8601TimeRange() {
        software.amazon.jsii.Kernel.call(this, "resetIso8601TimeRange", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLiteralTimeRange() {
        software.amazon.jsii.Kernel.call(this, "resetLiteralTimeRange", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRelativeTimeRange() {
        software.amazon.jsii.Kernel.call(this, "resetRelativeTimeRange", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRangeOutputReference getEpochTimeRange() {
        return software.amazon.jsii.Kernel.get(this, "epochTimeRange", software.amazon.jsii.NativeType.forClass(com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRangeOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeFromIso8601TimeRangeOutputReference getIso8601TimeRange() {
        return software.amazon.jsii.Kernel.get(this, "iso8601TimeRange", software.amazon.jsii.NativeType.forClass(com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeFromIso8601TimeRangeOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeFromLiteralTimeRangeOutputReference getLiteralTimeRange() {
        return software.amazon.jsii.Kernel.get(this, "literalTimeRange", software.amazon.jsii.NativeType.forClass(com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeFromLiteralTimeRangeOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeFromRelativeTimeRangeOutputReference getRelativeTimeRange() {
        return software.amazon.jsii.Kernel.get(this, "relativeTimeRange", software.amazon.jsii.NativeType.forClass(com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeFromRelativeTimeRangeOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRange getEpochTimeRangeInput() {
        return software.amazon.jsii.Kernel.get(this, "epochTimeRangeInput", software.amazon.jsii.NativeType.forClass(com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRange.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange getIso8601TimeRangeInput() {
        return software.amazon.jsii.Kernel.get(this, "iso8601TimeRangeInput", software.amazon.jsii.NativeType.forClass(com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeFromLiteralTimeRange getLiteralTimeRangeInput() {
        return software.amazon.jsii.Kernel.get(this, "literalTimeRangeInput", software.amazon.jsii.NativeType.forClass(com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeFromLiteralTimeRange.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange getRelativeTimeRangeInput() {
        return software.amazon.jsii.Kernel.get(this, "relativeTimeRangeInput", software.amazon.jsii.NativeType.forClass(com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeFrom getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeFrom.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeFrom value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
