package com.sumologic.dashboard;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.865Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.DashboardTimeRangeBeginBoundedTimeRangeFromIso8601TimeRangeOutputReference")
public class DashboardTimeRangeBeginBoundedTimeRangeFromIso8601TimeRangeOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DashboardTimeRangeBeginBoundedTimeRangeFromIso8601TimeRangeOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DashboardTimeRangeBeginBoundedTimeRangeFromIso8601TimeRangeOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public DashboardTimeRangeBeginBoundedTimeRangeFromIso8601TimeRangeOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIso8601TimeInput() {
        return software.amazon.jsii.Kernel.get(this, "iso8601TimeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIso8601Time() {
        return software.amazon.jsii.Kernel.get(this, "iso8601Time", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIso8601Time(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "iso8601Time", java.util.Objects.requireNonNull(value, "iso8601Time is required"));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
