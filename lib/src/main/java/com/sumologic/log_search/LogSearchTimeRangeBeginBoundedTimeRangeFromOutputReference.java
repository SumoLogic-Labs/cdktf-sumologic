package com.sumologic.log_search;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.092Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.logSearch.LogSearchTimeRangeBeginBoundedTimeRangeFromOutputReference")
public class LogSearchTimeRangeBeginBoundedTimeRangeFromOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected LogSearchTimeRangeBeginBoundedTimeRangeFromOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LogSearchTimeRangeBeginBoundedTimeRangeFromOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public LogSearchTimeRangeBeginBoundedTimeRangeFromOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putEpochTimeRange(final @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRange value) {
        software.amazon.jsii.Kernel.call(this, "putEpochTimeRange", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putIso8601TimeRange(final @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange value) {
        software.amazon.jsii.Kernel.call(this, "putIso8601TimeRange", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putLiteralTimeRange(final @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeFromLiteralTimeRange value) {
        software.amazon.jsii.Kernel.call(this, "putLiteralTimeRange", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRelativeTimeRange(final @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange value) {
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

    public @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRangeOutputReference getEpochTimeRange() {
        return software.amazon.jsii.Kernel.get(this, "epochTimeRange", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRangeOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeFromIso8601TimeRangeOutputReference getIso8601TimeRange() {
        return software.amazon.jsii.Kernel.get(this, "iso8601TimeRange", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeFromIso8601TimeRangeOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeFromLiteralTimeRangeOutputReference getLiteralTimeRange() {
        return software.amazon.jsii.Kernel.get(this, "literalTimeRange", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeFromLiteralTimeRangeOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeFromRelativeTimeRangeOutputReference getRelativeTimeRange() {
        return software.amazon.jsii.Kernel.get(this, "relativeTimeRange", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeFromRelativeTimeRangeOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRange getEpochTimeRangeInput() {
        return software.amazon.jsii.Kernel.get(this, "epochTimeRangeInput", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRange.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange getIso8601TimeRangeInput() {
        return software.amazon.jsii.Kernel.get(this, "iso8601TimeRangeInput", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeFromLiteralTimeRange getLiteralTimeRangeInput() {
        return software.amazon.jsii.Kernel.get(this, "literalTimeRangeInput", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeFromLiteralTimeRange.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange getRelativeTimeRangeInput() {
        return software.amazon.jsii.Kernel.get(this, "relativeTimeRangeInput", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeFrom getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeFrom.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeFrom value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
