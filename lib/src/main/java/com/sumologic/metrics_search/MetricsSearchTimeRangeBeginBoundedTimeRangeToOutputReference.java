package com.sumologic.metrics_search;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.104Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.metricsSearch.MetricsSearchTimeRangeBeginBoundedTimeRangeToOutputReference")
public class MetricsSearchTimeRangeBeginBoundedTimeRangeToOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected MetricsSearchTimeRangeBeginBoundedTimeRangeToOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MetricsSearchTimeRangeBeginBoundedTimeRangeToOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public MetricsSearchTimeRangeBeginBoundedTimeRangeToOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putEpochTimeRange(final @org.jetbrains.annotations.NotNull com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeToEpochTimeRange value) {
        software.amazon.jsii.Kernel.call(this, "putEpochTimeRange", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putIso8601TimeRange(final @org.jetbrains.annotations.NotNull com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeToIso8601TimeRange value) {
        software.amazon.jsii.Kernel.call(this, "putIso8601TimeRange", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putLiteralTimeRange(final @org.jetbrains.annotations.NotNull com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeToLiteralTimeRange value) {
        software.amazon.jsii.Kernel.call(this, "putLiteralTimeRange", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRelativeTimeRange(final @org.jetbrains.annotations.NotNull com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeToRelativeTimeRange value) {
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

    public @org.jetbrains.annotations.NotNull com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeToEpochTimeRangeOutputReference getEpochTimeRange() {
        return software.amazon.jsii.Kernel.get(this, "epochTimeRange", software.amazon.jsii.NativeType.forClass(com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeToEpochTimeRangeOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeToIso8601TimeRangeOutputReference getIso8601TimeRange() {
        return software.amazon.jsii.Kernel.get(this, "iso8601TimeRange", software.amazon.jsii.NativeType.forClass(com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeToIso8601TimeRangeOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeToLiteralTimeRangeOutputReference getLiteralTimeRange() {
        return software.amazon.jsii.Kernel.get(this, "literalTimeRange", software.amazon.jsii.NativeType.forClass(com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeToLiteralTimeRangeOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeToRelativeTimeRangeOutputReference getRelativeTimeRange() {
        return software.amazon.jsii.Kernel.get(this, "relativeTimeRange", software.amazon.jsii.NativeType.forClass(com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeToRelativeTimeRangeOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeToEpochTimeRange getEpochTimeRangeInput() {
        return software.amazon.jsii.Kernel.get(this, "epochTimeRangeInput", software.amazon.jsii.NativeType.forClass(com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeToEpochTimeRange.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeToIso8601TimeRange getIso8601TimeRangeInput() {
        return software.amazon.jsii.Kernel.get(this, "iso8601TimeRangeInput", software.amazon.jsii.NativeType.forClass(com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeToIso8601TimeRange.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeToLiteralTimeRange getLiteralTimeRangeInput() {
        return software.amazon.jsii.Kernel.get(this, "literalTimeRangeInput", software.amazon.jsii.NativeType.forClass(com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeToLiteralTimeRange.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeToRelativeTimeRange getRelativeTimeRangeInput() {
        return software.amazon.jsii.Kernel.get(this, "relativeTimeRangeInput", software.amazon.jsii.NativeType.forClass(com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeToRelativeTimeRange.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeTo getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeTo.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeTo value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
